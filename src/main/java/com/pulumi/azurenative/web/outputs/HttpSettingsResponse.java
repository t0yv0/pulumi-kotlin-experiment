// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ForwardProxyResponse;
import com.pulumi.azurenative.web.outputs.HttpSettingsRoutesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpSettingsResponse {
    /**
     * @return The configuration settings of a forward proxy used to make the requests.
     * 
     */
    private @Nullable ForwardProxyResponse forwardProxy;
    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the authentication/authorization responses not having the HTTPS scheme are permissible; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    private @Nullable Boolean requireHttps;
    /**
     * @return The configuration settings of the paths HTTP requests.
     * 
     */
    private @Nullable HttpSettingsRoutesResponse routes;

    private HttpSettingsResponse() {}
    /**
     * @return The configuration settings of a forward proxy used to make the requests.
     * 
     */
    public Optional<ForwardProxyResponse> forwardProxy() {
        return Optional.ofNullable(this.forwardProxy);
    }
    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the authentication/authorization responses not having the HTTPS scheme are permissible; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Optional<Boolean> requireHttps() {
        return Optional.ofNullable(this.requireHttps);
    }
    /**
     * @return The configuration settings of the paths HTTP requests.
     * 
     */
    public Optional<HttpSettingsRoutesResponse> routes() {
        return Optional.ofNullable(this.routes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpSettingsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ForwardProxyResponse forwardProxy;
        private @Nullable Boolean requireHttps;
        private @Nullable HttpSettingsRoutesResponse routes;
        public Builder() {}
        public Builder(HttpSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardProxy = defaults.forwardProxy;
    	      this.requireHttps = defaults.requireHttps;
    	      this.routes = defaults.routes;
        }

        @CustomType.Setter
        public Builder forwardProxy(@Nullable ForwardProxyResponse forwardProxy) {
            this.forwardProxy = forwardProxy;
            return this;
        }
        @CustomType.Setter
        public Builder requireHttps(@Nullable Boolean requireHttps) {
            this.requireHttps = requireHttps;
            return this;
        }
        @CustomType.Setter
        public Builder routes(@Nullable HttpSettingsRoutesResponse routes) {
            this.routes = routes;
            return this;
        }
        public HttpSettingsResponse build() {
            final var o = new HttpSettingsResponse();
            o.forwardProxy = forwardProxy;
            o.requireHttps = requireHttps;
            o.routes = routes;
            return o;
        }
    }
}