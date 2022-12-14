// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.AutoHealActionType;
import com.pulumi.azurenative.web.inputs.AutoHealCustomActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Actions which to take by the auto-heal module when a rule is triggered.
 * 
 */
public final class AutoHealActionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoHealActionsArgs Empty = new AutoHealActionsArgs();

    /**
     * Predefined action to be taken.
     * 
     */
    @Import(name="actionType")
    private @Nullable Output<AutoHealActionType> actionType;

    /**
     * @return Predefined action to be taken.
     * 
     */
    public Optional<Output<AutoHealActionType>> actionType() {
        return Optional.ofNullable(this.actionType);
    }

    /**
     * Custom action to be taken.
     * 
     */
    @Import(name="customAction")
    private @Nullable Output<AutoHealCustomActionArgs> customAction;

    /**
     * @return Custom action to be taken.
     * 
     */
    public Optional<Output<AutoHealCustomActionArgs>> customAction() {
        return Optional.ofNullable(this.customAction);
    }

    /**
     * Minimum time the process must execute
     * before taking the action
     * 
     */
    @Import(name="minProcessExecutionTime")
    private @Nullable Output<String> minProcessExecutionTime;

    /**
     * @return Minimum time the process must execute
     * before taking the action
     * 
     */
    public Optional<Output<String>> minProcessExecutionTime() {
        return Optional.ofNullable(this.minProcessExecutionTime);
    }

    private AutoHealActionsArgs() {}

    private AutoHealActionsArgs(AutoHealActionsArgs $) {
        this.actionType = $.actionType;
        this.customAction = $.customAction;
        this.minProcessExecutionTime = $.minProcessExecutionTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoHealActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoHealActionsArgs $;

        public Builder() {
            $ = new AutoHealActionsArgs();
        }

        public Builder(AutoHealActionsArgs defaults) {
            $ = new AutoHealActionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType Predefined action to be taken.
         * 
         * @return builder
         * 
         */
        public Builder actionType(@Nullable Output<AutoHealActionType> actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param actionType Predefined action to be taken.
         * 
         * @return builder
         * 
         */
        public Builder actionType(AutoHealActionType actionType) {
            return actionType(Output.of(actionType));
        }

        /**
         * @param customAction Custom action to be taken.
         * 
         * @return builder
         * 
         */
        public Builder customAction(@Nullable Output<AutoHealCustomActionArgs> customAction) {
            $.customAction = customAction;
            return this;
        }

        /**
         * @param customAction Custom action to be taken.
         * 
         * @return builder
         * 
         */
        public Builder customAction(AutoHealCustomActionArgs customAction) {
            return customAction(Output.of(customAction));
        }

        /**
         * @param minProcessExecutionTime Minimum time the process must execute
         * before taking the action
         * 
         * @return builder
         * 
         */
        public Builder minProcessExecutionTime(@Nullable Output<String> minProcessExecutionTime) {
            $.minProcessExecutionTime = minProcessExecutionTime;
            return this;
        }

        /**
         * @param minProcessExecutionTime Minimum time the process must execute
         * before taking the action
         * 
         * @return builder
         * 
         */
        public Builder minProcessExecutionTime(String minProcessExecutionTime) {
            return minProcessExecutionTime(Output.of(minProcessExecutionTime));
        }

        public AutoHealActionsArgs build() {
            return $;
        }
    }

}
