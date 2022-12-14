// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.inputs.AuthPlatformArgs;
import com.pulumi.azurenative.web.inputs.GlobalValidationArgs;
import com.pulumi.azurenative.web.inputs.HttpSettingsArgs;
import com.pulumi.azurenative.web.inputs.IdentityProvidersArgs;
import com.pulumi.azurenative.web.inputs.LoginArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppAuthSettingsV2Args extends com.pulumi.resources.ResourceArgs {

    public static final WebAppAuthSettingsV2Args Empty = new WebAppAuthSettingsV2Args();

    /**
     * The configuration settings that determines the validation flow of users using App Service Authentication/Authorization.
     * 
     */
    @Import(name="globalValidation")
    private @Nullable Output<GlobalValidationArgs> globalValidation;

    /**
     * @return The configuration settings that determines the validation flow of users using App Service Authentication/Authorization.
     * 
     */
    public Optional<Output<GlobalValidationArgs>> globalValidation() {
        return Optional.ofNullable(this.globalValidation);
    }

    /**
     * The configuration settings of the HTTP requests for authentication and authorization requests made against App Service Authentication/Authorization.
     * 
     */
    @Import(name="httpSettings")
    private @Nullable Output<HttpSettingsArgs> httpSettings;

    /**
     * @return The configuration settings of the HTTP requests for authentication and authorization requests made against App Service Authentication/Authorization.
     * 
     */
    public Optional<Output<HttpSettingsArgs>> httpSettings() {
        return Optional.ofNullable(this.httpSettings);
    }

    /**
     * The configuration settings of each of the identity providers used to configure App Service Authentication/Authorization.
     * 
     */
    @Import(name="identityProviders")
    private @Nullable Output<IdentityProvidersArgs> identityProviders;

    /**
     * @return The configuration settings of each of the identity providers used to configure App Service Authentication/Authorization.
     * 
     */
    public Optional<Output<IdentityProvidersArgs>> identityProviders() {
        return Optional.ofNullable(this.identityProviders);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The configuration settings of the login flow of users using App Service Authentication/Authorization.
     * 
     */
    @Import(name="login")
    private @Nullable Output<LoginArgs> login;

    /**
     * @return The configuration settings of the login flow of users using App Service Authentication/Authorization.
     * 
     */
    public Optional<Output<LoginArgs>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * Name of web app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of web app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The configuration settings of the platform of App Service Authentication/Authorization.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<AuthPlatformArgs> platform;

    /**
     * @return The configuration settings of the platform of App Service Authentication/Authorization.
     * 
     */
    public Optional<Output<AuthPlatformArgs>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private WebAppAuthSettingsV2Args() {}

    private WebAppAuthSettingsV2Args(WebAppAuthSettingsV2Args $) {
        this.globalValidation = $.globalValidation;
        this.httpSettings = $.httpSettings;
        this.identityProviders = $.identityProviders;
        this.kind = $.kind;
        this.login = $.login;
        this.name = $.name;
        this.platform = $.platform;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppAuthSettingsV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppAuthSettingsV2Args $;

        public Builder() {
            $ = new WebAppAuthSettingsV2Args();
        }

        public Builder(WebAppAuthSettingsV2Args defaults) {
            $ = new WebAppAuthSettingsV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param globalValidation The configuration settings that determines the validation flow of users using App Service Authentication/Authorization.
         * 
         * @return builder
         * 
         */
        public Builder globalValidation(@Nullable Output<GlobalValidationArgs> globalValidation) {
            $.globalValidation = globalValidation;
            return this;
        }

        /**
         * @param globalValidation The configuration settings that determines the validation flow of users using App Service Authentication/Authorization.
         * 
         * @return builder
         * 
         */
        public Builder globalValidation(GlobalValidationArgs globalValidation) {
            return globalValidation(Output.of(globalValidation));
        }

        /**
         * @param httpSettings The configuration settings of the HTTP requests for authentication and authorization requests made against App Service Authentication/Authorization.
         * 
         * @return builder
         * 
         */
        public Builder httpSettings(@Nullable Output<HttpSettingsArgs> httpSettings) {
            $.httpSettings = httpSettings;
            return this;
        }

        /**
         * @param httpSettings The configuration settings of the HTTP requests for authentication and authorization requests made against App Service Authentication/Authorization.
         * 
         * @return builder
         * 
         */
        public Builder httpSettings(HttpSettingsArgs httpSettings) {
            return httpSettings(Output.of(httpSettings));
        }

        /**
         * @param identityProviders The configuration settings of each of the identity providers used to configure App Service Authentication/Authorization.
         * 
         * @return builder
         * 
         */
        public Builder identityProviders(@Nullable Output<IdentityProvidersArgs> identityProviders) {
            $.identityProviders = identityProviders;
            return this;
        }

        /**
         * @param identityProviders The configuration settings of each of the identity providers used to configure App Service Authentication/Authorization.
         * 
         * @return builder
         * 
         */
        public Builder identityProviders(IdentityProvidersArgs identityProviders) {
            return identityProviders(Output.of(identityProviders));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param login The configuration settings of the login flow of users using App Service Authentication/Authorization.
         * 
         * @return builder
         * 
         */
        public Builder login(@Nullable Output<LoginArgs> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login The configuration settings of the login flow of users using App Service Authentication/Authorization.
         * 
         * @return builder
         * 
         */
        public Builder login(LoginArgs login) {
            return login(Output.of(login));
        }

        /**
         * @param name Name of web app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of web app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param platform The configuration settings of the platform of App Service Authentication/Authorization.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<AuthPlatformArgs> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform The configuration settings of the platform of App Service Authentication/Authorization.
         * 
         * @return builder
         * 
         */
        public Builder platform(AuthPlatformArgs platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public WebAppAuthSettingsV2Args build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
