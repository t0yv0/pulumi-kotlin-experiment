// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.AutoHealCustomActionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoHealActionsResponse {
    /**
     * @return Predefined action to be taken.
     * 
     */
    private @Nullable String actionType;
    /**
     * @return Custom action to be taken.
     * 
     */
    private @Nullable AutoHealCustomActionResponse customAction;
    /**
     * @return Minimum time the process must execute
     * before taking the action
     * 
     */
    private @Nullable String minProcessExecutionTime;

    private AutoHealActionsResponse() {}
    /**
     * @return Predefined action to be taken.
     * 
     */
    public Optional<String> actionType() {
        return Optional.ofNullable(this.actionType);
    }
    /**
     * @return Custom action to be taken.
     * 
     */
    public Optional<AutoHealCustomActionResponse> customAction() {
        return Optional.ofNullable(this.customAction);
    }
    /**
     * @return Minimum time the process must execute
     * before taking the action
     * 
     */
    public Optional<String> minProcessExecutionTime() {
        return Optional.ofNullable(this.minProcessExecutionTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealActionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String actionType;
        private @Nullable AutoHealCustomActionResponse customAction;
        private @Nullable String minProcessExecutionTime;
        public Builder() {}
        public Builder(AutoHealActionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.customAction = defaults.customAction;
    	      this.minProcessExecutionTime = defaults.minProcessExecutionTime;
        }

        @CustomType.Setter
        public Builder actionType(@Nullable String actionType) {
            this.actionType = actionType;
            return this;
        }
        @CustomType.Setter
        public Builder customAction(@Nullable AutoHealCustomActionResponse customAction) {
            this.customAction = customAction;
            return this;
        }
        @CustomType.Setter
        public Builder minProcessExecutionTime(@Nullable String minProcessExecutionTime) {
            this.minProcessExecutionTime = minProcessExecutionTime;
            return this;
        }
        public AutoHealActionsResponse build() {
            final var o = new AutoHealActionsResponse();
            o.actionType = actionType;
            o.customAction = customAction;
            o.minProcessExecutionTime = minProcessExecutionTime;
            return o;
        }
    }
}
