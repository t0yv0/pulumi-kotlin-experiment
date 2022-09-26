// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataCollectionEndpointResponseConfigurationAccess {
    /**
     * @return The endpoint. This property is READ-ONLY.
     * 
     */
    private String endpoint;

    private DataCollectionEndpointResponseConfigurationAccess() {}
    /**
     * @return The endpoint. This property is READ-ONLY.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionEndpointResponseConfigurationAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoint;
        public Builder() {}
        public Builder(DataCollectionEndpointResponseConfigurationAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
        }

        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public DataCollectionEndpointResponseConfigurationAccess build() {
            final var o = new DataCollectionEndpointResponseConfigurationAccess();
            o.endpoint = endpoint;
            return o;
        }
    }
}