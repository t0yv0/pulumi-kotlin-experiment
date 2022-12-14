// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CorsRuleResponse {
    /**
     * @return Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
     * 
     */
    private List<String> allowedHeaders;
    /**
     * @return Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
     * 
     */
    private List<String> allowedMethods;
    /**
     * @return Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or &#34;*&#34; to allow all domains
     * 
     */
    private List<String> allowedOrigins;
    /**
     * @return Required if CorsRule element is present. A list of response headers to expose to CORS clients.
     * 
     */
    private List<String> exposedHeaders;
    /**
     * @return Required if CorsRule element is present. The number of seconds that the client/browser should cache a preflight response.
     * 
     */
    private Integer maxAgeInSeconds;

    private CorsRuleResponse() {}
    /**
     * @return Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
     * 
     */
    public List<String> allowedHeaders() {
        return this.allowedHeaders;
    }
    /**
     * @return Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
     * 
     */
    public List<String> allowedMethods() {
        return this.allowedMethods;
    }
    /**
     * @return Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or &#34;*&#34; to allow all domains
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return Required if CorsRule element is present. A list of response headers to expose to CORS clients.
     * 
     */
    public List<String> exposedHeaders() {
        return this.exposedHeaders;
    }
    /**
     * @return Required if CorsRule element is present. The number of seconds that the client/browser should cache a preflight response.
     * 
     */
    public Integer maxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsRuleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private List<String> exposedHeaders;
        private Integer maxAgeInSeconds;
        public Builder() {}
        public Builder(CorsRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        @CustomType.Setter
        public Builder allowedHeaders(List<String> allowedHeaders) {
            this.allowedHeaders = Objects.requireNonNull(allowedHeaders);
            return this;
        }
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }
        @CustomType.Setter
        public Builder allowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        @CustomType.Setter
        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        @CustomType.Setter
        public Builder exposedHeaders(List<String> exposedHeaders) {
            this.exposedHeaders = Objects.requireNonNull(exposedHeaders);
            return this;
        }
        public Builder exposedHeaders(String... exposedHeaders) {
            return exposedHeaders(List.of(exposedHeaders));
        }
        @CustomType.Setter
        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds);
            return this;
        }
        public CorsRuleResponse build() {
            final var o = new CorsRuleResponse();
            o.allowedHeaders = allowedHeaders;
            o.allowedMethods = allowedMethods;
            o.allowedOrigins = allowedOrigins;
            o.exposedHeaders = exposedHeaders;
            o.maxAgeInSeconds = maxAgeInSeconds;
            return o;
        }
    }
}
