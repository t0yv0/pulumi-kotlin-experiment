// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NonceResponse {
    /**
     * @return The time after the request is made when the nonce should expire.
     * 
     */
    private @Nullable String nonceExpirationInterval;
    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the nonce should not be validated while completing the login flow; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    private @Nullable Boolean validateNonce;

    private NonceResponse() {}
    /**
     * @return The time after the request is made when the nonce should expire.
     * 
     */
    public Optional<String> nonceExpirationInterval() {
        return Optional.ofNullable(this.nonceExpirationInterval);
    }
    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the nonce should not be validated while completing the login flow; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Optional<Boolean> validateNonce() {
        return Optional.ofNullable(this.validateNonce);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonceResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String nonceExpirationInterval;
        private @Nullable Boolean validateNonce;
        public Builder() {}
        public Builder(NonceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonceExpirationInterval = defaults.nonceExpirationInterval;
    	      this.validateNonce = defaults.validateNonce;
        }

        @CustomType.Setter
        public Builder nonceExpirationInterval(@Nullable String nonceExpirationInterval) {
            this.nonceExpirationInterval = nonceExpirationInterval;
            return this;
        }
        @CustomType.Setter
        public Builder validateNonce(@Nullable Boolean validateNonce) {
            this.validateNonce = validateNonce;
            return this;
        }
        public NonceResponse build() {
            final var o = new NonceResponse();
            o.nonceExpirationInterval = nonceExpirationInterval;
            o.validateNonce = validateNonce;
            return o;
        }
    }
}