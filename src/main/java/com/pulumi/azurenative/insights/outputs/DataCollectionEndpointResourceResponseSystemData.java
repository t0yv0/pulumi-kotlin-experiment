// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataCollectionEndpointResourceResponseSystemData {
    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    private @Nullable String createdAt;
    /**
     * @return The identity that created the resource.
     * 
     */
    private @Nullable String createdBy;
    /**
     * @return The type of identity that created the resource.
     * 
     */
    private @Nullable String createdByType;
    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    private @Nullable String lastModifiedAt;
    /**
     * @return The identity that last modified the resource.
     * 
     */
    private @Nullable String lastModifiedBy;
    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    private @Nullable String lastModifiedByType;

    private DataCollectionEndpointResourceResponseSystemData() {}
    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * @return The identity that created the resource.
     * 
     */
    public Optional<String> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * @return The type of identity that created the resource.
     * 
     */
    public Optional<String> createdByType() {
        return Optional.ofNullable(this.createdByType);
    }
    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    public Optional<String> lastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    /**
     * @return The identity that last modified the resource.
     * 
     */
    public Optional<String> lastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    public Optional<String> lastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionEndpointResourceResponseSystemData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;
        public Builder() {}
        public Builder(DataCollectionEndpointResourceResponseSystemData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
        }

        @CustomType.Setter
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder createdBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        @CustomType.Setter
        public Builder createdByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        @CustomType.Setter
        public Builder lastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }
        public DataCollectionEndpointResourceResponseSystemData build() {
            final var o = new DataCollectionEndpointResourceResponseSystemData();
            o.createdAt = createdAt;
            o.createdBy = createdBy;
            o.createdByType = createdByType;
            o.lastModifiedAt = lastModifiedAt;
            o.lastModifiedBy = lastModifiedBy;
            o.lastModifiedByType = lastModifiedByType;
            return o;
        }
    }
}
