// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ContainerResponse;
import com.pulumi.azurenative.web.outputs.DaprResponse;
import com.pulumi.azurenative.web.outputs.ScaleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TemplateResponse {
    /**
     * @return List of container definitions for the Container App.
     * 
     */
    private @Nullable List<ContainerResponse> containers;
    /**
     * @return Dapr configuration for the Container App.
     * 
     */
    private @Nullable DaprResponse dapr;
    /**
     * @return User friendly suffix that is appended to the revision name
     * 
     */
    private @Nullable String revisionSuffix;
    /**
     * @return Scaling properties for the Container App.
     * 
     */
    private @Nullable ScaleResponse scale;

    private TemplateResponse() {}
    /**
     * @return List of container definitions for the Container App.
     * 
     */
    public List<ContainerResponse> containers() {
        return this.containers == null ? List.of() : this.containers;
    }
    /**
     * @return Dapr configuration for the Container App.
     * 
     */
    public Optional<DaprResponse> dapr() {
        return Optional.ofNullable(this.dapr);
    }
    /**
     * @return User friendly suffix that is appended to the revision name
     * 
     */
    public Optional<String> revisionSuffix() {
        return Optional.ofNullable(this.revisionSuffix);
    }
    /**
     * @return Scaling properties for the Container App.
     * 
     */
    public Optional<ScaleResponse> scale() {
        return Optional.ofNullable(this.scale);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ContainerResponse> containers;
        private @Nullable DaprResponse dapr;
        private @Nullable String revisionSuffix;
        private @Nullable ScaleResponse scale;
        public Builder() {}
        public Builder(TemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containers = defaults.containers;
    	      this.dapr = defaults.dapr;
    	      this.revisionSuffix = defaults.revisionSuffix;
    	      this.scale = defaults.scale;
        }

        @CustomType.Setter
        public Builder containers(@Nullable List<ContainerResponse> containers) {
            this.containers = containers;
            return this;
        }
        public Builder containers(ContainerResponse... containers) {
            return containers(List.of(containers));
        }
        @CustomType.Setter
        public Builder dapr(@Nullable DaprResponse dapr) {
            this.dapr = dapr;
            return this;
        }
        @CustomType.Setter
        public Builder revisionSuffix(@Nullable String revisionSuffix) {
            this.revisionSuffix = revisionSuffix;
            return this;
        }
        @CustomType.Setter
        public Builder scale(@Nullable ScaleResponse scale) {
            this.scale = scale;
            return this;
        }
        public TemplateResponse build() {
            final var o = new TemplateResponse();
            o.containers = containers;
            o.dapr = dapr;
            o.revisionSuffix = revisionSuffix;
            o.scale = scale;
            return o;
        }
    }
}