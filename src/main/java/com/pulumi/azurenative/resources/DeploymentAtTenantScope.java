// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.resources.DeploymentAtTenantScopeArgs;
import com.pulumi.azurenative.resources.outputs.DeploymentPropertiesExtendedResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Deployment information.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * ### Create deployment at tenant scope.
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.resources.DeploymentAtTenantScope;
 * import com.pulumi.azurenative.resources.DeploymentAtTenantScopeArgs;
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
 *         var deploymentAtTenantScope = new DeploymentAtTenantScope(&#34;deploymentAtTenantScope&#34;, DeploymentAtTenantScopeArgs.builder()        
 *             .deploymentName(&#34;tenant-dep01&#34;)
 *             .location(&#34;eastus&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;mode&#34;, &#34;Incremental&#34;),
 *                 Map.entry(&#34;parameters&#34;, ),
 *                 Map.entry(&#34;templateLink&#34;, Map.of(&#34;uri&#34;, &#34;https://example.com/exampleTemplate.json&#34;))
 *             ))
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;tagKey1&#34;, &#34;tag-value-1&#34;),
 *                 Map.entry(&#34;tagKey2&#34;, &#34;tag-value-2&#34;)
 *             ))
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
 * $ pulumi import azure-native:resources:DeploymentAtTenantScope tenant-dep01 /providers/Microsoft.Resources/deployments/tenant-dep01 
 * ```
 * 
 */
@ResourceType(type="azure-native:resources:DeploymentAtTenantScope")
public class DeploymentAtTenantScope extends com.pulumi.resources.CustomResource {
    /**
     * the location of the deployment.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return the location of the deployment.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the deployment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the deployment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Deployment properties.
     * 
     */
    @Export(name="properties", type=DeploymentPropertiesExtendedResponse.class, parameters={})
    private Output<DeploymentPropertiesExtendedResponse> properties;

    /**
     * @return Deployment properties.
     * 
     */
    public Output<DeploymentPropertiesExtendedResponse> properties() {
        return this.properties;
    }
    /**
     * Deployment tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Deployment tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the deployment.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the deployment.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentAtTenantScope(String name) {
        this(name, DeploymentAtTenantScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentAtTenantScope(String name, DeploymentAtTenantScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentAtTenantScope(String name, DeploymentAtTenantScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentAtTenantScope", name, args == null ? DeploymentAtTenantScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeploymentAtTenantScope(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentAtTenantScope", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:resources/v20190701:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20190801:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20191001:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20200601:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20200801:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20201001:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210101:DeploymentAtTenantScope").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20210401:DeploymentAtTenantScope").build())
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
    public static DeploymentAtTenantScope get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentAtTenantScope(name, id, options);
    }
}