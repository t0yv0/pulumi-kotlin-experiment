// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListAppServicePlanHybridConnectionKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListAppServicePlanHybridConnectionKeysArgs Empty = new ListAppServicePlanHybridConnectionKeysArgs();

    /**
     * Name of the App Service plan.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the App Service plan.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Service Bus namespace.
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The name of the Service Bus namespace.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The name of the Service Bus relay.
     * 
     */
    @Import(name="relayName", required=true)
    private Output<String> relayName;

    /**
     * @return The name of the Service Bus relay.
     * 
     */
    public Output<String> relayName() {
        return this.relayName;
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

    private ListAppServicePlanHybridConnectionKeysArgs() {}

    private ListAppServicePlanHybridConnectionKeysArgs(ListAppServicePlanHybridConnectionKeysArgs $) {
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.relayName = $.relayName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListAppServicePlanHybridConnectionKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListAppServicePlanHybridConnectionKeysArgs $;

        public Builder() {
            $ = new ListAppServicePlanHybridConnectionKeysArgs();
        }

        public Builder(ListAppServicePlanHybridConnectionKeysArgs defaults) {
            $ = new ListAppServicePlanHybridConnectionKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the App Service plan.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the App Service plan.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName The name of the Service Bus namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The name of the Service Bus namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param relayName The name of the Service Bus relay.
         * 
         * @return builder
         * 
         */
        public Builder relayName(Output<String> relayName) {
            $.relayName = relayName;
            return this;
        }

        /**
         * @param relayName The name of the Service Bus relay.
         * 
         * @return builder
         * 
         */
        public Builder relayName(String relayName) {
            return relayName(Output.of(relayName));
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

        public ListAppServicePlanHybridConnectionKeysArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.relayName = Objects.requireNonNull($.relayName, "expected parameter 'relayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}