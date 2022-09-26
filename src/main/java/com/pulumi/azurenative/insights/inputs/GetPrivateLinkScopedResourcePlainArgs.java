// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateLinkScopedResourcePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateLinkScopedResourcePlainArgs Empty = new GetPrivateLinkScopedResourcePlainArgs();

    /**
     * The name of the scoped resource object.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the scoped resource object.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Monitor PrivateLinkScope resource.
     * 
     */
    @Import(name="scopeName", required=true)
    private String scopeName;

    /**
     * @return The name of the Azure Monitor PrivateLinkScope resource.
     * 
     */
    public String scopeName() {
        return this.scopeName;
    }

    private GetPrivateLinkScopedResourcePlainArgs() {}

    private GetPrivateLinkScopedResourcePlainArgs(GetPrivateLinkScopedResourcePlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.scopeName = $.scopeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateLinkScopedResourcePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateLinkScopedResourcePlainArgs $;

        public Builder() {
            $ = new GetPrivateLinkScopedResourcePlainArgs();
        }

        public Builder(GetPrivateLinkScopedResourcePlainArgs defaults) {
            $ = new GetPrivateLinkScopedResourcePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the scoped resource object.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
         * 
         * @return builder
         * 
         */
        public Builder scopeName(String scopeName) {
            $.scopeName = scopeName;
            return this;
        }

        public GetPrivateLinkScopedResourcePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scopeName = Objects.requireNonNull($.scopeName, "expected parameter 'scopeName' to be non-null");
            return $;
        }
    }

}