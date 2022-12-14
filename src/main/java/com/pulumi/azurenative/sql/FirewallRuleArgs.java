// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress. Use value &#39;0.0.0.0&#39; for all Azure-internal IP addresses.
     * 
     */
    @Import(name="endIpAddress")
    private @Nullable Output<String> endIpAddress;

    /**
     * @return The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress. Use value &#39;0.0.0.0&#39; for all Azure-internal IP addresses.
     * 
     */
    public Optional<Output<String>> endIpAddress() {
        return Optional.ofNullable(this.endIpAddress);
    }

    /**
     * The name of the firewall rule.
     * 
     */
    @Import(name="firewallRuleName")
    private @Nullable Output<String> firewallRuleName;

    /**
     * @return The name of the firewall rule.
     * 
     */
    public Optional<Output<String>> firewallRuleName() {
        return Optional.ofNullable(this.firewallRuleName);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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

    /**
     * The start IP address of the firewall rule. Must be IPv4 format. Use value &#39;0.0.0.0&#39; for all Azure-internal IP addresses.
     * 
     */
    @Import(name="startIpAddress")
    private @Nullable Output<String> startIpAddress;

    /**
     * @return The start IP address of the firewall rule. Must be IPv4 format. Use value &#39;0.0.0.0&#39; for all Azure-internal IP addresses.
     * 
     */
    public Optional<Output<String>> startIpAddress() {
        return Optional.ofNullable(this.startIpAddress);
    }

    private FirewallRuleArgs() {}

    private FirewallRuleArgs(FirewallRuleArgs $) {
        this.endIpAddress = $.endIpAddress;
        this.firewallRuleName = $.firewallRuleName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.startIpAddress = $.startIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleArgs $;

        public Builder() {
            $ = new FirewallRuleArgs();
        }

        public Builder(FirewallRuleArgs defaults) {
            $ = new FirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endIpAddress The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress. Use value &#39;0.0.0.0&#39; for all Azure-internal IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(@Nullable Output<String> endIpAddress) {
            $.endIpAddress = endIpAddress;
            return this;
        }

        /**
         * @param endIpAddress The end IP address of the firewall rule. Must be IPv4 format. Must be greater than or equal to startIpAddress. Use value &#39;0.0.0.0&#39; for all Azure-internal IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(String endIpAddress) {
            return endIpAddress(Output.of(endIpAddress));
        }

        /**
         * @param firewallRuleName The name of the firewall rule.
         * 
         * @return builder
         * 
         */
        public Builder firewallRuleName(@Nullable Output<String> firewallRuleName) {
            $.firewallRuleName = firewallRuleName;
            return this;
        }

        /**
         * @param firewallRuleName The name of the firewall rule.
         * 
         * @return builder
         * 
         */
        public Builder firewallRuleName(String firewallRuleName) {
            return firewallRuleName(Output.of(firewallRuleName));
        }

        /**
         * @param name Resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        /**
         * @param startIpAddress The start IP address of the firewall rule. Must be IPv4 format. Use value &#39;0.0.0.0&#39; for all Azure-internal IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(@Nullable Output<String> startIpAddress) {
            $.startIpAddress = startIpAddress;
            return this;
        }

        /**
         * @param startIpAddress The start IP address of the firewall rule. Must be IPv4 format. Use value &#39;0.0.0.0&#39; for all Azure-internal IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(String startIpAddress) {
            return startIpAddress(Output.of(startIpAddress));
        }

        public FirewallRuleArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
