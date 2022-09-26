// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.WebAppAuthSettingsArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Configuration settings for the Azure App Service Authentication / Authorization feature.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppAuthSettings myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/authsettings 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppAuthSettings")
public class WebAppAuthSettings extends com.pulumi.resources.CustomResource {
    /**
     * Gets a JSON string containing the Azure AD Acl settings.
     * 
     */
    @Export(name="aadClaimsAuthorization", type=String.class, parameters={})
    private Output</* @Nullable */ String> aadClaimsAuthorization;

    /**
     * @return Gets a JSON string containing the Azure AD Acl settings.
     * 
     */
    public Output<Optional<String>> aadClaimsAuthorization() {
        return Codegen.optional(this.aadClaimsAuthorization);
    }
    /**
     * Login parameters to send to the OpenID Connect authorization endpoint when
     * a user logs in. Each parameter must be in the form &#34;key=value&#34;.
     * 
     */
    @Export(name="additionalLoginParams", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> additionalLoginParams;

    /**
     * @return Login parameters to send to the OpenID Connect authorization endpoint when
     * a user logs in. Each parameter must be in the form &#34;key=value&#34;.
     * 
     */
    public Output<Optional<List<String>>> additionalLoginParams() {
        return Codegen.optional(this.additionalLoginParams);
    }
    /**
     * Allowed audience values to consider when validating JWTs issued by
     * Azure Active Directory. Note that the &lt;code&gt;ClientID&lt;/code&gt; value is always considered an
     * allowed audience, regardless of this setting.
     * 
     */
    @Export(name="allowedAudiences", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedAudiences;

    /**
     * @return Allowed audience values to consider when validating JWTs issued by
     * Azure Active Directory. Note that the &lt;code&gt;ClientID&lt;/code&gt; value is always considered an
     * allowed audience, regardless of this setting.
     * 
     */
    public Output<Optional<List<String>>> allowedAudiences() {
        return Codegen.optional(this.allowedAudiences);
    }
    /**
     * External URLs that can be redirected to as part of logging in or logging out of the app. Note that the query string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     * 
     */
    @Export(name="allowedExternalRedirectUrls", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedExternalRedirectUrls;

    /**
     * @return External URLs that can be redirected to as part of logging in or logging out of the app. Note that the query string part of the URL is ignored.
     * This is an advanced setting typically only needed by Windows Store application backends.
     * Note that URLs within the current domain are always implicitly allowed.
     * 
     */
    public Output<Optional<List<String>>> allowedExternalRedirectUrls() {
        return Codegen.optional(this.allowedExternalRedirectUrls);
    }
    /**
     * The path of the config file containing auth settings.
     * If the path is relative, base will the site&#39;s root directory.
     * 
     */
    @Export(name="authFilePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> authFilePath;

    /**
     * @return The path of the config file containing auth settings.
     * If the path is relative, base will the site&#39;s root directory.
     * 
     */
    public Output<Optional<String>> authFilePath() {
        return Codegen.optional(this.authFilePath);
    }
    /**
     * The Client ID of this relying party application, known as the client_id.
     * This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientId;

    /**
     * @return The Client ID of this relying party application, known as the client_id.
     * This setting is required for enabling OpenID Connection authentication with Azure Active Directory or
     * other 3rd party OpenID Connect providers.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    public Output<Optional<String>> clientId() {
        return Codegen.optional(this.clientId);
    }
    /**
     * The Client Secret of this relying party application (in Azure Active Directory, this is also referred to as the Key).
     * This setting is optional. If no client secret is configured, the OpenID Connect implicit auth flow is used to authenticate end users.
     * Otherwise, the OpenID Connect Authorization Code Flow is used to authenticate end users.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return The Client Secret of this relying party application (in Azure Active Directory, this is also referred to as the Key).
     * This setting is optional. If no client secret is configured, the OpenID Connect implicit auth flow is used to authenticate end users.
     * Otherwise, the OpenID Connect Authorization Code Flow is used to authenticate end users.
     * More information on OpenID Connect: http://openid.net/specs/openid-connect-core-1_0.html
     * 
     */
    public Output<Optional<String>> clientSecret() {
        return Codegen.optional(this.clientSecret);
    }
    /**
     * An alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret. It is also optional.
     * 
     */
    @Export(name="clientSecretCertificateThumbprint", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecretCertificateThumbprint;

    /**
     * @return An alternative to the client secret, that is the thumbprint of a certificate used for signing purposes. This property acts as
     * a replacement for the Client Secret. It is also optional.
     * 
     */
    public Output<Optional<String>> clientSecretCertificateThumbprint() {
        return Codegen.optional(this.clientSecretCertificateThumbprint);
    }
    /**
     * The app setting name that contains the client secret of the relying party application.
     * 
     */
    @Export(name="clientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecretSettingName;

    /**
     * @return The app setting name that contains the client secret of the relying party application.
     * 
     */
    public Output<Optional<String>> clientSecretSettingName() {
        return Codegen.optional(this.clientSecretSettingName);
    }
    /**
     * The ConfigVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of the control plane for Authentication / Authorization.
     * 
     */
    @Export(name="configVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> configVersion;

    /**
     * @return The ConfigVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of the control plane for Authentication / Authorization.
     * 
     */
    public Output<Optional<String>> configVersion() {
        return Codegen.optional(this.configVersion);
    }
    /**
     * The default authentication provider to use when multiple providers are configured.
     * This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to &#34;RedirectToLoginPage&#34;.
     * 
     */
    @Export(name="defaultProvider", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultProvider;

    /**
     * @return The default authentication provider to use when multiple providers are configured.
     * This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to &#34;RedirectToLoginPage&#34;.
     * 
     */
    public Output<Optional<String>> defaultProvider() {
        return Codegen.optional(this.defaultProvider);
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; if the Authentication / Authorization feature is enabled for the current app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; if the Authentication / Authorization feature is enabled for the current app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The App ID of the Facebook app used for login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    @Export(name="facebookAppId", type=String.class, parameters={})
    private Output</* @Nullable */ String> facebookAppId;

    /**
     * @return The App ID of the Facebook app used for login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    public Output<Optional<String>> facebookAppId() {
        return Codegen.optional(this.facebookAppId);
    }
    /**
     * The App Secret of the Facebook app used for Facebook Login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    @Export(name="facebookAppSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> facebookAppSecret;

    /**
     * @return The App Secret of the Facebook app used for Facebook Login.
     * This setting is required for enabling Facebook Login.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    public Output<Optional<String>> facebookAppSecret() {
        return Codegen.optional(this.facebookAppSecret);
    }
    /**
     * The app setting name that contains the app secret used for Facebook Login.
     * 
     */
    @Export(name="facebookAppSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> facebookAppSecretSettingName;

    /**
     * @return The app setting name that contains the app secret used for Facebook Login.
     * 
     */
    public Output<Optional<String>> facebookAppSecretSettingName() {
        return Codegen.optional(this.facebookAppSecretSettingName);
    }
    /**
     * The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication.
     * This setting is optional.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    @Export(name="facebookOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> facebookOAuthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication.
     * This setting is optional.
     * Facebook Login documentation: https://developers.facebook.com/docs/facebook-login
     * 
     */
    public Output<Optional<List<String>>> facebookOAuthScopes() {
        return Codegen.optional(this.facebookOAuthScopes);
    }
    /**
     * The Client Id of the GitHub app used for login.
     * This setting is required for enabling Github login
     * 
     */
    @Export(name="gitHubClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> gitHubClientId;

    /**
     * @return The Client Id of the GitHub app used for login.
     * This setting is required for enabling Github login
     * 
     */
    public Output<Optional<String>> gitHubClientId() {
        return Codegen.optional(this.gitHubClientId);
    }
    /**
     * The Client Secret of the GitHub app used for Github Login.
     * This setting is required for enabling Github login.
     * 
     */
    @Export(name="gitHubClientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> gitHubClientSecret;

    /**
     * @return The Client Secret of the GitHub app used for Github Login.
     * This setting is required for enabling Github login.
     * 
     */
    public Output<Optional<String>> gitHubClientSecret() {
        return Codegen.optional(this.gitHubClientSecret);
    }
    /**
     * The app setting name that contains the client secret of the Github
     * app used for GitHub Login.
     * 
     */
    @Export(name="gitHubClientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> gitHubClientSecretSettingName;

    /**
     * @return The app setting name that contains the client secret of the Github
     * app used for GitHub Login.
     * 
     */
    public Output<Optional<String>> gitHubClientSecretSettingName() {
        return Codegen.optional(this.gitHubClientSecretSettingName);
    }
    /**
     * The OAuth 2.0 scopes that will be requested as part of GitHub Login authentication.
     * This setting is optional
     * 
     */
    @Export(name="gitHubOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> gitHubOAuthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of GitHub Login authentication.
     * This setting is optional
     * 
     */
    public Output<Optional<List<String>>> gitHubOAuthScopes() {
        return Codegen.optional(this.gitHubOAuthScopes);
    }
    /**
     * The OpenID Connect Client ID for the Google web application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    @Export(name="googleClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleClientId;

    /**
     * @return The OpenID Connect Client ID for the Google web application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    public Output<Optional<String>> googleClientId() {
        return Codegen.optional(this.googleClientId);
    }
    /**
     * The client secret associated with the Google web application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    @Export(name="googleClientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleClientSecret;

    /**
     * @return The client secret associated with the Google web application.
     * This setting is required for enabling Google Sign-In.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    public Output<Optional<String>> googleClientSecret() {
        return Codegen.optional(this.googleClientSecret);
    }
    /**
     * The app setting name that contains the client secret associated with
     * the Google web application.
     * 
     */
    @Export(name="googleClientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> googleClientSecretSettingName;

    /**
     * @return The app setting name that contains the client secret associated with
     * the Google web application.
     * 
     */
    public Output<Optional<String>> googleClientSecretSettingName() {
        return Codegen.optional(this.googleClientSecretSettingName);
    }
    /**
     * The OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication.
     * This setting is optional. If not specified, &#34;openid&#34;, &#34;profile&#34;, and &#34;email&#34; are used as default scopes.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    @Export(name="googleOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> googleOAuthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication.
     * This setting is optional. If not specified, &#34;openid&#34;, &#34;profile&#34;, and &#34;email&#34; are used as default scopes.
     * Google Sign-In documentation: https://developers.google.com/identity/sign-in/web/
     * 
     */
    public Output<Optional<List<String>>> googleOAuthScopes() {
        return Codegen.optional(this.googleOAuthScopes);
    }
    /**
     * &#34;true&#34; if the auth config settings should be read from a file,
     * &#34;false&#34; otherwise
     * 
     */
    @Export(name="isAuthFromFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> isAuthFromFile;

    /**
     * @return &#34;true&#34; if the auth config settings should be read from a file,
     * &#34;false&#34; otherwise
     * 
     */
    public Output<Optional<String>> isAuthFromFile() {
        return Codegen.optional(this.isAuthFromFile);
    }
    /**
     * The OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
     * When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://sts.windows.net/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token issuer.
     * More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html
     * 
     */
    @Export(name="issuer", type=String.class, parameters={})
    private Output</* @Nullable */ String> issuer;

    /**
     * @return The OpenID Connect Issuer URI that represents the entity which issues access tokens for this application.
     * When using Azure Active Directory, this value is the URI of the directory tenant, e.g. https://sts.windows.net/{tenant-guid}/.
     * This URI is a case-sensitive identifier for the token issuer.
     * More information on OpenID Connect Discovery: http://openid.net/specs/openid-connect-discovery-1_0.html
     * 
     */
    public Output<Optional<String>> issuer() {
        return Codegen.optional(this.issuer);
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * The OAuth 2.0 client ID that was created for the app used for authentication.
     * This setting is required for enabling Microsoft Account authentication.
     * Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm
     * 
     */
    @Export(name="microsoftAccountClientId", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAccountClientId;

    /**
     * @return The OAuth 2.0 client ID that was created for the app used for authentication.
     * This setting is required for enabling Microsoft Account authentication.
     * Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm
     * 
     */
    public Output<Optional<String>> microsoftAccountClientId() {
        return Codegen.optional(this.microsoftAccountClientId);
    }
    /**
     * The OAuth 2.0 client secret that was created for the app used for authentication.
     * This setting is required for enabling Microsoft Account authentication.
     * Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm
     * 
     */
    @Export(name="microsoftAccountClientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAccountClientSecret;

    /**
     * @return The OAuth 2.0 client secret that was created for the app used for authentication.
     * This setting is required for enabling Microsoft Account authentication.
     * Microsoft Account OAuth documentation: https://dev.onedrive.com/auth/msa_oauth.htm
     * 
     */
    public Output<Optional<String>> microsoftAccountClientSecret() {
        return Codegen.optional(this.microsoftAccountClientSecret);
    }
    /**
     * The app setting name containing the OAuth 2.0 client secret that was created for the
     * app used for authentication.
     * 
     */
    @Export(name="microsoftAccountClientSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> microsoftAccountClientSecretSettingName;

    /**
     * @return The app setting name containing the OAuth 2.0 client secret that was created for the
     * app used for authentication.
     * 
     */
    public Output<Optional<String>> microsoftAccountClientSecretSettingName() {
        return Codegen.optional(this.microsoftAccountClientSecretSettingName);
    }
    /**
     * The OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication.
     * This setting is optional. If not specified, &#34;wl.basic&#34; is used as the default scope.
     * Microsoft Account Scopes and permissions documentation: https://msdn.microsoft.com/en-us/library/dn631845.aspx
     * 
     */
    @Export(name="microsoftAccountOAuthScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> microsoftAccountOAuthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Microsoft Account authentication.
     * This setting is optional. If not specified, &#34;wl.basic&#34; is used as the default scope.
     * Microsoft Account Scopes and permissions documentation: https://msdn.microsoft.com/en-us/library/dn631845.aspx
     * 
     */
    public Output<Optional<List<String>>> microsoftAccountOAuthScopes() {
        return Codegen.optional(this.microsoftAccountOAuthScopes);
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization module.
     * 
     */
    @Export(name="runtimeVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeVersion;

    /**
     * @return The RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization module.
     * 
     */
    public Output<Optional<String>> runtimeVersion() {
        return Codegen.optional(this.runtimeVersion);
    }
    /**
     * The number of hours after session token expiration that a session token can be used to
     * call the token refresh API. The default is 72 hours.
     * 
     */
    @Export(name="tokenRefreshExtensionHours", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> tokenRefreshExtensionHours;

    /**
     * @return The number of hours after session token expiration that a session token can be used to
     * call the token refresh API. The default is 72 hours.
     * 
     */
    public Output<Optional<Double>> tokenRefreshExtensionHours() {
        return Codegen.optional(this.tokenRefreshExtensionHours);
    }
    /**
     * &lt;code&gt;true&lt;/code&gt; to durably store platform-specific security tokens that are obtained during login flows; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *  The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Export(name="tokenStoreEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tokenStoreEnabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to durably store platform-specific security tokens that are obtained during login flows; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *  The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Output<Optional<Boolean>> tokenStoreEnabled() {
        return Codegen.optional(this.tokenStoreEnabled);
    }
    /**
     * The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    @Export(name="twitterConsumerKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> twitterConsumerKey;

    /**
     * @return The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    public Output<Optional<String>> twitterConsumerKey() {
        return Codegen.optional(this.twitterConsumerKey);
    }
    /**
     * The OAuth 1.0a consumer secret of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    @Export(name="twitterConsumerSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> twitterConsumerSecret;

    /**
     * @return The OAuth 1.0a consumer secret of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    public Output<Optional<String>> twitterConsumerSecret() {
        return Codegen.optional(this.twitterConsumerSecret);
    }
    /**
     * The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
     * application used for sign-in.
     * 
     */
    @Export(name="twitterConsumerSecretSettingName", type=String.class, parameters={})
    private Output</* @Nullable */ String> twitterConsumerSecretSettingName;

    /**
     * @return The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
     * application used for sign-in.
     * 
     */
    public Output<Optional<String>> twitterConsumerSecretSettingName() {
        return Codegen.optional(this.twitterConsumerSecretSettingName);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    @Export(name="unauthenticatedClientAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> unauthenticatedClientAction;

    /**
     * @return The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    public Output<Optional<String>> unauthenticatedClientAction() {
        return Codegen.optional(this.unauthenticatedClientAction);
    }
    /**
     * Gets a value indicating whether the issuer should be a valid HTTPS url and be validated as such.
     * 
     */
    @Export(name="validateIssuer", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> validateIssuer;

    /**
     * @return Gets a value indicating whether the issuer should be a valid HTTPS url and be validated as such.
     * 
     */
    public Output<Optional<Boolean>> validateIssuer() {
        return Codegen.optional(this.validateIssuer);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppAuthSettings(String name) {
        this(name, WebAppAuthSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppAuthSettings(String name, WebAppAuthSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppAuthSettings(String name, WebAppAuthSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppAuthSettings", name, args == null ? WebAppAuthSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppAuthSettings(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppAuthSettings", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppAuthSettings").build()),
                Output.of(Alias.builder().type("azure-native:web/v20220301:WebAppAuthSettings").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WebAppAuthSettings get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppAuthSettings(name, id, options);
    }
}