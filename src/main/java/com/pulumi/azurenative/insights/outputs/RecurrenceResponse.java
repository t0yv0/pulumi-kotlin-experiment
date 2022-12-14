// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.RecurrentScheduleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RecurrenceResponse {
    /**
     * @return the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     * 
     */
    private String frequency;
    /**
     * @return the scheduling constraints for when the profile begins.
     * 
     */
    private RecurrentScheduleResponse schedule;

    private RecurrenceResponse() {}
    /**
     * @return the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     * 
     */
    public String frequency() {
        return this.frequency;
    }
    /**
     * @return the scheduling constraints for when the profile begins.
     * 
     */
    public RecurrentScheduleResponse schedule() {
        return this.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrenceResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String frequency;
        private RecurrentScheduleResponse schedule;
        public Builder() {}
        public Builder(RecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.schedule = defaults.schedule;
        }

        @CustomType.Setter
        public Builder frequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }
        @CustomType.Setter
        public Builder schedule(RecurrentScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public RecurrenceResponse build() {
            final var o = new RecurrenceResponse();
            o.frequency = frequency;
            o.schedule = schedule;
            return o;
        }
    }
}
