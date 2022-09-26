// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentAtTenantScopeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentAtTenantScopeArgs Empty = new GetDeploymentAtTenantScopeArgs();

    /**
     * The name of the deployment.
     * 
     */
    @Import(name="deploymentName", required=true)
    private Output<String> deploymentName;

    /**
     * @return The name of the deployment.
     * 
     */
    public Output<String> deploymentName() {
        return this.deploymentName;
    }

    private GetDeploymentAtTenantScopeArgs() {}

    private GetDeploymentAtTenantScopeArgs(GetDeploymentAtTenantScopeArgs $) {
        this.deploymentName = $.deploymentName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentAtTenantScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentAtTenantScopeArgs $;

        public Builder() {
            $ = new GetDeploymentAtTenantScopeArgs();
        }

        public Builder(GetDeploymentAtTenantScopeArgs defaults) {
            $ = new GetDeploymentAtTenantScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentName The name of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(Output<String> deploymentName) {
            $.deploymentName = deploymentName;
            return this;
        }

        /**
         * @param deploymentName The name of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentName(String deploymentName) {
            return deploymentName(Output.of(deploymentName));
        }

        public GetDeploymentAtTenantScopeArgs build() {
            $.deploymentName = Objects.requireNonNull($.deploymentName, "expected parameter 'deploymentName' to be non-null");
            return $;
        }
    }

}