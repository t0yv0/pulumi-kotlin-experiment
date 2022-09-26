// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Resource Access Rule.
 * 
 */
public final class ResourceAccessRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceAccessRuleArgs Empty = new ResourceAccessRuleArgs();

    /**
     * Resource Id
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return Resource Id
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * Tenant Id
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return Tenant Id
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private ResourceAccessRuleArgs() {}

    private ResourceAccessRuleArgs(ResourceAccessRuleArgs $) {
        this.resourceId = $.resourceId;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceAccessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceAccessRuleArgs $;

        public Builder() {
            $ = new ResourceAccessRuleArgs();
        }

        public Builder(ResourceAccessRuleArgs defaults) {
            $ = new ResourceAccessRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceId Resource Id
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId Resource Id
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param tenantId Tenant Id
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Tenant Id
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public ResourceAccessRuleArgs build() {
            return $;
        }
    }

}
