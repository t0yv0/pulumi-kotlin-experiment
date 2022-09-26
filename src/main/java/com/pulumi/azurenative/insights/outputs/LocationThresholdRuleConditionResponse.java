// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.RuleManagementEventDataSourceResponse;
import com.pulumi.azurenative.insights.outputs.RuleMetricDataSourceResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LocationThresholdRuleConditionResponse {
    /**
     * @return the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    private @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;
    /**
     * @return the number of locations that must fail to activate the alert.
     * 
     */
    private Integer failedLocationCount;
    /**
     * @return specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.LocationThresholdRuleCondition&#39;.
     * 
     */
    private String odataType;
    /**
     * @return the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    private @Nullable String windowSize;

    private LocationThresholdRuleConditionResponse() {}
    /**
     * @return the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    public Optional<Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse>> dataSource() {
        return Optional.ofNullable(this.dataSource);
    }
    /**
     * @return the number of locations that must fail to activate the alert.
     * 
     */
    public Integer failedLocationCount() {
        return this.failedLocationCount;
    }
    /**
     * @return specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.LocationThresholdRuleCondition&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }
    /**
     * @return the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    public Optional<String> windowSize() {
        return Optional.ofNullable(this.windowSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationThresholdRuleConditionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource;
        private Integer failedLocationCount;
        private String odataType;
        private @Nullable String windowSize;
        public Builder() {}
        public Builder(LocationThresholdRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSource = defaults.dataSource;
    	      this.failedLocationCount = defaults.failedLocationCount;
    	      this.odataType = defaults.odataType;
    	      this.windowSize = defaults.windowSize;
        }

        @CustomType.Setter
        public Builder dataSource(@Nullable Either<RuleManagementEventDataSourceResponse,RuleMetricDataSourceResponse> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        @CustomType.Setter
        public Builder failedLocationCount(Integer failedLocationCount) {
            this.failedLocationCount = Objects.requireNonNull(failedLocationCount);
            return this;
        }
        @CustomType.Setter
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        @CustomType.Setter
        public Builder windowSize(@Nullable String windowSize) {
            this.windowSize = windowSize;
            return this;
        }
        public LocationThresholdRuleConditionResponse build() {
            final var o = new LocationThresholdRuleConditionResponse();
            o.dataSource = dataSource;
            o.failedLocationCount = failedLocationCount;
            o.odataType = odataType;
            o.windowSize = windowSize;
            return o;
        }
    }
}
