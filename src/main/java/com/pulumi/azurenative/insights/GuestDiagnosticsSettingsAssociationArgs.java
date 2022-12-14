// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestDiagnosticsSettingsAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestDiagnosticsSettingsAssociationArgs Empty = new GuestDiagnosticsSettingsAssociationArgs();

    /**
     * The name of the diagnostic settings association.
     * 
     */
    @Import(name="associationName")
    private @Nullable Output<String> associationName;

    /**
     * @return The name of the diagnostic settings association.
     * 
     */
    public Optional<Output<String>> associationName() {
        return Optional.ofNullable(this.associationName);
    }

    /**
     * The guest diagnostic settings name.
     * 
     */
    @Import(name="guestDiagnosticSettingsName", required=true)
    private Output<String> guestDiagnosticSettingsName;

    /**
     * @return The guest diagnostic settings name.
     * 
     */
    public Output<String> guestDiagnosticSettingsName() {
        return this.guestDiagnosticSettingsName;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The fully qualified ID of the resource, including the resource name and resource type.
     * 
     */
    @Import(name="resourceUri", required=true)
    private Output<String> resourceUri;

    /**
     * @return The fully qualified ID of the resource, including the resource name and resource type.
     * 
     */
    public Output<String> resourceUri() {
        return this.resourceUri;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GuestDiagnosticsSettingsAssociationArgs() {}

    private GuestDiagnosticsSettingsAssociationArgs(GuestDiagnosticsSettingsAssociationArgs $) {
        this.associationName = $.associationName;
        this.guestDiagnosticSettingsName = $.guestDiagnosticSettingsName;
        this.location = $.location;
        this.resourceUri = $.resourceUri;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestDiagnosticsSettingsAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestDiagnosticsSettingsAssociationArgs $;

        public Builder() {
            $ = new GuestDiagnosticsSettingsAssociationArgs();
        }

        public Builder(GuestDiagnosticsSettingsAssociationArgs defaults) {
            $ = new GuestDiagnosticsSettingsAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associationName The name of the diagnostic settings association.
         * 
         * @return builder
         * 
         */
        public Builder associationName(@Nullable Output<String> associationName) {
            $.associationName = associationName;
            return this;
        }

        /**
         * @param associationName The name of the diagnostic settings association.
         * 
         * @return builder
         * 
         */
        public Builder associationName(String associationName) {
            return associationName(Output.of(associationName));
        }

        /**
         * @param guestDiagnosticSettingsName The guest diagnostic settings name.
         * 
         * @return builder
         * 
         */
        public Builder guestDiagnosticSettingsName(Output<String> guestDiagnosticSettingsName) {
            $.guestDiagnosticSettingsName = guestDiagnosticSettingsName;
            return this;
        }

        /**
         * @param guestDiagnosticSettingsName The guest diagnostic settings name.
         * 
         * @return builder
         * 
         */
        public Builder guestDiagnosticSettingsName(String guestDiagnosticSettingsName) {
            return guestDiagnosticSettingsName(Output.of(guestDiagnosticSettingsName));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(Output<String> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        /**
         * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GuestDiagnosticsSettingsAssociationArgs build() {
            $.guestDiagnosticSettingsName = Objects.requireNonNull($.guestDiagnosticSettingsName, "expected parameter 'guestDiagnosticSettingsName' to be non-null");
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}
