// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppSiteExtensionSlotPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppSiteExtensionSlotPlainArgs Empty = new GetWebAppSiteExtensionSlotPlainArgs();

    /**
     * Site name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Site name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Site extension name.
     * 
     */
    @Import(name="siteExtensionId", required=true)
    private String siteExtensionId;

    /**
     * @return Site extension name.
     * 
     */
    public String siteExtensionId() {
        return this.siteExtensionId;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API uses the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private String slot;

    /**
     * @return Name of the deployment slot. If a slot is not specified, the API uses the production slot.
     * 
     */
    public String slot() {
        return this.slot;
    }

    private GetWebAppSiteExtensionSlotPlainArgs() {}

    private GetWebAppSiteExtensionSlotPlainArgs(GetWebAppSiteExtensionSlotPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.siteExtensionId = $.siteExtensionId;
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppSiteExtensionSlotPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppSiteExtensionSlotPlainArgs $;

        public Builder() {
            $ = new GetWebAppSiteExtensionSlotPlainArgs();
        }

        public Builder(GetWebAppSiteExtensionSlotPlainArgs defaults) {
            $ = new GetWebAppSiteExtensionSlotPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Site name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param siteExtensionId Site extension name.
         * 
         * @return builder
         * 
         */
        public Builder siteExtensionId(String siteExtensionId) {
            $.siteExtensionId = siteExtensionId;
            return this;
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API uses the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            $.slot = slot;
            return this;
        }

        public GetWebAppSiteExtensionSlotPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.siteExtensionId = Objects.requireNonNull($.siteExtensionId, "expected parameter 'siteExtensionId' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}