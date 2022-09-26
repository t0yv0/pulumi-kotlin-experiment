// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.JwtClaimChecksResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureActiveDirectoryValidationResponse {
    /**
     * @return The list of audiences that can make successful authentication/authorization requests.
     * 
     */
    private @Nullable List<String> allowedAudiences;
    /**
     * @return The configuration settings of the checks that should be made while validating the JWT Claims.
     * 
     */
    private @Nullable JwtClaimChecksResponse jwtClaimChecks;

    private AzureActiveDirectoryValidationResponse() {}
    /**
     * @return The list of audiences that can make successful authentication/authorization requests.
     * 
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences == null ? List.of() : this.allowedAudiences;
    }
    /**
     * @return The configuration settings of the checks that should be made while validating the JWT Claims.
     * 
     */
    public Optional<JwtClaimChecksResponse> jwtClaimChecks() {
        return Optional.ofNullable(this.jwtClaimChecks);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryValidationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedAudiences;
        private @Nullable JwtClaimChecksResponse jwtClaimChecks;
        public Builder() {}
        public Builder(AzureActiveDirectoryValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.jwtClaimChecks = defaults.jwtClaimChecks;
        }

        @CustomType.Setter
        public Builder allowedAudiences(@Nullable List<String> allowedAudiences) {
            this.allowedAudiences = allowedAudiences;
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
        }
        @CustomType.Setter
        public Builder jwtClaimChecks(@Nullable JwtClaimChecksResponse jwtClaimChecks) {
            this.jwtClaimChecks = jwtClaimChecks;
            return this;
        }
        public AzureActiveDirectoryValidationResponse build() {
            final var o = new AzureActiveDirectoryValidationResponse();
            o.allowedAudiences = allowedAudiences;
            o.jwtClaimChecks = jwtClaimChecks;
            return o;
        }
    }
}
