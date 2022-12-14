// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.LogMetricTriggerResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TriggerConditionResponse {
    /**
     * @return Trigger condition for metric query rule
     * 
     */
    private @Nullable LogMetricTriggerResponse metricTrigger;
    /**
     * @return Result or count threshold based on which rule should be triggered.
     * 
     */
    private Double threshold;
    /**
     * @return Evaluation operation for rule - &#39;GreaterThan&#39; or &#39;LessThan.
     * 
     */
    private String thresholdOperator;

    private TriggerConditionResponse() {}
    /**
     * @return Trigger condition for metric query rule
     * 
     */
    public Optional<LogMetricTriggerResponse> metricTrigger() {
        return Optional.ofNullable(this.metricTrigger);
    }
    /**
     * @return Result or count threshold based on which rule should be triggered.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }
    /**
     * @return Evaluation operation for rule - &#39;GreaterThan&#39; or &#39;LessThan.
     * 
     */
    public String thresholdOperator() {
        return this.thresholdOperator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerConditionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LogMetricTriggerResponse metricTrigger;
        private Double threshold;
        private String thresholdOperator;
        public Builder() {}
        public Builder(TriggerConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricTrigger = defaults.metricTrigger;
    	      this.threshold = defaults.threshold;
    	      this.thresholdOperator = defaults.thresholdOperator;
        }

        @CustomType.Setter
        public Builder metricTrigger(@Nullable LogMetricTriggerResponse metricTrigger) {
            this.metricTrigger = metricTrigger;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        @CustomType.Setter
        public Builder thresholdOperator(String thresholdOperator) {
            this.thresholdOperator = Objects.requireNonNull(thresholdOperator);
            return this;
        }
        public TriggerConditionResponse build() {
            final var o = new TriggerConditionResponse();
            o.metricTrigger = metricTrigger;
            o.threshold = threshold;
            o.thresholdOperator = thresholdOperator;
            return o;
        }
    }
}
