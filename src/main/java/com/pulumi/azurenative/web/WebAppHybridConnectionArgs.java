// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppHybridConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppHybridConnectionArgs Empty = new WebAppHybridConnectionArgs();

    /**
     * The hostname of the endpoint.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The hostname of the endpoint.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
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
     * The port of the endpoint.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port of the endpoint.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The ARM URI to the Service Bus relay.
     * 
     */
    @Import(name="relayArmUri")
    private @Nullable Output<String> relayArmUri;

    /**
     * @return The ARM URI to the Service Bus relay.
     * 
     */
    public Optional<Output<String>> relayArmUri() {
        return Optional.ofNullable(this.relayArmUri);
    }

    /**
     * The name of the Service Bus relay.
     * 
     */
    @Import(name="relayName")
    private @Nullable Output<String> relayName;

    /**
     * @return The name of the Service Bus relay.
     * 
     */
    public Optional<Output<String>> relayName() {
        return Optional.ofNullable(this.relayName);
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
     * The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     * 
     */
    @Import(name="sendKeyName")
    private @Nullable Output<String> sendKeyName;

    /**
     * @return The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     * 
     */
    public Optional<Output<String>> sendKeyName() {
        return Optional.ofNullable(this.sendKeyName);
    }

    /**
     * The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     */
    @Import(name="sendKeyValue")
    private @Nullable Output<String> sendKeyValue;

    /**
     * @return The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     */
    public Optional<Output<String>> sendKeyValue() {
        return Optional.ofNullable(this.sendKeyValue);
    }

    /**
     * The name of the Service Bus namespace.
     * 
     */
    @Import(name="serviceBusNamespace")
    private @Nullable Output<String> serviceBusNamespace;

    /**
     * @return The name of the Service Bus namespace.
     * 
     */
    public Optional<Output<String>> serviceBusNamespace() {
        return Optional.ofNullable(this.serviceBusNamespace);
    }

    /**
     * The suffix for the service bus endpoint. By default this is .servicebus.windows.net
     * 
     */
    @Import(name="serviceBusSuffix")
    private @Nullable Output<String> serviceBusSuffix;

    /**
     * @return The suffix for the service bus endpoint. By default this is .servicebus.windows.net
     * 
     */
    public Optional<Output<String>> serviceBusSuffix() {
        return Optional.ofNullable(this.serviceBusSuffix);
    }

    private WebAppHybridConnectionArgs() {}

    private WebAppHybridConnectionArgs(WebAppHybridConnectionArgs $) {
        this.hostname = $.hostname;
        this.kind = $.kind;
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.port = $.port;
        this.relayArmUri = $.relayArmUri;
        this.relayName = $.relayName;
        this.resourceGroupName = $.resourceGroupName;
        this.sendKeyName = $.sendKeyName;
        this.sendKeyValue = $.sendKeyValue;
        this.serviceBusNamespace = $.serviceBusNamespace;
        this.serviceBusSuffix = $.serviceBusSuffix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppHybridConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppHybridConnectionArgs $;

        public Builder() {
            $ = new WebAppHybridConnectionArgs();
        }

        public Builder(WebAppHybridConnectionArgs defaults) {
            $ = new WebAppHybridConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname The hostname of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The hostname of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
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
         * @param port The port of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param relayArmUri The ARM URI to the Service Bus relay.
         * 
         * @return builder
         * 
         */
        public Builder relayArmUri(@Nullable Output<String> relayArmUri) {
            $.relayArmUri = relayArmUri;
            return this;
        }

        /**
         * @param relayArmUri The ARM URI to the Service Bus relay.
         * 
         * @return builder
         * 
         */
        public Builder relayArmUri(String relayArmUri) {
            return relayArmUri(Output.of(relayArmUri));
        }

        /**
         * @param relayName The name of the Service Bus relay.
         * 
         * @return builder
         * 
         */
        public Builder relayName(@Nullable Output<String> relayName) {
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

        /**
         * @param sendKeyName The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
         * 
         * @return builder
         * 
         */
        public Builder sendKeyName(@Nullable Output<String> sendKeyName) {
            $.sendKeyName = sendKeyName;
            return this;
        }

        /**
         * @param sendKeyName The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
         * 
         * @return builder
         * 
         */
        public Builder sendKeyName(String sendKeyName) {
            return sendKeyName(Output.of(sendKeyName));
        }

        /**
         * @param sendKeyValue The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
         * normally, use the POST /listKeys API instead.
         * 
         * @return builder
         * 
         */
        public Builder sendKeyValue(@Nullable Output<String> sendKeyValue) {
            $.sendKeyValue = sendKeyValue;
            return this;
        }

        /**
         * @param sendKeyValue The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be returned
         * normally, use the POST /listKeys API instead.
         * 
         * @return builder
         * 
         */
        public Builder sendKeyValue(String sendKeyValue) {
            return sendKeyValue(Output.of(sendKeyValue));
        }

        /**
         * @param serviceBusNamespace The name of the Service Bus namespace.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusNamespace(@Nullable Output<String> serviceBusNamespace) {
            $.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        /**
         * @param serviceBusNamespace The name of the Service Bus namespace.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusNamespace(String serviceBusNamespace) {
            return serviceBusNamespace(Output.of(serviceBusNamespace));
        }

        /**
         * @param serviceBusSuffix The suffix for the service bus endpoint. By default this is .servicebus.windows.net
         * 
         * @return builder
         * 
         */
        public Builder serviceBusSuffix(@Nullable Output<String> serviceBusSuffix) {
            $.serviceBusSuffix = serviceBusSuffix;
            return this;
        }

        /**
         * @param serviceBusSuffix The suffix for the service bus endpoint. By default this is .servicebus.windows.net
         * 
         * @return builder
         * 
         */
        public Builder serviceBusSuffix(String serviceBusSuffix) {
            return serviceBusSuffix(Output.of(serviceBusSuffix));
        }

        public WebAppHybridConnectionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}