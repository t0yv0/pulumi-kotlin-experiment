// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SlowRequestsBasedTriggerResponse {
    /**
     * @return Request Count.
     * 
     */
    private @Nullable Integer count;
    /**
     * @return Request Path.
     * 
     */
    private @Nullable String path;
    /**
     * @return Time interval.
     * 
     */
    private @Nullable String timeInterval;
    /**
     * @return Time taken.
     * 
     */
    private @Nullable String timeTaken;

    private SlowRequestsBasedTriggerResponse() {}
    /**
     * @return Request Count.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return Request Path.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Time interval.
     * 
     */
    public Optional<String> timeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }
    /**
     * @return Time taken.
     * 
     */
    public Optional<String> timeTaken() {
        return Optional.ofNullable(this.timeTaken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlowRequestsBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String path;
        private @Nullable String timeInterval;
        private @Nullable String timeTaken;
        public Builder() {}
        public Builder(SlowRequestsBasedTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.timeInterval = defaults.timeInterval;
    	      this.timeTaken = defaults.timeTaken;
        }

        @CustomType.Setter
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder timeInterval(@Nullable String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        @CustomType.Setter
        public Builder timeTaken(@Nullable String timeTaken) {
            this.timeTaken = timeTaken;
            return this;
        }
        public SlowRequestsBasedTriggerResponse build() {
            final var o = new SlowRequestsBasedTriggerResponse();
            o.count = count;
            o.path = path;
            o.timeInterval = timeInterval;
            o.timeTaken = timeTaken;
            return o;
        }
    }
}
