// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storage.FileServicePropertiesArgs;
import com.pulumi.azurenative.storage.outputs.CorsRulesResponse;
import com.pulumi.azurenative.storage.outputs.DeleteRetentionPolicyResponse;
import com.pulumi.azurenative.storage.outputs.ProtocolSettingsResponse;
import com.pulumi.azurenative.storage.outputs.SkuResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The properties of File services in storage account.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * ### PutFileServices
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.storage.FileServiceProperties;
 * import com.pulumi.azurenative.storage.FileServicePropertiesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var fileServiceProperties = new FileServiceProperties(&#34;fileServiceProperties&#34;, FileServicePropertiesArgs.builder()        
 *             .accountName(&#34;sto8607&#34;)
 *             .cors(Map.of(&#34;corsRules&#34;,             
 *                 Map.ofEntries(
 *                     Map.entry(&#34;allowedHeaders&#34;,                     
 *                         &#34;x-ms-meta-abc&#34;,
 *                         &#34;x-ms-meta-data*&#34;,
 *                         &#34;x-ms-meta-target*&#34;),
 *                     Map.entry(&#34;allowedMethods&#34;,                     
 *                         &#34;GET&#34;,
 *                         &#34;HEAD&#34;,
 *                         &#34;POST&#34;,
 *                         &#34;OPTIONS&#34;,
 *                         &#34;MERGE&#34;,
 *                         &#34;PUT&#34;),
 *                     Map.entry(&#34;allowedOrigins&#34;,                     
 *                         &#34;http://www.contoso.com&#34;,
 *                         &#34;http://www.fabrikam.com&#34;),
 *                     Map.entry(&#34;exposedHeaders&#34;, &#34;x-ms-meta-*&#34;),
 *                     Map.entry(&#34;maxAgeInSeconds&#34;, 100)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;allowedHeaders&#34;, &#34;*&#34;),
 *                     Map.entry(&#34;allowedMethods&#34;, &#34;GET&#34;),
 *                     Map.entry(&#34;allowedOrigins&#34;, &#34;*&#34;),
 *                     Map.entry(&#34;exposedHeaders&#34;, &#34;*&#34;),
 *                     Map.entry(&#34;maxAgeInSeconds&#34;, 2)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;allowedHeaders&#34;, &#34;x-ms-meta-12345675754564*&#34;),
 *                     Map.entry(&#34;allowedMethods&#34;,                     
 *                         &#34;GET&#34;,
 *                         &#34;PUT&#34;),
 *                     Map.entry(&#34;allowedOrigins&#34;,                     
 *                         &#34;http://www.abc23.com&#34;,
 *                         &#34;https://www.fabrikam.com/*&#34;),
 *                     Map.entry(&#34;exposedHeaders&#34;,                     
 *                         &#34;x-ms-meta-abc&#34;,
 *                         &#34;x-ms-meta-data*&#34;,
 *                         &#34;x-ms-meta-target*&#34;),
 *                     Map.entry(&#34;maxAgeInSeconds&#34;, 2000)
 *                 )))
 *             .fileServicesName(&#34;default&#34;)
 *             .resourceGroupName(&#34;res4410&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### PutFileServices_EnableSMBMultichannel
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.storage.FileServiceProperties;
 * import com.pulumi.azurenative.storage.FileServicePropertiesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var fileServiceProperties = new FileServiceProperties(&#34;fileServiceProperties&#34;, FileServicePropertiesArgs.builder()        
 *             .accountName(&#34;sto8607&#34;)
 *             .fileServicesName(&#34;default&#34;)
 *             .protocolSettings(Map.of(&#34;smb&#34;, Map.of(&#34;multichannel&#34;, Map.of(&#34;enabled&#34;, true))))
 *             .resourceGroupName(&#34;res4410&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### PutFileServices_EnableSecureSmbFeatures
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.storage.FileServiceProperties;
 * import com.pulumi.azurenative.storage.FileServicePropertiesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var fileServiceProperties = new FileServiceProperties(&#34;fileServiceProperties&#34;, FileServicePropertiesArgs.builder()        
 *             .accountName(&#34;sto8607&#34;)
 *             .fileServicesName(&#34;default&#34;)
 *             .protocolSettings(Map.of(&#34;smb&#34;, Map.ofEntries(
 *                 Map.entry(&#34;authenticationMethods&#34;, &#34;NTLMv2;Kerberos&#34;),
 *                 Map.entry(&#34;channelEncryption&#34;, &#34;AES-128-CCM;AES-128-GCM;AES-256-GCM&#34;),
 *                 Map.entry(&#34;kerberosTicketEncryption&#34;, &#34;RC4-HMAC;AES-256&#34;),
 *                 Map.entry(&#34;versions&#34;, &#34;SMB2.1;SMB3.0;SMB3.1.1&#34;)
 *             )))
 *             .resourceGroupName(&#34;res4410&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:FileServiceProperties default /subscriptions/{subscription-id}/resourceGroups/res4410/providers/Microsoft.Storage/storageAccounts/sto8607/fileServices/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:FileServiceProperties")
public class FileServiceProperties extends com.pulumi.resources.CustomResource {
    /**
     * Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
     */
    @Export(name="cors", type=CorsRulesResponse.class, parameters={})
    private Output</* @Nullable */ CorsRulesResponse> cors;

    /**
     * @return Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
     */
    public Output<Optional<CorsRulesResponse>> cors() {
        return Codegen.optional(this.cors);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Protocol settings for file service
     * 
     */
    @Export(name="protocolSettings", type=ProtocolSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ProtocolSettingsResponse> protocolSettings;

    /**
     * @return Protocol settings for file service
     * 
     */
    public Output<Optional<ProtocolSettingsResponse>> protocolSettings() {
        return Codegen.optional(this.protocolSettings);
    }
    /**
     * The file service properties for share soft delete.
     * 
     */
    @Export(name="shareDeleteRetentionPolicy", type=DeleteRetentionPolicyResponse.class, parameters={})
    private Output</* @Nullable */ DeleteRetentionPolicyResponse> shareDeleteRetentionPolicy;

    /**
     * @return The file service properties for share soft delete.
     * 
     */
    public Output<Optional<DeleteRetentionPolicyResponse>> shareDeleteRetentionPolicy() {
        return Codegen.optional(this.shareDeleteRetentionPolicy);
    }
    /**
     * Sku name and tier.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return Sku name and tier.
     * 
     */
    public Output<SkuResponse> sku() {
        return this.sku;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileServiceProperties(String name) {
        this(name, FileServicePropertiesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileServiceProperties(String name, FileServicePropertiesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileServiceProperties(String name, FileServicePropertiesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:FileServiceProperties", name, args == null ? FileServicePropertiesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FileServiceProperties(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:FileServiceProperties", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20190401:FileServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20190601:FileServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:FileServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:FileServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:FileServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:FileServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:FileServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:FileServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210901:FileServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20220501:FileServiceProperties").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FileServiceProperties get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FileServiceProperties(name, id, options);
    }
}