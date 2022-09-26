// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.web.outputs.ArmIdWrapperResponse;
import com.pulumi.azurenative.web.outputs.PrivateLinkConnectionStateResponse;
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
 * Remote Private Endpoint Connection ARM resource.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### Approves or rejects a private endpoint connection for a site.
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.web.WebAppPrivateEndpointConnection;
 * import com.pulumi.azurenative.web.WebAppPrivateEndpointConnectionArgs;
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
 *         var webAppPrivateEndpointConnection = new WebAppPrivateEndpointConnection(&#34;webAppPrivateEndpointConnection&#34;, WebAppPrivateEndpointConnectionArgs.builder()        
 *             .name(&#34;testSite&#34;)
 *             .privateEndpointConnectionName(&#34;connection&#34;)
 *             .privateLinkServiceConnectionState(Map.ofEntries(
 *                 Map.entry(&#34;actionsRequired&#34;, &#34;&#34;),
 *                 Map.entry(&#34;description&#34;, &#34;Approved by admin.&#34;),
 *                 Map.entry(&#34;status&#34;, &#34;Approved&#34;)
 *             ))
 *             .resourceGroupName(&#34;rg&#34;)
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
 * $ pulumi import azure-native:web:WebAppPrivateEndpointConnection myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/privateEndpointConnections/{privateEndpointConnectionName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppPrivateEndpointConnection")
public class WebAppPrivateEndpointConnection extends com.pulumi.resources.CustomResource {
    /**
     * Private IPAddresses mapped to the remote private endpoint
     * 
     */
    @Export(name="ipAddresses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ipAddresses;

    /**
     * @return Private IPAddresses mapped to the remote private endpoint
     * 
     */
    public Output<Optional<List<String>>> ipAddresses() {
        return Codegen.optional(this.ipAddresses);
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * PrivateEndpoint of a remote private endpoint connection
     * 
     */
    @Export(name="privateEndpoint", type=ArmIdWrapperResponse.class, parameters={})
    private Output</* @Nullable */ ArmIdWrapperResponse> privateEndpoint;

    /**
     * @return PrivateEndpoint of a remote private endpoint connection
     * 
     */
    public Output<Optional<ArmIdWrapperResponse>> privateEndpoint() {
        return Codegen.optional(this.privateEndpoint);
    }
    /**
     * The state of a private link connection
     * 
     */
    @Export(name="privateLinkServiceConnectionState", type=PrivateLinkConnectionStateResponse.class, parameters={})
    private Output</* @Nullable */ PrivateLinkConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return The state of a private link connection
     * 
     */
    public Output<Optional<PrivateLinkConnectionStateResponse>> privateLinkServiceConnectionState() {
        return Codegen.optional(this.privateLinkServiceConnectionState);
    }
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppPrivateEndpointConnection(String name) {
        this(name, WebAppPrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppPrivateEndpointConnection(String name, WebAppPrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppPrivateEndpointConnection(String name, WebAppPrivateEndpointConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppPrivateEndpointConnection", name, args == null ? WebAppPrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppPrivateEndpointConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppPrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20220301:WebAppPrivateEndpointConnection").build())
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
    public static WebAppPrivateEndpointConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppPrivateEndpointConnection(name, id, options);
    }
}
