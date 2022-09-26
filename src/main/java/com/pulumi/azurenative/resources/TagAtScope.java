// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.resources.TagAtScopeArgs;
import com.pulumi.azurenative.resources.outputs.TagsResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Wrapper resource for tags API requests and responses.
 * API Version: 2019-10-01.
 * 
 * ## Example Usage
 * ### Update tags on a resource
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.resources.TagAtScope;
 * import com.pulumi.azurenative.resources.TagAtScopeArgs;
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
 *         var tagAtScope = new TagAtScope(&#34;tagAtScope&#34;, TagAtScopeArgs.builder()        
 *             .properties(Map.of(&#34;tags&#34;, Map.ofEntries(
 *                 Map.entry(&#34;tagKey1&#34;, &#34;tagValue1&#34;),
 *                 Map.entry(&#34;tagKey2&#34;, &#34;tagValue2&#34;)
 *             )))
 *             .scope(&#34;subscriptions/eaee6a92-e973-4922-9471-3a0a6abf81cd/resourcegroups/myResourceGroup/providers/myPRNameSpace/VM/myVm&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### Update tags on a subscription
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.resources.TagAtScope;
 * import com.pulumi.azurenative.resources.TagAtScopeArgs;
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
 *         var tagAtScope = new TagAtScope(&#34;tagAtScope&#34;, TagAtScopeArgs.builder()        
 *             .properties(Map.of(&#34;tags&#34;, Map.ofEntries(
 *                 Map.entry(&#34;tagKey1&#34;, &#34;tagValue1&#34;),
 *                 Map.entry(&#34;tagKey2&#34;, &#34;tagValue2&#34;)
 *             )))
 *             .scope(&#34;subscriptions/eaee6a92-e973-4922-9471-3a0a6abf81cd&#34;)
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
 * $ pulumi import azure-native:resources:TagAtScope myresource1 /{scope}/providers/Microsoft.Resources/tags/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:resources:TagAtScope")
public class TagAtScope extends com.pulumi.resources.CustomResource {
    /**
     * The name of the tags wrapper resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the tags wrapper resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The set of tags.
     * 
     */
    @Export(name="properties", type=TagsResponse.class, parameters={})
    private Output<TagsResponse> properties;

    /**
     * @return The set of tags.
     * 
     */
    public Output<TagsResponse> properties() {
        return this.properties;
    }
    /**
     * The type of the tags wrapper resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the tags wrapper resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagAtScope(String name) {
        this(name, TagAtScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagAtScope(String name, TagAtScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagAtScope(String name, TagAtScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:TagAtScope", name, args == null ? TagAtScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagAtScope(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:TagAtScope", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:resources/v20191001:TagAtScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20200601:TagAtScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20200801:TagAtScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20201001:TagAtScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210101:TagAtScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210401:TagAtScope").build())
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
    public static TagAtScope get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TagAtScope(name, id, options);
    }
}