// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.inputs.ManagedInstancePrivateEndpointPropertyArgs;
import com.pulumi.azurenative.sql.inputs.ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedInstancePrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstancePrivateEndpointConnectionArgs Empty = new ManagedInstancePrivateEndpointConnectionArgs();

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
     * Private endpoint which the connection belongs to.
     * 
     */
    @Import(name="privateEndpoint")
    private @Nullable Output<ManagedInstancePrivateEndpointPropertyArgs> privateEndpoint;

    /**
     * @return Private endpoint which the connection belongs to.
     * 
     */
    public Optional<Output<ManagedInstancePrivateEndpointPropertyArgs>> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }

    @Import(name="privateEndpointConnectionName")
    private @Nullable Output<String> privateEndpointConnectionName;

    public Optional<Output<String>> privateEndpointConnectionName() {
        return Optional.ofNullable(this.privateEndpointConnectionName);
    }

    /**
     * Connection State of the Private Endpoint Connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
    private @Nullable Output<ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState;

    /**
     * @return Connection State of the Private Endpoint Connection.
     * 
     */
    public Optional<Output<ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs>> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
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

    private ManagedInstancePrivateEndpointConnectionArgs() {}

    private ManagedInstancePrivateEndpointConnectionArgs(ManagedInstancePrivateEndpointConnectionArgs $) {
        this.managedInstanceName = $.managedInstanceName;
        this.privateEndpoint = $.privateEndpoint;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = $.privateLinkServiceConnectionState;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstancePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstancePrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new ManagedInstancePrivateEndpointConnectionArgs();
        }

        public Builder(ManagedInstancePrivateEndpointConnectionArgs defaults) {
            $ = new ManagedInstancePrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
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
         * @param privateEndpoint Private endpoint which the connection belongs to.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(@Nullable Output<ManagedInstancePrivateEndpointPropertyArgs> privateEndpoint) {
            $.privateEndpoint = privateEndpoint;
            return this;
        }

        /**
         * @param privateEndpoint Private endpoint which the connection belongs to.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpoint(ManagedInstancePrivateEndpointPropertyArgs privateEndpoint) {
            return privateEndpoint(Output.of(privateEndpoint));
        }

        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        /**
         * @param privateLinkServiceConnectionState Connection State of the Private Endpoint Connection.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(@Nullable Output<ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState) {
            $.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        /**
         * @param privateLinkServiceConnectionState Connection State of the Private Endpoint Connection.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceConnectionState(ManagedInstancePrivateLinkServiceConnectionStatePropertyArgs privateLinkServiceConnectionState) {
            return privateLinkServiceConnectionState(Output.of(privateLinkServiceConnectionState));
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

        public ManagedInstancePrivateEndpointConnectionArgs build() {
            $.managedInstanceName = Objects.requireNonNull($.managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
