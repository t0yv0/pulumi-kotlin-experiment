// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.FailoverGroupArgs;
import com.pulumi.azurenative.sql.outputs.FailoverGroupReadOnlyEndpointResponse;
import com.pulumi.azurenative.sql.outputs.FailoverGroupReadWriteEndpointResponse;
import com.pulumi.azurenative.sql.outputs.PartnerInfoResponse;
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
 * A failover group.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * ### Create failover group
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.sql.FailoverGroup;
 * import com.pulumi.azurenative.sql.FailoverGroupArgs;
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
 *         var failoverGroup = new FailoverGroup(&#34;failoverGroup&#34;, FailoverGroupArgs.builder()        
 *             .databases(            
 *                 &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/servers/failover-group-primary-server/databases/testdb-1&#34;,
 *                 &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/servers/failover-group-primary-server/databases/testdb-2&#34;)
 *             .failoverGroupName(&#34;failover-group-test-3&#34;)
 *             .partnerServers(Map.of(&#34;id&#34;, &#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/servers/failover-group-secondary-server&#34;))
 *             .readOnlyEndpoint(Map.of(&#34;failoverPolicy&#34;, &#34;Disabled&#34;))
 *             .readWriteEndpoint(Map.ofEntries(
 *                 Map.entry(&#34;failoverPolicy&#34;, &#34;Automatic&#34;),
 *                 Map.entry(&#34;failoverWithDataLossGracePeriodMinutes&#34;, 480)
 *             ))
 *             .resourceGroupName(&#34;Default&#34;)
 *             .serverName(&#34;failover-group-primary-server&#34;)
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
 * $ pulumi import azure-native:sql:FailoverGroup failover-group-test-3 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/servers/failover-group-primary-server/failoverGroups/failover-group-test-3 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:FailoverGroup")
public class FailoverGroup extends com.pulumi.resources.CustomResource {
    /**
     * List of databases in the failover group.
     * 
     */
    @Export(name="databases", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> databases;

    /**
     * @return List of databases in the failover group.
     * 
     */
    public Output<Optional<List<String>>> databases() {
        return Codegen.optional(this.databases);
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * List of partner server information for the failover group.
     * 
     */
    @Export(name="partnerServers", type=List.class, parameters={PartnerInfoResponse.class})
    private Output<List<PartnerInfoResponse>> partnerServers;

    /**
     * @return List of partner server information for the failover group.
     * 
     */
    public Output<List<PartnerInfoResponse>> partnerServers() {
        return this.partnerServers;
    }
    /**
     * Read-only endpoint of the failover group instance.
     * 
     */
    @Export(name="readOnlyEndpoint", type=FailoverGroupReadOnlyEndpointResponse.class, parameters={})
    private Output</* @Nullable */ FailoverGroupReadOnlyEndpointResponse> readOnlyEndpoint;

    /**
     * @return Read-only endpoint of the failover group instance.
     * 
     */
    public Output<Optional<FailoverGroupReadOnlyEndpointResponse>> readOnlyEndpoint() {
        return Codegen.optional(this.readOnlyEndpoint);
    }
    /**
     * Read-write endpoint of the failover group instance.
     * 
     */
    @Export(name="readWriteEndpoint", type=FailoverGroupReadWriteEndpointResponse.class, parameters={})
    private Output<FailoverGroupReadWriteEndpointResponse> readWriteEndpoint;

    /**
     * @return Read-write endpoint of the failover group instance.
     * 
     */
    public Output<FailoverGroupReadWriteEndpointResponse> readWriteEndpoint() {
        return this.readWriteEndpoint;
    }
    /**
     * Local replication role of the failover group instance.
     * 
     */
    @Export(name="replicationRole", type=String.class, parameters={})
    private Output<String> replicationRole;

    /**
     * @return Local replication role of the failover group instance.
     * 
     */
    public Output<String> replicationRole() {
        return this.replicationRole;
    }
    /**
     * Replication state of the failover group instance.
     * 
     */
    @Export(name="replicationState", type=String.class, parameters={})
    private Output<String> replicationState;

    /**
     * @return Replication state of the failover group instance.
     * 
     */
    public Output<String> replicationState() {
        return this.replicationState;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public FailoverGroup(String name) {
        this(name, FailoverGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FailoverGroup(String name, FailoverGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FailoverGroup(String name, FailoverGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:FailoverGroup", name, args == null ? FailoverGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FailoverGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:FailoverGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20150501preview:FailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:FailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:FailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:FailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:FailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:FailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:FailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101:FailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:FailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220201preview:FailoverGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220501preview:FailoverGroup").build())
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
    public static FailoverGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FailoverGroup(name, id, options);
    }
}