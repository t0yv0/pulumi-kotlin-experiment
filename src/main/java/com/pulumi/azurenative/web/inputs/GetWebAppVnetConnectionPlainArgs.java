// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppVnetConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppVnetConnectionPlainArgs Empty = new GetWebAppVnetConnectionPlainArgs();

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the app.
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
     * Name of the virtual network.
     * 
     */
    @Import(name="vnetName", required=true)
    private String vnetName;

    /**
     * @return Name of the virtual network.
     * 
     */
    public String vnetName() {
        return this.vnetName;
    }

    private GetWebAppVnetConnectionPlainArgs() {}

    private GetWebAppVnetConnectionPlainArgs(GetWebAppVnetConnectionPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.vnetName = $.vnetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppVnetConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppVnetConnectionPlainArgs $;

        public Builder() {
            $ = new GetWebAppVnetConnectionPlainArgs();
        }

        public Builder(GetWebAppVnetConnectionPlainArgs defaults) {
            $ = new GetWebAppVnetConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the app.
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
         * @param vnetName Name of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder vnetName(String vnetName) {
            $.vnetName = vnetName;
            return this;
        }

        public GetWebAppVnetConnectionPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vnetName = Objects.requireNonNull($.vnetName, "expected parameter 'vnetName' to be non-null");
            return $;
        }
    }

}