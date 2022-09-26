// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentVariableResponse {
    /**
     * @return The name of the environment variable.
     * 
     */
    private String name;
    /**
     * @return The value of the secure environment variable.
     * 
     */
    private @Nullable String secureValue;
    /**
     * @return The value of the environment variable.
     * 
     */
    private @Nullable String value;

    private EnvironmentVariableResponse() {}
    /**
     * @return The name of the environment variable.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the secure environment variable.
     * 
     */
    public Optional<String> secureValue() {
        return Optional.ofNullable(this.secureValue);
    }
    /**
     * @return The value of the environment variable.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVariableResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable String secureValue;
        private @Nullable String value;
        public Builder() {}
        public Builder(EnvironmentVariableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secureValue = defaults.secureValue;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder secureValue(@Nullable String secureValue) {
            this.secureValue = secureValue;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public EnvironmentVariableResponse build() {
            final var o = new EnvironmentVariableResponse();
            o.name = name;
            o.secureValue = secureValue;
            o.value = value;
            return o;
        }
    }
}