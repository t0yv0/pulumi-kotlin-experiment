// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.ManagedServerDnsAliasArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A managed server DNS alias.
 * API Version: 2021-11-01-preview.
 * 
 * ## Example Usage
 * ### Create managed server DNS alias
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.sql.ManagedServerDnsAlias;
 * import com.pulumi.azurenative.sql.ManagedServerDnsAliasArgs;
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
 *         var managedServerDnsAlias = new ManagedServerDnsAlias(&#34;managedServerDnsAlias&#34;, ManagedServerDnsAliasArgs.builder()        
 *             .dnsAliasName(&#34;dns-alias-mi&#34;)
 *             .managedInstanceName(&#34;dns-mi&#34;)
 *             .resourceGroupName(&#34;Default&#34;)
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
 * $ pulumi import azure-native:sql:ManagedServerDnsAlias dns-alias-mi /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/managedInstances/dns-mi/dnsAliases/dns-alias-mi 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ManagedServerDnsAlias")
public class ManagedServerDnsAlias extends com.pulumi.resources.CustomResource {
    /**
     * The fully qualified DNS record for managed server alias
     * 
     */
    @Export(name="azureDnsRecord", type=String.class, parameters={})
    private Output<String> azureDnsRecord;

    /**
     * @return The fully qualified DNS record for managed server alias
     * 
     */
    public Output<String> azureDnsRecord() {
        return this.azureDnsRecord;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The fully qualified public DNS record for managed server alias
     * 
     */
    @Export(name="publicAzureDnsRecord", type=String.class, parameters={})
    private Output<String> publicAzureDnsRecord;

    /**
     * @return The fully qualified public DNS record for managed server alias
     * 
     */
    public Output<String> publicAzureDnsRecord() {
        return this.publicAzureDnsRecord;
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
    public ManagedServerDnsAlias(String name) {
        this(name, ManagedServerDnsAliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedServerDnsAlias(String name, ManagedServerDnsAliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedServerDnsAlias(String name, ManagedServerDnsAliasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedServerDnsAlias", name, args == null ? ManagedServerDnsAliasArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedServerDnsAlias(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedServerDnsAlias", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20211101:ManagedServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:ManagedServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220201preview:ManagedServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220501preview:ManagedServerDnsAlias").build())
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
    public static ManagedServerDnsAlias get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedServerDnsAlias(name, id, options);
    }
}
