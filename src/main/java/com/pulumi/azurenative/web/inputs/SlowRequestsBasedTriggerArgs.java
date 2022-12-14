// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger based on request execution time.
 * 
 */
public final class SlowRequestsBasedTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlowRequestsBasedTriggerArgs Empty = new SlowRequestsBasedTriggerArgs();

    /**
     * Request Count.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return Request Count.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Request Path.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Request Path.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Time interval.
     * 
     */
    @Import(name="timeInterval")
    private @Nullable Output<String> timeInterval;

    /**
     * @return Time interval.
     * 
     */
    public Optional<Output<String>> timeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }

    /**
     * Time taken.
     * 
     */
    @Import(name="timeTaken")
    private @Nullable Output<String> timeTaken;

    /**
     * @return Time taken.
     * 
     */
    public Optional<Output<String>> timeTaken() {
        return Optional.ofNullable(this.timeTaken);
    }

    private SlowRequestsBasedTriggerArgs() {}

    private SlowRequestsBasedTriggerArgs(SlowRequestsBasedTriggerArgs $) {
        this.count = $.count;
        this.path = $.path;
        this.timeInterval = $.timeInterval;
        this.timeTaken = $.timeTaken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlowRequestsBasedTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlowRequestsBasedTriggerArgs $;

        public Builder() {
            $ = new SlowRequestsBasedTriggerArgs();
        }

        public Builder(SlowRequestsBasedTriggerArgs defaults) {
            $ = new SlowRequestsBasedTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Request Count.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Request Count.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param path Request Path.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Request Path.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param timeInterval Time interval.
         * 
         * @return builder
         * 
         */
        public Builder timeInterval(@Nullable Output<String> timeInterval) {
            $.timeInterval = timeInterval;
            return this;
        }

        /**
         * @param timeInterval Time interval.
         * 
         * @return builder
         * 
         */
        public Builder timeInterval(String timeInterval) {
            return timeInterval(Output.of(timeInterval));
        }

        /**
         * @param timeTaken Time taken.
         * 
         * @return builder
         * 
         */
        public Builder timeTaken(@Nullable Output<String> timeTaken) {
            $.timeTaken = timeTaken;
            return this;
        }

        /**
         * @param timeTaken Time taken.
         * 
         * @return builder
         * 
         */
        public Builder timeTaken(String timeTaken) {
            return timeTaken(Output.of(timeTaken));
        }

        public SlowRequestsBasedTriggerArgs build() {
            return $;
        }
    }

}
