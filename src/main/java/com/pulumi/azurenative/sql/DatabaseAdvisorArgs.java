// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.AutoExecuteStatus;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseAdvisorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseAdvisorArgs Empty = new DatabaseAdvisorArgs();

    /**
     * The name of the Database Advisor.
     * 
     */
    @Import(name="advisorName")
    private @Nullable Output<String> advisorName;

    /**
     * @return The name of the Database Advisor.
     * 
     */
    public Optional<Output<String>> advisorName() {
        return Optional.ofNullable(this.advisorName);
    }

    /**
     * Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are &#39;Enabled&#39; and &#39;Disabled&#39;
     * 
     */
    @Import(name="autoExecuteStatus", required=true)
    private Output<AutoExecuteStatus> autoExecuteStatus;

    /**
     * @return Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are &#39;Enabled&#39; and &#39;Disabled&#39;
     * 
     */
    public Output<AutoExecuteStatus> autoExecuteStatus() {
        return this.autoExecuteStatus;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
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
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    private DatabaseAdvisorArgs() {}

    private DatabaseAdvisorArgs(DatabaseAdvisorArgs $) {
        this.advisorName = $.advisorName;
        this.autoExecuteStatus = $.autoExecuteStatus;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseAdvisorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseAdvisorArgs $;

        public Builder() {
            $ = new DatabaseAdvisorArgs();
        }

        public Builder(DatabaseAdvisorArgs defaults) {
            $ = new DatabaseAdvisorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advisorName The name of the Database Advisor.
         * 
         * @return builder
         * 
         */
        public Builder advisorName(@Nullable Output<String> advisorName) {
            $.advisorName = advisorName;
            return this;
        }

        /**
         * @param advisorName The name of the Database Advisor.
         * 
         * @return builder
         * 
         */
        public Builder advisorName(String advisorName) {
            return advisorName(Output.of(advisorName));
        }

        /**
         * @param autoExecuteStatus Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are &#39;Enabled&#39; and &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder autoExecuteStatus(Output<AutoExecuteStatus> autoExecuteStatus) {
            $.autoExecuteStatus = autoExecuteStatus;
            return this;
        }

        /**
         * @param autoExecuteStatus Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are &#39;Enabled&#39; and &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder autoExecuteStatus(AutoExecuteStatus autoExecuteStatus) {
            return autoExecuteStatus(Output.of(autoExecuteStatus));
        }

        /**
         * @param databaseName The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
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
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public DatabaseAdvisorArgs build() {
            $.autoExecuteStatus = Objects.requireNonNull($.autoExecuteStatus, "expected parameter 'autoExecuteStatus' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
