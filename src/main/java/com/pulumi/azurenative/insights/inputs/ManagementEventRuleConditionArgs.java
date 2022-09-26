// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.ManagementEventAggregationConditionArgs;
import com.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceArgs;
import com.pulumi.azurenative.insights.inputs.RuleMetricDataSourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A management event rule condition.
 * 
 */
public final class ManagementEventRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementEventRuleConditionArgs Empty = new ManagementEventRuleConditionArgs();

    /**
     * How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
     * 
     */
    @Import(name="aggregation")
    private @Nullable Output<ManagementEventAggregationConditionArgs> aggregation;

    /**
     * @return How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
     * 
     */
    public Optional<Output<ManagementEventAggregationConditionArgs>> aggregation() {
        return Optional.ofNullable(this.aggregation);
    }

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
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    private ManagementEventRuleConditionArgs() {}

    private ManagementEventRuleConditionArgs(ManagementEventRuleConditionArgs $) {
        this.aggregation = $.aggregation;
        this.dataSource = $.dataSource;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementEventRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementEventRuleConditionArgs $;

        public Builder() {
            $ = new ManagementEventRuleConditionArgs();
        }

        public Builder(ManagementEventRuleConditionArgs defaults) {
            $ = new ManagementEventRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregation How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(@Nullable Output<ManagementEventAggregationConditionArgs> aggregation) {
            $.aggregation = aggregation;
            return this;
        }

        /**
         * @param aggregation How the data that is collected should be combined over time and when the alert is activated. Note that for management event alerts aggregation is optional – if it is not provided then any event will cause the alert to activate.
         * 
         * @return builder
         * 
         */
        public Builder aggregation(ManagementEventAggregationConditionArgs aggregation) {
            return aggregation(Output.of(aggregation));
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
         * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition&#39;.
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
         * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public ManagementEventRuleConditionArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}