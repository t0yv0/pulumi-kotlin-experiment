// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SasPolicyResponse {
    /**
     * @return The SAS expiration action. Can only be Log.
     * 
     */
    private String expirationAction;
    /**
     * @return The SAS expiration period, DD.HH:MM:SS.
     * 
     */
    private String sasExpirationPeriod;

    private SasPolicyResponse() {}
    /**
     * @return The SAS expiration action. Can only be Log.
     * 
     */
    public String expirationAction() {
        return this.expirationAction;
    }
    /**
     * @return The SAS expiration period, DD.HH:MM:SS.
     * 
     */
    public String sasExpirationPeriod() {
        return this.sasExpirationPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SasPolicyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expirationAction;
        private String sasExpirationPeriod;
        public Builder() {}
        public Builder(SasPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationAction = defaults.expirationAction;
    	      this.sasExpirationPeriod = defaults.sasExpirationPeriod;
        }

        @CustomType.Setter
        public Builder expirationAction(String expirationAction) {
            this.expirationAction = Objects.requireNonNull(expirationAction);
            return this;
        }
        @CustomType.Setter
        public Builder sasExpirationPeriod(String sasExpirationPeriod) {
            this.sasExpirationPeriod = Objects.requireNonNull(sasExpirationPeriod);
            return this;
        }
        public SasPolicyResponse build() {
            final var o = new SasPolicyResponse();
            o.expirationAction = expirationAction;
            o.sasExpirationPeriod = sasExpirationPeriod;
            return o;
        }
    }
}