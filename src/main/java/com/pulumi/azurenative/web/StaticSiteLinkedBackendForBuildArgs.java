// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticSiteLinkedBackendForBuildArgs extends com.pulumi.resources.ResourceArgs {

    public static final StaticSiteLinkedBackendForBuildArgs Empty = new StaticSiteLinkedBackendForBuildArgs();

    /**
     * The resource id of the backend linked to the static site
     * 
     */
    @Import(name="backendResourceId")
    private @Nullable Output<String> backendResourceId;

    /**
     * @return The resource id of the backend linked to the static site
     * 
     */
    public Optional<Output<String>> backendResourceId() {
        return Optional.ofNullable(this.backendResourceId);
    }

    /**
     * The stage site identifier
     * 
     */
    @Import(name="environmentName", required=true)
    private Output<String> environmentName;

    /**
     * @return The stage site identifier
     * 
     */
    public Output<String> environmentName() {
        return this.environmentName;
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
     * Name of the backend to link to the static site
     * 
     */
    @Import(name="linkedBackendName")
    private @Nullable Output<String> linkedBackendName;

    /**
     * @return Name of the backend to link to the static site
     * 
     */
    public Optional<Output<String>> linkedBackendName() {
        return Optional.ofNullable(this.linkedBackendName);
    }

    /**
     * Name of the static site
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the static site
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The region of the backend linked to the static site
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the backend linked to the static site
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
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

    private StaticSiteLinkedBackendForBuildArgs() {}

    private StaticSiteLinkedBackendForBuildArgs(StaticSiteLinkedBackendForBuildArgs $) {
        this.backendResourceId = $.backendResourceId;
        this.environmentName = $.environmentName;
        this.kind = $.kind;
        this.linkedBackendName = $.linkedBackendName;
        this.name = $.name;
        this.region = $.region;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticSiteLinkedBackendForBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticSiteLinkedBackendForBuildArgs $;

        public Builder() {
            $ = new StaticSiteLinkedBackendForBuildArgs();
        }

        public Builder(StaticSiteLinkedBackendForBuildArgs defaults) {
            $ = new StaticSiteLinkedBackendForBuildArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendResourceId The resource id of the backend linked to the static site
         * 
         * @return builder
         * 
         */
        public Builder backendResourceId(@Nullable Output<String> backendResourceId) {
            $.backendResourceId = backendResourceId;
            return this;
        }

        /**
         * @param backendResourceId The resource id of the backend linked to the static site
         * 
         * @return builder
         * 
         */
        public Builder backendResourceId(String backendResourceId) {
            return backendResourceId(Output.of(backendResourceId));
        }

        /**
         * @param environmentName The stage site identifier
         * 
         * @return builder
         * 
         */
        public Builder environmentName(Output<String> environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param environmentName The stage site identifier
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            return environmentName(Output.of(environmentName));
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
         * @param linkedBackendName Name of the backend to link to the static site
         * 
         * @return builder
         * 
         */
        public Builder linkedBackendName(@Nullable Output<String> linkedBackendName) {
            $.linkedBackendName = linkedBackendName;
            return this;
        }

        /**
         * @param linkedBackendName Name of the backend to link to the static site
         * 
         * @return builder
         * 
         */
        public Builder linkedBackendName(String linkedBackendName) {
            return linkedBackendName(Output.of(linkedBackendName));
        }

        /**
         * @param name Name of the static site
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the static site
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region The region of the backend linked to the static site
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the backend linked to the static site
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
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

        public StaticSiteLinkedBackendForBuildArgs build() {
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
