// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.azurenative.sql.outputs.ManagedInstancePrivateEndpointConnectionPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedInstancePecPropertyResponse {
    /**
     * @return Resource ID.
     * 
     */
    private String id;
    /**
     * @return Private endpoint connection properties
     * 
     */
    private ManagedInstancePrivateEndpointConnectionPropertiesResponse properties;

    private ManagedInstancePecPropertyResponse() {}
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Private endpoint connection properties
     * 
     */
    public ManagedInstancePrivateEndpointConnectionPropertiesResponse properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstancePecPropertyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private ManagedInstancePrivateEndpointConnectionPropertiesResponse properties;
        public Builder() {}
        public Builder(ManagedInstancePecPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder properties(ManagedInstancePrivateEndpointConnectionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public ManagedInstancePecPropertyResponse build() {
            final var o = new ManagedInstancePecPropertyResponse();
            o.id = id;
            o.properties = properties;
            return o;
        }
    }
}
