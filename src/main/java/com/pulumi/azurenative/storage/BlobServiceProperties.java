// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storage.BlobServicePropertiesArgs;
import com.pulumi.azurenative.storage.outputs.ChangeFeedResponse;
import com.pulumi.azurenative.storage.outputs.CorsRulesResponse;
import com.pulumi.azurenative.storage.outputs.DeleteRetentionPolicyResponse;
import com.pulumi.azurenative.storage.outputs.LastAccessTimeTrackingPolicyResponse;
import com.pulumi.azurenative.storage.outputs.RestorePolicyPropertiesResponse;
import com.pulumi.azurenative.storage.outputs.SkuResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The properties of a storage account’s Blob service.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * ### BlobServicesPutLastAccessTimeBasedTracking
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.storage.BlobServiceProperties;
 * import com.pulumi.azurenative.storage.BlobServicePropertiesArgs;
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
 *         var blobServiceProperties = new BlobServiceProperties(&#34;blobServiceProperties&#34;, BlobServicePropertiesArgs.builder()        
 *             .accountName(&#34;sto8607&#34;)
 *             .blobServicesName(&#34;default&#34;)
 *             .lastAccessTimeTrackingPolicy(Map.ofEntries(
 *                 Map.entry(&#34;blobType&#34;, &#34;blockBlob&#34;),
 *                 Map.entry(&#34;enable&#34;, true),
 *                 Map.entry(&#34;name&#34;, &#34;AccessTimeTracking&#34;),
 *                 Map.entry(&#34;trackingGranularityInDays&#34;, 1)
 *             ))
 *             .resourceGroupName(&#34;res4410&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### PutBlobServices
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.storage.BlobServiceProperties;
 * import com.pulumi.azurenative.storage.BlobServicePropertiesArgs;
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
 *         var blobServiceProperties = new BlobServiceProperties(&#34;blobServiceProperties&#34;, BlobServicePropertiesArgs.builder()        
 *             .accountName(&#34;sto8607&#34;)
 *             .blobServicesName(&#34;default&#34;)
 *             .changeFeed(Map.ofEntries(
 *                 Map.entry(&#34;enabled&#34;, true),
 *                 Map.entry(&#34;retentionInDays&#34;, 7)
 *             ))
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
 *                         &#34;x -ms-meta-target*&#34;),
 *                     Map.entry(&#34;maxAgeInSeconds&#34;, 2000)
 *                 )))
 *             .defaultServiceVersion(&#34;2017-07-29&#34;)
 *             .deleteRetentionPolicy(Map.ofEntries(
 *                 Map.entry(&#34;days&#34;, 300),
 *                 Map.entry(&#34;enabled&#34;, true)
 *             ))
 *             .isVersioningEnabled(true)
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
 * $ pulumi import azure-native:storage:BlobServiceProperties default /subscriptions/{subscription-id}/resourceGroups/res4410/providers/Microsoft.Storage/storageAccounts/sto8607/blobServices/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:BlobServiceProperties")
public class BlobServiceProperties extends com.pulumi.resources.CustomResource {
    /**
     * Deprecated in favor of isVersioningEnabled property.
     * 
     */
    @Export(name="automaticSnapshotPolicyEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> automaticSnapshotPolicyEnabled;

    /**
     * @return Deprecated in favor of isVersioningEnabled property.
     * 
     */
    public Output<Optional<Boolean>> automaticSnapshotPolicyEnabled() {
        return Codegen.optional(this.automaticSnapshotPolicyEnabled);
    }
    /**
     * The blob service properties for change feed events.
     * 
     */
    @Export(name="changeFeed", type=ChangeFeedResponse.class, parameters={})
    private Output</* @Nullable */ ChangeFeedResponse> changeFeed;

    /**
     * @return The blob service properties for change feed events.
     * 
     */
    public Output<Optional<ChangeFeedResponse>> changeFeed() {
        return Codegen.optional(this.changeFeed);
    }
    /**
     * The blob service properties for container soft delete.
     * 
     */
    @Export(name="containerDeleteRetentionPolicy", type=DeleteRetentionPolicyResponse.class, parameters={})
    private Output</* @Nullable */ DeleteRetentionPolicyResponse> containerDeleteRetentionPolicy;

    /**
     * @return The blob service properties for container soft delete.
     * 
     */
    public Output<Optional<DeleteRetentionPolicyResponse>> containerDeleteRetentionPolicy() {
        return Codegen.optional(this.containerDeleteRetentionPolicy);
    }
    /**
     * Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Blob service.
     * 
     */
    @Export(name="cors", type=CorsRulesResponse.class, parameters={})
    private Output</* @Nullable */ CorsRulesResponse> cors;

    /**
     * @return Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Blob service.
     * 
     */
    public Output<Optional<CorsRulesResponse>> cors() {
        return Codegen.optional(this.cors);
    }
    /**
     * DefaultServiceVersion indicates the default version to use for requests to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27 and all more recent versions.
     * 
     */
    @Export(name="defaultServiceVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultServiceVersion;

    /**
     * @return DefaultServiceVersion indicates the default version to use for requests to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27 and all more recent versions.
     * 
     */
    public Output<Optional<String>> defaultServiceVersion() {
        return Codegen.optional(this.defaultServiceVersion);
    }
    /**
     * The blob service properties for blob soft delete.
     * 
     */
    @Export(name="deleteRetentionPolicy", type=DeleteRetentionPolicyResponse.class, parameters={})
    private Output</* @Nullable */ DeleteRetentionPolicyResponse> deleteRetentionPolicy;

    /**
     * @return The blob service properties for blob soft delete.
     * 
     */
    public Output<Optional<DeleteRetentionPolicyResponse>> deleteRetentionPolicy() {
        return Codegen.optional(this.deleteRetentionPolicy);
    }
    /**
     * Versioning is enabled if set to true.
     * 
     */
    @Export(name="isVersioningEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isVersioningEnabled;

    /**
     * @return Versioning is enabled if set to true.
     * 
     */
    public Output<Optional<Boolean>> isVersioningEnabled() {
        return Codegen.optional(this.isVersioningEnabled);
    }
    /**
     * The blob service property to configure last access time based tracking policy.
     * 
     */
    @Export(name="lastAccessTimeTrackingPolicy", type=LastAccessTimeTrackingPolicyResponse.class, parameters={})
    private Output</* @Nullable */ LastAccessTimeTrackingPolicyResponse> lastAccessTimeTrackingPolicy;

    /**
     * @return The blob service property to configure last access time based tracking policy.
     * 
     */
    public Output<Optional<LastAccessTimeTrackingPolicyResponse>> lastAccessTimeTrackingPolicy() {
        return Codegen.optional(this.lastAccessTimeTrackingPolicy);
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
     * The blob service properties for blob restore policy.
     * 
     */
    @Export(name="restorePolicy", type=RestorePolicyPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ RestorePolicyPropertiesResponse> restorePolicy;

    /**
     * @return The blob service properties for blob restore policy.
     * 
     */
    public Output<Optional<RestorePolicyPropertiesResponse>> restorePolicy() {
        return Codegen.optional(this.restorePolicy);
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
    public BlobServiceProperties(String name) {
        this(name, BlobServicePropertiesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BlobServiceProperties(String name, BlobServicePropertiesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BlobServiceProperties(String name, BlobServicePropertiesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:BlobServiceProperties", name, args == null ? BlobServicePropertiesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BlobServiceProperties(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:BlobServiceProperties", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20180701:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20181101:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20190401:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20190601:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210901:BlobServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20220501:BlobServiceProperties").build())
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
    public static BlobServiceProperties get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BlobServiceProperties(name, id, options);
    }
}