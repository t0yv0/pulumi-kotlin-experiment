// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkScopedResourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkScopedResourceArgs Empty = new GetPrivateLinkScopedResourceArgs();

    /**
     * The name of the scoped resource object.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the scoped resource object.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Monitor PrivateLinkScope resource.
     * 
     */
    @Import(name="scopeName", required=true)
    private Output<String> scopeName;

    /**
     * @return The name of the Azure Monitor PrivateLinkScope resource.
     * 
     */
    public Output<String> scopeName() {
        return this.scopeName;
    }

    private GetPrivateLinkScopedResourceArgs() {}

    private GetPrivateLinkScopedResourceArgs(GetPrivateLinkScopedResourceArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.scopeName = $.scopeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkScopedResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkScopedResourceArgs $;

        public Builder() {
            $ = new GetPrivateLinkScopedResourceArgs();
        }

        public Builder(GetPrivateLinkScopedResourceArgs defaults) {
            $ = new GetPrivateLinkScopedResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the scoped resource object.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the scoped resource object.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
         * 
         * @return builder
         * 
         */
        public Builder scopeName(Output<String> scopeName) {
            $.scopeName = scopeName;
            return this;
        }

        /**
         * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
         * 
         * @return builder
         * 
         */
        public Builder scopeName(String scopeName) {
            return scopeName(Output.of(scopeName));
        }

        public GetPrivateLinkScopedResourceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scopeName = Objects.requireNonNull($.scopeName, "expected parameter 'scopeName' to be non-null");
            return $;
        }
    }

}