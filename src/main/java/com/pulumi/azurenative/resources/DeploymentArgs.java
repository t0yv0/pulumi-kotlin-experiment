// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.resources.inputs.DeploymentPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * The name of the deployment.
     * 
     */
    @Import(name="deploymentName")
    private @Nullable Output<String> deploymentName;

    /**
     * @return The name of the deployment.
     * 
     */
    public Optional<Output<String>> deploymentName() {
        return Optional.ofNullable(this.deploymentName);
    }

    /**
     * The location to store the deployment data.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location to store the deployment data.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The deployment properties.
     * 
     */
    @Import(name="properties", required=true)
    private Output<DeploymentPropertiesArgs> properties;

    /**
     * @return The deployment properties.
     * 
     */
    public Output<DeploymentPropertiesArgs> properties() {
        return this.properties;
    }

    /**
     * The name of the resource group to deploy the resources to. The name is case insensitive. The resource group must already exist.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group to deploy the resources to. The name is case insensitive. The resource group must already exist.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Deployment tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Deployment tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DeploymentArgs() {}

    private DeploymentArgs(DeploymentArgs $) {
        this.deploymentName = $.deploymentName;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentArgs $;

        public Builder() {
            $ = new DeploymentArgs();
        }

        public Builder(DeploymentArgs defaults) {
            $ = new DeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentName The name of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(@Nullable Output<String> deploymentName) {
            $.deploymentName = deploymentName;
            return this;
        }

        /**
         * @param deploymentName The name of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(String deploymentName) {
            return deploymentName(Output.of(deploymentName));
        }

        /**
         * @param location The location to store the deployment data.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location to store the deployment data.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param properties The deployment properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<DeploymentPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The deployment properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(DeploymentPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group to deploy the resources to. The name is case insensitive. The resource group must already exist.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to deploy the resources to. The name is case insensitive. The resource group must already exist.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Deployment tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Deployment tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DeploymentArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
