// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.inputs.AppLogsConfigurationArgs;
import com.pulumi.azurenative.web.inputs.ArcConfigurationArgs;
import com.pulumi.azurenative.web.inputs.ExtendedLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubeEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubeEnvironmentArgs Empty = new KubeEnvironmentArgs();

    @Import(name="aksResourceID")
    private @Nullable Output<String> aksResourceID;

    public Optional<Output<String>> aksResourceID() {
        return Optional.ofNullable(this.aksResourceID);
    }

    /**
     * Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only &#34;log-analytics&#34; is
     * supported
     * 
     */
    @Import(name="appLogsConfiguration")
    private @Nullable Output<AppLogsConfigurationArgs> appLogsConfiguration;

    /**
     * @return Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only &#34;log-analytics&#34; is
     * supported
     * 
     */
    public Optional<Output<AppLogsConfigurationArgs>> appLogsConfiguration() {
        return Optional.ofNullable(this.appLogsConfiguration);
    }

    /**
     * Cluster configuration which determines the ARC cluster
     * components types. Eg: Choosing between BuildService kind,
     * FrontEnd Service ArtifactsStorageType etc.
     * 
     */
    @Import(name="arcConfiguration")
    private @Nullable Output<ArcConfigurationArgs> arcConfiguration;

    /**
     * @return Cluster configuration which determines the ARC cluster
     * components types. Eg: Choosing between BuildService kind,
     * FrontEnd Service ArtifactsStorageType etc.
     * 
     */
    public Optional<Output<ArcConfigurationArgs>> arcConfiguration() {
        return Optional.ofNullable(this.arcConfiguration);
    }

    /**
     * Extended Location.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    /**
     * @return Extended Location.
     * 
     */
    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * Only visible within Vnet/Subnet
     * 
     */
    @Import(name="internalLoadBalancerEnabled")
    private @Nullable Output<Boolean> internalLoadBalancerEnabled;

    /**
     * @return Only visible within Vnet/Subnet
     * 
     */
    public Optional<Output<Boolean>> internalLoadBalancerEnabled() {
        return Optional.ofNullable(this.internalLoadBalancerEnabled);
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
     * Name of the Kubernetes Environment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Kubernetes Environment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
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
     * Static IP of the KubeEnvironment
     * 
     */
    @Import(name="staticIp")
    private @Nullable Output<String> staticIp;

    /**
     * @return Static IP of the KubeEnvironment
     * 
     */
    public Optional<Output<String>> staticIp() {
        return Optional.ofNullable(this.staticIp);
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

    private KubeEnvironmentArgs() {}

    private KubeEnvironmentArgs(KubeEnvironmentArgs $) {
        this.aksResourceID = $.aksResourceID;
        this.appLogsConfiguration = $.appLogsConfiguration;
        this.arcConfiguration = $.arcConfiguration;
        this.extendedLocation = $.extendedLocation;
        this.internalLoadBalancerEnabled = $.internalLoadBalancerEnabled;
        this.kind = $.kind;
        this.location = $.location;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.staticIp = $.staticIp;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubeEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubeEnvironmentArgs $;

        public Builder() {
            $ = new KubeEnvironmentArgs();
        }

        public Builder(KubeEnvironmentArgs defaults) {
            $ = new KubeEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder aksResourceID(@Nullable Output<String> aksResourceID) {
            $.aksResourceID = aksResourceID;
            return this;
        }

        public Builder aksResourceID(String aksResourceID) {
            return aksResourceID(Output.of(aksResourceID));
        }

        /**
         * @param appLogsConfiguration Cluster configuration which enables the log daemon to export
         * app logs to a destination. Currently only &#34;log-analytics&#34; is
         * supported
         * 
         * @return builder
         * 
         */
        public Builder appLogsConfiguration(@Nullable Output<AppLogsConfigurationArgs> appLogsConfiguration) {
            $.appLogsConfiguration = appLogsConfiguration;
            return this;
        }

        /**
         * @param appLogsConfiguration Cluster configuration which enables the log daemon to export
         * app logs to a destination. Currently only &#34;log-analytics&#34; is
         * supported
         * 
         * @return builder
         * 
         */
        public Builder appLogsConfiguration(AppLogsConfigurationArgs appLogsConfiguration) {
            return appLogsConfiguration(Output.of(appLogsConfiguration));
        }

        /**
         * @param arcConfiguration Cluster configuration which determines the ARC cluster
         * components types. Eg: Choosing between BuildService kind,
         * FrontEnd Service ArtifactsStorageType etc.
         * 
         * @return builder
         * 
         */
        public Builder arcConfiguration(@Nullable Output<ArcConfigurationArgs> arcConfiguration) {
            $.arcConfiguration = arcConfiguration;
            return this;
        }

        /**
         * @param arcConfiguration Cluster configuration which determines the ARC cluster
         * components types. Eg: Choosing between BuildService kind,
         * FrontEnd Service ArtifactsStorageType etc.
         * 
         * @return builder
         * 
         */
        public Builder arcConfiguration(ArcConfigurationArgs arcConfiguration) {
            return arcConfiguration(Output.of(arcConfiguration));
        }

        /**
         * @param extendedLocation Extended Location.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        /**
         * @param extendedLocation Extended Location.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        /**
         * @param internalLoadBalancerEnabled Only visible within Vnet/Subnet
         * 
         * @return builder
         * 
         */
        public Builder internalLoadBalancerEnabled(@Nullable Output<Boolean> internalLoadBalancerEnabled) {
            $.internalLoadBalancerEnabled = internalLoadBalancerEnabled;
            return this;
        }

        /**
         * @param internalLoadBalancerEnabled Only visible within Vnet/Subnet
         * 
         * @return builder
         * 
         */
        public Builder internalLoadBalancerEnabled(Boolean internalLoadBalancerEnabled) {
            return internalLoadBalancerEnabled(Output.of(internalLoadBalancerEnabled));
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
         * @param name Name of the Kubernetes Environment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Kubernetes Environment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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
         * @param staticIp Static IP of the KubeEnvironment
         * 
         * @return builder
         * 
         */
        public Builder staticIp(@Nullable Output<String> staticIp) {
            $.staticIp = staticIp;
            return this;
        }

        /**
         * @param staticIp Static IP of the KubeEnvironment
         * 
         * @return builder
         * 
         */
        public Builder staticIp(String staticIp) {
            return staticIp(Output.of(staticIp));
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

        public KubeEnvironmentArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}