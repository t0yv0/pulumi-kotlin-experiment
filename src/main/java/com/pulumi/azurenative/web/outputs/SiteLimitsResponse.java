// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SiteLimitsResponse {
    /**
     * @return Maximum allowed disk size usage in MB.
     * 
     */
    private @Nullable Double maxDiskSizeInMb;
    /**
     * @return Maximum allowed memory usage in MB.
     * 
     */
    private @Nullable Double maxMemoryInMb;
    /**
     * @return Maximum allowed CPU usage percentage.
     * 
     */
    private @Nullable Double maxPercentageCpu;

    private SiteLimitsResponse() {}
    /**
     * @return Maximum allowed disk size usage in MB.
     * 
     */
    public Optional<Double> maxDiskSizeInMb() {
        return Optional.ofNullable(this.maxDiskSizeInMb);
    }
    /**
     * @return Maximum allowed memory usage in MB.
     * 
     */
    public Optional<Double> maxMemoryInMb() {
        return Optional.ofNullable(this.maxMemoryInMb);
    }
    /**
     * @return Maximum allowed CPU usage percentage.
     * 
     */
    public Optional<Double> maxPercentageCpu() {
        return Optional.ofNullable(this.maxPercentageCpu);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteLimitsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double maxDiskSizeInMb;
        private @Nullable Double maxMemoryInMb;
        private @Nullable Double maxPercentageCpu;
        public Builder() {}
        public Builder(SiteLimitsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxDiskSizeInMb = defaults.maxDiskSizeInMb;
    	      this.maxMemoryInMb = defaults.maxMemoryInMb;
    	      this.maxPercentageCpu = defaults.maxPercentageCpu;
        }

        @CustomType.Setter
        public Builder maxDiskSizeInMb(@Nullable Double maxDiskSizeInMb) {
            this.maxDiskSizeInMb = maxDiskSizeInMb;
            return this;
        }
        @CustomType.Setter
        public Builder maxMemoryInMb(@Nullable Double maxMemoryInMb) {
            this.maxMemoryInMb = maxMemoryInMb;
            return this;
        }
        @CustomType.Setter
        public Builder maxPercentageCpu(@Nullable Double maxPercentageCpu) {
            this.maxPercentageCpu = maxPercentageCpu;
            return this;
        }
        public SiteLimitsResponse build() {
            final var o = new SiteLimitsResponse();
            o.maxDiskSizeInMb = maxDiskSizeInMb;
            o.maxMemoryInMb = maxMemoryInMb;
            o.maxPercentageCpu = maxPercentageCpu;
            return o;
        }
    }
}
