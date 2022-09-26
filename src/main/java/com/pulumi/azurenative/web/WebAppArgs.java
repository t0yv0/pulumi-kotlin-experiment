// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.enums.ClientCertMode;
import com.pulumi.azurenative.web.enums.RedundancyMode;
import com.pulumi.azurenative.web.inputs.CloningInfoArgs;
import com.pulumi.azurenative.web.inputs.HostNameSslStateArgs;
import com.pulumi.azurenative.web.inputs.HostingEnvironmentProfileArgs;
import com.pulumi.azurenative.web.inputs.ManagedServiceIdentityArgs;
import com.pulumi.azurenative.web.inputs.SiteConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppArgs Empty = new WebAppArgs();

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="clientAffinityEnabled")
    private @Nullable Output<Boolean> clientAffinityEnabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> clientAffinityEnabled() {
        return Optional.ofNullable(this.clientAffinityEnabled);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="clientCertEnabled")
    private @Nullable Output<Boolean> clientCertEnabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> clientCertEnabled() {
        return Optional.ofNullable(this.clientCertEnabled);
    }

    /**
     * client certificate authentication comma-separated exclusion paths
     * 
     */
    @Import(name="clientCertExclusionPaths")
    private @Nullable Output<String> clientCertExclusionPaths;

    /**
     * @return client certificate authentication comma-separated exclusion paths
     * 
     */
    public Optional<Output<String>> clientCertExclusionPaths() {
        return Optional.ofNullable(this.clientCertExclusionPaths);
    }

    /**
     * This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     */
    @Import(name="clientCertMode")
    private @Nullable Output<ClientCertMode> clientCertMode;

    /**
     * @return This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     */
    public Optional<Output<ClientCertMode>> clientCertMode() {
        return Optional.ofNullable(this.clientCertMode);
    }

    /**
     * If specified during app creation, the app is cloned from a source app.
     * 
     */
    @Import(name="cloningInfo")
    private @Nullable Output<CloningInfoArgs> cloningInfo;

    /**
     * @return If specified during app creation, the app is cloned from a source app.
     * 
     */
    public Optional<Output<CloningInfoArgs>> cloningInfo() {
        return Optional.ofNullable(this.cloningInfo);
    }

    /**
     * Size of the function container.
     * 
     */
    @Import(name="containerSize")
    private @Nullable Output<Integer> containerSize;

    /**
     * @return Size of the function container.
     * 
     */
    public Optional<Output<Integer>> containerSize() {
        return Optional.ofNullable(this.containerSize);
    }

    /**
     * Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
     * 
     */
    @Import(name="customDomainVerificationId")
    private @Nullable Output<String> customDomainVerificationId;

    /**
     * @return Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
     * 
     */
    public Optional<Output<String>> customDomainVerificationId() {
        return Optional.ofNullable(this.customDomainVerificationId);
    }

    /**
     * Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     * 
     */
    @Import(name="dailyMemoryTimeQuota")
    private @Nullable Output<Integer> dailyMemoryTimeQuota;

    /**
     * @return Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     * 
     */
    public Optional<Output<Integer>> dailyMemoryTimeQuota() {
        return Optional.ofNullable(this.dailyMemoryTimeQuota);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Hostname SSL states are used to manage the SSL bindings for app&#39;s hostnames.
     * 
     */
    @Import(name="hostNameSslStates")
    private @Nullable Output<List<HostNameSslStateArgs>> hostNameSslStates;

    /**
     * @return Hostname SSL states are used to manage the SSL bindings for app&#39;s hostnames.
     * 
     */
    public Optional<Output<List<HostNameSslStateArgs>>> hostNameSslStates() {
        return Optional.ofNullable(this.hostNameSslStates);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *  If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
     * 
     */
    @Import(name="hostNamesDisabled")
    private @Nullable Output<Boolean> hostNamesDisabled;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *  If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
     * 
     */
    public Optional<Output<Boolean>> hostNamesDisabled() {
        return Optional.ofNullable(this.hostNamesDisabled);
    }

    /**
     * App Service Environment to use for the app.
     * 
     */
    @Import(name="hostingEnvironmentProfile")
    private @Nullable Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile;

    /**
     * @return App Service Environment to use for the app.
     * 
     */
    public Optional<Output<HostingEnvironmentProfileArgs>> hostingEnvironmentProfile() {
        return Optional.ofNullable(this.hostingEnvironmentProfile);
    }

    /**
     * HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     * 
     */
    @Import(name="httpsOnly")
    private @Nullable Output<Boolean> httpsOnly;

    /**
     * @return HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     * 
     */
    public Optional<Output<Boolean>> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }

    /**
     * Hyper-V sandbox.
     * 
     */
    @Import(name="hyperV")
    private @Nullable Output<Boolean> hyperV;

    /**
     * @return Hyper-V sandbox.
     * 
     */
    public Optional<Output<Boolean>> hyperV() {
        return Optional.ofNullable(this.hyperV);
    }

    /**
     * Managed service identity.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ManagedServiceIdentityArgs> identity;

    /**
     * @return Managed service identity.
     * 
     */
    public Optional<Output<ManagedServiceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Obsolete: Hyper-V sandbox.
     * 
     */
    @Import(name="isXenon")
    private @Nullable Output<Boolean> isXenon;

    /**
     * @return Obsolete: Hyper-V sandbox.
     * 
     */
    public Optional<Output<Boolean>> isXenon() {
        return Optional.ofNullable(this.isXenon);
    }

    /**
     * Identity to use for Key Vault Reference authentication.
     * 
     */
    @Import(name="keyVaultReferenceIdentity")
    private @Nullable Output<String> keyVaultReferenceIdentity;

    /**
     * @return Identity to use for Key Vault Reference authentication.
     * 
     */
    public Optional<Output<String>> keyVaultReferenceIdentity() {
        return Optional.ofNullable(this.keyVaultReferenceIdentity);
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
     * Resource Location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Unique name of the app to create or update. To create or update a deployment slot, use the {slot} parameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name of the app to create or update. To create or update a deployment slot, use the {slot} parameter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Site redundancy mode
     * 
     */
    @Import(name="redundancyMode")
    private @Nullable Output<RedundancyMode> redundancyMode;

    /**
     * @return Site redundancy mode
     * 
     */
    public Optional<Output<RedundancyMode>> redundancyMode() {
        return Optional.ofNullable(this.redundancyMode);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="reserved")
    private @Nullable Output<Boolean> reserved;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> reserved() {
        return Optional.ofNullable(this.reserved);
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

    /**
     * &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="scmSiteAlsoStopped")
    private @Nullable Output<Boolean> scmSiteAlsoStopped;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> scmSiteAlsoStopped() {
        return Optional.ofNullable(this.scmSiteAlsoStopped);
    }

    /**
     * Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
     * 
     */
    @Import(name="serverFarmId")
    private @Nullable Output<String> serverFarmId;

    /**
     * @return Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
     * 
     */
    public Optional<Output<String>> serverFarmId() {
        return Optional.ofNullable(this.serverFarmId);
    }

    /**
     * Configuration of the app.
     * 
     */
    @Import(name="siteConfig")
    private @Nullable Output<SiteConfigArgs> siteConfig;

    /**
     * @return Configuration of the app.
     * 
     */
    public Optional<Output<SiteConfigArgs>> siteConfig() {
        return Optional.ofNullable(this.siteConfig);
    }

    /**
     * Checks if Customer provided storage account is required
     * 
     */
    @Import(name="storageAccountRequired")
    private @Nullable Output<Boolean> storageAccountRequired;

    /**
     * @return Checks if Customer provided storage account is required
     * 
     */
    public Optional<Output<Boolean>> storageAccountRequired() {
        return Optional.ofNullable(this.storageAccountRequired);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
     * 
     */
    @Import(name="virtualNetworkSubnetId")
    private @Nullable Output<String> virtualNetworkSubnetId;

    /**
     * @return Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
     * 
     */
    public Optional<Output<String>> virtualNetworkSubnetId() {
        return Optional.ofNullable(this.virtualNetworkSubnetId);
    }

    private WebAppArgs() {}

    private WebAppArgs(WebAppArgs $) {
        this.clientAffinityEnabled = $.clientAffinityEnabled;
        this.clientCertEnabled = $.clientCertEnabled;
        this.clientCertExclusionPaths = $.clientCertExclusionPaths;
        this.clientCertMode = $.clientCertMode;
        this.cloningInfo = $.cloningInfo;
        this.containerSize = $.containerSize;
        this.customDomainVerificationId = $.customDomainVerificationId;
        this.dailyMemoryTimeQuota = $.dailyMemoryTimeQuota;
        this.enabled = $.enabled;
        this.hostNameSslStates = $.hostNameSslStates;
        this.hostNamesDisabled = $.hostNamesDisabled;
        this.hostingEnvironmentProfile = $.hostingEnvironmentProfile;
        this.httpsOnly = $.httpsOnly;
        this.hyperV = $.hyperV;
        this.identity = $.identity;
        this.isXenon = $.isXenon;
        this.keyVaultReferenceIdentity = $.keyVaultReferenceIdentity;
        this.kind = $.kind;
        this.location = $.location;
        this.name = $.name;
        this.redundancyMode = $.redundancyMode;
        this.reserved = $.reserved;
        this.resourceGroupName = $.resourceGroupName;
        this.scmSiteAlsoStopped = $.scmSiteAlsoStopped;
        this.serverFarmId = $.serverFarmId;
        this.siteConfig = $.siteConfig;
        this.storageAccountRequired = $.storageAccountRequired;
        this.tags = $.tags;
        this.virtualNetworkSubnetId = $.virtualNetworkSubnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppArgs $;

        public Builder() {
            $ = new WebAppArgs();
        }

        public Builder(WebAppArgs defaults) {
            $ = new WebAppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientAffinityEnabled &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder clientAffinityEnabled(@Nullable Output<Boolean> clientAffinityEnabled) {
            $.clientAffinityEnabled = clientAffinityEnabled;
            return this;
        }

        /**
         * @param clientAffinityEnabled &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder clientAffinityEnabled(Boolean clientAffinityEnabled) {
            return clientAffinityEnabled(Output.of(clientAffinityEnabled));
        }

        /**
         * @param clientCertEnabled &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder clientCertEnabled(@Nullable Output<Boolean> clientCertEnabled) {
            $.clientCertEnabled = clientCertEnabled;
            return this;
        }

        /**
         * @param clientCertEnabled &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder clientCertEnabled(Boolean clientCertEnabled) {
            return clientCertEnabled(Output.of(clientCertEnabled));
        }

        /**
         * @param clientCertExclusionPaths client certificate authentication comma-separated exclusion paths
         * 
         * @return builder
         * 
         */
        public Builder clientCertExclusionPaths(@Nullable Output<String> clientCertExclusionPaths) {
            $.clientCertExclusionPaths = clientCertExclusionPaths;
            return this;
        }

        /**
         * @param clientCertExclusionPaths client certificate authentication comma-separated exclusion paths
         * 
         * @return builder
         * 
         */
        public Builder clientCertExclusionPaths(String clientCertExclusionPaths) {
            return clientCertExclusionPaths(Output.of(clientCertExclusionPaths));
        }

        /**
         * @param clientCertMode This composes with ClientCertEnabled setting.
         * - ClientCertEnabled: false means ClientCert is ignored.
         * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
         * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
         * 
         * @return builder
         * 
         */
        public Builder clientCertMode(@Nullable Output<ClientCertMode> clientCertMode) {
            $.clientCertMode = clientCertMode;
            return this;
        }

        /**
         * @param clientCertMode This composes with ClientCertEnabled setting.
         * - ClientCertEnabled: false means ClientCert is ignored.
         * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
         * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
         * 
         * @return builder
         * 
         */
        public Builder clientCertMode(ClientCertMode clientCertMode) {
            return clientCertMode(Output.of(clientCertMode));
        }

        /**
         * @param cloningInfo If specified during app creation, the app is cloned from a source app.
         * 
         * @return builder
         * 
         */
        public Builder cloningInfo(@Nullable Output<CloningInfoArgs> cloningInfo) {
            $.cloningInfo = cloningInfo;
            return this;
        }

        /**
         * @param cloningInfo If specified during app creation, the app is cloned from a source app.
         * 
         * @return builder
         * 
         */
        public Builder cloningInfo(CloningInfoArgs cloningInfo) {
            return cloningInfo(Output.of(cloningInfo));
        }

        /**
         * @param containerSize Size of the function container.
         * 
         * @return builder
         * 
         */
        public Builder containerSize(@Nullable Output<Integer> containerSize) {
            $.containerSize = containerSize;
            return this;
        }

        /**
         * @param containerSize Size of the function container.
         * 
         * @return builder
         * 
         */
        public Builder containerSize(Integer containerSize) {
            return containerSize(Output.of(containerSize));
        }

        /**
         * @param customDomainVerificationId Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
         * 
         * @return builder
         * 
         */
        public Builder customDomainVerificationId(@Nullable Output<String> customDomainVerificationId) {
            $.customDomainVerificationId = customDomainVerificationId;
            return this;
        }

        /**
         * @param customDomainVerificationId Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
         * 
         * @return builder
         * 
         */
        public Builder customDomainVerificationId(String customDomainVerificationId) {
            return customDomainVerificationId(Output.of(customDomainVerificationId));
        }

        /**
         * @param dailyMemoryTimeQuota Maximum allowed daily memory-time quota (applicable on dynamic apps only).
         * 
         * @return builder
         * 
         */
        public Builder dailyMemoryTimeQuota(@Nullable Output<Integer> dailyMemoryTimeQuota) {
            $.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
            return this;
        }

        /**
         * @param dailyMemoryTimeQuota Maximum allowed daily memory-time quota (applicable on dynamic apps only).
         * 
         * @return builder
         * 
         */
        public Builder dailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
            return dailyMemoryTimeQuota(Output.of(dailyMemoryTimeQuota));
        }

        /**
         * @param enabled &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param hostNameSslStates Hostname SSL states are used to manage the SSL bindings for app&#39;s hostnames.
         * 
         * @return builder
         * 
         */
        public Builder hostNameSslStates(@Nullable Output<List<HostNameSslStateArgs>> hostNameSslStates) {
            $.hostNameSslStates = hostNameSslStates;
            return this;
        }

        /**
         * @param hostNameSslStates Hostname SSL states are used to manage the SSL bindings for app&#39;s hostnames.
         * 
         * @return builder
         * 
         */
        public Builder hostNameSslStates(List<HostNameSslStateArgs> hostNameSslStates) {
            return hostNameSslStates(Output.of(hostNameSslStates));
        }

        /**
         * @param hostNameSslStates Hostname SSL states are used to manage the SSL bindings for app&#39;s hostnames.
         * 
         * @return builder
         * 
         */
        public Builder hostNameSslStates(HostNameSslStateArgs... hostNameSslStates) {
            return hostNameSslStates(List.of(hostNameSslStates));
        }

        /**
         * @param hostNamesDisabled &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
         *  If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
         * 
         * @return builder
         * 
         */
        public Builder hostNamesDisabled(@Nullable Output<Boolean> hostNamesDisabled) {
            $.hostNamesDisabled = hostNamesDisabled;
            return this;
        }

        /**
         * @param hostNamesDisabled &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
         *  If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
         * 
         * @return builder
         * 
         */
        public Builder hostNamesDisabled(Boolean hostNamesDisabled) {
            return hostNamesDisabled(Output.of(hostNamesDisabled));
        }

        /**
         * @param hostingEnvironmentProfile App Service Environment to use for the app.
         * 
         * @return builder
         * 
         */
        public Builder hostingEnvironmentProfile(@Nullable Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile) {
            $.hostingEnvironmentProfile = hostingEnvironmentProfile;
            return this;
        }

        /**
         * @param hostingEnvironmentProfile App Service Environment to use for the app.
         * 
         * @return builder
         * 
         */
        public Builder hostingEnvironmentProfile(HostingEnvironmentProfileArgs hostingEnvironmentProfile) {
            return hostingEnvironmentProfile(Output.of(hostingEnvironmentProfile));
        }

        /**
         * @param httpsOnly HttpsOnly: configures a web site to accept only https requests. Issues redirect for
         * http requests
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            $.httpsOnly = httpsOnly;
            return this;
        }

        /**
         * @param httpsOnly HttpsOnly: configures a web site to accept only https requests. Issues redirect for
         * http requests
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(Boolean httpsOnly) {
            return httpsOnly(Output.of(httpsOnly));
        }

        /**
         * @param hyperV Hyper-V sandbox.
         * 
         * @return builder
         * 
         */
        public Builder hyperV(@Nullable Output<Boolean> hyperV) {
            $.hyperV = hyperV;
            return this;
        }

        /**
         * @param hyperV Hyper-V sandbox.
         * 
         * @return builder
         * 
         */
        public Builder hyperV(Boolean hyperV) {
            return hyperV(Output.of(hyperV));
        }

        /**
         * @param identity Managed service identity.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity Managed service identity.
         * 
         * @return builder
         * 
         */
        public Builder identity(ManagedServiceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param isXenon Obsolete: Hyper-V sandbox.
         * 
         * @return builder
         * 
         */
        public Builder isXenon(@Nullable Output<Boolean> isXenon) {
            $.isXenon = isXenon;
            return this;
        }

        /**
         * @param isXenon Obsolete: Hyper-V sandbox.
         * 
         * @return builder
         * 
         */
        public Builder isXenon(Boolean isXenon) {
            return isXenon(Output.of(isXenon));
        }

        /**
         * @param keyVaultReferenceIdentity Identity to use for Key Vault Reference authentication.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultReferenceIdentity(@Nullable Output<String> keyVaultReferenceIdentity) {
            $.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
            return this;
        }

        /**
         * @param keyVaultReferenceIdentity Identity to use for Key Vault Reference authentication.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultReferenceIdentity(String keyVaultReferenceIdentity) {
            return keyVaultReferenceIdentity(Output.of(keyVaultReferenceIdentity));
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
         * @param location Resource Location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource Location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Unique name of the app to create or update. To create or update a deployment slot, use the {slot} parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name of the app to create or update. To create or update a deployment slot, use the {slot} parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redundancyMode Site redundancy mode
         * 
         * @return builder
         * 
         */
        public Builder redundancyMode(@Nullable Output<RedundancyMode> redundancyMode) {
            $.redundancyMode = redundancyMode;
            return this;
        }

        /**
         * @param redundancyMode Site redundancy mode
         * 
         * @return builder
         * 
         */
        public Builder redundancyMode(RedundancyMode redundancyMode) {
            return redundancyMode(Output.of(redundancyMode));
        }

        /**
         * @param reserved &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder reserved(@Nullable Output<Boolean> reserved) {
            $.reserved = reserved;
            return this;
        }

        /**
         * @param reserved &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder reserved(Boolean reserved) {
            return reserved(Output.of(reserved));
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

        /**
         * @param scmSiteAlsoStopped &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder scmSiteAlsoStopped(@Nullable Output<Boolean> scmSiteAlsoStopped) {
            $.scmSiteAlsoStopped = scmSiteAlsoStopped;
            return this;
        }

        /**
         * @param scmSiteAlsoStopped &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder scmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
            return scmSiteAlsoStopped(Output.of(scmSiteAlsoStopped));
        }

        /**
         * @param serverFarmId Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder serverFarmId(@Nullable Output<String> serverFarmId) {
            $.serverFarmId = serverFarmId;
            return this;
        }

        /**
         * @param serverFarmId Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder serverFarmId(String serverFarmId) {
            return serverFarmId(Output.of(serverFarmId));
        }

        /**
         * @param siteConfig Configuration of the app.
         * 
         * @return builder
         * 
         */
        public Builder siteConfig(@Nullable Output<SiteConfigArgs> siteConfig) {
            $.siteConfig = siteConfig;
            return this;
        }

        /**
         * @param siteConfig Configuration of the app.
         * 
         * @return builder
         * 
         */
        public Builder siteConfig(SiteConfigArgs siteConfig) {
            return siteConfig(Output.of(siteConfig));
        }

        /**
         * @param storageAccountRequired Checks if Customer provided storage account is required
         * 
         * @return builder
         * 
         */
        public Builder storageAccountRequired(@Nullable Output<Boolean> storageAccountRequired) {
            $.storageAccountRequired = storageAccountRequired;
            return this;
        }

        /**
         * @param storageAccountRequired Checks if Customer provided storage account is required
         * 
         * @return builder
         * 
         */
        public Builder storageAccountRequired(Boolean storageAccountRequired) {
            return storageAccountRequired(Output.of(storageAccountRequired));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param virtualNetworkSubnetId Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
         * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetId(@Nullable Output<String> virtualNetworkSubnetId) {
            $.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }

        /**
         * @param virtualNetworkSubnetId Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
         * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkSubnetId(String virtualNetworkSubnetId) {
            return virtualNetworkSubnetId(Output.of(virtualNetworkSubnetId));
        }

        public WebAppArgs build() {
            $.hyperV = Codegen.booleanProp("hyperV").output().arg($.hyperV).def(false).getNullable();
            $.isXenon = Codegen.booleanProp("isXenon").output().arg($.isXenon).def(false).getNullable();
            $.reserved = Codegen.booleanProp("reserved").output().arg($.reserved).def(false).getNullable();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scmSiteAlsoStopped = Codegen.booleanProp("scmSiteAlsoStopped").output().arg($.scmSiteAlsoStopped).def(false).getNullable();
            return $;
        }
    }

}