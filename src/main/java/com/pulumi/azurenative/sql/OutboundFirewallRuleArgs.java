// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutboundFirewallRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutboundFirewallRuleArgs Empty = new OutboundFirewallRuleArgs();

    @Import(name="outboundRuleFqdn")
    private @Nullable Output<String> outboundRuleFqdn;

    public Optional<Output<String>> outboundRuleFqdn() {
        return Optional.ofNullable(this.outboundRuleFqdn);
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

    private OutboundFirewallRuleArgs() {}

    private OutboundFirewallRuleArgs(OutboundFirewallRuleArgs $) {
        this.outboundRuleFqdn = $.outboundRuleFqdn;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutboundFirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutboundFirewallRuleArgs $;

        public Builder() {
            $ = new OutboundFirewallRuleArgs();
        }

        public Builder(OutboundFirewallRuleArgs defaults) {
            $ = new OutboundFirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder outboundRuleFqdn(@Nullable Output<String> outboundRuleFqdn) {
            $.outboundRuleFqdn = outboundRuleFqdn;
            return this;
        }

        public Builder outboundRuleFqdn(String outboundRuleFqdn) {
            return outboundRuleFqdn(Output.of(outboundRuleFqdn));
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

        public OutboundFirewallRuleArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}