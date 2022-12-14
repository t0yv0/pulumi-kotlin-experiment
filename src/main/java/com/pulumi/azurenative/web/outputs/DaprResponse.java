// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.DaprComponentResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DaprResponse {
    /**
     * @return Dapr application identifier
     * 
     */
    private @Nullable String appId;
    /**
     * @return Port on which the Dapr side car
     * 
     */
    private @Nullable Integer appPort;
    /**
     * @return Collection of Dapr components
     * 
     */
    private @Nullable List<DaprComponentResponse> components;
    /**
     * @return Boolean indicating if the Dapr side car is enabled
     * 
     */
    private @Nullable Boolean enabled;

    private DaprResponse() {}
    /**
     * @return Dapr application identifier
     * 
     */
    public Optional<String> appId() {
        return Optional.ofNullable(this.appId);
    }
    /**
     * @return Port on which the Dapr side car
     * 
     */
    public Optional<Integer> appPort() {
        return Optional.ofNullable(this.appPort);
    }
    /**
     * @return Collection of Dapr components
     * 
     */
    public List<DaprComponentResponse> components() {
        return this.components == null ? List.of() : this.components;
    }
    /**
     * @return Boolean indicating if the Dapr side car is enabled
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaprResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String appId;
        private @Nullable Integer appPort;
        private @Nullable List<DaprComponentResponse> components;
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(DaprResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appPort = defaults.appPort;
    	      this.components = defaults.components;
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder appId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }
        @CustomType.Setter
        public Builder appPort(@Nullable Integer appPort) {
            this.appPort = appPort;
            return this;
        }
        @CustomType.Setter
        public Builder components(@Nullable List<DaprComponentResponse> components) {
            this.components = components;
            return this;
        }
        public Builder components(DaprComponentResponse... components) {
            return components(List.of(components));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public DaprResponse build() {
            final var o = new DaprResponse();
            o.appId = appId;
            o.appPort = appPort;
            o.components = components;
            o.enabled = enabled;
            return o;
        }
    }
}
