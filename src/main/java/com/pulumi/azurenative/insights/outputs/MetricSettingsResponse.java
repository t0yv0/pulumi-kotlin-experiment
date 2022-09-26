// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.RetentionPolicyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricSettingsResponse {
    /**
     * @return Name of a Diagnostic Metric category for a resource type this setting is applied to. To obtain the list of Diagnostic metric categories for a resource, first perform a GET diagnostic settings operation.
     * 
     */
    private @Nullable String category;
    /**
     * @return a value indicating whether this category is enabled.
     * 
     */
    private Boolean enabled;
    /**
     * @return the retention policy for this category.
     * 
     */
    private @Nullable RetentionPolicyResponse retentionPolicy;
    /**
     * @return the timegrain of the metric in ISO8601 format.
     * 
     */
    private @Nullable String timeGrain;

    private MetricSettingsResponse() {}
    /**
     * @return Name of a Diagnostic Metric category for a resource type this setting is applied to. To obtain the list of Diagnostic metric categories for a resource, first perform a GET diagnostic settings operation.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    /**
     * @return a value indicating whether this category is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return the retention policy for this category.
     * 
     */
    public Optional<RetentionPolicyResponse> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }
    /**
     * @return the timegrain of the metric in ISO8601 format.
     * 
     */
    public Optional<String> timeGrain() {
        return Optional.ofNullable(this.timeGrain);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricSettingsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String category;
        private Boolean enabled;
        private @Nullable RetentionPolicyResponse retentionPolicy;
        private @Nullable String timeGrain;
        public Builder() {}
        public Builder(MetricSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.timeGrain = defaults.timeGrain;
        }

        @CustomType.Setter
        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder retentionPolicy(@Nullable RetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder timeGrain(@Nullable String timeGrain) {
            this.timeGrain = timeGrain;
            return this;
        }
        public MetricSettingsResponse build() {
            final var o = new MetricSettingsResponse();
            o.category = category;
            o.enabled = enabled;
            o.retentionPolicy = retentionPolicy;
            o.timeGrain = timeGrain;
            return o;
        }
    }
}
