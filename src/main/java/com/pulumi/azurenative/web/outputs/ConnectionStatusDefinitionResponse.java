// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ConnectionErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionStatusDefinitionResponse {
    /**
     * @return Connection error
     * 
     */
    private @Nullable ConnectionErrorResponse error;
    /**
     * @return The gateway status
     * 
     */
    private @Nullable String status;
    /**
     * @return Target of the error
     * 
     */
    private @Nullable String target;

    private ConnectionStatusDefinitionResponse() {}
    /**
     * @return Connection error
     * 
     */
    public Optional<ConnectionErrorResponse> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * @return The gateway status
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Target of the error
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionStatusDefinitionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConnectionErrorResponse error;
        private @Nullable String status;
        private @Nullable String target;
        public Builder() {}
        public Builder(ConnectionStatusDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
        }

        @CustomType.Setter
        public Builder error(@Nullable ConnectionErrorResponse error) {
            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public ConnectionStatusDefinitionResponse build() {
            final var o = new ConnectionStatusDefinitionResponse();
            o.error = error;
            o.status = status;
            o.target = target;
            return o;
        }
    }
}
