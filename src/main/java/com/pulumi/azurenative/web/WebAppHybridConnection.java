// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppHybridConnectionArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Hybrid Connection contract. This is used to configure a Hybrid Connection.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppHybridConnection myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hybridConnectionNamespaces/{namespaceName}/relays/{relayName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppHybridConnection")
public class WebAppHybridConnection extends com.pulumi.resources.CustomResource {
    /**
     * The hostname of the endpoint.
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostname;

    /**
     * @return The hostname of the endpoint.
     * 
     */
    public Output<Optional<String>> hostname() {
        return Codegen.optional(this.hostname);
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
     * The port of the endpoint.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port of the endpoint.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * The ARM URI to the Service Bus relay.
     * 
     */
    @Export(name="relayArmUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> relayArmUri;

    /**
     * @return The ARM URI to the Service Bus relay.
     * 
     */
    public Output<Optional<String>> relayArmUri() {
        return Codegen.optional(this.relayArmUri);
    }
    /**
     * The name of the Service Bus relay.
     * 
     */
    @Export(name="relayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> relayName;

    /**
     * @return The name of the Service Bus relay.
     * 
     */
    public Output<Optional<String>> relayName() {
        return Codegen.optional(this.relayName);
    }
    /**
     * The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     * 
     */
    @Export(name="sendKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> sendKeyName;

    /**
     * @return The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     * 
     */
    public Output<Optional<String>> sendKeyName() {
        return Codegen.optional(this.sendKeyName);
    }
    /**
     * The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     */
    @Export(name="sendKeyValue", type=String.class, parameters={})
    private Output</* @Nullable */ String> sendKeyValue;

    /**
     * @return The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     */
    public Output<Optional<String>> sendKeyValue() {
        return Codegen.optional(this.sendKeyValue);
    }
    /**
     * The name of the Service Bus namespace.
     * 
     */
    @Export(name="serviceBusNamespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusNamespace;

    /**
     * @return The name of the Service Bus namespace.
     * 
     */
    public Output<Optional<String>> serviceBusNamespace() {
        return Codegen.optional(this.serviceBusNamespace);
    }
    /**
     * The suffix for the service bus endpoint. By default this is .servicebus.windows.net
     * 
     */
    @Export(name="serviceBusSuffix", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusSuffix;

    /**
     * @return The suffix for the service bus endpoint. By default this is .servicebus.windows.net
     * 
     */
    public Output<Optional<String>> serviceBusSuffix() {
        return Codegen.optional(this.serviceBusSuffix);
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
    public WebAppHybridConnection(String name) {
        this(name, WebAppHybridConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppHybridConnection(String name, WebAppHybridConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppHybridConnection(String name, WebAppHybridConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHybridConnection", name, args == null ? WebAppHybridConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppHybridConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHybridConnection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppHybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:web/v20220301:WebAppHybridConnection").build())
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
    public static WebAppHybridConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppHybridConnection(name, id, options);
    }
}
