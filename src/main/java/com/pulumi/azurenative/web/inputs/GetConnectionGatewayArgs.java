// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionGatewayArgs Empty = new GetConnectionGatewayArgs();

    /**
     * The connection gateway name
     * 
     */
    @Import(name="connectionGatewayName", required=true)
    private Output<String> connectionGatewayName;

    /**
     * @return The connection gateway name
     * 
     */
    public Output<String> connectionGatewayName() {
        return this.connectionGatewayName;
    }

    /**
     * The resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Subscription Id
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return Subscription Id
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    private GetConnectionGatewayArgs() {}

    private GetConnectionGatewayArgs(GetConnectionGatewayArgs $) {
        this.connectionGatewayName = $.connectionGatewayName;
        this.resourceGroupName = $.resourceGroupName;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionGatewayArgs $;

        public Builder() {
            $ = new GetConnectionGatewayArgs();
        }

        public Builder(GetConnectionGatewayArgs defaults) {
            $ = new GetConnectionGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionGatewayName The connection gateway name
         * 
         * @return builder
         * 
         */
        public Builder connectionGatewayName(Output<String> connectionGatewayName) {
            $.connectionGatewayName = connectionGatewayName;
            return this;
        }

        /**
         * @param connectionGatewayName The connection gateway name
         * 
         * @return builder
         * 
         */
        public Builder connectionGatewayName(String connectionGatewayName) {
            return connectionGatewayName(Output.of(connectionGatewayName));
        }

        /**
         * @param resourceGroupName The resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param subscriptionId Subscription Id
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Subscription Id
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public GetConnectionGatewayArgs build() {
            $.connectionGatewayName = Objects.requireNonNull($.connectionGatewayName, "expected parameter 'connectionGatewayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}