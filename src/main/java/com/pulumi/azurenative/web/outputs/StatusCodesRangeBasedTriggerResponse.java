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
public final class StatusCodesRangeBasedTriggerResponse {
    /**
     * @return Request Count.
     * 
     */
    private @Nullable Integer count;
    private @Nullable String path;
    /**
     * @return HTTP status code.
     * 
     */
    private @Nullable String statusCodes;
    /**
     * @return Time interval.
     * 
     */
    private @Nullable String timeInterval;

    private StatusCodesRangeBasedTriggerResponse() {}
    /**
     * @return Request Count.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return HTTP status code.
     * 
     */
    public Optional<String> statusCodes() {
        return Optional.ofNullable(this.statusCodes);
    }
    /**
     * @return Time interval.
     * 
     */
    public Optional<String> timeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCodesRangeBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String path;
        private @Nullable String statusCodes;
        private @Nullable String timeInterval;
        public Builder() {}
        public Builder(StatusCodesRangeBasedTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.statusCodes = defaults.statusCodes;
    	      this.timeInterval = defaults.timeInterval;
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
        public Builder statusCodes(@Nullable String statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }
        @CustomType.Setter
        public Builder timeInterval(@Nullable String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public StatusCodesRangeBasedTriggerResponse build() {
            final var o = new StatusCodesRangeBasedTriggerResponse();
            o.count = count;
            o.path = path;
            o.statusCodes = statusCodes;
            o.timeInterval = timeInterval;
            return o;
        }
    }
}
