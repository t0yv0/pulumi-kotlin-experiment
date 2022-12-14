// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentAtManagementGroupScopeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentAtManagementGroupScopeArgs Empty = new GetDeploymentAtManagementGroupScopeArgs();

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

    /**
     * The management group ID.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The management group ID.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    private GetDeploymentAtManagementGroupScopeArgs() {}

    private GetDeploymentAtManagementGroupScopeArgs(GetDeploymentAtManagementGroupScopeArgs $) {
        this.deploymentName = $.deploymentName;
        this.groupId = $.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentAtManagementGroupScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentAtManagementGroupScopeArgs $;

        public Builder() {
            $ = new GetDeploymentAtManagementGroupScopeArgs();
        }

        public Builder(GetDeploymentAtManagementGroupScopeArgs defaults) {
            $ = new GetDeploymentAtManagementGroupScopeArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param groupId The management group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The management group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public GetDeploymentAtManagementGroupScopeArgs build() {
            $.deploymentName = Objects.requireNonNull($.deploymentName, "expected parameter 'deploymentName' to be non-null");
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            return $;
        }
    }

}
