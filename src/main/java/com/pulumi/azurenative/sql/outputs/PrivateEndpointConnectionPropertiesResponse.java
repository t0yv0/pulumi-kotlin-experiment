// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.azurenative.sql.outputs.PrivateEndpointPropertyResponse;
import com.pulumi.azurenative.sql.outputs.PrivateLinkServiceConnectionStatePropertyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointConnectionPropertiesResponse {
    /**
     * @return Private endpoint which the connection belongs to.
     * 
     */
    private @Nullable PrivateEndpointPropertyResponse privateEndpoint;
    /**
     * @return Connection state of the private endpoint connection.
     * 
     */
    private @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
    /**
     * @return State of the private endpoint connection.
     * 
     */
    private String provisioningState;

    private PrivateEndpointConnectionPropertiesResponse() {}
    /**
     * @return Private endpoint which the connection belongs to.
     * 
     */
    public Optional<PrivateEndpointPropertyResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * @return Connection state of the private endpoint connection.
     * 
     */
    public Optional<PrivateLinkServiceConnectionStatePropertyResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * @return State of the private endpoint connection.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PrivateEndpointPropertyResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
        private String provisioningState;
        public Builder() {}
        public Builder(PrivateEndpointConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        @CustomType.Setter
        public Builder privateEndpoint(@Nullable PrivateEndpointPropertyResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        @CustomType.Setter
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public PrivateEndpointConnectionPropertiesResponse build() {
            final var o = new PrivateEndpointConnectionPropertiesResponse();
            o.privateEndpoint = privateEndpoint;
            o.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            o.provisioningState = provisioningState;
            return o;
        }
    }
}
