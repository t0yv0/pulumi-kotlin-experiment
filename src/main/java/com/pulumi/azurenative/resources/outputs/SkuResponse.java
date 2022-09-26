// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuResponse {
    /**
     * @return The SKU capacity.
     * 
     */
    private @Nullable Integer capacity;
    /**
     * @return The SKU family.
     * 
     */
    private @Nullable String family;
    /**
     * @return The SKU model.
     * 
     */
    private @Nullable String model;
    /**
     * @return The SKU name.
     * 
     */
    private @Nullable String name;
    /**
     * @return The SKU size.
     * 
     */
    private @Nullable String size;
    /**
     * @return The SKU tier.
     * 
     */
    private @Nullable String tier;

    private SkuResponse() {}
    /**
     * @return The SKU capacity.
     * 
     */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return The SKU family.
     * 
     */
    public Optional<String> family() {
        return Optional.ofNullable(this.family);
    }
    /**
     * @return The SKU model.
     * 
     */
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }
    /**
     * @return The SKU name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The SKU size.
     * 
     */
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    /**
     * @return The SKU tier.
     * 
     */
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String family;
        private @Nullable String model;
        private @Nullable String name;
        private @Nullable String size;
        private @Nullable String tier;
        public Builder() {}
        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        @CustomType.Setter
        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }
        @CustomType.Setter
        public Builder model(@Nullable String model) {
            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public SkuResponse build() {
            final var o = new SkuResponse();
            o.capacity = capacity;
            o.family = family;
            o.model = model;
            o.name = name;
            o.size = size;
            o.tier = tier;
            return o;
        }
    }
}