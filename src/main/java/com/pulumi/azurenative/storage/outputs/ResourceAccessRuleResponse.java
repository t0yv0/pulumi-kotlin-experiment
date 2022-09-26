// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceAccessRuleResponse {
    /**
     * @return Resource Id
     * 
     */
    private @Nullable String resourceId;
    /**
     * @return Tenant Id
     * 
     */
    private @Nullable String tenantId;

    private ResourceAccessRuleResponse() {}
    /**
     * @return Resource Id
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * @return Tenant Id
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAccessRuleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String resourceId;
        private @Nullable String tenantId;
        public Builder() {}
        public Builder(ResourceAccessRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public ResourceAccessRuleResponse build() {
            final var o = new ResourceAccessRuleResponse();
            o.resourceId = resourceId;
            o.tenantId = tenantId;
            return o;
        }
    }
}
