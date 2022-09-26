// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerAzureADAdministratorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerAzureADAdministratorArgs Empty = new GetServerAzureADAdministratorArgs();

    /**
     * The name of server active directory administrator.
     * 
     */
    @Import(name="administratorName", required=true)
    private Output<String> administratorName;

    /**
     * @return The name of server active directory administrator.
     * 
     */
    public Output<String> administratorName() {
        return this.administratorName;
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

    private GetServerAzureADAdministratorArgs() {}

    private GetServerAzureADAdministratorArgs(GetServerAzureADAdministratorArgs $) {
        this.administratorName = $.administratorName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerAzureADAdministratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerAzureADAdministratorArgs $;

        public Builder() {
            $ = new GetServerAzureADAdministratorArgs();
        }

        public Builder(GetServerAzureADAdministratorArgs defaults) {
            $ = new GetServerAzureADAdministratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administratorName The name of server active directory administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorName(Output<String> administratorName) {
            $.administratorName = administratorName;
            return this;
        }

        /**
         * @param administratorName The name of server active directory administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorName(String administratorName) {
            return administratorName(Output.of(administratorName));
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

        public GetServerAzureADAdministratorArgs build() {
            $.administratorName = Objects.requireNonNull($.administratorName, "expected parameter 'administratorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
