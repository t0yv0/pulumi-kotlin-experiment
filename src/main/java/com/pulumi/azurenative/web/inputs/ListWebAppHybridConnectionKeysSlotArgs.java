// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListWebAppHybridConnectionKeysSlotArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWebAppHybridConnectionKeysSlotArgs Empty = new ListWebAppHybridConnectionKeysSlotArgs();

    /**
     * The name of the web app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the web app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The namespace for this hybrid connection.
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The namespace for this hybrid connection.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * The relay name for this hybrid connection.
     * 
     */
    @Import(name="relayName", required=true)
    private Output<String> relayName;

    /**
     * @return The relay name for this hybrid connection.
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

    /**
     * The name of the slot for the web app.
     * 
     */
    @Import(name="slot", required=true)
    private Output<String> slot;

    /**
     * @return The name of the slot for the web app.
     * 
     */
    public Output<String> slot() {
        return this.slot;
    }

    private ListWebAppHybridConnectionKeysSlotArgs() {}

    private ListWebAppHybridConnectionKeysSlotArgs(ListWebAppHybridConnectionKeysSlotArgs $) {
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.relayName = $.relayName;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWebAppHybridConnectionKeysSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWebAppHybridConnectionKeysSlotArgs $;

        public Builder() {
            $ = new ListWebAppHybridConnectionKeysSlotArgs();
        }

        public Builder(ListWebAppHybridConnectionKeysSlotArgs defaults) {
            $ = new ListWebAppHybridConnectionKeysSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the web app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the web app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespaceName The namespace for this hybrid connection.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The namespace for this hybrid connection.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param relayName The relay name for this hybrid connection.
         * 
         * @return builder
         * 
         */
        public Builder relayName(Output<String> relayName) {
            $.relayName = relayName;
            return this;
        }

        /**
         * @param relayName The relay name for this hybrid connection.
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

        /**
         * @param slot The name of the slot for the web app.
         * 
         * @return builder
         * 
         */
        public Builder slot(Output<String> slot) {
            $.slot = slot;
            return this;
        }

        /**
         * @param slot The name of the slot for the web app.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            return slot(Output.of(slot));
        }

        public ListWebAppHybridConnectionKeysSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.relayName = Objects.requireNonNull($.relayName, "expected parameter 'relayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}
