// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.ConnectionGatewayReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionGatewayDefinitionPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionGatewayDefinitionPropertiesArgs Empty = new ConnectionGatewayDefinitionPropertiesArgs();

    /**
     * The URI of the backend
     * 
     */
    @Import(name="backendUri")
    private @Nullable Output<String> backendUri;

    /**
     * @return The URI of the backend
     * 
     */
    public Optional<Output<String>> backendUri() {
        return Optional.ofNullable(this.backendUri);
    }

    /**
     * The gateway installation reference
     * 
     */
    @Import(name="connectionGatewayInstallation")
    private @Nullable Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation;

    /**
     * @return The gateway installation reference
     * 
     */
    public Optional<Output<ConnectionGatewayReferenceArgs>> connectionGatewayInstallation() {
        return Optional.ofNullable(this.connectionGatewayInstallation);
    }

    /**
     * The gateway admin
     * 
     */
    @Import(name="contactInformation")
    private @Nullable Output<List<String>> contactInformation;

    /**
     * @return The gateway admin
     * 
     */
    public Optional<Output<List<String>>> contactInformation() {
        return Optional.ofNullable(this.contactInformation);
    }

    /**
     * The gateway description
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The gateway description
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The gateway display name
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The gateway display name
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The machine name of the gateway
     * 
     */
    @Import(name="machineName")
    private @Nullable Output<String> machineName;

    /**
     * @return The machine name of the gateway
     * 
     */
    public Optional<Output<String>> machineName() {
        return Optional.ofNullable(this.machineName);
    }

    /**
     * The gateway status
     * 
     */
    @Import(name="status")
    private @Nullable Output<Object> status;

    /**
     * @return The gateway status
     * 
     */
    public Optional<Output<Object>> status() {
        return Optional.ofNullable(this.status);
    }

    private ConnectionGatewayDefinitionPropertiesArgs() {}

    private ConnectionGatewayDefinitionPropertiesArgs(ConnectionGatewayDefinitionPropertiesArgs $) {
        this.backendUri = $.backendUri;
        this.connectionGatewayInstallation = $.connectionGatewayInstallation;
        this.contactInformation = $.contactInformation;
        this.description = $.description;
        this.displayName = $.displayName;
        this.machineName = $.machineName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionGatewayDefinitionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionGatewayDefinitionPropertiesArgs $;

        public Builder() {
            $ = new ConnectionGatewayDefinitionPropertiesArgs();
        }

        public Builder(ConnectionGatewayDefinitionPropertiesArgs defaults) {
            $ = new ConnectionGatewayDefinitionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendUri The URI of the backend
         * 
         * @return builder
         * 
         */
        public Builder backendUri(@Nullable Output<String> backendUri) {
            $.backendUri = backendUri;
            return this;
        }

        /**
         * @param backendUri The URI of the backend
         * 
         * @return builder
         * 
         */
        public Builder backendUri(String backendUri) {
            return backendUri(Output.of(backendUri));
        }

        /**
         * @param connectionGatewayInstallation The gateway installation reference
         * 
         * @return builder
         * 
         */
        public Builder connectionGatewayInstallation(@Nullable Output<ConnectionGatewayReferenceArgs> connectionGatewayInstallation) {
            $.connectionGatewayInstallation = connectionGatewayInstallation;
            return this;
        }

        /**
         * @param connectionGatewayInstallation The gateway installation reference
         * 
         * @return builder
         * 
         */
        public Builder connectionGatewayInstallation(ConnectionGatewayReferenceArgs connectionGatewayInstallation) {
            return connectionGatewayInstallation(Output.of(connectionGatewayInstallation));
        }

        /**
         * @param contactInformation The gateway admin
         * 
         * @return builder
         * 
         */
        public Builder contactInformation(@Nullable Output<List<String>> contactInformation) {
            $.contactInformation = contactInformation;
            return this;
        }

        /**
         * @param contactInformation The gateway admin
         * 
         * @return builder
         * 
         */
        public Builder contactInformation(List<String> contactInformation) {
            return contactInformation(Output.of(contactInformation));
        }

        /**
         * @param contactInformation The gateway admin
         * 
         * @return builder
         * 
         */
        public Builder contactInformation(String... contactInformation) {
            return contactInformation(List.of(contactInformation));
        }

        /**
         * @param description The gateway description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The gateway description
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The gateway display name
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The gateway display name
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param machineName The machine name of the gateway
         * 
         * @return builder
         * 
         */
        public Builder machineName(@Nullable Output<String> machineName) {
            $.machineName = machineName;
            return this;
        }

        /**
         * @param machineName The machine name of the gateway
         * 
         * @return builder
         * 
         */
        public Builder machineName(String machineName) {
            return machineName(Output.of(machineName));
        }

        /**
         * @param status The gateway status
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Object> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The gateway status
         * 
         * @return builder
         * 
         */
        public Builder status(Object status) {
            return status(Output.of(status));
        }

        public ConnectionGatewayDefinitionPropertiesArgs build() {
            return $;
        }
    }

}
