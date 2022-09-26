package com.pulumi.azurenative.storage

import com.pulumi.azurenative.Utilities
import com.pulumi.core.Alias
import com.pulumi.core.Output
import com.pulumi.core.annotations.Export
import com.pulumi.core.annotations.ResourceType
import com.pulumi.core.internal.Codegen
import com.pulumi.resources.CustomResource
import com.pulumi.resources.CustomResourceOptions
import javax.annotation.Nullable

@ResourceType(type = "azure-native:storage:StorageAccount")
class StorageAccount : CustomResource {

    @Export(name = "name", type = String::class)
    private var name: Output<String>? = null

    fun name(): Output<String> {
        return this.name!!
    }

    constructor(name: String) : this(name, StorageAccountArgs.Empty)

    constructor(name: String, args: StorageAccountArgs) : this(name, args, null)

    constructor(
        name: String,
        args: StorageAccountArgs?,
        @Nullable options: CustomResourceOptions?
    ) :
            super(
                "azure-native:storage:StorageAccount", name,
                args ?: StorageAccountArgs.Empty,
                makeResourceOptions(options, Codegen.empty())
            )

    private constructor(
        name: String,
        id: Output<String>,
        @Nullable options: CustomResourceOptions
    ) :
            super("azure-native:storage:StorageAccount", name, null, makeResourceOptions(options, id))

    companion object {
        fun makeResourceOptions(
            options: CustomResourceOptions?,
            id: Output<String>
        ): CustomResourceOptions {
            val defaultOptions = CustomResourceOptions.builder()
                .version(Utilities.getVersion())
                .aliases(
                    listOf(
                        Output.of(Alias.builder().type("azure-native:storage/v20150501preview:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20150615:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20160101:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20160501:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20161201:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20170601:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20171001:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20180201:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20180301preview:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20180701:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20181101:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20190401:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20190601:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20200801preview:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20210101:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20210201:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20210401:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20210601:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20210801:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20210901:StorageAccount").build()),
                        Output.of(Alias.builder().type("azure-native:storage/v20220501:StorageAccount").build())
                    )
                )
                .build()
            return CustomResourceOptions.merge(defaultOptions, options, id)
        }
    }
}
