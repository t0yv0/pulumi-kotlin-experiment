// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServerAzureADOnlyAuthenticationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerAzureADOnlyAuthenticationArgs Empty = new GetServerAzureADOnlyAuthenticationArgs();

    /**
     * The name of server azure active directory only authentication.
     * 
     */
    @Import(name="authenticationName", required=true)
    private Output<String> authenticationName;

    /**
     * @return The name of server azure active directory only authentication.
     * 
     */
    public Output<String> authenticationName() {
        return this.authenticationName;
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

    private GetServerAzureADOnlyAuthenticationArgs() {}

    private GetServerAzureADOnlyAuthenticationArgs(GetServerAzureADOnlyAuthenticationArgs $) {
        this.authenticationName = $.authenticationName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerAzureADOnlyAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerAzureADOnlyAuthenticationArgs $;

        public Builder() {
            $ = new GetServerAzureADOnlyAuthenticationArgs();
        }

        public Builder(GetServerAzureADOnlyAuthenticationArgs defaults) {
            $ = new GetServerAzureADOnlyAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationName The name of server azure active directory only authentication.
         * 
         * @return builder
         * 
         */
        public Builder authenticationName(Output<String> authenticationName) {
            $.authenticationName = authenticationName;
            return this;
        }

        /**
         * @param authenticationName The name of server azure active directory only authentication.
         * 
         * @return builder
         * 
         */
        public Builder authenticationName(String authenticationName) {
            return authenticationName(Output.of(authenticationName));
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

        public GetServerAzureADOnlyAuthenticationArgs build() {
            $.authenticationName = Objects.requireNonNull($.authenticationName, "expected parameter 'authenticationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
