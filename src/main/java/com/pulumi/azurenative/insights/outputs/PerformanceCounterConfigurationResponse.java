// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PerformanceCounterConfigurationResponse {
    private @Nullable String instance;
    private String name;
    private String samplingPeriod;

    private PerformanceCounterConfigurationResponse() {}
    public Optional<String> instance() {
        return Optional.ofNullable(this.instance);
    }
    public String name() {
        return this.name;
    }
    public String samplingPeriod() {
        return this.samplingPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerformanceCounterConfigurationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String instance;
        private String name;
        private String samplingPeriod;
        public Builder() {}
        public Builder(PerformanceCounterConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.samplingPeriod = defaults.samplingPeriod;
        }

        @CustomType.Setter
        public Builder instance(@Nullable String instance) {
            this.instance = instance;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder samplingPeriod(String samplingPeriod) {
            this.samplingPeriod = Objects.requireNonNull(samplingPeriod);
            return this;
        }
        public PerformanceCounterConfigurationResponse build() {
            final var o = new PerformanceCounterConfigurationResponse();
            o.instance = instance;
            o.name = name;
            o.samplingPeriod = samplingPeriod;
            return o;
        }
    }
}
