// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedServerDnsAliasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedServerDnsAliasArgs Empty = new GetManagedServerDnsAliasArgs();

    @Import(name="dnsAliasName", required=true)
    private Output<String> dnsAliasName;

    public Output<String> dnsAliasName() {
        return this.dnsAliasName;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName", required=true)
    private Output<String> managedInstanceName;

    /**
     * @return The name of the managed instance.
     * 
     */
    public Output<String> managedInstanceName() {
        return this.managedInstanceName;
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

    private GetManagedServerDnsAliasArgs() {}

    private GetManagedServerDnsAliasArgs(GetManagedServerDnsAliasArgs $) {
        this.dnsAliasName = $.dnsAliasName;
        this.managedInstanceName = $.managedInstanceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedServerDnsAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedServerDnsAliasArgs $;

        public Builder() {
            $ = new GetManagedServerDnsAliasArgs();
        }

        public Builder(GetManagedServerDnsAliasArgs defaults) {
            $ = new GetManagedServerDnsAliasArgs(Objects.requireNonNull(defaults));
        }

        public Builder dnsAliasName(Output<String> dnsAliasName) {
            $.dnsAliasName = dnsAliasName;
            return this;
        }

        public Builder dnsAliasName(String dnsAliasName) {
            return dnsAliasName(Output.of(dnsAliasName));
        }

        /**
         * @param managedInstanceName The name of the managed instance.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceName(Output<String> managedInstanceName) {
            $.managedInstanceName = managedInstanceName;
            return this;
        }

        /**
         * @param managedInstanceName The name of the managed instance.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceName(String managedInstanceName) {
            return managedInstanceName(Output.of(managedInstanceName));
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

        public GetManagedServerDnsAliasArgs build() {
            $.dnsAliasName = Objects.requireNonNull($.dnsAliasName, "expected parameter 'dnsAliasName' to be non-null");
            $.managedInstanceName = Objects.requireNonNull($.managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
