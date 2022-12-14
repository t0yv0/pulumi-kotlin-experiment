// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.inputs.JobStepActionArgs;
import com.pulumi.azurenative.sql.inputs.JobStepExecutionOptionsArgs;
import com.pulumi.azurenative.sql.inputs.JobStepOutputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobStepArgs Empty = new JobStepArgs();

    /**
     * The action payload of the job step.
     * 
     */
    @Import(name="action", required=true)
    private Output<JobStepActionArgs> action;

    /**
     * @return The action payload of the job step.
     * 
     */
    public Output<JobStepActionArgs> action() {
        return this.action;
    }

    /**
     * The resource ID of the job credential that will be used to connect to the targets.
     * 
     */
    @Import(name="credential", required=true)
    private Output<String> credential;

    /**
     * @return The resource ID of the job credential that will be used to connect to the targets.
     * 
     */
    public Output<String> credential() {
        return this.credential;
    }

    /**
     * Execution options for the job step.
     * 
     */
    @Import(name="executionOptions")
    private @Nullable Output<JobStepExecutionOptionsArgs> executionOptions;

    /**
     * @return Execution options for the job step.
     * 
     */
    public Optional<Output<JobStepExecutionOptionsArgs>> executionOptions() {
        return Optional.ofNullable(this.executionOptions);
    }

    /**
     * The name of the job agent.
     * 
     */
    @Import(name="jobAgentName", required=true)
    private Output<String> jobAgentName;

    /**
     * @return The name of the job agent.
     * 
     */
    public Output<String> jobAgentName() {
        return this.jobAgentName;
    }

    /**
     * The name of the job.
     * 
     */
    @Import(name="jobName", required=true)
    private Output<String> jobName;

    /**
     * @return The name of the job.
     * 
     */
    public Output<String> jobName() {
        return this.jobName;
    }

    /**
     * Output destination properties of the job step.
     * 
     */
    @Import(name="output")
    private @Nullable Output<JobStepOutputArgs> output;

    /**
     * @return Output destination properties of the job step.
     * 
     */
    public Optional<Output<JobStepOutputArgs>> output() {
        return Optional.ofNullable(this.output);
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The job step&#39;s index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
     */
    @Import(name="stepId")
    private @Nullable Output<Integer> stepId;

    /**
     * @return The job step&#39;s index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
     */
    public Optional<Output<Integer>> stepId() {
        return Optional.ofNullable(this.stepId);
    }

    /**
     * The name of the job step.
     * 
     */
    @Import(name="stepName")
    private @Nullable Output<String> stepName;

    /**
     * @return The name of the job step.
     * 
     */
    public Optional<Output<String>> stepName() {
        return Optional.ofNullable(this.stepName);
    }

    /**
     * The resource ID of the target group that the job step will be executed on.
     * 
     */
    @Import(name="targetGroup", required=true)
    private Output<String> targetGroup;

    /**
     * @return The resource ID of the target group that the job step will be executed on.
     * 
     */
    public Output<String> targetGroup() {
        return this.targetGroup;
    }

    private JobStepArgs() {}

    private JobStepArgs(JobStepArgs $) {
        this.action = $.action;
        this.credential = $.credential;
        this.executionOptions = $.executionOptions;
        this.jobAgentName = $.jobAgentName;
        this.jobName = $.jobName;
        this.output = $.output;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.stepId = $.stepId;
        this.stepName = $.stepName;
        this.targetGroup = $.targetGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobStepArgs $;

        public Builder() {
            $ = new JobStepArgs();
        }

        public Builder(JobStepArgs defaults) {
            $ = new JobStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action payload of the job step.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<JobStepActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action payload of the job step.
         * 
         * @return builder
         * 
         */
        public Builder action(JobStepActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param credential The resource ID of the job credential that will be used to connect to the targets.
         * 
         * @return builder
         * 
         */
        public Builder credential(Output<String> credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param credential The resource ID of the job credential that will be used to connect to the targets.
         * 
         * @return builder
         * 
         */
        public Builder credential(String credential) {
            return credential(Output.of(credential));
        }

        /**
         * @param executionOptions Execution options for the job step.
         * 
         * @return builder
         * 
         */
        public Builder executionOptions(@Nullable Output<JobStepExecutionOptionsArgs> executionOptions) {
            $.executionOptions = executionOptions;
            return this;
        }

        /**
         * @param executionOptions Execution options for the job step.
         * 
         * @return builder
         * 
         */
        public Builder executionOptions(JobStepExecutionOptionsArgs executionOptions) {
            return executionOptions(Output.of(executionOptions));
        }

        /**
         * @param jobAgentName The name of the job agent.
         * 
         * @return builder
         * 
         */
        public Builder jobAgentName(Output<String> jobAgentName) {
            $.jobAgentName = jobAgentName;
            return this;
        }

        /**
         * @param jobAgentName The name of the job agent.
         * 
         * @return builder
         * 
         */
        public Builder jobAgentName(String jobAgentName) {
            return jobAgentName(Output.of(jobAgentName));
        }

        /**
         * @param jobName The name of the job.
         * 
         * @return builder
         * 
         */
        public Builder jobName(Output<String> jobName) {
            $.jobName = jobName;
            return this;
        }

        /**
         * @param jobName The name of the job.
         * 
         * @return builder
         * 
         */
        public Builder jobName(String jobName) {
            return jobName(Output.of(jobName));
        }

        /**
         * @param output Output destination properties of the job step.
         * 
         * @return builder
         * 
         */
        public Builder output(@Nullable Output<JobStepOutputArgs> output) {
            $.output = output;
            return this;
        }

        /**
         * @param output Output destination properties of the job step.
         * 
         * @return builder
         * 
         */
        public Builder output(JobStepOutputArgs output) {
            return output(Output.of(output));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param stepId The job step&#39;s index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
         * 
         * @return builder
         * 
         */
        public Builder stepId(@Nullable Output<Integer> stepId) {
            $.stepId = stepId;
            return this;
        }

        /**
         * @param stepId The job step&#39;s index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
         * 
         * @return builder
         * 
         */
        public Builder stepId(Integer stepId) {
            return stepId(Output.of(stepId));
        }

        /**
         * @param stepName The name of the job step.
         * 
         * @return builder
         * 
         */
        public Builder stepName(@Nullable Output<String> stepName) {
            $.stepName = stepName;
            return this;
        }

        /**
         * @param stepName The name of the job step.
         * 
         * @return builder
         * 
         */
        public Builder stepName(String stepName) {
            return stepName(Output.of(stepName));
        }

        /**
         * @param targetGroup The resource ID of the target group that the job step will be executed on.
         * 
         * @return builder
         * 
         */
        public Builder targetGroup(Output<String> targetGroup) {
            $.targetGroup = targetGroup;
            return this;
        }

        /**
         * @param targetGroup The resource ID of the target group that the job step will be executed on.
         * 
         * @return builder
         * 
         */
        public Builder targetGroup(String targetGroup) {
            return targetGroup(Output.of(targetGroup));
        }

        public JobStepArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.credential = Objects.requireNonNull($.credential, "expected parameter 'credential' to be non-null");
            $.jobAgentName = Objects.requireNonNull($.jobAgentName, "expected parameter 'jobAgentName' to be non-null");
            $.jobName = Objects.requireNonNull($.jobName, "expected parameter 'jobName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.targetGroup = Objects.requireNonNull($.targetGroup, "expected parameter 'targetGroup' to be non-null");
            return $;
        }
    }

}
