// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFailoverGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFailoverGroupArgs Empty = new GetFailoverGroupArgs();

    /**
     * The name of the failover group.
     * 
     */
    @Import(name="failoverGroupName", required=true)
    private Output<String> failoverGroupName;

    /**
     * @return The name of the failover group.
     * 
     */
    public Output<String> failoverGroupName() {
        return this.failoverGroupName;
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
     * The name of the server containing the failover group.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server containing the failover group.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    private GetFailoverGroupArgs() {}

    private GetFailoverGroupArgs(GetFailoverGroupArgs $) {
        this.failoverGroupName = $.failoverGroupName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFailoverGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFailoverGroupArgs $;

        public Builder() {
            $ = new GetFailoverGroupArgs();
        }

        public Builder(GetFailoverGroupArgs defaults) {
            $ = new GetFailoverGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failoverGroupName The name of the failover group.
         * 
         * @return builder
         * 
         */
        public Builder failoverGroupName(Output<String> failoverGroupName) {
            $.failoverGroupName = failoverGroupName;
            return this;
        }

        /**
         * @param failoverGroupName The name of the failover group.
         * 
         * @return builder
         * 
         */
        public Builder failoverGroupName(String failoverGroupName) {
            return failoverGroupName(Output.of(failoverGroupName));
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
         * @param serverName The name of the server containing the failover group.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server containing the failover group.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public GetFailoverGroupArgs build() {
            $.failoverGroupName = Objects.requireNonNull($.failoverGroupName, "expected parameter 'failoverGroupName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}