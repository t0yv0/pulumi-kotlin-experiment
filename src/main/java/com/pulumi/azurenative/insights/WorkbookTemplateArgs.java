// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.insights.inputs.WorkbookTemplateGalleryArgs;
import com.pulumi.azurenative.insights.inputs.WorkbookTemplateLocalizedGalleryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkbookTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkbookTemplateArgs Empty = new WorkbookTemplateArgs();

    /**
     * Information about the author of the workbook template.
     * 
     */
    @Import(name="author")
    private @Nullable Output<String> author;

    /**
     * @return Information about the author of the workbook template.
     * 
     */
    public Optional<Output<String>> author() {
        return Optional.ofNullable(this.author);
    }

    /**
     * Workbook galleries supported by the template.
     * 
     */
    @Import(name="galleries", required=true)
    private Output<List<WorkbookTemplateGalleryArgs>> galleries;

    /**
     * @return Workbook galleries supported by the template.
     * 
     */
    public Output<List<WorkbookTemplateGalleryArgs>> galleries() {
        return this.galleries;
    }

    /**
     * Key value pair of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     * 
     */
    @Import(name="localized")
    private @Nullable Output<Map<String,List<WorkbookTemplateLocalizedGalleryArgs>>> localized;

    /**
     * @return Key value pair of localized gallery. Each key is the locale code of languages supported by the Azure portal.
     * 
     */
    public Optional<Output<Map<String,List<WorkbookTemplateLocalizedGalleryArgs>>>> localized() {
        return Optional.ofNullable(this.localized);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
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
     * The name of the Application Insights component resource.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return The name of the Application Insights component resource.
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Valid JSON object containing workbook template payload.
     * 
     */
    @Import(name="templateData", required=true)
    private Output<Object> templateData;

    /**
     * @return Valid JSON object containing workbook template payload.
     * 
     */
    public Output<Object> templateData() {
        return this.templateData;
    }

    private WorkbookTemplateArgs() {}

    private WorkbookTemplateArgs(WorkbookTemplateArgs $) {
        this.author = $.author;
        this.galleries = $.galleries;
        this.localized = $.localized;
        this.location = $.location;
        this.priority = $.priority;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.tags = $.tags;
        this.templateData = $.templateData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkbookTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkbookTemplateArgs $;

        public Builder() {
            $ = new WorkbookTemplateArgs();
        }

        public Builder(WorkbookTemplateArgs defaults) {
            $ = new WorkbookTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param author Information about the author of the workbook template.
         * 
         * @return builder
         * 
         */
        public Builder author(@Nullable Output<String> author) {
            $.author = author;
            return this;
        }

        /**
         * @param author Information about the author of the workbook template.
         * 
         * @return builder
         * 
         */
        public Builder author(String author) {
            return author(Output.of(author));
        }

        /**
         * @param galleries Workbook galleries supported by the template.
         * 
         * @return builder
         * 
         */
        public Builder galleries(Output<List<WorkbookTemplateGalleryArgs>> galleries) {
            $.galleries = galleries;
            return this;
        }

        /**
         * @param galleries Workbook galleries supported by the template.
         * 
         * @return builder
         * 
         */
        public Builder galleries(List<WorkbookTemplateGalleryArgs> galleries) {
            return galleries(Output.of(galleries));
        }

        /**
         * @param galleries Workbook galleries supported by the template.
         * 
         * @return builder
         * 
         */
        public Builder galleries(WorkbookTemplateGalleryArgs... galleries) {
            return galleries(List.of(galleries));
        }

        /**
         * @param localized Key value pair of localized gallery. Each key is the locale code of languages supported by the Azure portal.
         * 
         * @return builder
         * 
         */
        public Builder localized(@Nullable Output<Map<String,List<WorkbookTemplateLocalizedGalleryArgs>>> localized) {
            $.localized = localized;
            return this;
        }

        /**
         * @param localized Key value pair of localized gallery. Each key is the locale code of languages supported by the Azure portal.
         * 
         * @return builder
         * 
         */
        public Builder localized(Map<String,List<WorkbookTemplateLocalizedGalleryArgs>> localized) {
            return localized(Output.of(localized));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param priority Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority of the template. Determines which template to open when a workbook gallery is opened in viewer mode.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
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
         * @param resourceName The name of the Application Insights component resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the Application Insights component resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param templateData Valid JSON object containing workbook template payload.
         * 
         * @return builder
         * 
         */
        public Builder templateData(Output<Object> templateData) {
            $.templateData = templateData;
            return this;
        }

        /**
         * @param templateData Valid JSON object containing workbook template payload.
         * 
         * @return builder
         * 
         */
        public Builder templateData(Object templateData) {
            return templateData(Output.of(templateData));
        }

        public WorkbookTemplateArgs build() {
            $.galleries = Objects.requireNonNull($.galleries, "expected parameter 'galleries' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.templateData = Objects.requireNonNull($.templateData, "expected parameter 'templateData' to be non-null");
            return $;
        }
    }

}