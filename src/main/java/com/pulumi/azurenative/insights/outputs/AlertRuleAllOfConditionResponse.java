// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.AlertRuleAnyOfOrLeafConditionResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AlertRuleAllOfConditionResponse {
    /**
     * @return The list of Activity Log Alert rule conditions.
     * 
     */
    private List<AlertRuleAnyOfOrLeafConditionResponse> allOf;

    private AlertRuleAllOfConditionResponse() {}
    /**
     * @return The list of Activity Log Alert rule conditions.
     * 
     */
    public List<AlertRuleAnyOfOrLeafConditionResponse> allOf() {
        return this.allOf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleAllOfConditionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<AlertRuleAnyOfOrLeafConditionResponse> allOf;
        public Builder() {}
        public Builder(AlertRuleAllOfConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allOf = defaults.allOf;
        }

        @CustomType.Setter
        public Builder allOf(List<AlertRuleAnyOfOrLeafConditionResponse> allOf) {
            this.allOf = Objects.requireNonNull(allOf);
            return this;
        }
        public Builder allOf(AlertRuleAnyOfOrLeafConditionResponse... allOf) {
            return allOf(List.of(allOf));
        }
        public AlertRuleAllOfConditionResponse build() {
            final var o = new AlertRuleAllOfConditionResponse();
            o.allOf = allOf;
            return o;
        }
    }
}
