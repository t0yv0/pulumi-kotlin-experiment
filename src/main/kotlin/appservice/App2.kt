package appservice

import com.pulumi.Context
import com.pulumi.asset.FileArchive
import com.pulumi.azurenative.insights.Component
import com.pulumi.azurenative.insights.ComponentArgs
import com.pulumi.azurenative.insights.enums.ApplicationType
import com.pulumi.azurenative.resources.ResourceGroup
import com.pulumi.azurenative.sql.Database
import com.pulumi.azurenative.sql.DatabaseArgs
import com.pulumi.azurenative.sql.Server
import com.pulumi.azurenative.sql.ServerArgs
import com.pulumi.azurenative.storage.*
import com.pulumi.azurenative.storage.enums.*
import com.pulumi.azurenative.storage.inputs.ListStorageAccountServiceSASArgs
import com.pulumi.azurenative.storage.inputs.SkuArgs
import com.pulumi.azurenative.storage.outputs.ListStorageAccountServiceSASResult
import com.pulumi.azurenative.web.AppServicePlan
import com.pulumi.azurenative.web.AppServicePlanArgs
import com.pulumi.azurenative.web.WebApp
import com.pulumi.azurenative.web.WebAppArgs
import com.pulumi.azurenative.web.enums.ConnectionStringType
import com.pulumi.azurenative.web.inputs.ConnStringInfoArgs
import com.pulumi.azurenative.web.inputs.NameValuePairArgs
import com.pulumi.azurenative.web.inputs.SiteConfigArgs
import com.pulumi.azurenative.web.inputs.SkuDescriptionArgs
import com.pulumi.core.Output

object App2 {
    fun stack(ctx: Context) {
        val resourceGroup = ResourceGroup("resourceGroup")

        val storageAccount = StorageAccount(
            "sa",
            StorageAccountArgs(
                resourceGroupName = resourceGroup.name(),
                kind = Kind.StorageV2,
                sku = SkuArgs(name = SkuName.Standard_LRS),
            )
        )

        val storageContainer = BlobContainer(
            "container",
            BlobContainerArgs(
                resourceGroupName = resourceGroup.name(),
                accountName = storageAccount.name(),
                publicAccess = Output.of(PublicAccess.None),
            )
        )

        val blob = Blob(
            "blob",
            BlobArgs.builder().resourceGroupName(resourceGroup.name())
                .accountName(storageAccount.name())
                .containerName(storageContainer.name())
                .source(FileArchive("wwwroot"))
                .build()
        )

        val codeBlobUrl =
            getSASToken(storageAccount.name(), storageContainer.name(), blob.name(), resourceGroup.name())

        val appInsights = Component(
            "ai",
            ComponentArgs.builder().resourceGroupName(resourceGroup.name())
                .kind("web")
                .applicationType(ApplicationType.Web)
                .build()
        )

        val username = "pulumi"

        // Get the password to use for SQL from config.
        val pwd = ctx.config().require("sqlPassword")

        val sqlServer = Server(
            "sqlserver",
            ServerArgs.builder().resourceGroupName(resourceGroup.name())
                .administratorLogin(username)
                .administratorLoginPassword(pwd)
                .version("12.0")
                .build()
        )

        val database = Database(
            "db",
            DatabaseArgs.builder().resourceGroupName(resourceGroup.name())
                .serverName(sqlServer.name())
                .sku(com.pulumi.azurenative.sql.inputs.SkuArgs.builder().name("S0").build())
                .build()
        )

        val appServicePlan = AppServicePlan(
            "asp",
            AppServicePlanArgs.builder().resourceGroupName(resourceGroup.name())
                .kind("App")
                .sku(SkuDescriptionArgs.builder().name("B1").tier("Basic").build())
                .build()
        )

        val app = WebApp(
            "webapp",
            WebAppArgs.builder().resourceGroupName(resourceGroup.name())
                .serverFarmId(appServicePlan.id())
                .siteConfig(
                    SiteConfigArgs.builder()
                        .appSettings(
                            NameValuePairArgs.builder()
                                .name("APPINSIGHTS_INSTRUMENTATIONKEY")
                                .value(appInsights.instrumentationKey())
                                .build(),
                            NameValuePairArgs.builder()
                                .name("APPLICATIONINSIGHTS_CONNECTION_STRING")
                                .value(Output.format("InstrumentationKey=%s", appInsights.instrumentationKey()))
                                .build(),
                            NameValuePairArgs.builder()
                                .name("ApplicationInsightsAgent_EXTENSION_VERSION")
                                .value("~2")
                                .build(),
                            NameValuePairArgs.builder()
                                .name("WEBSITE_RUN_FROM_PACKAGE")
                                .value(codeBlobUrl)
                                .build()
                        )
                        .connectionStrings(
                            ConnStringInfoArgs.builder()
                                .name("db")
                                .connectionString(
                                    Output.format(
                                        "Server=tcp:%s.database.windows.net;initial catalog=%s;user ID=%s;password=%s;Min Pool Size=0;Max Pool Size=30;Persist Security Info=true;",
                                        sqlServer.name(), database.name(), Output.of(username), Output.of(pwd)
                                    )
                                )
                                .type(ConnectionStringType.SQLAzure)
                                .build()
                        )
                        .build()
                )
                .httpsOnly(true)
                .build()
        )

        ctx.export("endpoint", Output.format("https://%s", app.defaultHostName()))
    }

    private fun getSASToken(
        storageAccount: Output<String>,
        storageContainer: Output<String>,
        blob: Output<String>,
        resourceGroup: Output<String>
    ): Output<String> {
        val blobSAS = StorageFunctions.listStorageAccountServiceSAS(
            ListStorageAccountServiceSASArgs.builder()
                .resourceGroupName(resourceGroup)
                .accountName(storageAccount)
                .protocols(HttpProtocol.Https)
                .sharedAccessStartTime("2022-01-01")
                .sharedAccessExpiryTime("2030-01-01")
                .resource(SignedResource.C)
                .permissions(Permissions.R)
                .canonicalizedResource(String.format("/blob/%s/%s", storageAccount, storageContainer))
                .contentType("application/json")
                .cacheControl("max-age=5")
                .contentDisposition("inline")
                .contentEncoding("deflate")
                .build()
        )
        val token = blobSAS.applyValue(ListStorageAccountServiceSASResult::serviceSasToken)
        return Output.format(
            "https://%s.blob.core.windows.net/%s/%s?%s",
            storageAccount, storageContainer, blob, token
        )
    }
}
