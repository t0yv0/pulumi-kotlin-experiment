// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedInstancePairInfoResponse {
    /**
     * @return Id of Partner Managed Instance in pair.
     * 
     */
    private @Nullable String partnerManagedInstanceId;
    /**
     * @return Id of Primary Managed Instance in pair.
     * 
     */
    private @Nullable String primaryManagedInstanceId;

    private ManagedInstancePairInfoResponse() {}
    /**
     * @return Id of Partner Managed Instance in pair.
     * 
     */
    public Optional<String> partnerManagedInstanceId() {
        return Optional.ofNullable(this.partnerManagedInstanceId);
    }
    /**
     * @return Id of Primary Managed Instance in pair.
     * 
     */
    public Optional<String> primaryManagedInstanceId() {
        return Optional.ofNullable(this.primaryManagedInstanceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstancePairInfoResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String partnerManagedInstanceId;
        private @Nullable String primaryManagedInstanceId;
        public Builder() {}
        public Builder(ManagedInstancePairInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerManagedInstanceId = defaults.partnerManagedInstanceId;
    	      this.primaryManagedInstanceId = defaults.primaryManagedInstanceId;
        }

        @CustomType.Setter
        public Builder partnerManagedInstanceId(@Nullable String partnerManagedInstanceId) {
            this.partnerManagedInstanceId = partnerManagedInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder primaryManagedInstanceId(@Nullable String primaryManagedInstanceId) {
            this.primaryManagedInstanceId = primaryManagedInstanceId;
            return this;
        }
        public ManagedInstancePairInfoResponse build() {
            final var o = new ManagedInstancePairInfoResponse();
            o.partnerManagedInstanceId = partnerManagedInstanceId;
            o.primaryManagedInstanceId = primaryManagedInstanceId;
            return o;
        }
    }
}