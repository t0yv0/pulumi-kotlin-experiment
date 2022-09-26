// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.azurenative.resources.outputs.DeploymentPropertiesExtendedResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDeploymentAtSubscriptionScopeResult {
    /**
     * @return The ID of the deployment.
     * 
     */
    private String id;
    /**
     * @return the location of the deployment.
     * 
     */
    private @Nullable String location;
    /**
     * @return The name of the deployment.
     * 
     */
    private String name;
    /**
     * @return Deployment properties.
     * 
     */
    private DeploymentPropertiesExtendedResponse properties;
    /**
     * @return Deployment tags
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return The type of the deployment.
     * 
     */
    private String type;

    private GetDeploymentAtSubscriptionScopeResult() {}
    /**
     * @return The ID of the deployment.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return the location of the deployment.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the deployment.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Deployment properties.
     * 
     */
    public DeploymentPropertiesExtendedResponse properties() {
        return this.properties;
    }
    /**
     * @return Deployment tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the deployment.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentAtSubscriptionScopeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private DeploymentPropertiesExtendedResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;
        public Builder() {}
        public Builder(GetDeploymentAtSubscriptionScopeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder properties(DeploymentPropertiesExtendedResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDeploymentAtSubscriptionScopeResult build() {
            final var o = new GetDeploymentAtSubscriptionScopeResult();
            o.id = id;
            o.location = location;
            o.name = name;
            o.properties = properties;
            o.tags = tags;
            o.type = type;
            return o;
        }
    }
}
