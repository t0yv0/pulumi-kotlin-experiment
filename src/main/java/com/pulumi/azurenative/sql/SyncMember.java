// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.SyncMemberArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Azure SQL Database sync member.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * ### Create a new sync member
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.sql.SyncMember;
 * import com.pulumi.azurenative.sql.SyncMemberArgs;
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
 *         var syncMember = new SyncMember(&#34;syncMember&#34;, SyncMemberArgs.builder()        
 *             .databaseName(&#34;syncgroupcrud-4328&#34;)
 *             .databaseType(&#34;AzureSqlDatabase&#34;)
 *             .resourceGroupName(&#34;syncgroupcrud-65440&#34;)
 *             .serverName(&#34;syncgroupcrud-8475&#34;)
 *             .syncDirection(&#34;Bidirectional&#34;)
 *             .syncGroupName(&#34;syncgroupcrud-3187&#34;)
 *             .syncMemberAzureDatabaseResourceId(&#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/syncgroupcrud-65440/providers/Microsoft.Sql/servers/syncgroupcrud-8475/databases/syncgroupcrud-4328&#34;)
 *             .syncMemberName(&#34;syncmembercrud-4879&#34;)
 *             .usePrivateLinkConnection(true)
 *             .userName(&#34;myUser&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### Update a sync member
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.sql.SyncMember;
 * import com.pulumi.azurenative.sql.SyncMemberArgs;
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
 *         var syncMember = new SyncMember(&#34;syncMember&#34;, SyncMemberArgs.builder()        
 *             .databaseName(&#34;syncgroupcrud-4328&#34;)
 *             .databaseType(&#34;AzureSqlDatabase&#34;)
 *             .resourceGroupName(&#34;syncgroupcrud-65440&#34;)
 *             .serverName(&#34;syncgroupcrud-8475&#34;)
 *             .syncDirection(&#34;Bidirectional&#34;)
 *             .syncGroupName(&#34;syncgroupcrud-3187&#34;)
 *             .syncMemberAzureDatabaseResourceId(&#34;/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/syncgroupcrud-65440/providers/Microsoft.Sql/servers/syncgroupcrud-8475/databases/syncgroupcrud-4328&#34;)
 *             .syncMemberName(&#34;syncmembercrud-4879&#34;)
 *             .usePrivateLinkConnection(true)
 *             .userName(&#34;myUser&#34;)
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
 * $ pulumi import azure-native:sql:SyncMember syncmembercrud-4879 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/syncgroupcrud-65440/providers/Microsoft.Sql/servers/syncgroupcrud-8475/databases/syncgroupcrud-4328/syncGroups/syncgroupcrud-3187/syncMembers/syncmembercrud-4879 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:SyncMember")
public class SyncMember extends com.pulumi.resources.CustomResource {
    /**
     * Database name of the member database in the sync member.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output</* @Nullable */ String> databaseName;

    /**
     * @return Database name of the member database in the sync member.
     * 
     */
    public Output<Optional<String>> databaseName() {
        return Codegen.optional(this.databaseName);
    }
    /**
     * Database type of the sync member.
     * 
     */
    @Export(name="databaseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> databaseType;

    /**
     * @return Database type of the sync member.
     * 
     */
    public Output<Optional<String>> databaseType() {
        return Codegen.optional(this.databaseType);
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
     * Private endpoint name of the sync member if use private link connection is enabled, for sync members in Azure.
     * 
     */
    @Export(name="privateEndpointName", type=String.class, parameters={})
    private Output<String> privateEndpointName;

    /**
     * @return Private endpoint name of the sync member if use private link connection is enabled, for sync members in Azure.
     * 
     */
    public Output<String> privateEndpointName() {
        return this.privateEndpointName;
    }
    /**
     * Server name of the member database in the sync member
     * 
     */
    @Export(name="serverName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverName;

    /**
     * @return Server name of the member database in the sync member
     * 
     */
    public Output<Optional<String>> serverName() {
        return Codegen.optional(this.serverName);
    }
    /**
     * SQL Server database id of the sync member.
     * 
     */
    @Export(name="sqlServerDatabaseId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqlServerDatabaseId;

    /**
     * @return SQL Server database id of the sync member.
     * 
     */
    public Output<Optional<String>> sqlServerDatabaseId() {
        return Codegen.optional(this.sqlServerDatabaseId);
    }
    /**
     * ARM resource id of the sync agent in the sync member.
     * 
     */
    @Export(name="syncAgentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncAgentId;

    /**
     * @return ARM resource id of the sync agent in the sync member.
     * 
     */
    public Output<Optional<String>> syncAgentId() {
        return Codegen.optional(this.syncAgentId);
    }
    /**
     * Sync direction of the sync member.
     * 
     */
    @Export(name="syncDirection", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncDirection;

    /**
     * @return Sync direction of the sync member.
     * 
     */
    public Output<Optional<String>> syncDirection() {
        return Codegen.optional(this.syncDirection);
    }
    /**
     * ARM resource id of the sync member logical database, for sync members in Azure.
     * 
     */
    @Export(name="syncMemberAzureDatabaseResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncMemberAzureDatabaseResourceId;

    /**
     * @return ARM resource id of the sync member logical database, for sync members in Azure.
     * 
     */
    public Output<Optional<String>> syncMemberAzureDatabaseResourceId() {
        return Codegen.optional(this.syncMemberAzureDatabaseResourceId);
    }
    /**
     * Sync state of the sync member.
     * 
     */
    @Export(name="syncState", type=String.class, parameters={})
    private Output<String> syncState;

    /**
     * @return Sync state of the sync member.
     * 
     */
    public Output<String> syncState() {
        return this.syncState;
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
     * Whether to use private link connection.
     * 
     */
    @Export(name="usePrivateLinkConnection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> usePrivateLinkConnection;

    /**
     * @return Whether to use private link connection.
     * 
     */
    public Output<Optional<Boolean>> usePrivateLinkConnection() {
        return Codegen.optional(this.usePrivateLinkConnection);
    }
    /**
     * User name of the member database in the sync member.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output</* @Nullable */ String> userName;

    /**
     * @return User name of the member database in the sync member.
     * 
     */
    public Output<Optional<String>> userName() {
        return Codegen.optional(this.userName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SyncMember(String name) {
        this(name, SyncMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SyncMember(String name, SyncMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SyncMember(String name, SyncMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:SyncMember", name, args == null ? SyncMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SyncMember(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:SyncMember", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20150501preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20190601preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220201preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220501preview:SyncMember").build())
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
    public static SyncMember get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SyncMember(name, id, options);
    }
}