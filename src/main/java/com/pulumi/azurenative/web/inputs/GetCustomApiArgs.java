// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCustomApiArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCustomApiArgs Empty = new GetCustomApiArgs();

    /**
     * API name
     * 
     */
    @Import(name="apiName", required=true)
    private Output<String> apiName;

    /**
     * @return API name
     * 
     */
    public Output<String> apiName() {
        return this.apiName;
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

    private GetCustomApiArgs() {}

    private GetCustomApiArgs(GetCustomApiArgs $) {
        this.apiName = $.apiName;
        this.resourceGroupName = $.resourceGroupName;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCustomApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCustomApiArgs $;

        public Builder() {
            $ = new GetCustomApiArgs();
        }

        public Builder(GetCustomApiArgs defaults) {
            $ = new GetCustomApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiName API name
         * 
         * @return builder
         * 
         */
        public Builder apiName(Output<String> apiName) {
            $.apiName = apiName;
            return this;
        }

        /**
         * @param apiName API name
         * 
         * @return builder
         * 
         */
        public Builder apiName(String apiName) {
            return apiName(Output.of(apiName));
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

        public GetCustomApiArgs build() {
            $.apiName = Objects.requireNonNull($.apiName, "expected parameter 'apiName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}