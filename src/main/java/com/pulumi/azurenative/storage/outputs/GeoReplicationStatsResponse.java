// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GeoReplicationStatsResponse {
    /**
     * @return A boolean flag which indicates whether or not account failover is supported for the account.
     * 
     */
    private Boolean canFailover;
    /**
     * @return All primary writes preceding this UTC date/time value are guaranteed to be available for read operations. Primary writes following this point in time may or may not be available for reads. Element may be default value if value of LastSyncTime is not available, this can happen if secondary is offline or we are in bootstrap.
     * 
     */
    private String lastSyncTime;
    /**
     * @return The status of the secondary location. Possible values are: - Live: Indicates that the secondary location is active and operational. - Bootstrap: Indicates initial synchronization from the primary location to the secondary location is in progress.This typically occurs when replication is first enabled. - Unavailable: Indicates that the secondary location is temporarily unavailable.
     * 
     */
    private String status;

    private GeoReplicationStatsResponse() {}
    /**
     * @return A boolean flag which indicates whether or not account failover is supported for the account.
     * 
     */
    public Boolean canFailover() {
        return this.canFailover;
    }
    /**
     * @return All primary writes preceding this UTC date/time value are guaranteed to be available for read operations. Primary writes following this point in time may or may not be available for reads. Element may be default value if value of LastSyncTime is not available, this can happen if secondary is offline or we are in bootstrap.
     * 
     */
    public String lastSyncTime() {
        return this.lastSyncTime;
    }
    /**
     * @return The status of the secondary location. Possible values are: - Live: Indicates that the secondary location is active and operational. - Bootstrap: Indicates initial synchronization from the primary location to the secondary location is in progress.This typically occurs when replication is first enabled. - Unavailable: Indicates that the secondary location is temporarily unavailable.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoReplicationStatsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean canFailover;
        private String lastSyncTime;
        private String status;
        public Builder() {}
        public Builder(GeoReplicationStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canFailover = defaults.canFailover;
    	      this.lastSyncTime = defaults.lastSyncTime;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder canFailover(Boolean canFailover) {
            this.canFailover = Objects.requireNonNull(canFailover);
            return this;
        }
        @CustomType.Setter
        public Builder lastSyncTime(String lastSyncTime) {
            this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GeoReplicationStatsResponse build() {
            final var o = new GeoReplicationStatsResponse();
            o.canFailover = canFailover;
            o.lastSyncTime = lastSyncTime;
            o.status = status;
            return o;
        }
    }
}
