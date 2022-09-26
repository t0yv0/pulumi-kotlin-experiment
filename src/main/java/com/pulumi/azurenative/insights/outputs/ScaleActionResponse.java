// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScaleActionResponse {
    /**
     * @return the amount of time to wait since the last scaling action before this action occurs. It must be between 1 week and 1 minute in ISO 8601 format.
     * 
     */
    private String cooldown;
    /**
     * @return the scale direction. Whether the scaling action increases or decreases the number of instances.
     * 
     */
    private String direction;
    /**
     * @return the type of action that should occur when the scale rule fires.
     * 
     */
    private String type;
    /**
     * @return the number of instances that are involved in the scaling action. This value must be 1 or greater. The default value is 1.
     * 
     */
    private @Nullable String value;

    private ScaleActionResponse() {}
    /**
     * @return the amount of time to wait since the last scaling action before this action occurs. It must be between 1 week and 1 minute in ISO 8601 format.
     * 
     */
    public String cooldown() {
        return this.cooldown;
    }
    /**
     * @return the scale direction. Whether the scaling action increases or decreases the number of instances.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return the type of action that should occur when the scale rule fires.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return the number of instances that are involved in the scaling action. This value must be 1 or greater. The default value is 1.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleActionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cooldown;
        private String direction;
        private String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(ScaleActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldown = defaults.cooldown;
    	      this.direction = defaults.direction;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder cooldown(String cooldown) {
            this.cooldown = Objects.requireNonNull(cooldown);
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ScaleActionResponse build() {
            final var o = new ScaleActionResponse();
            o.cooldown = cooldown;
            o.direction = direction;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}
