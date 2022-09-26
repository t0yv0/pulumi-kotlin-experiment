// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CorsSettingsResponse {
    /**
     * @return Gets or sets the list of origins that should be allowed to make cross-origin
     * calls (for example: http://example.com:12345). Use &#34;*&#34; to allow all.
     * 
     */
    private @Nullable List<String> allowedOrigins;
    /**
     * @return Gets or sets whether CORS requests with credentials are allowed. See
     * https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#Requests_with_credentials
     * for more details.
     * 
     */
    private @Nullable Boolean supportCredentials;

    private CorsSettingsResponse() {}
    /**
     * @return Gets or sets the list of origins that should be allowed to make cross-origin
     * calls (for example: http://example.com:12345). Use &#34;*&#34; to allow all.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins == null ? List.of() : this.allowedOrigins;
    }
    /**
     * @return Gets or sets whether CORS requests with credentials are allowed. See
     * https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS#Requests_with_credentials
     * for more details.
     * 
     */
    public Optional<Boolean> supportCredentials() {
        return Optional.ofNullable(this.supportCredentials);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsSettingsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedOrigins;
        private @Nullable Boolean supportCredentials;
        public Builder() {}
        public Builder(CorsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.supportCredentials = defaults.supportCredentials;
        }

        @CustomType.Setter
        public Builder allowedOrigins(@Nullable List<String> allowedOrigins) {
            this.allowedOrigins = allowedOrigins;
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        @CustomType.Setter
        public Builder supportCredentials(@Nullable Boolean supportCredentials) {
            this.supportCredentials = supportCredentials;
            return this;
        }
        public CorsSettingsResponse build() {
            final var o = new CorsSettingsResponse();
            o.allowedOrigins = allowedOrigins;
            o.supportCredentials = supportCredentials;
            return o;
        }
    }
}
