// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerCommunicationLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerCommunicationLinkArgs Empty = new ServerCommunicationLinkArgs();

    /**
     * The name of the server communication link.
     * 
     */
    @Import(name="communicationLinkName")
    private @Nullable Output<String> communicationLinkName;

    /**
     * @return The name of the server communication link.
     * 
     */
    public Optional<Output<String>> communicationLinkName() {
        return Optional.ofNullable(this.communicationLinkName);
    }

    /**
     * The name of the partner server.
     * 
     */
    @Import(name="partnerServer", required=true)
    private Output<String> partnerServer;

    /**
     * @return The name of the partner server.
     * 
     */
    public Output<String> partnerServer() {
        return this.partnerServer;
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

    private ServerCommunicationLinkArgs() {}

    private ServerCommunicationLinkArgs(ServerCommunicationLinkArgs $) {
        this.communicationLinkName = $.communicationLinkName;
        this.partnerServer = $.partnerServer;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerCommunicationLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerCommunicationLinkArgs $;

        public Builder() {
            $ = new ServerCommunicationLinkArgs();
        }

        public Builder(ServerCommunicationLinkArgs defaults) {
            $ = new ServerCommunicationLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param communicationLinkName The name of the server communication link.
         * 
         * @return builder
         * 
         */
        public Builder communicationLinkName(@Nullable Output<String> communicationLinkName) {
            $.communicationLinkName = communicationLinkName;
            return this;
        }

        /**
         * @param communicationLinkName The name of the server communication link.
         * 
         * @return builder
         * 
         */
        public Builder communicationLinkName(String communicationLinkName) {
            return communicationLinkName(Output.of(communicationLinkName));
        }

        /**
         * @param partnerServer The name of the partner server.
         * 
         * @return builder
         * 
         */
        public Builder partnerServer(Output<String> partnerServer) {
            $.partnerServer = partnerServer;
            return this;
        }

        /**
         * @param partnerServer The name of the partner server.
         * 
         * @return builder
         * 
         */
        public Builder partnerServer(String partnerServer) {
            return partnerServer(Output.of(partnerServer));
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

        public ServerCommunicationLinkArgs build() {
            $.partnerServer = Objects.requireNonNull($.partnerServer, "expected parameter 'partnerServer' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
