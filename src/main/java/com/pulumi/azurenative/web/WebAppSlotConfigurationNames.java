// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppSlotConfigurationNamesArgs;
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
 * Slot Config names azure resource.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppSlotConfigurationNames myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/slotConfigNames 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppSlotConfigurationNames")
public class WebAppSlotConfigurationNames extends com.pulumi.resources.CustomResource {
    /**
     * List of application settings names.
     * 
     */
    @Export(name="appSettingNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> appSettingNames;

    /**
     * @return List of application settings names.
     * 
     */
    public Output<Optional<List<String>>> appSettingNames() {
        return Codegen.optional(this.appSettingNames);
    }
    /**
     * List of external Azure storage account identifiers.
     * 
     */
    @Export(name="azureStorageConfigNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> azureStorageConfigNames;

    /**
     * @return List of external Azure storage account identifiers.
     * 
     */
    public Output<Optional<List<String>>> azureStorageConfigNames() {
        return Codegen.optional(this.azureStorageConfigNames);
    }
    /**
     * List of connection string names.
     * 
     */
    @Export(name="connectionStringNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> connectionStringNames;

    /**
     * @return List of connection string names.
     * 
     */
    public Output<Optional<List<String>>> connectionStringNames() {
        return Codegen.optional(this.connectionStringNames);
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
    public WebAppSlotConfigurationNames(String name) {
        this(name, WebAppSlotConfigurationNamesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppSlotConfigurationNames(String name, WebAppSlotConfigurationNamesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppSlotConfigurationNames(String name, WebAppSlotConfigurationNamesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSlotConfigurationNames", name, args == null ? WebAppSlotConfigurationNamesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppSlotConfigurationNames(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppSlotConfigurationNames", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppSlotConfigurationNames").build()),
                Output.of(Alias.builder().type("azure-native:web/v20220301:WebAppSlotConfigurationNames").build())
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
    public static WebAppSlotConfigurationNames get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppSlotConfigurationNames(name, id, options);
    }
}
