// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information needed for cloning operation.
 * 
 */
public final class CloningInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloningInfoArgs Empty = new CloningInfoArgs();

    /**
     * Application setting overrides for cloned app. If specified, these settings override the settings cloned
     * from source app. Otherwise, application settings from source app are retained.
     * 
     */
    @Import(name="appSettingsOverrides")
    private @Nullable Output<Map<String,String>> appSettingsOverrides;

    /**
     * @return Application setting overrides for cloned app. If specified, these settings override the settings cloned
     * from source app. Otherwise, application settings from source app are retained.
     * 
     */
    public Optional<Output<Map<String,String>>> appSettingsOverrides() {
        return Optional.ofNullable(this.appSettingsOverrides);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; to clone custom hostnames from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="cloneCustomHostNames")
    private @Nullable Output<Boolean> cloneCustomHostNames;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to clone custom hostnames from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> cloneCustomHostNames() {
        return Optional.ofNullable(this.cloneCustomHostNames);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; to clone source control from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="cloneSourceControl")
    private @Nullable Output<Boolean> cloneSourceControl;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to clone source control from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> cloneSourceControl() {
        return Optional.ofNullable(this.cloneSourceControl);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; to configure load balancing for source and destination app.
     * 
     */
    @Import(name="configureLoadBalancing")
    private @Nullable Output<Boolean> configureLoadBalancing;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to configure load balancing for source and destination app.
     * 
     */
    public Optional<Output<Boolean>> configureLoadBalancing() {
        return Optional.ofNullable(this.configureLoadBalancing);
    }

    /**
     * Correlation ID of cloning operation. This ID ties multiple cloning operations
     * together to use the same snapshot.
     * 
     */
    @Import(name="correlationId")
    private @Nullable Output<String> correlationId;

    /**
     * @return Correlation ID of cloning operation. This ID ties multiple cloning operations
     * together to use the same snapshot.
     * 
     */
    public Optional<Output<String>> correlationId() {
        return Optional.ofNullable(this.correlationId);
    }

    /**
     * App Service Environment.
     * 
     */
    @Import(name="hostingEnvironment")
    private @Nullable Output<String> hostingEnvironment;

    /**
     * @return App Service Environment.
     * 
     */
    public Optional<Output<String>> hostingEnvironment() {
        return Optional.ofNullable(this.hostingEnvironment);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; to overwrite destination app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="overwrite")
    private @Nullable Output<Boolean> overwrite;

    /**
     * @return &lt;code&gt;true&lt;/code&gt; to overwrite destination app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    public Optional<Output<Boolean>> overwrite() {
        return Optional.ofNullable(this.overwrite);
    }

    /**
     * ARM resource ID of the source app. App resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName} for other slots.
     * 
     */
    @Import(name="sourceWebAppId", required=true)
    private Output<String> sourceWebAppId;

    /**
     * @return ARM resource ID of the source app. App resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName} for other slots.
     * 
     */
    public Output<String> sourceWebAppId() {
        return this.sourceWebAppId;
    }

    /**
     * Location of source app ex: West US or North Europe
     * 
     */
    @Import(name="sourceWebAppLocation")
    private @Nullable Output<String> sourceWebAppLocation;

    /**
     * @return Location of source app ex: West US or North Europe
     * 
     */
    public Optional<Output<String>> sourceWebAppLocation() {
        return Optional.ofNullable(this.sourceWebAppLocation);
    }

    /**
     * ARM resource ID of the Traffic Manager profile to use, if it exists. Traffic Manager resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
     * 
     */
    @Import(name="trafficManagerProfileId")
    private @Nullable Output<String> trafficManagerProfileId;

    /**
     * @return ARM resource ID of the Traffic Manager profile to use, if it exists. Traffic Manager resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
     * 
     */
    public Optional<Output<String>> trafficManagerProfileId() {
        return Optional.ofNullable(this.trafficManagerProfileId);
    }

    /**
     * Name of Traffic Manager profile to create. This is only needed if Traffic Manager profile does not already exist.
     * 
     */
    @Import(name="trafficManagerProfileName")
    private @Nullable Output<String> trafficManagerProfileName;

    /**
     * @return Name of Traffic Manager profile to create. This is only needed if Traffic Manager profile does not already exist.
     * 
     */
    public Optional<Output<String>> trafficManagerProfileName() {
        return Optional.ofNullable(this.trafficManagerProfileName);
    }

    private CloningInfoArgs() {}

    private CloningInfoArgs(CloningInfoArgs $) {
        this.appSettingsOverrides = $.appSettingsOverrides;
        this.cloneCustomHostNames = $.cloneCustomHostNames;
        this.cloneSourceControl = $.cloneSourceControl;
        this.configureLoadBalancing = $.configureLoadBalancing;
        this.correlationId = $.correlationId;
        this.hostingEnvironment = $.hostingEnvironment;
        this.overwrite = $.overwrite;
        this.sourceWebAppId = $.sourceWebAppId;
        this.sourceWebAppLocation = $.sourceWebAppLocation;
        this.trafficManagerProfileId = $.trafficManagerProfileId;
        this.trafficManagerProfileName = $.trafficManagerProfileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloningInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloningInfoArgs $;

        public Builder() {
            $ = new CloningInfoArgs();
        }

        public Builder(CloningInfoArgs defaults) {
            $ = new CloningInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appSettingsOverrides Application setting overrides for cloned app. If specified, these settings override the settings cloned
         * from source app. Otherwise, application settings from source app are retained.
         * 
         * @return builder
         * 
         */
        public Builder appSettingsOverrides(@Nullable Output<Map<String,String>> appSettingsOverrides) {
            $.appSettingsOverrides = appSettingsOverrides;
            return this;
        }

        /**
         * @param appSettingsOverrides Application setting overrides for cloned app. If specified, these settings override the settings cloned
         * from source app. Otherwise, application settings from source app are retained.
         * 
         * @return builder
         * 
         */
        public Builder appSettingsOverrides(Map<String,String> appSettingsOverrides) {
            return appSettingsOverrides(Output.of(appSettingsOverrides));
        }

        /**
         * @param cloneCustomHostNames &lt;code&gt;true&lt;/code&gt; to clone custom hostnames from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder cloneCustomHostNames(@Nullable Output<Boolean> cloneCustomHostNames) {
            $.cloneCustomHostNames = cloneCustomHostNames;
            return this;
        }

        /**
         * @param cloneCustomHostNames &lt;code&gt;true&lt;/code&gt; to clone custom hostnames from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder cloneCustomHostNames(Boolean cloneCustomHostNames) {
            return cloneCustomHostNames(Output.of(cloneCustomHostNames));
        }

        /**
         * @param cloneSourceControl &lt;code&gt;true&lt;/code&gt; to clone source control from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder cloneSourceControl(@Nullable Output<Boolean> cloneSourceControl) {
            $.cloneSourceControl = cloneSourceControl;
            return this;
        }

        /**
         * @param cloneSourceControl &lt;code&gt;true&lt;/code&gt; to clone source control from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder cloneSourceControl(Boolean cloneSourceControl) {
            return cloneSourceControl(Output.of(cloneSourceControl));
        }

        /**
         * @param configureLoadBalancing &lt;code&gt;true&lt;/code&gt; to configure load balancing for source and destination app.
         * 
         * @return builder
         * 
         */
        public Builder configureLoadBalancing(@Nullable Output<Boolean> configureLoadBalancing) {
            $.configureLoadBalancing = configureLoadBalancing;
            return this;
        }

        /**
         * @param configureLoadBalancing &lt;code&gt;true&lt;/code&gt; to configure load balancing for source and destination app.
         * 
         * @return builder
         * 
         */
        public Builder configureLoadBalancing(Boolean configureLoadBalancing) {
            return configureLoadBalancing(Output.of(configureLoadBalancing));
        }

        /**
         * @param correlationId Correlation ID of cloning operation. This ID ties multiple cloning operations
         * together to use the same snapshot.
         * 
         * @return builder
         * 
         */
        public Builder correlationId(@Nullable Output<String> correlationId) {
            $.correlationId = correlationId;
            return this;
        }

        /**
         * @param correlationId Correlation ID of cloning operation. This ID ties multiple cloning operations
         * together to use the same snapshot.
         * 
         * @return builder
         * 
         */
        public Builder correlationId(String correlationId) {
            return correlationId(Output.of(correlationId));
        }

        /**
         * @param hostingEnvironment App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder hostingEnvironment(@Nullable Output<String> hostingEnvironment) {
            $.hostingEnvironment = hostingEnvironment;
            return this;
        }

        /**
         * @param hostingEnvironment App Service Environment.
         * 
         * @return builder
         * 
         */
        public Builder hostingEnvironment(String hostingEnvironment) {
            return hostingEnvironment(Output.of(hostingEnvironment));
        }

        /**
         * @param overwrite &lt;code&gt;true&lt;/code&gt; to overwrite destination app; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder overwrite(@Nullable Output<Boolean> overwrite) {
            $.overwrite = overwrite;
            return this;
        }

        /**
         * @param overwrite &lt;code&gt;true&lt;/code&gt; to overwrite destination app; otherwise, &lt;code&gt;false&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder overwrite(Boolean overwrite) {
            return overwrite(Output.of(overwrite));
        }

        /**
         * @param sourceWebAppId ARM resource ID of the source app. App resource ID is of the form
         * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production slots and
         * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName} for other slots.
         * 
         * @return builder
         * 
         */
        public Builder sourceWebAppId(Output<String> sourceWebAppId) {
            $.sourceWebAppId = sourceWebAppId;
            return this;
        }

        /**
         * @param sourceWebAppId ARM resource ID of the source app. App resource ID is of the form
         * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production slots and
         * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName} for other slots.
         * 
         * @return builder
         * 
         */
        public Builder sourceWebAppId(String sourceWebAppId) {
            return sourceWebAppId(Output.of(sourceWebAppId));
        }

        /**
         * @param sourceWebAppLocation Location of source app ex: West US or North Europe
         * 
         * @return builder
         * 
         */
        public Builder sourceWebAppLocation(@Nullable Output<String> sourceWebAppLocation) {
            $.sourceWebAppLocation = sourceWebAppLocation;
            return this;
        }

        /**
         * @param sourceWebAppLocation Location of source app ex: West US or North Europe
         * 
         * @return builder
         * 
         */
        public Builder sourceWebAppLocation(String sourceWebAppLocation) {
            return sourceWebAppLocation(Output.of(sourceWebAppLocation));
        }

        /**
         * @param trafficManagerProfileId ARM resource ID of the Traffic Manager profile to use, if it exists. Traffic Manager resource ID is of the form
         * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
         * 
         * @return builder
         * 
         */
        public Builder trafficManagerProfileId(@Nullable Output<String> trafficManagerProfileId) {
            $.trafficManagerProfileId = trafficManagerProfileId;
            return this;
        }

        /**
         * @param trafficManagerProfileId ARM resource ID of the Traffic Manager profile to use, if it exists. Traffic Manager resource ID is of the form
         * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
         * 
         * @return builder
         * 
         */
        public Builder trafficManagerProfileId(String trafficManagerProfileId) {
            return trafficManagerProfileId(Output.of(trafficManagerProfileId));
        }

        /**
         * @param trafficManagerProfileName Name of Traffic Manager profile to create. This is only needed if Traffic Manager profile does not already exist.
         * 
         * @return builder
         * 
         */
        public Builder trafficManagerProfileName(@Nullable Output<String> trafficManagerProfileName) {
            $.trafficManagerProfileName = trafficManagerProfileName;
            return this;
        }

        /**
         * @param trafficManagerProfileName Name of Traffic Manager profile to create. This is only needed if Traffic Manager profile does not already exist.
         * 
         * @return builder
         * 
         */
        public Builder trafficManagerProfileName(String trafficManagerProfileName) {
            return trafficManagerProfileName(Output.of(trafficManagerProfileName));
        }

        public CloningInfoArgs build() {
            $.sourceWebAppId = Objects.requireNonNull($.sourceWebAppId, "expected parameter 'sourceWebAppId' to be non-null");
            return $;
        }
    }

}