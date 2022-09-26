// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FileSystemHttpLogsConfigResponse {
    /**
     * @return True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Retention in days.
     * Remove files older than X days.
     * 0 or lower means no retention.
     * 
     */
    private @Nullable Integer retentionInDays;
    /**
     * @return Maximum size in megabytes that http log files can use.
     * When reached old log files will be removed to make space for new ones.
     * Value can range between 25 and 100.
     * 
     */
    private @Nullable Integer retentionInMb;

    private FileSystemHttpLogsConfigResponse() {}
    /**
     * @return True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Retention in days.
     * Remove files older than X days.
     * 0 or lower means no retention.
     * 
     */
    public Optional<Integer> retentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }
    /**
     * @return Maximum size in megabytes that http log files can use.
     * When reached old log files will be removed to make space for new ones.
     * Value can range between 25 and 100.
     * 
     */
    public Optional<Integer> retentionInMb() {
        return Optional.ofNullable(this.retentionInMb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemHttpLogsConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer retentionInDays;
        private @Nullable Integer retentionInMb;
        public Builder() {}
        public Builder(FileSystemHttpLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.retentionInMb = defaults.retentionInMb;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder retentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }
        @CustomType.Setter
        public Builder retentionInMb(@Nullable Integer retentionInMb) {
            this.retentionInMb = retentionInMb;
            return this;
        }
        public FileSystemHttpLogsConfigResponse build() {
            final var o = new FileSystemHttpLogsConfigResponse();
            o.enabled = enabled;
            o.retentionInDays = retentionInDays;
            o.retentionInMb = retentionInMb;
            return o;
        }
    }
}