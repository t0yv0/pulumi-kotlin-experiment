// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storage.QueueArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * ### QueueOperationPut
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.storage.Queue;
 * import com.pulumi.azurenative.storage.QueueArgs;
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
 *         var queue = new Queue(&#34;queue&#34;, QueueArgs.builder()        
 *             .accountName(&#34;sto328&#34;)
 *             .queueName(&#34;queue6185&#34;)
 *             .resourceGroupName(&#34;res3376&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### QueueOperationPutWithMetadata
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.storage.Queue;
 * import com.pulumi.azurenative.storage.QueueArgs;
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
 *         var queue = new Queue(&#34;queue&#34;, QueueArgs.builder()        
 *             .accountName(&#34;sto328&#34;)
 *             .metadata(Map.ofEntries(
 *                 Map.entry(&#34;sample1&#34;, &#34;meta1&#34;),
 *                 Map.entry(&#34;sample2&#34;, &#34;meta2&#34;)
 *             ))
 *             .queueName(&#34;queue6185&#34;)
 *             .resourceGroupName(&#34;res3376&#34;)
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
 * $ pulumi import azure-native:storage:Queue queue6185 /subscriptions/{subscription-id}/resourceGroups/res3376/providers/Microsoft.Storage/storageAccounts/sto328/queueServices/default/queues/queue6185 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:Queue")
public class Queue extends com.pulumi.resources.CustomResource {
    /**
     * Integer indicating an approximate number of messages in the queue. This number is not lower than the actual number of messages in the queue, but could be higher.
     * 
     */
    @Export(name="approximateMessageCount", type=Integer.class, parameters={})
    private Output<Integer> approximateMessageCount;

    /**
     * @return Integer indicating an approximate number of messages in the queue. This number is not lower than the actual number of messages in the queue, but could be higher.
     * 
     */
    public Output<Integer> approximateMessageCount() {
        return this.approximateMessageCount;
    }
    /**
     * A name-value pair that represents queue metadata.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return A name-value pair that represents queue metadata.
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
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
    public Queue(String name) {
        this(name, QueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Queue(String name, QueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Queue(String name, QueueArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:Queue", name, args == null ? QueueArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Queue(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:Queue", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20190601:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210901:Queue").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20220501:Queue").build())
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
    public static Queue get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Queue(name, id, options);
    }
}