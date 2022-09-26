// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.AzureActiveDirectoryLoginArgs;
import com.pulumi.azurenative.web.inputs.AzureActiveDirectoryRegistrationArgs;
import com.pulumi.azurenative.web.inputs.AzureActiveDirectoryValidationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Azure Active directory provider.
 * 
 */
public final class AzureActiveDirectoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureActiveDirectoryArgs Empty = new AzureActiveDirectoryArgs();

    /**
     * &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Gets a value indicating whether the Azure AD configuration was auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
     * read or write to this property.
     * 
     */
    @Import(name="isAutoProvisioned")
    private @Nullable Output<Boolean> isAutoProvisioned;

    /**
     * @return Gets a value indicating whether the Azure AD configuration was auto-provisioned using 1st party tooling.
     * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
     * read or write to this property.
     * 
     */
    public Optional<Output<Boolean>> isAutoProvisioned() {
        return Optional.ofNullable(this.isAutoProvisioned);
    }

    /**
     * The configuration settings of the Azure Active Directory login flow.
     * 
     */
    @Import(name="login")
    private @Nullable Output<AzureActiveDirectoryLoginArgs> login;

    /**
     * @return The configuration settings of the Azure Active Directory login flow.
     * 
     */
    public Optional<Output<AzureActiveDirectoryLoginArgs>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * The configuration settings of the Azure Active Directory app registration.
     * 
     */
    @Import(name="registration")
    private @Nullable Output<AzureActiveDirectoryRegistrationArgs> registration;

    /**
     * @return The configuration settings of the Azure Active Directory app registration.
     * 
     */
    public Optional<Output<AzureActiveDirectoryRegistrationArgs>> registration() {
        return Optional.ofNullable(this.registration);
    }

    /**
     * The configuration settings of the Azure Active Directory token validation flow.
     * 
     */
    @Import(name="validation")
    private @Nullable Output<AzureActiveDirectoryValidationArgs> validation;

    /**
     * @return The configuration settings of the Azure Active Directory token validation flow.
     * 
     */
    public Optional<Output<AzureActiveDirectoryValidationArgs>> validation() {
        return Optional.ofNullable(this.validation);
    }

    private AzureActiveDirectoryArgs() {}

    private AzureActiveDirectoryArgs(AzureActiveDirectoryArgs $) {
        this.enabled = $.enabled;
        this.isAutoProvisioned = $.isAutoProvisioned;
        this.login = $.login;
        this.registration = $.registration;
        this.validation = $.validation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureActiveDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureActiveDirectoryArgs $;

        public Builder() {
            $ = new AzureActiveDirectoryArgs();
        }

        public Builder(AzureActiveDirectoryArgs defaults) {
            $ = new AzureActiveDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled &lt;code&gt;false&lt;/code&gt; if the Azure Active Directory provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param isAutoProvisioned Gets a value indicating whether the Azure AD configuration was auto-provisioned using 1st party tooling.
         * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
         * read or write to this property.
         * 
         * @return builder
         * 
         */
        public Builder isAutoProvisioned(@Nullable Output<Boolean> isAutoProvisioned) {
            $.isAutoProvisioned = isAutoProvisioned;
            return this;
        }

        /**
         * @param isAutoProvisioned Gets a value indicating whether the Azure AD configuration was auto-provisioned using 1st party tooling.
         * This is an internal flag primarily intended to support the Azure Management Portal. Users should not
         * read or write to this property.
         * 
         * @return builder
         * 
         */
        public Builder isAutoProvisioned(Boolean isAutoProvisioned) {
            return isAutoProvisioned(Output.of(isAutoProvisioned));
        }

        /**
         * @param login The configuration settings of the Azure Active Directory login flow.
         * 
         * @return builder
         * 
         */
        public Builder login(@Nullable Output<AzureActiveDirectoryLoginArgs> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login The configuration settings of the Azure Active Directory login flow.
         * 
         * @return builder
         * 
         */
        public Builder login(AzureActiveDirectoryLoginArgs login) {
            return login(Output.of(login));
        }

        /**
         * @param registration The configuration settings of the Azure Active Directory app registration.
         * 
         * @return builder
         * 
         */
        public Builder registration(@Nullable Output<AzureActiveDirectoryRegistrationArgs> registration) {
            $.registration = registration;
            return this;
        }

        /**
         * @param registration The configuration settings of the Azure Active Directory app registration.
         * 
         * @return builder
         * 
         */
        public Builder registration(AzureActiveDirectoryRegistrationArgs registration) {
            return registration(Output.of(registration));
        }

        /**
         * @param validation The configuration settings of the Azure Active Directory token validation flow.
         * 
         * @return builder
         * 
         */
        public Builder validation(@Nullable Output<AzureActiveDirectoryValidationArgs> validation) {
            $.validation = validation;
            return this;
        }

        /**
         * @param validation The configuration settings of the Azure Active Directory token validation flow.
         * 
         * @return builder
         * 
         */
        public Builder validation(AzureActiveDirectoryValidationArgs validation) {
            return validation(Output.of(validation));
        }

        public AzureActiveDirectoryArgs build() {
            return $;
        }
    }

}