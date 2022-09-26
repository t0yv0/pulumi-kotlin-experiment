// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogAnalyticsDestinationResponse {
    /**
     * @return A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Customer ID of the Log Analytics workspace.
     * 
     */
    private String workspaceId;
    /**
     * @return The resource ID of the Log Analytics workspace.
     * 
     */
    private @Nullable String workspaceResourceId;

    private LogAnalyticsDestinationResponse() {}
    /**
     * @return A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Customer ID of the Log Analytics workspace.
     * 
     */
    public String workspaceId() {
        return this.workspaceId;
    }
    /**
     * @return The resource ID of the Log Analytics workspace.
     * 
     */
    public Optional<String> workspaceResourceId() {
        return Optional.ofNullable(this.workspaceResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsDestinationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private String workspaceId;
        private @Nullable String workspaceResourceId;
        public Builder() {}
        public Builder(LogAnalyticsDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }
        @CustomType.Setter
        public Builder workspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }
        public LogAnalyticsDestinationResponse build() {
            final var o = new LogAnalyticsDestinationResponse();
            o.name = name;
            o.workspaceId = workspaceId;
            o.workspaceResourceId = workspaceResourceId;
            return o;
        }
    }
}
