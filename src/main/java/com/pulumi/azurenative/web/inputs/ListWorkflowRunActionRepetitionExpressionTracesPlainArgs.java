// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListWorkflowRunActionRepetitionExpressionTracesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWorkflowRunActionRepetitionExpressionTracesPlainArgs Empty = new ListWorkflowRunActionRepetitionExpressionTracesPlainArgs();

    /**
     * The workflow action name.
     * 
     */
    @Import(name="actionName", required=true)
    private String actionName;

    /**
     * @return The workflow action name.
     * 
     */
    public String actionName() {
        return this.actionName;
    }

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
     * The workflow repetition.
     * 
     */
    @Import(name="repetitionName", required=true)
    private String repetitionName;

    /**
     * @return The workflow repetition.
     * 
     */
    public String repetitionName() {
        return this.repetitionName;
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
     * The workflow run name.
     * 
     */
    @Import(name="runName", required=true)
    private String runName;

    /**
     * @return The workflow run name.
     * 
     */
    public String runName() {
        return this.runName;
    }

    /**
     * The workflow name.
     * 
     */
    @Import(name="workflowName", required=true)
    private String workflowName;

    /**
     * @return The workflow name.
     * 
     */
    public String workflowName() {
        return this.workflowName;
    }

    private ListWorkflowRunActionRepetitionExpressionTracesPlainArgs() {}

    private ListWorkflowRunActionRepetitionExpressionTracesPlainArgs(ListWorkflowRunActionRepetitionExpressionTracesPlainArgs $) {
        this.actionName = $.actionName;
        this.name = $.name;
        this.repetitionName = $.repetitionName;
        this.resourceGroupName = $.resourceGroupName;
        this.runName = $.runName;
        this.workflowName = $.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWorkflowRunActionRepetitionExpressionTracesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWorkflowRunActionRepetitionExpressionTracesPlainArgs $;

        public Builder() {
            $ = new ListWorkflowRunActionRepetitionExpressionTracesPlainArgs();
        }

        public Builder(ListWorkflowRunActionRepetitionExpressionTracesPlainArgs defaults) {
            $ = new ListWorkflowRunActionRepetitionExpressionTracesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionName The workflow action name.
         * 
         * @return builder
         * 
         */
        public Builder actionName(String actionName) {
            $.actionName = actionName;
            return this;
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
         * @param repetitionName The workflow repetition.
         * 
         * @return builder
         * 
         */
        public Builder repetitionName(String repetitionName) {
            $.repetitionName = repetitionName;
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
         * @param runName The workflow run name.
         * 
         * @return builder
         * 
         */
        public Builder runName(String runName) {
            $.runName = runName;
            return this;
        }

        /**
         * @param workflowName The workflow name.
         * 
         * @return builder
         * 
         */
        public Builder workflowName(String workflowName) {
            $.workflowName = workflowName;
            return this;
        }

        public ListWorkflowRunActionRepetitionExpressionTracesPlainArgs build() {
            $.actionName = Objects.requireNonNull($.actionName, "expected parameter 'actionName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.repetitionName = Objects.requireNonNull($.repetitionName, "expected parameter 'repetitionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.runName = Objects.requireNonNull($.runName, "expected parameter 'runName' to be non-null");
            $.workflowName = Objects.requireNonNull($.workflowName, "expected parameter 'workflowName' to be non-null");
            return $;
        }
    }

}
