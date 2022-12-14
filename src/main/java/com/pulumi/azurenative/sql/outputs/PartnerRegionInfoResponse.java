// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PartnerRegionInfoResponse {
    /**
     * @return Geo location of the partner managed instances.
     * 
     */
    private @Nullable String location;
    /**
     * @return Replication role of the partner managed instances.
     * 
     */
    private String replicationRole;

    private PartnerRegionInfoResponse() {}
    /**
     * @return Geo location of the partner managed instances.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Replication role of the partner managed instances.
     * 
     */
    public String replicationRole() {
        return this.replicationRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartnerRegionInfoResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String location;
        private String replicationRole;
        public Builder() {}
        public Builder(PartnerRegionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.replicationRole = defaults.replicationRole;
        }

        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder replicationRole(String replicationRole) {
            this.replicationRole = Objects.requireNonNull(replicationRole);
            return this;
        }
        public PartnerRegionInfoResponse build() {
            final var o = new PartnerRegionInfoResponse();
            o.location = location;
            o.replicationRole = replicationRole;
            return o;
        }
    }
}
