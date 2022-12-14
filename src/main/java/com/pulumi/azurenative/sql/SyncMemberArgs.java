// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.SyncDirection;
import com.pulumi.azurenative.sql.enums.SyncMemberDbType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyncMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyncMemberArgs Empty = new SyncMemberArgs();

    /**
     * Database name of the member database in the sync member.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return Database name of the member database in the sync member.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * Database type of the sync member.
     * 
     */
    @Import(name="databaseType")
    private @Nullable Output<Either<String,SyncMemberDbType>> databaseType;

    /**
     * @return Database type of the sync member.
     * 
     */
    public Optional<Output<Either<String,SyncMemberDbType>>> databaseType() {
        return Optional.ofNullable(this.databaseType);
    }

    /**
     * Password of the member database in the sync member.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password of the member database in the sync member.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Server name of the member database in the sync member
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return Server name of the member database in the sync member
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * SQL Server database id of the sync member.
     * 
     */
    @Import(name="sqlServerDatabaseId")
    private @Nullable Output<String> sqlServerDatabaseId;

    /**
     * @return SQL Server database id of the sync member.
     * 
     */
    public Optional<Output<String>> sqlServerDatabaseId() {
        return Optional.ofNullable(this.sqlServerDatabaseId);
    }

    /**
     * ARM resource id of the sync agent in the sync member.
     * 
     */
    @Import(name="syncAgentId")
    private @Nullable Output<String> syncAgentId;

    /**
     * @return ARM resource id of the sync agent in the sync member.
     * 
     */
    public Optional<Output<String>> syncAgentId() {
        return Optional.ofNullable(this.syncAgentId);
    }

    /**
     * Sync direction of the sync member.
     * 
     */
    @Import(name="syncDirection")
    private @Nullable Output<Either<String,SyncDirection>> syncDirection;

    /**
     * @return Sync direction of the sync member.
     * 
     */
    public Optional<Output<Either<String,SyncDirection>>> syncDirection() {
        return Optional.ofNullable(this.syncDirection);
    }

    /**
     * The name of the sync group on which the sync member is hosted.
     * 
     */
    @Import(name="syncGroupName", required=true)
    private Output<String> syncGroupName;

    /**
     * @return The name of the sync group on which the sync member is hosted.
     * 
     */
    public Output<String> syncGroupName() {
        return this.syncGroupName;
    }

    /**
     * ARM resource id of the sync member logical database, for sync members in Azure.
     * 
     */
    @Import(name="syncMemberAzureDatabaseResourceId")
    private @Nullable Output<String> syncMemberAzureDatabaseResourceId;

    /**
     * @return ARM resource id of the sync member logical database, for sync members in Azure.
     * 
     */
    public Optional<Output<String>> syncMemberAzureDatabaseResourceId() {
        return Optional.ofNullable(this.syncMemberAzureDatabaseResourceId);
    }

    /**
     * The name of the sync member.
     * 
     */
    @Import(name="syncMemberName")
    private @Nullable Output<String> syncMemberName;

    /**
     * @return The name of the sync member.
     * 
     */
    public Optional<Output<String>> syncMemberName() {
        return Optional.ofNullable(this.syncMemberName);
    }

    /**
     * Whether to use private link connection.
     * 
     */
    @Import(name="usePrivateLinkConnection")
    private @Nullable Output<Boolean> usePrivateLinkConnection;

    /**
     * @return Whether to use private link connection.
     * 
     */
    public Optional<Output<Boolean>> usePrivateLinkConnection() {
        return Optional.ofNullable(this.usePrivateLinkConnection);
    }

    /**
     * User name of the member database in the sync member.
     * 
     */
    @Import(name="userName")
    private @Nullable Output<String> userName;

    /**
     * @return User name of the member database in the sync member.
     * 
     */
    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private SyncMemberArgs() {}

    private SyncMemberArgs(SyncMemberArgs $) {
        this.databaseName = $.databaseName;
        this.databaseType = $.databaseType;
        this.password = $.password;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.sqlServerDatabaseId = $.sqlServerDatabaseId;
        this.syncAgentId = $.syncAgentId;
        this.syncDirection = $.syncDirection;
        this.syncGroupName = $.syncGroupName;
        this.syncMemberAzureDatabaseResourceId = $.syncMemberAzureDatabaseResourceId;
        this.syncMemberName = $.syncMemberName;
        this.usePrivateLinkConnection = $.usePrivateLinkConnection;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyncMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyncMemberArgs $;

        public Builder() {
            $ = new SyncMemberArgs();
        }

        public Builder(SyncMemberArgs defaults) {
            $ = new SyncMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName Database name of the member database in the sync member.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Database name of the member database in the sync member.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param databaseType Database type of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(@Nullable Output<Either<String,SyncMemberDbType>> databaseType) {
            $.databaseType = databaseType;
            return this;
        }

        /**
         * @param databaseType Database type of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(Either<String,SyncMemberDbType> databaseType) {
            return databaseType(Output.of(databaseType));
        }

        /**
         * @param databaseType Database type of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(String databaseType) {
            return databaseType(Either.ofLeft(databaseType));
        }

        /**
         * @param databaseType Database type of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder databaseType(SyncMemberDbType databaseType) {
            return databaseType(Either.ofRight(databaseType));
        }

        /**
         * @param password Password of the member database in the sync member.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password of the member database in the sync member.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName Server name of the member database in the sync member
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName Server name of the member database in the sync member
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param sqlServerDatabaseId SQL Server database id of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder sqlServerDatabaseId(@Nullable Output<String> sqlServerDatabaseId) {
            $.sqlServerDatabaseId = sqlServerDatabaseId;
            return this;
        }

        /**
         * @param sqlServerDatabaseId SQL Server database id of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder sqlServerDatabaseId(String sqlServerDatabaseId) {
            return sqlServerDatabaseId(Output.of(sqlServerDatabaseId));
        }

        /**
         * @param syncAgentId ARM resource id of the sync agent in the sync member.
         * 
         * @return builder
         * 
         */
        public Builder syncAgentId(@Nullable Output<String> syncAgentId) {
            $.syncAgentId = syncAgentId;
            return this;
        }

        /**
         * @param syncAgentId ARM resource id of the sync agent in the sync member.
         * 
         * @return builder
         * 
         */
        public Builder syncAgentId(String syncAgentId) {
            return syncAgentId(Output.of(syncAgentId));
        }

        /**
         * @param syncDirection Sync direction of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder syncDirection(@Nullable Output<Either<String,SyncDirection>> syncDirection) {
            $.syncDirection = syncDirection;
            return this;
        }

        /**
         * @param syncDirection Sync direction of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder syncDirection(Either<String,SyncDirection> syncDirection) {
            return syncDirection(Output.of(syncDirection));
        }

        /**
         * @param syncDirection Sync direction of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder syncDirection(String syncDirection) {
            return syncDirection(Either.ofLeft(syncDirection));
        }

        /**
         * @param syncDirection Sync direction of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder syncDirection(SyncDirection syncDirection) {
            return syncDirection(Either.ofRight(syncDirection));
        }

        /**
         * @param syncGroupName The name of the sync group on which the sync member is hosted.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(Output<String> syncGroupName) {
            $.syncGroupName = syncGroupName;
            return this;
        }

        /**
         * @param syncGroupName The name of the sync group on which the sync member is hosted.
         * 
         * @return builder
         * 
         */
        public Builder syncGroupName(String syncGroupName) {
            return syncGroupName(Output.of(syncGroupName));
        }

        /**
         * @param syncMemberAzureDatabaseResourceId ARM resource id of the sync member logical database, for sync members in Azure.
         * 
         * @return builder
         * 
         */
        public Builder syncMemberAzureDatabaseResourceId(@Nullable Output<String> syncMemberAzureDatabaseResourceId) {
            $.syncMemberAzureDatabaseResourceId = syncMemberAzureDatabaseResourceId;
            return this;
        }

        /**
         * @param syncMemberAzureDatabaseResourceId ARM resource id of the sync member logical database, for sync members in Azure.
         * 
         * @return builder
         * 
         */
        public Builder syncMemberAzureDatabaseResourceId(String syncMemberAzureDatabaseResourceId) {
            return syncMemberAzureDatabaseResourceId(Output.of(syncMemberAzureDatabaseResourceId));
        }

        /**
         * @param syncMemberName The name of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder syncMemberName(@Nullable Output<String> syncMemberName) {
            $.syncMemberName = syncMemberName;
            return this;
        }

        /**
         * @param syncMemberName The name of the sync member.
         * 
         * @return builder
         * 
         */
        public Builder syncMemberName(String syncMemberName) {
            return syncMemberName(Output.of(syncMemberName));
        }

        /**
         * @param usePrivateLinkConnection Whether to use private link connection.
         * 
         * @return builder
         * 
         */
        public Builder usePrivateLinkConnection(@Nullable Output<Boolean> usePrivateLinkConnection) {
            $.usePrivateLinkConnection = usePrivateLinkConnection;
            return this;
        }

        /**
         * @param usePrivateLinkConnection Whether to use private link connection.
         * 
         * @return builder
         * 
         */
        public Builder usePrivateLinkConnection(Boolean usePrivateLinkConnection) {
            return usePrivateLinkConnection(Output.of(usePrivateLinkConnection));
        }

        /**
         * @param userName User name of the member database in the sync member.
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName User name of the member database in the sync member.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public SyncMemberArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.syncGroupName = Objects.requireNonNull($.syncGroupName, "expected parameter 'syncGroupName' to be non-null");
            return $;
        }
    }

}
