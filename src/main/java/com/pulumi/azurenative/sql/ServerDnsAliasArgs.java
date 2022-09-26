// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerDnsAliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerDnsAliasArgs Empty = new ServerDnsAliasArgs();

    /**
     * The name of the server dns alias.
     * 
     */
    @Import(name="dnsAliasName")
    private @Nullable Output<String> dnsAliasName;

    /**
     * @return The name of the server dns alias.
     * 
     */
    public Optional<Output<String>> dnsAliasName() {
        return Optional.ofNullable(this.dnsAliasName);
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
     * The name of the server that the alias is pointing to.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server that the alias is pointing to.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    private ServerDnsAliasArgs() {}

    private ServerDnsAliasArgs(ServerDnsAliasArgs $) {
        this.dnsAliasName = $.dnsAliasName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerDnsAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerDnsAliasArgs $;

        public Builder() {
            $ = new ServerDnsAliasArgs();
        }

        public Builder(ServerDnsAliasArgs defaults) {
            $ = new ServerDnsAliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsAliasName The name of the server dns alias.
         * 
         * @return builder
         * 
         */
        public Builder dnsAliasName(@Nullable Output<String> dnsAliasName) {
            $.dnsAliasName = dnsAliasName;
            return this;
        }

        /**
         * @param dnsAliasName The name of the server dns alias.
         * 
         * @return builder
         * 
         */
        public Builder dnsAliasName(String dnsAliasName) {
            return dnsAliasName(Output.of(dnsAliasName));
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
         * @param serverName The name of the server that the alias is pointing to.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server that the alias is pointing to.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public ServerDnsAliasArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}