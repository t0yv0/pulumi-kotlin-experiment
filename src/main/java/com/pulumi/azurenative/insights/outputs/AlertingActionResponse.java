// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.AzNsActionGroupResponse;
import com.pulumi.azurenative.insights.outputs.TriggerConditionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertingActionResponse {
    /**
     * @return Azure action group reference.
     * 
     */
    private @Nullable AzNsActionGroupResponse aznsAction;
    /**
     * @return Specifies the action. Supported values - AlertingAction, LogToMetricAction
     * Expected value is &#39;Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.AlertingAction&#39;.
     * 
     */
    private String odataType;
    /**
     * @return Severity of the alert
     * 
     */
    private String severity;
    /**
     * @return time (in minutes) for which Alerts should be throttled or suppressed.
     * 
     */
    private @Nullable Integer throttlingInMin;
    /**
     * @return The trigger condition that results in the alert rule being.
     * 
     */
    private TriggerConditionResponse trigger;

    private AlertingActionResponse() {}
    /**
     * @return Azure action group reference.
     * 
     */
    public Optional<AzNsActionGroupResponse> aznsAction() {
        return Optional.ofNullable(this.aznsAction);
    }
    /**
     * @return Specifies the action. Supported values - AlertingAction, LogToMetricAction
     * Expected value is &#39;Microsoft.WindowsAzure.Management.Monitoring.Alerts.Models.Microsoft.AppInsights.Nexus.DataContracts.Resources.ScheduledQueryRules.AlertingAction&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }
    /**
     * @return Severity of the alert
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return time (in minutes) for which Alerts should be throttled or suppressed.
     * 
     */
    public Optional<Integer> throttlingInMin() {
        return Optional.ofNullable(this.throttlingInMin);
    }
    /**
     * @return The trigger condition that results in the alert rule being.
     * 
     */
    public TriggerConditionResponse trigger() {
        return this.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertingActionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AzNsActionGroupResponse aznsAction;
        private String odataType;
        private String severity;
        private @Nullable Integer throttlingInMin;
        private TriggerConditionResponse trigger;
        public Builder() {}
        public Builder(AlertingActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aznsAction = defaults.aznsAction;
    	      this.odataType = defaults.odataType;
    	      this.severity = defaults.severity;
    	      this.throttlingInMin = defaults.throttlingInMin;
    	      this.trigger = defaults.trigger;
        }

        @CustomType.Setter
        public Builder aznsAction(@Nullable AzNsActionGroupResponse aznsAction) {
            this.aznsAction = aznsAction;
            return this;
        }
        @CustomType.Setter
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        @CustomType.Setter
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        @CustomType.Setter
        public Builder throttlingInMin(@Nullable Integer throttlingInMin) {
            this.throttlingInMin = throttlingInMin;
            return this;
        }
        @CustomType.Setter
        public Builder trigger(TriggerConditionResponse trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }
        public AlertingActionResponse build() {
            final var o = new AlertingActionResponse();
            o.aznsAction = aznsAction;
            o.odataType = odataType;
            o.severity = severity;
            o.throttlingInMin = throttlingInMin;
            o.trigger = trigger;
            return o;
        }
    }
}
