// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemplateSpecArgs Empty = new TemplateSpecArgs();

    /**
     * Template Spec description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Template Spec description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Template Spec display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Template Spec display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The location of the Template Spec. It cannot be changed after Template Spec creation. It must be one of the supported Azure locations.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the Template Spec. It cannot be changed after Template Spec creation. It must be one of the supported Azure locations.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The Template Spec metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    /**
     * @return The Template Spec metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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
     * Name of the Template Spec.
     * 
     */
    @Import(name="templateSpecName")
    private @Nullable Output<String> templateSpecName;

    /**
     * @return Name of the Template Spec.
     * 
     */
    public Optional<Output<String>> templateSpecName() {
        return Optional.ofNullable(this.templateSpecName);
    }

    private TemplateSpecArgs() {}

    private TemplateSpecArgs(TemplateSpecArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.location = $.location;
        this.metadata = $.metadata;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.templateSpecName = $.templateSpecName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateSpecArgs $;

        public Builder() {
            $ = new TemplateSpecArgs();
        }

        public Builder(TemplateSpecArgs defaults) {
            $ = new TemplateSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Template Spec description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Template Spec description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Template Spec display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Template Spec display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param location The location of the Template Spec. It cannot be changed after Template Spec creation. It must be one of the supported Azure locations.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the Template Spec. It cannot be changed after Template Spec creation. It must be one of the supported Azure locations.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metadata The Template Spec metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The Template Spec metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
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
         * @param templateSpecName Name of the Template Spec.
         * 
         * @return builder
         * 
         */
        public Builder templateSpecName(@Nullable Output<String> templateSpecName) {
            $.templateSpecName = templateSpecName;
            return this;
        }

        /**
         * @param templateSpecName Name of the Template Spec.
         * 
         * @return builder
         * 
         */
        public Builder templateSpecName(String templateSpecName) {
            return templateSpecName(Output.of(templateSpecName));
        }

        public TemplateSpecArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}