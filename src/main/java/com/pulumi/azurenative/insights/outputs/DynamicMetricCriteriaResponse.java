// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.DynamicThresholdFailingPeriodsResponse;
import com.pulumi.azurenative.insights.outputs.MetricDimensionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DynamicMetricCriteriaResponse {
    /**
     * @return The extent of deviation required to trigger an alert. This will affect how tight the threshold is to the metric series pattern.
     * 
     */
    private String alertSensitivity;
    /**
     * @return Specifies the type of threshold criteria
     * Expected value is &#39;DynamicThresholdCriterion&#39;.
     * 
     */
    private String criterionType;
    /**
     * @return List of dimension conditions.
     * 
     */
    private @Nullable List<MetricDimensionResponse> dimensions;
    /**
     * @return The minimum number of violations required within the selected lookback time window required to raise an alert.
     * 
     */
    private DynamicThresholdFailingPeriodsResponse failingPeriods;
    /**
     * @return Use this option to set the date from which to start learning the metric historical data and calculate the dynamic thresholds (in ISO8601 format)
     * 
     */
    private @Nullable String ignoreDataBefore;
    /**
     * @return Name of the metric.
     * 
     */
    private String metricName;
    /**
     * @return Namespace of the metric.
     * 
     */
    private @Nullable String metricNamespace;
    /**
     * @return Name of the criteria.
     * 
     */
    private String name;
    /**
     * @return The operator used to compare the metric value against the threshold.
     * 
     */
    private String operator;
    /**
     * @return Allows creating an alert rule on a custom metric that isn&#39;t yet emitted, by causing the metric validation to be skipped.
     * 
     */
    private @Nullable Boolean skipMetricValidation;
    /**
     * @return the criteria time aggregation types.
     * 
     */
    private String timeAggregation;

    private DynamicMetricCriteriaResponse() {}
    /**
     * @return The extent of deviation required to trigger an alert. This will affect how tight the threshold is to the metric series pattern.
     * 
     */
    public String alertSensitivity() {
        return this.alertSensitivity;
    }
    /**
     * @return Specifies the type of threshold criteria
     * Expected value is &#39;DynamicThresholdCriterion&#39;.
     * 
     */
    public String criterionType() {
        return this.criterionType;
    }
    /**
     * @return List of dimension conditions.
     * 
     */
    public List<MetricDimensionResponse> dimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * @return The minimum number of violations required within the selected lookback time window required to raise an alert.
     * 
     */
    public DynamicThresholdFailingPeriodsResponse failingPeriods() {
        return this.failingPeriods;
    }
    /**
     * @return Use this option to set the date from which to start learning the metric historical data and calculate the dynamic thresholds (in ISO8601 format)
     * 
     */
    public Optional<String> ignoreDataBefore() {
        return Optional.ofNullable(this.ignoreDataBefore);
    }
    /**
     * @return Name of the metric.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return Namespace of the metric.
     * 
     */
    public Optional<String> metricNamespace() {
        return Optional.ofNullable(this.metricNamespace);
    }
    /**
     * @return Name of the criteria.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The operator used to compare the metric value against the threshold.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return Allows creating an alert rule on a custom metric that isn&#39;t yet emitted, by causing the metric validation to be skipped.
     * 
     */
    public Optional<Boolean> skipMetricValidation() {
        return Optional.ofNullable(this.skipMetricValidation);
    }
    /**
     * @return the criteria time aggregation types.
     * 
     */
    public String timeAggregation() {
        return this.timeAggregation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicMetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String alertSensitivity;
        private String criterionType;
        private @Nullable List<MetricDimensionResponse> dimensions;
        private DynamicThresholdFailingPeriodsResponse failingPeriods;
        private @Nullable String ignoreDataBefore;
        private String metricName;
        private @Nullable String metricNamespace;
        private String name;
        private String operator;
        private @Nullable Boolean skipMetricValidation;
        private String timeAggregation;
        public Builder() {}
        public Builder(DynamicMetricCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertSensitivity = defaults.alertSensitivity;
    	      this.criterionType = defaults.criterionType;
    	      this.dimensions = defaults.dimensions;
    	      this.failingPeriods = defaults.failingPeriods;
    	      this.ignoreDataBefore = defaults.ignoreDataBefore;
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.skipMetricValidation = defaults.skipMetricValidation;
    	      this.timeAggregation = defaults.timeAggregation;
        }

        @CustomType.Setter
        public Builder alertSensitivity(String alertSensitivity) {
            this.alertSensitivity = Objects.requireNonNull(alertSensitivity);
            return this;
        }
        @CustomType.Setter
        public Builder criterionType(String criterionType) {
            this.criterionType = Objects.requireNonNull(criterionType);
            return this;
        }
        @CustomType.Setter
        public Builder dimensions(@Nullable List<MetricDimensionResponse> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(MetricDimensionResponse... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder failingPeriods(DynamicThresholdFailingPeriodsResponse failingPeriods) {
            this.failingPeriods = Objects.requireNonNull(failingPeriods);
            return this;
        }
        @CustomType.Setter
        public Builder ignoreDataBefore(@Nullable String ignoreDataBefore) {
            this.ignoreDataBefore = ignoreDataBefore;
            return this;
        }
        @CustomType.Setter
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        @CustomType.Setter
        public Builder metricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        @CustomType.Setter
        public Builder skipMetricValidation(@Nullable Boolean skipMetricValidation) {
            this.skipMetricValidation = skipMetricValidation;
            return this;
        }
        @CustomType.Setter
        public Builder timeAggregation(String timeAggregation) {
            this.timeAggregation = Objects.requireNonNull(timeAggregation);
            return this;
        }
        public DynamicMetricCriteriaResponse build() {
            final var o = new DynamicMetricCriteriaResponse();
            o.alertSensitivity = alertSensitivity;
            o.criterionType = criterionType;
            o.dimensions = dimensions;
            o.failingPeriods = failingPeriods;
            o.ignoreDataBefore = ignoreDataBefore;
            o.metricName = metricName;
            o.metricNamespace = metricNamespace;
            o.name = name;
            o.operator = operator;
            o.skipMetricValidation = skipMetricValidation;
            o.timeAggregation = timeAggregation;
            return o;
        }
    }
}
