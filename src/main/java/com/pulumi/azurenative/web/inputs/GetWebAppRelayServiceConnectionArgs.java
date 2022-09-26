// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppRelayServiceConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppRelayServiceConnectionArgs Empty = new GetWebAppRelayServiceConnectionArgs();

    /**
     * Name of the hybrid connection.
     * 
     */
    @Import(name="entityName", required=true)
    private Output<String> entityName;

    /**
     * @return Name of the hybrid connection.
     * 
     */
    public Output<String> entityName() {
        return this.entityName;
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

    private GetWebAppRelayServiceConnectionArgs() {}

    private GetWebAppRelayServiceConnectionArgs(GetWebAppRelayServiceConnectionArgs $) {
        this.entityName = $.entityName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppRelayServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppRelayServiceConnectionArgs $;

        public Builder() {
            $ = new GetWebAppRelayServiceConnectionArgs();
        }

        public Builder(GetWebAppRelayServiceConnectionArgs defaults) {
            $ = new GetWebAppRelayServiceConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityName Name of the hybrid connection.
         * 
         * @return builder
         * 
         */
        public Builder entityName(Output<String> entityName) {
            $.entityName = entityName;
            return this;
        }

        /**
         * @param entityName Name of the hybrid connection.
         * 
         * @return builder
         * 
         */
        public Builder entityName(String entityName) {
            return entityName(Output.of(entityName));
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

        public GetWebAppRelayServiceConnectionArgs build() {
            $.entityName = Objects.requireNonNull($.entityName, "expected parameter 'entityName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}