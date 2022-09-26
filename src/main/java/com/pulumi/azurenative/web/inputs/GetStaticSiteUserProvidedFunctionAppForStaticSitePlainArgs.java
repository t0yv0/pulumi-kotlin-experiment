// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs Empty = new GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs();

    /**
     * Name of the function app registered with the static site.
     * 
     */
    @Import(name="functionAppName", required=true)
    private String functionAppName;

    /**
     * @return Name of the function app registered with the static site.
     * 
     */
    public String functionAppName() {
        return this.functionAppName;
    }

    /**
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the static site.
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

    private GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs() {}

    private GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs(GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs $) {
        this.functionAppName = $.functionAppName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs $;

        public Builder() {
            $ = new GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs();
        }

        public Builder(GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs defaults) {
            $ = new GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param functionAppName Name of the function app registered with the static site.
         * 
         * @return builder
         * 
         */
        public Builder functionAppName(String functionAppName) {
            $.functionAppName = functionAppName;
            return this;
        }

        /**
         * @param name Name of the static site.
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

        public GetStaticSiteUserProvidedFunctionAppForStaticSitePlainArgs build() {
            $.functionAppName = Objects.requireNonNull($.functionAppName, "expected parameter 'functionAppName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}