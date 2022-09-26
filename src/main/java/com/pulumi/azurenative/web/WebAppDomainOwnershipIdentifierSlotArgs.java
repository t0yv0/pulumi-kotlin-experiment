// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppDomainOwnershipIdentifierSlotArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppDomainOwnershipIdentifierSlotArgs Empty = new WebAppDomainOwnershipIdentifierSlotArgs();

    /**
     * Name of domain ownership identifier.
     * 
     */
    @Import(name="domainOwnershipIdentifierName")
    private @Nullable Output<String> domainOwnershipIdentifierName;

    /**
     * @return Name of domain ownership identifier.
     * 
     */
    public Optional<Output<String>> domainOwnershipIdentifierName() {
        return Optional.ofNullable(this.domainOwnershipIdentifierName);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
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

    /**
     * Name of the deployment slot. If a slot is not specified, the API will delete the binding for the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private Output<String> slot;

    /**
     * @return Name of the deployment slot. If a slot is not specified, the API will delete the binding for the production slot.
     * 
     */
    public Output<String> slot() {
        return this.slot;
    }

    /**
     * String representation of the identity.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return String representation of the identity.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private WebAppDomainOwnershipIdentifierSlotArgs() {}

    private WebAppDomainOwnershipIdentifierSlotArgs(WebAppDomainOwnershipIdentifierSlotArgs $) {
        this.domainOwnershipIdentifierName = $.domainOwnershipIdentifierName;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppDomainOwnershipIdentifierSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppDomainOwnershipIdentifierSlotArgs $;

        public Builder() {
            $ = new WebAppDomainOwnershipIdentifierSlotArgs();
        }

        public Builder(WebAppDomainOwnershipIdentifierSlotArgs defaults) {
            $ = new WebAppDomainOwnershipIdentifierSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainOwnershipIdentifierName Name of domain ownership identifier.
         * 
         * @return builder
         * 
         */
        public Builder domainOwnershipIdentifierName(@Nullable Output<String> domainOwnershipIdentifierName) {
            $.domainOwnershipIdentifierName = domainOwnershipIdentifierName;
            return this;
        }

        /**
         * @param domainOwnershipIdentifierName Name of domain ownership identifier.
         * 
         * @return builder
         * 
         */
        public Builder domainOwnershipIdentifierName(String domainOwnershipIdentifierName) {
            return domainOwnershipIdentifierName(Output.of(domainOwnershipIdentifierName));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
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

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will delete the binding for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(Output<String> slot) {
            $.slot = slot;
            return this;
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will delete the binding for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            return slot(Output.of(slot));
        }

        /**
         * @param value String representation of the identity.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value String representation of the identity.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public WebAppDomainOwnershipIdentifierSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}