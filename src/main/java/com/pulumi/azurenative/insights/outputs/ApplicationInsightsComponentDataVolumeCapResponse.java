// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationInsightsComponentDataVolumeCapResponse {
    /**
     * @return Daily data volume cap in GB.
     * 
     */
    private @Nullable Double cap;
    /**
     * @return Maximum daily data volume cap that the user can set for this component.
     * 
     */
    private Double maxHistoryCap;
    /**
     * @return Daily data volume cap UTC reset hour.
     * 
     */
    private Integer resetTime;
    /**
     * @return Do not send a notification email when the daily data volume cap is met.
     * 
     */
    private @Nullable Boolean stopSendNotificationWhenHitCap;
    /**
     * @return Reserved, not used for now.
     * 
     */
    private @Nullable Boolean stopSendNotificationWhenHitThreshold;
    /**
     * @return Reserved, not used for now.
     * 
     */
    private @Nullable Integer warningThreshold;

    private ApplicationInsightsComponentDataVolumeCapResponse() {}
    /**
     * @return Daily data volume cap in GB.
     * 
     */
    public Optional<Double> cap() {
        return Optional.ofNullable(this.cap);
    }
    /**
     * @return Maximum daily data volume cap that the user can set for this component.
     * 
     */
    public Double maxHistoryCap() {
        return this.maxHistoryCap;
    }
    /**
     * @return Daily data volume cap UTC reset hour.
     * 
     */
    public Integer resetTime() {
        return this.resetTime;
    }
    /**
     * @return Do not send a notification email when the daily data volume cap is met.
     * 
     */
    public Optional<Boolean> stopSendNotificationWhenHitCap() {
        return Optional.ofNullable(this.stopSendNotificationWhenHitCap);
    }
    /**
     * @return Reserved, not used for now.
     * 
     */
    public Optional<Boolean> stopSendNotificationWhenHitThreshold() {
        return Optional.ofNullable(this.stopSendNotificationWhenHitThreshold);
    }
    /**
     * @return Reserved, not used for now.
     * 
     */
    public Optional<Integer> warningThreshold() {
        return Optional.ofNullable(this.warningThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInsightsComponentDataVolumeCapResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double cap;
        private Double maxHistoryCap;
        private Integer resetTime;
        private @Nullable Boolean stopSendNotificationWhenHitCap;
        private @Nullable Boolean stopSendNotificationWhenHitThreshold;
        private @Nullable Integer warningThreshold;
        public Builder() {}
        public Builder(ApplicationInsightsComponentDataVolumeCapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cap = defaults.cap;
    	      this.maxHistoryCap = defaults.maxHistoryCap;
    	      this.resetTime = defaults.resetTime;
    	      this.stopSendNotificationWhenHitCap = defaults.stopSendNotificationWhenHitCap;
    	      this.stopSendNotificationWhenHitThreshold = defaults.stopSendNotificationWhenHitThreshold;
    	      this.warningThreshold = defaults.warningThreshold;
        }

        @CustomType.Setter
        public Builder cap(@Nullable Double cap) {
            this.cap = cap;
            return this;
        }
        @CustomType.Setter
        public Builder maxHistoryCap(Double maxHistoryCap) {
            this.maxHistoryCap = Objects.requireNonNull(maxHistoryCap);
            return this;
        }
        @CustomType.Setter
        public Builder resetTime(Integer resetTime) {
            this.resetTime = Objects.requireNonNull(resetTime);
            return this;
        }
        @CustomType.Setter
        public Builder stopSendNotificationWhenHitCap(@Nullable Boolean stopSendNotificationWhenHitCap) {
            this.stopSendNotificationWhenHitCap = stopSendNotificationWhenHitCap;
            return this;
        }
        @CustomType.Setter
        public Builder stopSendNotificationWhenHitThreshold(@Nullable Boolean stopSendNotificationWhenHitThreshold) {
            this.stopSendNotificationWhenHitThreshold = stopSendNotificationWhenHitThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder warningThreshold(@Nullable Integer warningThreshold) {
            this.warningThreshold = warningThreshold;
            return this;
        }
        public ApplicationInsightsComponentDataVolumeCapResponse build() {
            final var o = new ApplicationInsightsComponentDataVolumeCapResponse();
            o.cap = cap;
            o.maxHistoryCap = maxHistoryCap;
            o.resetTime = resetTime;
            o.stopSendNotificationWhenHitCap = stopSendNotificationWhenHitCap;
            o.stopSendNotificationWhenHitThreshold = stopSendNotificationWhenHitThreshold;
            o.warningThreshold = warningThreshold;
            return o;
        }
    }
}
