// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SkuResponse {
    /**
     * @return The SKU name. Required for account creation; optional for update. Note that in older versions, SKU name was called accountType.
     * 
     */
    private String name;
    /**
     * @return The SKU tier. This is based on the SKU name.
     * 
     */
    private String tier;

    private SkuResponse() {}
    /**
     * @return The SKU name. Required for account creation; optional for update. Note that in older versions, SKU name was called accountType.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The SKU tier. This is based on the SKU name.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String tier;
        public Builder() {}
        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public SkuResponse build() {
            final var o = new SkuResponse();
            o.name = name;
            o.tier = tier;
            return o;
        }
    }
}