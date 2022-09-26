// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListWorkflowTriggerCallbackUrlPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWorkflowTriggerCallbackUrlPlainArgs Empty = new ListWorkflowTriggerCallbackUrlPlainArgs();

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
     * The workflow trigger name.
     * 
     */
    @Import(name="triggerName", required=true)
    private String triggerName;

    /**
     * @return The workflow trigger name.
     * 
     */
    public String triggerName() {
        return this.triggerName;
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

    private ListWorkflowTriggerCallbackUrlPlainArgs() {}

    private ListWorkflowTriggerCallbackUrlPlainArgs(ListWorkflowTriggerCallbackUrlPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.triggerName = $.triggerName;
        this.workflowName = $.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWorkflowTriggerCallbackUrlPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWorkflowTriggerCallbackUrlPlainArgs $;

        public Builder() {
            $ = new ListWorkflowTriggerCallbackUrlPlainArgs();
        }

        public Builder(ListWorkflowTriggerCallbackUrlPlainArgs defaults) {
            $ = new ListWorkflowTriggerCallbackUrlPlainArgs(Objects.requireNonNull(defaults));
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
         * @param triggerName The workflow trigger name.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(String triggerName) {
            $.triggerName = triggerName;
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

        public ListWorkflowTriggerCallbackUrlPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.triggerName = Objects.requireNonNull($.triggerName, "expected parameter 'triggerName' to be non-null");
            $.workflowName = Objects.requireNonNull($.workflowName, "expected parameter 'workflowName' to be non-null");
            return $;
        }
    }

}
