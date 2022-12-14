// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.ConditionOperator;
import com.pulumi.azurenative.insights.enums.TimeAggregationOperator;
import com.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceArgs;
import com.pulumi.azurenative.insights.inputs.RuleMetricDataSourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule condition based on a metric crossing a threshold.
 * 
 */
public final class ThresholdRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThresholdRuleConditionArgs Empty = new ThresholdRuleConditionArgs();

    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    @Import(name="dataSource")
    private @Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource;

    /**
     * @return the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    public Optional<Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>>> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }

    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ThresholdRuleCondition&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ThresholdRuleCondition&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * the operator used to compare the data and the threshold.
     * 
     */
    @Import(name="operator", required=true)
    private Output<ConditionOperator> operator;

    /**
     * @return the operator used to compare the data and the threshold.
     * 
     */
    public Output<ConditionOperator> operator() {
        return this.operator;
    }

    /**
     * the threshold value that activates the alert.
     * 
     */
    @Import(name="threshold", required=true)
    private Output<Double> threshold;

    /**
     * @return the threshold value that activates the alert.
     * 
     */
    public Output<Double> threshold() {
        return this.threshold;
    }

    /**
     * the time aggregation operator. How the data that are collected should be combined over time. The default value is the PrimaryAggregationType of the Metric.
     * 
     */
    @Import(name="timeAggregation")
    private @Nullable Output<TimeAggregationOperator> timeAggregation;

    /**
     * @return the time aggregation operator. How the data that are collected should be combined over time. The default value is the PrimaryAggregationType of the Metric.
     * 
     */
    public Optional<Output<TimeAggregationOperator>> timeAggregation() {
        return Optional.ofNullable(this.timeAggregation);
    }

    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    @Import(name="windowSize")
    private @Nullable Output<String> windowSize;

    /**
     * @return the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    public Optional<Output<String>> windowSize() {
        return Optional.ofNullable(this.windowSize);
    }

    private ThresholdRuleConditionArgs() {}

    private ThresholdRuleConditionArgs(ThresholdRuleConditionArgs $) {
        this.dataSource = $.dataSource;
        this.odataType = $.odataType;
        this.operator = $.operator;
        this.threshold = $.threshold;
        this.timeAggregation = $.timeAggregation;
        this.windowSize = $.windowSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThresholdRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThresholdRuleConditionArgs $;

        public Builder() {
            $ = new ThresholdRuleConditionArgs();
        }

        public Builder(ThresholdRuleConditionArgs defaults) {
            $ = new ThresholdRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataSource the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(@Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource) {
            $.dataSource = dataSource;
            return this;
        }

        /**
         * @param dataSource the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs> dataSource) {
            return dataSource(Output.of(dataSource));
        }

        /**
         * @param dataSource the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(RuleManagementEventDataSourceArgs dataSource) {
            return dataSource(Either.ofLeft(dataSource));
        }

        /**
         * @param dataSource the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
         * 
         * @return builder
         * 
         */
        public Builder dataSource(RuleMetricDataSourceArgs dataSource) {
            return dataSource(Either.ofRight(dataSource));
        }

        /**
         * @param odataType specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
         * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ThresholdRuleCondition&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
         * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ThresholdRuleCondition&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param operator the operator used to compare the data and the threshold.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<ConditionOperator> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator the operator used to compare the data and the threshold.
         * 
         * @return builder
         * 
         */
        public Builder operator(ConditionOperator operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param threshold the threshold value that activates the alert.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold the threshold value that activates the alert.
         * 
         * @return builder
         * 
         */
        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        /**
         * @param timeAggregation the time aggregation operator. How the data that are collected should be combined over time. The default value is the PrimaryAggregationType of the Metric.
         * 
         * @return builder
         * 
         */
        public Builder timeAggregation(@Nullable Output<TimeAggregationOperator> timeAggregation) {
            $.timeAggregation = timeAggregation;
            return this;
        }

        /**
         * @param timeAggregation the time aggregation operator. How the data that are collected should be combined over time. The default value is the PrimaryAggregationType of the Metric.
         * 
         * @return builder
         * 
         */
        public Builder timeAggregation(TimeAggregationOperator timeAggregation) {
            return timeAggregation(Output.of(timeAggregation));
        }

        /**
         * @param windowSize the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
         * 
         * @return builder
         * 
         */
        public Builder windowSize(@Nullable Output<String> windowSize) {
            $.windowSize = windowSize;
            return this;
        }

        /**
         * @param windowSize the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
         * 
         * @return builder
         * 
         */
        public Builder windowSize(String windowSize) {
            return windowSize(Output.of(windowSize));
        }

        public ThresholdRuleConditionArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.threshold = Objects.requireNonNull($.threshold, "expected parameter 'threshold' to be non-null");
            return $;
        }
    }

}
