// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * The minimum number of violations required within the selected lookback time window required to raise an alert.
 * 
 */
public final class DynamicThresholdFailingPeriodsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DynamicThresholdFailingPeriodsArgs Empty = new DynamicThresholdFailingPeriodsArgs();

    /**
     * The number of violations to trigger an alert. Should be smaller or equal to numberOfEvaluationPeriods.
     * 
     */
    @Import(name="minFailingPeriodsToAlert", required=true)
    private Output<Double> minFailingPeriodsToAlert;

    /**
     * @return The number of violations to trigger an alert. Should be smaller or equal to numberOfEvaluationPeriods.
     * 
     */
    public Output<Double> minFailingPeriodsToAlert() {
        return this.minFailingPeriodsToAlert;
    }

    /**
     * The number of aggregated lookback points. The lookback time window is calculated based on the aggregation granularity (windowSize) and the selected number of aggregated points.
     * 
     */
    @Import(name="numberOfEvaluationPeriods", required=true)
    private Output<Double> numberOfEvaluationPeriods;

    /**
     * @return The number of aggregated lookback points. The lookback time window is calculated based on the aggregation granularity (windowSize) and the selected number of aggregated points.
     * 
     */
    public Output<Double> numberOfEvaluationPeriods() {
        return this.numberOfEvaluationPeriods;
    }

    private DynamicThresholdFailingPeriodsArgs() {}

    private DynamicThresholdFailingPeriodsArgs(DynamicThresholdFailingPeriodsArgs $) {
        this.minFailingPeriodsToAlert = $.minFailingPeriodsToAlert;
        this.numberOfEvaluationPeriods = $.numberOfEvaluationPeriods;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicThresholdFailingPeriodsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicThresholdFailingPeriodsArgs $;

        public Builder() {
            $ = new DynamicThresholdFailingPeriodsArgs();
        }

        public Builder(DynamicThresholdFailingPeriodsArgs defaults) {
            $ = new DynamicThresholdFailingPeriodsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minFailingPeriodsToAlert The number of violations to trigger an alert. Should be smaller or equal to numberOfEvaluationPeriods.
         * 
         * @return builder
         * 
         */
        public Builder minFailingPeriodsToAlert(Output<Double> minFailingPeriodsToAlert) {
            $.minFailingPeriodsToAlert = minFailingPeriodsToAlert;
            return this;
        }

        /**
         * @param minFailingPeriodsToAlert The number of violations to trigger an alert. Should be smaller or equal to numberOfEvaluationPeriods.
         * 
         * @return builder
         * 
         */
        public Builder minFailingPeriodsToAlert(Double minFailingPeriodsToAlert) {
            return minFailingPeriodsToAlert(Output.of(minFailingPeriodsToAlert));
        }

        /**
         * @param numberOfEvaluationPeriods The number of aggregated lookback points. The lookback time window is calculated based on the aggregation granularity (windowSize) and the selected number of aggregated points.
         * 
         * @return builder
         * 
         */
        public Builder numberOfEvaluationPeriods(Output<Double> numberOfEvaluationPeriods) {
            $.numberOfEvaluationPeriods = numberOfEvaluationPeriods;
            return this;
        }

        /**
         * @param numberOfEvaluationPeriods The number of aggregated lookback points. The lookback time window is calculated based on the aggregation granularity (windowSize) and the selected number of aggregated points.
         * 
         * @return builder
         * 
         */
        public Builder numberOfEvaluationPeriods(Double numberOfEvaluationPeriods) {
            return numberOfEvaluationPeriods(Output.of(numberOfEvaluationPeriods));
        }

        public DynamicThresholdFailingPeriodsArgs build() {
            $.minFailingPeriodsToAlert = Objects.requireNonNull($.minFailingPeriodsToAlert, "expected parameter 'minFailingPeriodsToAlert' to be non-null");
            $.numberOfEvaluationPeriods = Objects.requireNonNull($.numberOfEvaluationPeriods, "expected parameter 'numberOfEvaluationPeriods' to be non-null");
            return $;
        }
    }

}