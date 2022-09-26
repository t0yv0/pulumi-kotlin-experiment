// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExportConfigurationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExportConfigurationPlainArgs Empty = new GetExportConfigurationPlainArgs();

    /**
     * The Continuous Export configuration ID. This is unique within a Application Insights component.
     * 
     */
    @Import(name="exportId", required=true)
    private String exportId;

    /**
     * @return The Continuous Export configuration ID. This is unique within a Application Insights component.
     * 
     */
    public String exportId() {
        return this.exportId;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the Application Insights component resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetExportConfigurationPlainArgs() {}

    private GetExportConfigurationPlainArgs(GetExportConfigurationPlainArgs $) {
        this.exportId = $.exportId;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExportConfigurationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExportConfigurationPlainArgs $;

        public Builder() {
            $ = new GetExportConfigurationPlainArgs();
        }

        public Builder(GetExportConfigurationPlainArgs defaults) {
            $ = new GetExportConfigurationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
         * 
         * @return builder
         * 
         */
        public Builder exportId(String exportId) {
            $.exportId = exportId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the Application Insights component resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetExportConfigurationPlainArgs build() {
            $.exportId = Objects.requireNonNull($.exportId, "expected parameter 'exportId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}