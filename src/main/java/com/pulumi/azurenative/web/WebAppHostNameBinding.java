// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppHostNameBindingArgs;
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
 * A hostname binding object.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppHostNameBinding myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/hostNameBindings/{hostName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppHostNameBinding")
public class WebAppHostNameBinding extends com.pulumi.resources.CustomResource {
    /**
     * Azure resource name.
     * 
     */
    @Export(name="azureResourceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureResourceName;

    /**
     * @return Azure resource name.
     * 
     */
    public Output<Optional<String>> azureResourceName() {
        return Codegen.optional(this.azureResourceName);
    }
    /**
     * Azure resource type.
     * 
     */
    @Export(name="azureResourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureResourceType;

    /**
     * @return Azure resource type.
     * 
     */
    public Output<Optional<String>> azureResourceType() {
        return Codegen.optional(this.azureResourceType);
    }
    /**
     * Custom DNS record type.
     * 
     */
    @Export(name="customHostNameDnsRecordType", type=String.class, parameters={})
    private Output</* @Nullable */ String> customHostNameDnsRecordType;

    /**
     * @return Custom DNS record type.
     * 
     */
    public Output<Optional<String>> customHostNameDnsRecordType() {
        return Codegen.optional(this.customHostNameDnsRecordType);
    }
    /**
     * Fully qualified ARM domain resource URI.
     * 
     */
    @Export(name="domainId", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainId;

    /**
     * @return Fully qualified ARM domain resource URI.
     * 
     */
    public Output<Optional<String>> domainId() {
        return Codegen.optional(this.domainId);
    }
    /**
     * Hostname type.
     * 
     */
    @Export(name="hostNameType", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostNameType;

    /**
     * @return Hostname type.
     * 
     */
    public Output<Optional<String>> hostNameType() {
        return Codegen.optional(this.hostNameType);
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
     * App Service app name.
     * 
     */
    @Export(name="siteName", type=String.class, parameters={})
    private Output</* @Nullable */ String> siteName;

    /**
     * @return App Service app name.
     * 
     */
    public Output<Optional<String>> siteName() {
        return Codegen.optional(this.siteName);
    }
    /**
     * SSL type
     * 
     */
    @Export(name="sslState", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslState;

    /**
     * @return SSL type
     * 
     */
    public Output<Optional<String>> sslState() {
        return Codegen.optional(this.sslState);
    }
    /**
     * SSL certificate thumbprint
     * 
     */
    @Export(name="thumbprint", type=String.class, parameters={})
    private Output</* @Nullable */ String> thumbprint;

    /**
     * @return SSL certificate thumbprint
     * 
     */
    public Output<Optional<String>> thumbprint() {
        return Codegen.optional(this.thumbprint);
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
     * Virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    @Export(name="virtualIP", type=String.class, parameters={})
    private Output<String> virtualIP;

    /**
     * @return Virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    public Output<String> virtualIP() {
        return this.virtualIP;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppHostNameBinding(String name) {
        this(name, WebAppHostNameBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppHostNameBinding(String name, WebAppHostNameBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppHostNameBinding(String name, WebAppHostNameBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHostNameBinding", name, args == null ? WebAppHostNameBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppHostNameBinding(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHostNameBinding", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppHostNameBinding").build()),
                Output.of(Alias.builder().type("azure-native:web/v20220301:WebAppHostNameBinding").build())
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
    public static WebAppHostNameBinding get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppHostNameBinding(name, id, options);
    }
}