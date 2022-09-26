// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.enums.PublicCertificateLocation;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppPublicCertificateSlotArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppPublicCertificateSlotArgs Empty = new WebAppPublicCertificateSlotArgs();

    /**
     * Public Certificate byte array
     * 
     */
    @Import(name="blob")
    private @Nullable Output<String> blob;

    /**
     * @return Public Certificate byte array
     * 
     */
    public Optional<Output<String>> blob() {
        return Optional.ofNullable(this.blob);
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
     * Public Certificate Location
     * 
     */
    @Import(name="publicCertificateLocation")
    private @Nullable Output<PublicCertificateLocation> publicCertificateLocation;

    /**
     * @return Public Certificate Location
     * 
     */
    public Optional<Output<PublicCertificateLocation>> publicCertificateLocation() {
        return Optional.ofNullable(this.publicCertificateLocation);
    }

    /**
     * Public certificate name.
     * 
     */
    @Import(name="publicCertificateName")
    private @Nullable Output<String> publicCertificateName;

    /**
     * @return Public certificate name.
     * 
     */
    public Optional<Output<String>> publicCertificateName() {
        return Optional.ofNullable(this.publicCertificateName);
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
     * Name of the deployment slot. If a slot is not specified, the API will create a binding for the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private Output<String> slot;

    /**
     * @return Name of the deployment slot. If a slot is not specified, the API will create a binding for the production slot.
     * 
     */
    public Output<String> slot() {
        return this.slot;
    }

    private WebAppPublicCertificateSlotArgs() {}

    private WebAppPublicCertificateSlotArgs(WebAppPublicCertificateSlotArgs $) {
        this.blob = $.blob;
        this.kind = $.kind;
        this.name = $.name;
        this.publicCertificateLocation = $.publicCertificateLocation;
        this.publicCertificateName = $.publicCertificateName;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppPublicCertificateSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppPublicCertificateSlotArgs $;

        public Builder() {
            $ = new WebAppPublicCertificateSlotArgs();
        }

        public Builder(WebAppPublicCertificateSlotArgs defaults) {
            $ = new WebAppPublicCertificateSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blob Public Certificate byte array
         * 
         * @return builder
         * 
         */
        public Builder blob(@Nullable Output<String> blob) {
            $.blob = blob;
            return this;
        }

        /**
         * @param blob Public Certificate byte array
         * 
         * @return builder
         * 
         */
        public Builder blob(String blob) {
            return blob(Output.of(blob));
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
         * @param publicCertificateLocation Public Certificate Location
         * 
         * @return builder
         * 
         */
        public Builder publicCertificateLocation(@Nullable Output<PublicCertificateLocation> publicCertificateLocation) {
            $.publicCertificateLocation = publicCertificateLocation;
            return this;
        }

        /**
         * @param publicCertificateLocation Public Certificate Location
         * 
         * @return builder
         * 
         */
        public Builder publicCertificateLocation(PublicCertificateLocation publicCertificateLocation) {
            return publicCertificateLocation(Output.of(publicCertificateLocation));
        }

        /**
         * @param publicCertificateName Public certificate name.
         * 
         * @return builder
         * 
         */
        public Builder publicCertificateName(@Nullable Output<String> publicCertificateName) {
            $.publicCertificateName = publicCertificateName;
            return this;
        }

        /**
         * @param publicCertificateName Public certificate name.
         * 
         * @return builder
         * 
         */
        public Builder publicCertificateName(String publicCertificateName) {
            return publicCertificateName(Output.of(publicCertificateName));
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
         * @param slot Name of the deployment slot. If a slot is not specified, the API will create a binding for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(Output<String> slot) {
            $.slot = slot;
            return this;
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will create a binding for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            return slot(Output.of(slot));
        }

        public WebAppPublicCertificateSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}