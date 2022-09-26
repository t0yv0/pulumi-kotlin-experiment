// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppSiteExtensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppSiteExtensionArgs Empty = new WebAppSiteExtensionArgs();

    /**
     * Site name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Site name.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * Site extension name.
     * 
     */
    @Import(name="siteExtensionId")
    private @Nullable Output<String> siteExtensionId;

    /**
     * @return Site extension name.
     * 
     */
    public Optional<Output<String>> siteExtensionId() {
        return Optional.ofNullable(this.siteExtensionId);
    }

    private WebAppSiteExtensionArgs() {}

    private WebAppSiteExtensionArgs(WebAppSiteExtensionArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.siteExtensionId = $.siteExtensionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppSiteExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppSiteExtensionArgs $;

        public Builder() {
            $ = new WebAppSiteExtensionArgs();
        }

        public Builder(WebAppSiteExtensionArgs defaults) {
            $ = new WebAppSiteExtensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Site name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Site name.
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
         * @param siteExtensionId Site extension name.
         * 
         * @return builder
         * 
         */
        public Builder siteExtensionId(@Nullable Output<String> siteExtensionId) {
            $.siteExtensionId = siteExtensionId;
            return this;
        }

        /**
         * @param siteExtensionId Site extension name.
         * 
         * @return builder
         * 
         */
        public Builder siteExtensionId(String siteExtensionId) {
            return siteExtensionId(Output.of(siteExtensionId));
        }

        public WebAppSiteExtensionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}