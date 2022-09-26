// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ArmIdWrapperResponse;
import com.pulumi.azurenative.web.outputs.PrivateLinkConnectionStateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppPrivateEndpointConnectionSlotResult {
    /**
     * @return Resource Id.
     * 
     */
    private String id;
    /**
     * @return Private IPAddresses mapped to the remote private endpoint
     * 
     */
    private @Nullable List<String> ipAddresses;
    /**
     * @return Kind of resource.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Resource Name.
     * 
     */
    private String name;
    /**
     * @return PrivateEndpoint of a remote private endpoint connection
     * 
     */
    private @Nullable ArmIdWrapperResponse privateEndpoint;
    /**
     * @return The state of a private link connection
     * 
     */
    private @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
    private String provisioningState;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetWebAppPrivateEndpointConnectionSlotResult() {}
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Private IPAddresses mapped to the remote private endpoint
     * 
     */
    public List<String> ipAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return PrivateEndpoint of a remote private endpoint connection
     * 
     */
    public Optional<ArmIdWrapperResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * @return The state of a private link connection
     * 
     */
    public Optional<PrivateLinkConnectionStateResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPrivateEndpointConnectionSlotResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable List<String> ipAddresses;
        private @Nullable String kind;
        private String name;
        private @Nullable ArmIdWrapperResponse privateEndpoint;
        private @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private String type;
        public Builder() {}
        public Builder(GetWebAppPrivateEndpointConnectionSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpoint(@Nullable ArmIdWrapperResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        @CustomType.Setter
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWebAppPrivateEndpointConnectionSlotResult build() {
            final var o = new GetWebAppPrivateEndpointConnectionSlotResult();
            o.id = id;
            o.ipAddresses = ipAddresses;
            o.kind = kind;
            o.name = name;
            o.privateEndpoint = privateEndpoint;
            o.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            o.provisioningState = provisioningState;
            o.type = type;
            return o;
        }
    }
}
