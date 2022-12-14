// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.AzureActiveDirectoryLoginResponse;
import com.pulumi.azurenative.web.outputs.AzureActiveDirectoryRegistrationResponse;
import com.pulumi.azurenative.web.outputs.AzureActiveDirectoryValidationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureActiveDirectoryResponse {
    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Gets a value indicating whether the Azure AD configuration was auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
     * read or write to this property.
     * 
     */
    private @Nullable Boolean isAutoProvisioned;
    /**
     * @return The configuration settings of the Azure Active Directory login flow.
     * 
     */
    private @Nullable AzureActiveDirectoryLoginResponse login;
    /**
     * @return The configuration settings of the Azure Active Directory app registration.
     * 
     */
    private @Nullable AzureActiveDirectoryRegistrationResponse registration;
    /**
     * @return The configuration settings of the Azure Active Directory token validation flow.
     * 
     */
    private @Nullable AzureActiveDirectoryValidationResponse validation;

    private AzureActiveDirectoryResponse() {}
    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Gets a value indicating whether the Azure AD configuration was auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
     * read or write to this property.
     * 
     */
    public Optional<Boolean> isAutoProvisioned() {
        return Optional.ofNullable(this.isAutoProvisioned);
    }
    /**
     * @return The configuration settings of the Azure Active Directory login flow.
     * 
     */
    public Optional<AzureActiveDirectoryLoginResponse> login() {
        return Optional.ofNullable(this.login);
    }
    /**
     * @return The configuration settings of the Azure Active Directory app registration.
     * 
     */
    public Optional<AzureActiveDirectoryRegistrationResponse> registration() {
        return Optional.ofNullable(this.registration);
    }
    /**
     * @return The configuration settings of the Azure Active Directory token validation flow.
     * 
     */
    public Optional<AzureActiveDirectoryValidationResponse> validation() {
        return Optional.ofNullable(this.validation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean isAutoProvisioned;
        private @Nullable AzureActiveDirectoryLoginResponse login;
        private @Nullable AzureActiveDirectoryRegistrationResponse registration;
        private @Nullable AzureActiveDirectoryValidationResponse validation;
        public Builder() {}
        public Builder(AzureActiveDirectoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.isAutoProvisioned = defaults.isAutoProvisioned;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
    	      this.validation = defaults.validation;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder isAutoProvisioned(@Nullable Boolean isAutoProvisioned) {
            this.isAutoProvisioned = isAutoProvisioned;
            return this;
        }
        @CustomType.Setter
        public Builder login(@Nullable AzureActiveDirectoryLoginResponse login) {
            this.login = login;
            return this;
        }
        @CustomType.Setter
        public Builder registration(@Nullable AzureActiveDirectoryRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }
        @CustomType.Setter
        public Builder validation(@Nullable AzureActiveDirectoryValidationResponse validation) {
            this.validation = validation;
            return this;
        }
        public AzureActiveDirectoryResponse build() {
            final var o = new AzureActiveDirectoryResponse();
            o.enabled = enabled;
            o.isAutoProvisioned = isAutoProvisioned;
            o.login = login;
            o.registration = registration;
            o.validation = validation;
            return o;
        }
    }
}
