// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.RequestsBasedTriggerResponse;
import com.pulumi.azurenative.web.outputs.SlowRequestsBasedTriggerResponse;
import com.pulumi.azurenative.web.outputs.StatusCodesBasedTriggerResponse;
import com.pulumi.azurenative.web.outputs.StatusCodesRangeBasedTriggerResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoHealTriggersResponse {
    /**
     * @return A rule based on private bytes.
     * 
     */
    private @Nullable Integer privateBytesInKB;
    /**
     * @return A rule based on total requests.
     * 
     */
    private @Nullable RequestsBasedTriggerResponse requests;
    /**
     * @return A rule based on request execution time.
     * 
     */
    private @Nullable SlowRequestsBasedTriggerResponse slowRequests;
    /**
     * @return A rule based on multiple Slow Requests Rule with path
     * 
     */
    private @Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath;
    /**
     * @return A rule based on status codes.
     * 
     */
    private @Nullable List<StatusCodesBasedTriggerResponse> statusCodes;
    /**
     * @return A rule based on status codes ranges.
     * 
     */
    private @Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange;

    private AutoHealTriggersResponse() {}
    /**
     * @return A rule based on private bytes.
     * 
     */
    public Optional<Integer> privateBytesInKB() {
        return Optional.ofNullable(this.privateBytesInKB);
    }
    /**
     * @return A rule based on total requests.
     * 
     */
    public Optional<RequestsBasedTriggerResponse> requests() {
        return Optional.ofNullable(this.requests);
    }
    /**
     * @return A rule based on request execution time.
     * 
     */
    public Optional<SlowRequestsBasedTriggerResponse> slowRequests() {
        return Optional.ofNullable(this.slowRequests);
    }
    /**
     * @return A rule based on multiple Slow Requests Rule with path
     * 
     */
    public List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath() {
        return this.slowRequestsWithPath == null ? List.of() : this.slowRequestsWithPath;
    }
    /**
     * @return A rule based on status codes.
     * 
     */
    public List<StatusCodesBasedTriggerResponse> statusCodes() {
        return this.statusCodes == null ? List.of() : this.statusCodes;
    }
    /**
     * @return A rule based on status codes ranges.
     * 
     */
    public List<StatusCodesRangeBasedTriggerResponse> statusCodesRange() {
        return this.statusCodesRange == null ? List.of() : this.statusCodesRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealTriggersResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer privateBytesInKB;
        private @Nullable RequestsBasedTriggerResponse requests;
        private @Nullable SlowRequestsBasedTriggerResponse slowRequests;
        private @Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath;
        private @Nullable List<StatusCodesBasedTriggerResponse> statusCodes;
        private @Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange;
        public Builder() {}
        public Builder(AutoHealTriggersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateBytesInKB = defaults.privateBytesInKB;
    	      this.requests = defaults.requests;
    	      this.slowRequests = defaults.slowRequests;
    	      this.slowRequestsWithPath = defaults.slowRequestsWithPath;
    	      this.statusCodes = defaults.statusCodes;
    	      this.statusCodesRange = defaults.statusCodesRange;
        }

        @CustomType.Setter
        public Builder privateBytesInKB(@Nullable Integer privateBytesInKB) {
            this.privateBytesInKB = privateBytesInKB;
            return this;
        }
        @CustomType.Setter
        public Builder requests(@Nullable RequestsBasedTriggerResponse requests) {
            this.requests = requests;
            return this;
        }
        @CustomType.Setter
        public Builder slowRequests(@Nullable SlowRequestsBasedTriggerResponse slowRequests) {
            this.slowRequests = slowRequests;
            return this;
        }
        @CustomType.Setter
        public Builder slowRequestsWithPath(@Nullable List<SlowRequestsBasedTriggerResponse> slowRequestsWithPath) {
            this.slowRequestsWithPath = slowRequestsWithPath;
            return this;
        }
        public Builder slowRequestsWithPath(SlowRequestsBasedTriggerResponse... slowRequestsWithPath) {
            return slowRequestsWithPath(List.of(slowRequestsWithPath));
        }
        @CustomType.Setter
        public Builder statusCodes(@Nullable List<StatusCodesBasedTriggerResponse> statusCodes) {
            this.statusCodes = statusCodes;
            return this;
        }
        public Builder statusCodes(StatusCodesBasedTriggerResponse... statusCodes) {
            return statusCodes(List.of(statusCodes));
        }
        @CustomType.Setter
        public Builder statusCodesRange(@Nullable List<StatusCodesRangeBasedTriggerResponse> statusCodesRange) {
            this.statusCodesRange = statusCodesRange;
            return this;
        }
        public Builder statusCodesRange(StatusCodesRangeBasedTriggerResponse... statusCodesRange) {
            return statusCodesRange(List.of(statusCodesRange));
        }
        public AutoHealTriggersResponse build() {
            final var o = new AutoHealTriggersResponse();
            o.privateBytesInKB = privateBytesInKB;
            o.requests = requests;
            o.slowRequests = slowRequests;
            o.slowRequestsWithPath = slowRequestsWithPath;
            o.statusCodes = statusCodes;
            o.statusCodesRange = statusCodesRange;
            return o;
        }
    }
}
