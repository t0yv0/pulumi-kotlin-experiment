// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.DataMaskingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataMaskingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataMaskingPolicyArgs Empty = new DataMaskingPolicyArgs();

    /**
     * The name of the database for which the data masking rule applies.
     * 
     */
    @Import(name="dataMaskingPolicyName")
    private @Nullable Output<String> dataMaskingPolicyName;

    /**
     * @return The name of the database for which the data masking rule applies.
     * 
     */
    public Optional<Output<String>> dataMaskingPolicyName() {
        return Optional.ofNullable(this.dataMaskingPolicyName);
    }

    /**
     * The state of the data masking policy.
     * 
     */
    @Import(name="dataMaskingState", required=true)
    private Output<DataMaskingState> dataMaskingState;

    /**
     * @return The state of the data masking policy.
     * 
     */
    public Output<DataMaskingState> dataMaskingState() {
        return this.dataMaskingState;
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
     * The list of the exempt principals. Specifies the semicolon-separated list of database users for which the data masking policy does not apply. The specified users receive data results without masking for all of the database queries.
     * 
     */
    @Import(name="exemptPrincipals")
    private @Nullable Output<String> exemptPrincipals;

    /**
     * @return The list of the exempt principals. Specifies the semicolon-separated list of database users for which the data masking policy does not apply. The specified users receive data results without masking for all of the database queries.
     * 
     */
    public Optional<Output<String>> exemptPrincipals() {
        return Optional.ofNullable(this.exemptPrincipals);
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

    private DataMaskingPolicyArgs() {}

    private DataMaskingPolicyArgs(DataMaskingPolicyArgs $) {
        this.dataMaskingPolicyName = $.dataMaskingPolicyName;
        this.dataMaskingState = $.dataMaskingState;
        this.databaseName = $.databaseName;
        this.exemptPrincipals = $.exemptPrincipals;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataMaskingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataMaskingPolicyArgs $;

        public Builder() {
            $ = new DataMaskingPolicyArgs();
        }

        public Builder(DataMaskingPolicyArgs defaults) {
            $ = new DataMaskingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataMaskingPolicyName The name of the database for which the data masking rule applies.
         * 
         * @return builder
         * 
         */
        public Builder dataMaskingPolicyName(@Nullable Output<String> dataMaskingPolicyName) {
            $.dataMaskingPolicyName = dataMaskingPolicyName;
            return this;
        }

        /**
         * @param dataMaskingPolicyName The name of the database for which the data masking rule applies.
         * 
         * @return builder
         * 
         */
        public Builder dataMaskingPolicyName(String dataMaskingPolicyName) {
            return dataMaskingPolicyName(Output.of(dataMaskingPolicyName));
        }

        /**
         * @param dataMaskingState The state of the data masking policy.
         * 
         * @return builder
         * 
         */
        public Builder dataMaskingState(Output<DataMaskingState> dataMaskingState) {
            $.dataMaskingState = dataMaskingState;
            return this;
        }

        /**
         * @param dataMaskingState The state of the data masking policy.
         * 
         * @return builder
         * 
         */
        public Builder dataMaskingState(DataMaskingState dataMaskingState) {
            return dataMaskingState(Output.of(dataMaskingState));
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
         * @param exemptPrincipals The list of the exempt principals. Specifies the semicolon-separated list of database users for which the data masking policy does not apply. The specified users receive data results without masking for all of the database queries.
         * 
         * @return builder
         * 
         */
        public Builder exemptPrincipals(@Nullable Output<String> exemptPrincipals) {
            $.exemptPrincipals = exemptPrincipals;
            return this;
        }

        /**
         * @param exemptPrincipals The list of the exempt principals. Specifies the semicolon-separated list of database users for which the data masking policy does not apply. The specified users receive data results without masking for all of the database queries.
         * 
         * @return builder
         * 
         */
        public Builder exemptPrincipals(String exemptPrincipals) {
            return exemptPrincipals(Output.of(exemptPrincipals));
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

        public DataMaskingPolicyArgs build() {
            $.dataMaskingState = Objects.requireNonNull($.dataMaskingState, "expected parameter 'dataMaskingState' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
