// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.AppleResponse;
import com.pulumi.azurenative.web.outputs.AzureActiveDirectoryResponse;
import com.pulumi.azurenative.web.outputs.AzureStaticWebAppsResponse;
import com.pulumi.azurenative.web.outputs.CustomOpenIdConnectProviderResponse;
import com.pulumi.azurenative.web.outputs.FacebookResponse;
import com.pulumi.azurenative.web.outputs.GitHubResponse;
import com.pulumi.azurenative.web.outputs.GoogleResponse;
import com.pulumi.azurenative.web.outputs.LegacyMicrosoftAccountResponse;
import com.pulumi.azurenative.web.outputs.TwitterResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IdentityProvidersResponse {
    /**
     * @return The configuration settings of the Apple provider.
     * 
     */
    private @Nullable AppleResponse apple;
    /**
     * @return The configuration settings of the Azure Active directory provider.
     * 
     */
    private @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
    /**
     * @return The configuration settings of the Azure Static Web Apps provider.
     * 
     */
    private @Nullable AzureStaticWebAppsResponse azureStaticWebApps;
    /**
     * @return The map of the name of the alias of each custom Open ID Connect provider to the
     * configuration settings of the custom Open ID Connect provider.
     * 
     */
    private @Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders;
    /**
     * @return The configuration settings of the Facebook provider.
     * 
     */
    private @Nullable FacebookResponse facebook;
    /**
     * @return The configuration settings of the GitHub provider.
     * 
     */
    private @Nullable GitHubResponse gitHub;
    /**
     * @return The configuration settings of the Google provider.
     * 
     */
    private @Nullable GoogleResponse google;
    /**
     * @return The configuration settings of the legacy Microsoft Account provider.
     * 
     */
    private @Nullable LegacyMicrosoftAccountResponse legacyMicrosoftAccount;
    /**
     * @return The configuration settings of the Twitter provider.
     * 
     */
    private @Nullable TwitterResponse twitter;

    private IdentityProvidersResponse() {}
    /**
     * @return The configuration settings of the Apple provider.
     * 
     */
    public Optional<AppleResponse> apple() {
        return Optional.ofNullable(this.apple);
    }
    /**
     * @return The configuration settings of the Azure Active directory provider.
     * 
     */
    public Optional<AzureActiveDirectoryResponse> azureActiveDirectory() {
        return Optional.ofNullable(this.azureActiveDirectory);
    }
    /**
     * @return The configuration settings of the Azure Static Web Apps provider.
     * 
     */
    public Optional<AzureStaticWebAppsResponse> azureStaticWebApps() {
        return Optional.ofNullable(this.azureStaticWebApps);
    }
    /**
     * @return The map of the name of the alias of each custom Open ID Connect provider to the
     * configuration settings of the custom Open ID Connect provider.
     * 
     */
    public Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders() {
        return this.customOpenIdConnectProviders == null ? Map.of() : this.customOpenIdConnectProviders;
    }
    /**
     * @return The configuration settings of the Facebook provider.
     * 
     */
    public Optional<FacebookResponse> facebook() {
        return Optional.ofNullable(this.facebook);
    }
    /**
     * @return The configuration settings of the GitHub provider.
     * 
     */
    public Optional<GitHubResponse> gitHub() {
        return Optional.ofNullable(this.gitHub);
    }
    /**
     * @return The configuration settings of the Google provider.
     * 
     */
    public Optional<GoogleResponse> google() {
        return Optional.ofNullable(this.google);
    }
    /**
     * @return The configuration settings of the legacy Microsoft Account provider.
     * 
     */
    public Optional<LegacyMicrosoftAccountResponse> legacyMicrosoftAccount() {
        return Optional.ofNullable(this.legacyMicrosoftAccount);
    }
    /**
     * @return The configuration settings of the Twitter provider.
     * 
     */
    public Optional<TwitterResponse> twitter() {
        return Optional.ofNullable(this.twitter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProvidersResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AppleResponse apple;
        private @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
        private @Nullable AzureStaticWebAppsResponse azureStaticWebApps;
        private @Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders;
        private @Nullable FacebookResponse facebook;
        private @Nullable GitHubResponse gitHub;
        private @Nullable GoogleResponse google;
        private @Nullable LegacyMicrosoftAccountResponse legacyMicrosoftAccount;
        private @Nullable TwitterResponse twitter;
        public Builder() {}
        public Builder(IdentityProvidersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apple = defaults.apple;
    	      this.azureActiveDirectory = defaults.azureActiveDirectory;
    	      this.azureStaticWebApps = defaults.azureStaticWebApps;
    	      this.customOpenIdConnectProviders = defaults.customOpenIdConnectProviders;
    	      this.facebook = defaults.facebook;
    	      this.gitHub = defaults.gitHub;
    	      this.google = defaults.google;
    	      this.legacyMicrosoftAccount = defaults.legacyMicrosoftAccount;
    	      this.twitter = defaults.twitter;
        }

        @CustomType.Setter
        public Builder apple(@Nullable AppleResponse apple) {
            this.apple = apple;
            return this;
        }
        @CustomType.Setter
        public Builder azureActiveDirectory(@Nullable AzureActiveDirectoryResponse azureActiveDirectory) {
            this.azureActiveDirectory = azureActiveDirectory;
            return this;
        }
        @CustomType.Setter
        public Builder azureStaticWebApps(@Nullable AzureStaticWebAppsResponse azureStaticWebApps) {
            this.azureStaticWebApps = azureStaticWebApps;
            return this;
        }
        @CustomType.Setter
        public Builder customOpenIdConnectProviders(@Nullable Map<String,CustomOpenIdConnectProviderResponse> customOpenIdConnectProviders) {
            this.customOpenIdConnectProviders = customOpenIdConnectProviders;
            return this;
        }
        @CustomType.Setter
        public Builder facebook(@Nullable FacebookResponse facebook) {
            this.facebook = facebook;
            return this;
        }
        @CustomType.Setter
        public Builder gitHub(@Nullable GitHubResponse gitHub) {
            this.gitHub = gitHub;
            return this;
        }
        @CustomType.Setter
        public Builder google(@Nullable GoogleResponse google) {
            this.google = google;
            return this;
        }
        @CustomType.Setter
        public Builder legacyMicrosoftAccount(@Nullable LegacyMicrosoftAccountResponse legacyMicrosoftAccount) {
            this.legacyMicrosoftAccount = legacyMicrosoftAccount;
            return this;
        }
        @CustomType.Setter
        public Builder twitter(@Nullable TwitterResponse twitter) {
            this.twitter = twitter;
            return this;
        }
        public IdentityProvidersResponse build() {
            final var o = new IdentityProvidersResponse();
            o.apple = apple;
            o.azureActiveDirectory = azureActiveDirectory;
            o.azureStaticWebApps = azureStaticWebApps;
            o.customOpenIdConnectProviders = customOpenIdConnectProviders;
            o.facebook = facebook;
            o.gitHub = gitHub;
            o.google = google;
            o.legacyMicrosoftAccount = legacyMicrosoftAccount;
            o.twitter = twitter;
            return o;
        }
    }
}