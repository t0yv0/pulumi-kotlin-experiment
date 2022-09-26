// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppDomainOwnershipIdentifierArgs;
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
 * A domain specific resource identifier.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppDomainOwnershipIdentifier myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/domainOwnershipIdentifiers/{domainOwnershipIdentifierName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppDomainOwnershipIdentifier")
public class WebAppDomainOwnershipIdentifier extends com.pulumi.resources.CustomResource {
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
     * String representation of the identity.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return String representation of the identity.
     * 
     */
    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppDomainOwnershipIdentifier(String name) {
        this(name, WebAppDomainOwnershipIdentifierArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppDomainOwnershipIdentifier(String name, WebAppDomainOwnershipIdentifierArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppDomainOwnershipIdentifier(String name, WebAppDomainOwnershipIdentifierArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppDomainOwnershipIdentifier", name, args == null ? WebAppDomainOwnershipIdentifierArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppDomainOwnershipIdentifier(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppDomainOwnershipIdentifier", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppDomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().type("azure-native:web/v20220301:WebAppDomainOwnershipIdentifier").build())
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
    public static WebAppDomainOwnershipIdentifier get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppDomainOwnershipIdentifier(name, id, options);
    }
}
