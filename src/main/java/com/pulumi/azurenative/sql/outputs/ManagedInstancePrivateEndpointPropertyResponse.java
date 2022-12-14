// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedInstancePrivateEndpointPropertyResponse {
    /**
     * @return Resource id of the private endpoint.
     * 
     */
    private @Nullable String id;

    private ManagedInstancePrivateEndpointPropertyResponse() {}
    /**
     * @return Resource id of the private endpoint.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstancePrivateEndpointPropertyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        public Builder() {}
        public Builder(ManagedInstancePrivateEndpointPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public ManagedInstancePrivateEndpointPropertyResponse build() {
            final var o = new ManagedInstancePrivateEndpointPropertyResponse();
            o.id = id;
            return o;
        }
    }
}
