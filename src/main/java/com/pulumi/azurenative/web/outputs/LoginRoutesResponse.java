// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoginRoutesResponse {
    /**
     * @return The endpoint at which a logout request should be made.
     * 
     */
    private @Nullable String logoutEndpoint;

    private LoginRoutesResponse() {}
    /**
     * @return The endpoint at which a logout request should be made.
     * 
     */
    public Optional<String> logoutEndpoint() {
        return Optional.ofNullable(this.logoutEndpoint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoginRoutesResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String logoutEndpoint;
        public Builder() {}
        public Builder(LoginRoutesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logoutEndpoint = defaults.logoutEndpoint;
        }

        @CustomType.Setter
        public Builder logoutEndpoint(@Nullable String logoutEndpoint) {
            this.logoutEndpoint = logoutEndpoint;
            return this;
        }
        public LoginRoutesResponse build() {
            final var o = new LoginRoutesResponse();
            o.logoutEndpoint = logoutEndpoint;
            return o;
        }
    }
}
