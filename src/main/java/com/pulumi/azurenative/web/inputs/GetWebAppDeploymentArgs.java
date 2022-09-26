// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppDeploymentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppDeploymentArgs Empty = new GetWebAppDeploymentArgs();

    /**
     * Deployment ID.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Deployment ID.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the app.
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

    private GetWebAppDeploymentArgs() {}

    private GetWebAppDeploymentArgs(GetWebAppDeploymentArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppDeploymentArgs $;

        public Builder() {
            $ = new GetWebAppDeploymentArgs();
        }

        public Builder(GetWebAppDeploymentArgs defaults) {
            $ = new GetWebAppDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Deployment ID.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Deployment ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the app.
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

        public GetWebAppDeploymentArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}