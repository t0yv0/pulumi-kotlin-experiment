// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storage.QueueServicePropertiesArgs;
import com.pulumi.azurenative.storage.outputs.CorsRulesResponse;
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
 * The properties of a storage account’s Queue service.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * ### QueueServicesPut
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.storage.QueueServiceProperties;
 * import com.pulumi.azurenative.storage.QueueServicePropertiesArgs;
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
 *         var queueServiceProperties = new QueueServiceProperties(&#34;queueServiceProperties&#34;, QueueServicePropertiesArgs.builder()        
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
 *             .queueServiceName(&#34;default&#34;)
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
 * $ pulumi import azure-native:storage:QueueServiceProperties default /subscriptions/{subscription-id}/resourceGroups/res4410/providers/Microsoft.Storage/storageAccounts/sto8607/queueServices/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:QueueServiceProperties")
public class QueueServiceProperties extends com.pulumi.resources.CustomResource {
    /**
     * Specifies CORS rules for the Queue service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Queue service.
     * 
     */
    @Export(name="cors", type=CorsRulesResponse.class, parameters={})
    private Output</* @Nullable */ CorsRulesResponse> cors;

    /**
     * @return Specifies CORS rules for the Queue service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the Queue service.
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
    public QueueServiceProperties(String name) {
        this(name, QueueServicePropertiesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public QueueServiceProperties(String name, QueueServicePropertiesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public QueueServiceProperties(String name, QueueServicePropertiesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:QueueServiceProperties", name, args == null ? QueueServicePropertiesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private QueueServiceProperties(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:QueueServiceProperties", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20190601:QueueServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:QueueServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:QueueServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:QueueServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:QueueServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:QueueServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:QueueServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210901:QueueServiceProperties").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20220501:QueueServiceProperties").build())
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
    public static QueueServiceProperties get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new QueueServiceProperties(name, id, options);
    }
}
