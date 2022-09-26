// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.ServerDnsAliasArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A server DNS alias.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * ### Create server DNS alias
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.sql.ServerDnsAlias;
 * import com.pulumi.azurenative.sql.ServerDnsAliasArgs;
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
 *         var serverDnsAlias = new ServerDnsAlias(&#34;serverDnsAlias&#34;, ServerDnsAliasArgs.builder()        
 *             .dnsAliasName(&#34;dns-alias-name-1&#34;)
 *             .resourceGroupName(&#34;Default&#34;)
 *             .serverName(&#34;dns-alias-server&#34;)
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
 * $ pulumi import azure-native:sql:ServerDnsAlias dns-alias-name-1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/servers/dns-alias-server/dnsAliases/dns-alias-name-1 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ServerDnsAlias")
public class ServerDnsAlias extends com.pulumi.resources.CustomResource {
    /**
     * The fully qualified DNS record for alias
     * 
     */
    @Export(name="azureDnsRecord", type=String.class, parameters={})
    private Output<String> azureDnsRecord;

    /**
     * @return The fully qualified DNS record for alias
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
    public ServerDnsAlias(String name) {
        this(name, ServerDnsAliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerDnsAlias(String name, ServerDnsAliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerDnsAlias(String name, ServerDnsAliasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerDnsAlias", name, args == null ? ServerDnsAliasArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerDnsAlias(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerDnsAlias", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20170301preview:ServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:ServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:ServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:ServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:ServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:ServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:ServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101:ServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:ServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220201preview:ServerDnsAlias").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220501preview:ServerDnsAlias").build())
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
    public static ServerDnsAlias get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerDnsAlias(name, id, options);
    }
}
