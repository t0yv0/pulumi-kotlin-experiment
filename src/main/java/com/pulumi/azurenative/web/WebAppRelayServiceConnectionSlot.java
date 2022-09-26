// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppRelayServiceConnectionSlotArgs;
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
 * Hybrid Connection for an App Service app.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppRelayServiceConnectionSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/hybridconnection/{entityName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppRelayServiceConnectionSlot")
public class WebAppRelayServiceConnectionSlot extends com.pulumi.resources.CustomResource {
    @Export(name="biztalkUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> biztalkUri;

    public Output<Optional<String>> biztalkUri() {
        return Codegen.optional(this.biztalkUri);
    }
    @Export(name="entityConnectionString", type=String.class, parameters={})
    private Output</* @Nullable */ String> entityConnectionString;

    public Output<Optional<String>> entityConnectionString() {
        return Codegen.optional(this.entityConnectionString);
    }
    @Export(name="entityName", type=String.class, parameters={})
    private Output</* @Nullable */ String> entityName;

    public Output<Optional<String>> entityName() {
        return Codegen.optional(this.entityName);
    }
    @Export(name="hostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostname;

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
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    @Export(name="resourceConnectionString", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceConnectionString;

    public Output<Optional<String>> resourceConnectionString() {
        return Codegen.optional(this.resourceConnectionString);
    }
    @Export(name="resourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceType;

    public Output<Optional<String>> resourceType() {
        return Codegen.optional(this.resourceType);
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
    public WebAppRelayServiceConnectionSlot(String name) {
        this(name, WebAppRelayServiceConnectionSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppRelayServiceConnectionSlot(String name, WebAppRelayServiceConnectionSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppRelayServiceConnectionSlot(String name, WebAppRelayServiceConnectionSlotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppRelayServiceConnectionSlot", name, args == null ? WebAppRelayServiceConnectionSlotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppRelayServiceConnectionSlot(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppRelayServiceConnectionSlot", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppRelayServiceConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20220301:WebAppRelayServiceConnectionSlot").build())
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
    public static WebAppRelayServiceConnectionSlot get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppRelayServiceConnectionSlot(name, id, options);
    }
}
