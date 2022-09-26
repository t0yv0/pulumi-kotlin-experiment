// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppPublicCertificateArgs;
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
 * Public certificate object
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppPublicCertificate myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/publicCertificates/{publicCertificateName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppPublicCertificate")
public class WebAppPublicCertificate extends com.pulumi.resources.CustomResource {
    /**
     * Public Certificate byte array
     * 
     */
    @Export(name="blob", type=String.class, parameters={})
    private Output</* @Nullable */ String> blob;

    /**
     * @return Public Certificate byte array
     * 
     */
    public Output<Optional<String>> blob() {
        return Codegen.optional(this.blob);
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
     * Public Certificate Location
     * 
     */
    @Export(name="publicCertificateLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicCertificateLocation;

    /**
     * @return Public Certificate Location
     * 
     */
    public Output<Optional<String>> publicCertificateLocation() {
        return Codegen.optional(this.publicCertificateLocation);
    }
    /**
     * Certificate Thumbprint
     * 
     */
    @Export(name="thumbprint", type=String.class, parameters={})
    private Output<String> thumbprint;

    /**
     * @return Certificate Thumbprint
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
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
    public WebAppPublicCertificate(String name) {
        this(name, WebAppPublicCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppPublicCertificate(String name, WebAppPublicCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppPublicCertificate(String name, WebAppPublicCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppPublicCertificate", name, args == null ? WebAppPublicCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppPublicCertificate(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppPublicCertificate", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppPublicCertificate").build()),
                Output.of(Alias.builder().type("azure-native:web/v20220301:WebAppPublicCertificate").build())
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
    public static WebAppPublicCertificate get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppPublicCertificate(name, id, options);
    }
}