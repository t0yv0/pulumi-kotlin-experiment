// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubeEnvironmentProfileResponse {
    /**
     * @return Resource ID of the Kubernetes Environment.
     * 
     */
    private @Nullable String id;
    /**
     * @return Name of the Kubernetes Environment.
     * 
     */
    private String name;
    /**
     * @return Resource type of the Kubernetes Environment.
     * 
     */
    private String type;

    private KubeEnvironmentProfileResponse() {}
    /**
     * @return Resource ID of the Kubernetes Environment.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Name of the Kubernetes Environment.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource type of the Kubernetes Environment.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubeEnvironmentProfileResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private String name;
        private String type;
        public Builder() {}
        public Builder(KubeEnvironmentProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public KubeEnvironmentProfileResponse build() {
            final var o = new KubeEnvironmentProfileResponse();
            o.id = id;
            o.name = name;
            o.type = type;
            return o;
        }
    }
}
