// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.inputs.RecurrenceArgs;
import com.pulumi.azurenative.insights.inputs.ScaleCapacityArgs;
import com.pulumi.azurenative.insights.inputs.ScaleRuleArgs;
import com.pulumi.azurenative.insights.inputs.TimeWindowArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Autoscale profile.
 * 
 */
public final class AutoscaleProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscaleProfileArgs Empty = new AutoscaleProfileArgs();

    /**
     * the number of instances that can be used during this profile.
     * 
     */
    @Import(name="capacity", required=true)
    private Output<ScaleCapacityArgs> capacity;

    /**
     * @return the number of instances that can be used during this profile.
     * 
     */
    public Output<ScaleCapacityArgs> capacity() {
        return this.capacity;
    }

    /**
     * the specific date-time for the profile. This element is not used if the Recurrence element is used.
     * 
     */
    @Import(name="fixedDate")
    private @Nullable Output<TimeWindowArgs> fixedDate;

    /**
     * @return the specific date-time for the profile. This element is not used if the Recurrence element is used.
     * 
     */
    public Optional<Output<TimeWindowArgs>> fixedDate() {
        return Optional.ofNullable(this.fixedDate);
    }

    /**
     * the name of the profile.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return the name of the profile.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * the repeating times at which this profile begins. This element is not used if the FixedDate element is used.
     * 
     */
    @Import(name="recurrence")
    private @Nullable Output<RecurrenceArgs> recurrence;

    /**
     * @return the repeating times at which this profile begins. This element is not used if the FixedDate element is used.
     * 
     */
    public Optional<Output<RecurrenceArgs>> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    /**
     * the collection of rules that provide the triggers and parameters for the scaling action. A maximum of 10 rules can be specified.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<ScaleRuleArgs>> rules;

    /**
     * @return the collection of rules that provide the triggers and parameters for the scaling action. A maximum of 10 rules can be specified.
     * 
     */
    public Output<List<ScaleRuleArgs>> rules() {
        return this.rules;
    }

    private AutoscaleProfileArgs() {}

    private AutoscaleProfileArgs(AutoscaleProfileArgs $) {
        this.capacity = $.capacity;
        this.fixedDate = $.fixedDate;
        this.name = $.name;
        this.recurrence = $.recurrence;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscaleProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscaleProfileArgs $;

        public Builder() {
            $ = new AutoscaleProfileArgs();
        }

        public Builder(AutoscaleProfileArgs defaults) {
            $ = new AutoscaleProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity the number of instances that can be used during this profile.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Output<ScaleCapacityArgs> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity the number of instances that can be used during this profile.
         * 
         * @return builder
         * 
         */
        public Builder capacity(ScaleCapacityArgs capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param fixedDate the specific date-time for the profile. This element is not used if the Recurrence element is used.
         * 
         * @return builder
         * 
         */
        public Builder fixedDate(@Nullable Output<TimeWindowArgs> fixedDate) {
            $.fixedDate = fixedDate;
            return this;
        }

        /**
         * @param fixedDate the specific date-time for the profile. This element is not used if the Recurrence element is used.
         * 
         * @return builder
         * 
         */
        public Builder fixedDate(TimeWindowArgs fixedDate) {
            return fixedDate(Output.of(fixedDate));
        }

        /**
         * @param name the name of the profile.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name the name of the profile.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param recurrence the repeating times at which this profile begins. This element is not used if the FixedDate element is used.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(@Nullable Output<RecurrenceArgs> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        /**
         * @param recurrence the repeating times at which this profile begins. This element is not used if the FixedDate element is used.
         * 
         * @return builder
         * 
         */
        public Builder recurrence(RecurrenceArgs recurrence) {
            return recurrence(Output.of(recurrence));
        }

        /**
         * @param rules the collection of rules that provide the triggers and parameters for the scaling action. A maximum of 10 rules can be specified.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<ScaleRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules the collection of rules that provide the triggers and parameters for the scaling action. A maximum of 10 rules can be specified.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<ScaleRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules the collection of rules that provide the triggers and parameters for the scaling action. A maximum of 10 rules can be specified.
         * 
         * @return builder
         * 
         */
        public Builder rules(ScaleRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public AutoscaleProfileArgs build() {
            $.capacity = Objects.requireNonNull($.capacity, "expected parameter 'capacity' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
