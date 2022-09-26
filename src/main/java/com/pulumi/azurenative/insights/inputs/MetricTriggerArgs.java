// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.ComparisonOperationType;
import com.pulumi.azurenative.insights.enums.MetricStatisticType;
import com.pulumi.azurenative.insights.enums.TimeAggregationType;
import com.pulumi.azurenative.insights.inputs.ScaleRuleMetricDimensionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The trigger that results in a scaling action.
 * 
 */
public final class MetricTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricTriggerArgs Empty = new MetricTriggerArgs();

    /**
     * List of dimension conditions. For example: [{&#34;DimensionName&#34;:&#34;AppName&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;App1&#34;]},{&#34;DimensionName&#34;:&#34;Deployment&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;default&#34;]}].
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<List<ScaleRuleMetricDimensionArgs>> dimensions;

    /**
     * @return List of dimension conditions. For example: [{&#34;DimensionName&#34;:&#34;AppName&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;App1&#34;]},{&#34;DimensionName&#34;:&#34;Deployment&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;default&#34;]}].
     * 
     */
    public Optional<Output<List<ScaleRuleMetricDimensionArgs>>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * a value indicating whether metric should divide per instance.
     * 
     */
    @Import(name="dividePerInstance")
    private @Nullable Output<Boolean> dividePerInstance;

    /**
     * @return a value indicating whether metric should divide per instance.
     * 
     */
    public Optional<Output<Boolean>> dividePerInstance() {
        return Optional.ofNullable(this.dividePerInstance);
    }

    /**
     * the name of the metric that defines what the rule monitors.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    /**
     * @return the name of the metric that defines what the rule monitors.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * the namespace of the metric that defines what the rule monitors.
     * 
     */
    @Import(name="metricNamespace")
    private @Nullable Output<String> metricNamespace;

    /**
     * @return the namespace of the metric that defines what the rule monitors.
     * 
     */
    public Optional<Output<String>> metricNamespace() {
        return Optional.ofNullable(this.metricNamespace);
    }

    /**
     * the location of the resource the rule monitors.
     * 
     */
    @Import(name="metricResourceLocation")
    private @Nullable Output<String> metricResourceLocation;

    /**
     * @return the location of the resource the rule monitors.
     * 
     */
    public Optional<Output<String>> metricResourceLocation() {
        return Optional.ofNullable(this.metricResourceLocation);
    }

    /**
     * the resource identifier of the resource the rule monitors.
     * 
     */
    @Import(name="metricResourceUri", required=true)
    private Output<String> metricResourceUri;

    /**
     * @return the resource identifier of the resource the rule monitors.
     * 
     */
    public Output<String> metricResourceUri() {
        return this.metricResourceUri;
    }

    /**
     * the operator that is used to compare the metric data and the threshold.
     * 
     */
    @Import(name="operator", required=true)
    private Output<ComparisonOperationType> operator;

    /**
     * @return the operator that is used to compare the metric data and the threshold.
     * 
     */
    public Output<ComparisonOperationType> operator() {
        return this.operator;
    }

    /**
     * the metric statistic type. How the metrics from multiple instances are combined.
     * 
     */
    @Import(name="statistic", required=true)
    private Output<MetricStatisticType> statistic;

    /**
     * @return the metric statistic type. How the metrics from multiple instances are combined.
     * 
     */
    public Output<MetricStatisticType> statistic() {
        return this.statistic;
    }

    /**
     * the threshold of the metric that triggers the scale action.
     * 
     */
    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    /**
     * @return the threshold of the metric that triggers the scale action.
     * 
     */
    public Output<Double> threshold() {
        return this.threshold;
    }

    /**
     * time aggregation type. How the data that is collected should be combined over time. The default value is Average.
     * 
     */
    @Import(name="timeAggregation", required=true)
    private Output<TimeAggregationType> timeAggregation;

    /**
     * @return time aggregation type. How the data that is collected should be combined over time. The default value is Average.
     * 
     */
    public Output<TimeAggregationType> timeAggregation() {
        return this.timeAggregation;
    }

    /**
     * the granularity of metrics the rule monitors. Must be one of the predefined values returned from metric definitions for the metric. Must be between 12 hours and 1 minute.
     * 
     */
    @Import(name="timeGrain", required=true)
    private Output<String> timeGrain;

    /**
     * @return the granularity of metrics the rule monitors. Must be one of the predefined values returned from metric definitions for the metric. Must be between 12 hours and 1 minute.
     * 
     */
    public Output<String> timeGrain() {
        return this.timeGrain;
    }

    /**
     * the range of time in which instance data is collected. This value must be greater than the delay in metric collection, which can vary from resource-to-resource. Must be between 12 hours and 5 minutes.
     * 
     */
    @Import(name="timeWindow", required=true)
    private Output<String> timeWindow;

    /**
     * @return the range of time in which instance data is collected. This value must be greater than the delay in metric collection, which can vary from resource-to-resource. Must be between 12 hours and 5 minutes.
     * 
     */
    public Output<String> timeWindow() {
        return this.timeWindow;
    }

    private MetricTriggerArgs() {}

    private MetricTriggerArgs(MetricTriggerArgs $) {
        this.dimensions = $.dimensions;
        this.dividePerInstance = $.dividePerInstance;
        this.metricName = $.metricName;
        this.metricNamespace = $.metricNamespace;
        this.metricResourceLocation = $.metricResourceLocation;
        this.metricResourceUri = $.metricResourceUri;
        this.operator = $.operator;
        this.statistic = $.statistic;
        this.threshold = $.threshold;
        this.timeAggregation = $.timeAggregation;
        this.timeGrain = $.timeGrain;
        this.timeWindow = $.timeWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricTriggerArgs $;

        public Builder() {
            $ = new MetricTriggerArgs();
        }

        public Builder(MetricTriggerArgs defaults) {
            $ = new MetricTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dimensions List of dimension conditions. For example: [{&#34;DimensionName&#34;:&#34;AppName&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;App1&#34;]},{&#34;DimensionName&#34;:&#34;Deployment&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;default&#34;]}].
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<List<ScaleRuleMetricDimensionArgs>> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions List of dimension conditions. For example: [{&#34;DimensionName&#34;:&#34;AppName&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;App1&#34;]},{&#34;DimensionName&#34;:&#34;Deployment&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;default&#34;]}].
         * 
         * @return builder
         * 
         */
        public Builder dimensions(List<ScaleRuleMetricDimensionArgs> dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param dimensions List of dimension conditions. For example: [{&#34;DimensionName&#34;:&#34;AppName&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;App1&#34;]},{&#34;DimensionName&#34;:&#34;Deployment&#34;,&#34;Operator&#34;:&#34;Equals&#34;,&#34;Values&#34;:[&#34;default&#34;]}].
         * 
         * @return builder
         * 
         */
        public Builder dimensions(ScaleRuleMetricDimensionArgs... dimensions) {
            return dimensions(List.of(dimensions));
        }

        /**
         * @param dividePerInstance a value indicating whether metric should divide per instance.
         * 
         * @return builder
         * 
         */
        public Builder dividePerInstance(@Nullable Output<Boolean> dividePerInstance) {
            $.dividePerInstance = dividePerInstance;
            return this;
        }

        /**
         * @param dividePerInstance a value indicating whether metric should divide per instance.
         * 
         * @return builder
         * 
         */
        public Builder dividePerInstance(Boolean dividePerInstance) {
            return dividePerInstance(Output.of(dividePerInstance));
        }

        /**
         * @param metricName the name of the metric that defines what the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName the name of the metric that defines what the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param metricNamespace the namespace of the metric that defines what the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricNamespace(@Nullable Output<String> metricNamespace) {
            $.metricNamespace = metricNamespace;
            return this;
        }

        /**
         * @param metricNamespace the namespace of the metric that defines what the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricNamespace(String metricNamespace) {
            return metricNamespace(Output.of(metricNamespace));
        }

        /**
         * @param metricResourceLocation the location of the resource the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricResourceLocation(@Nullable Output<String> metricResourceLocation) {
            $.metricResourceLocation = metricResourceLocation;
            return this;
        }

        /**
         * @param metricResourceLocation the location of the resource the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricResourceLocation(String metricResourceLocation) {
            return metricResourceLocation(Output.of(metricResourceLocation));
        }

        /**
         * @param metricResourceUri the resource identifier of the resource the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricResourceUri(Output<String> metricResourceUri) {
            $.metricResourceUri = metricResourceUri;
            return this;
        }

        /**
         * @param metricResourceUri the resource identifier of the resource the rule monitors.
         * 
         * @return builder
         * 
         */
        public Builder metricResourceUri(String metricResourceUri) {
            return metricResourceUri(Output.of(metricResourceUri));
        }

        /**
         * @param operator the operator that is used to compare the metric data and the threshold.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<ComparisonOperationType> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator the operator that is used to compare the metric data and the threshold.
         * 
         * @return builder
         * 
         */
        public Builder operator(ComparisonOperationType operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param statistic the metric statistic type. How the metrics from multiple instances are combined.
         * 
         * @return builder
         * 
         */
        public Builder statistic(Output<MetricStatisticType> statistic) {
            $.statistic = statistic;
            return this;
        }

        /**
         * @param statistic the metric statistic type. How the metrics from multiple instances are combined.
         * 
         * @return builder
         * 
         */
        public Builder statistic(MetricStatisticType statistic) {
            return statistic(Output.of(statistic));
        }

        /**
         * @param threshold the threshold of the metric that triggers the scale action.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold the threshold of the metric that triggers the scale action.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param timeAggregation time aggregation type. How the data that is collected should be combined over time. The default value is Average.
         * 
         * @return builder
         * 
         */
        public Builder timeAggregation(Output<TimeAggregationType> timeAggregation) {
            $.timeAggregation = timeAggregation;
            return this;
        }

        /**
         * @param timeAggregation time aggregation type. How the data that is collected should be combined over time. The default value is Average.
         * 
         * @return builder
         * 
         */
        public Builder timeAggregation(TimeAggregationType timeAggregation) {
            return timeAggregation(Output.of(timeAggregation));
        }

        /**
         * @param timeGrain the granularity of metrics the rule monitors. Must be one of the predefined values returned from metric definitions for the metric. Must be between 12 hours and 1 minute.
         * 
         * @return builder
         * 
         */
        public Builder timeGrain(Output<String> timeGrain) {
            $.timeGrain = timeGrain;
            return this;
        }

        /**
         * @param timeGrain the granularity of metrics the rule monitors. Must be one of the predefined values returned from metric definitions for the metric. Must be between 12 hours and 1 minute.
         * 
         * @return builder
         * 
         */
        public Builder timeGrain(String timeGrain) {
            return timeGrain(Output.of(timeGrain));
        }

        /**
         * @param timeWindow the range of time in which instance data is collected. This value must be greater than the delay in metric collection, which can vary from resource-to-resource. Must be between 12 hours and 5 minutes.
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(Output<String> timeWindow) {
            $.timeWindow = timeWindow;
            return this;
        }

        /**
         * @param timeWindow the range of time in which instance data is collected. This value must be greater than the delay in metric collection, which can vary from resource-to-resource. Must be between 12 hours and 5 minutes.
         * 
         * @return builder
         * 
         */
        public Builder timeWindow(String timeWindow) {
            return timeWindow(Output.of(timeWindow));
        }

        public MetricTriggerArgs build() {
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.metricResourceUri = Objects.requireNonNull($.metricResourceUri, "expected parameter 'metricResourceUri' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.statistic = Objects.requireNonNull($.statistic, "expected parameter 'statistic' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            $.timeAggregation = Objects.requireNonNull($.timeAggregation, "expected parameter 'timeAggregation' to be non-null");
            $.timeGrain = Objects.requireNonNull($.timeGrain, "expected parameter 'timeGrain' to be non-null");
            $.timeWindow = Objects.requireNonNull($.timeWindow, "expected parameter 'timeWindow' to be non-null");
            return $;
        }
    }

}