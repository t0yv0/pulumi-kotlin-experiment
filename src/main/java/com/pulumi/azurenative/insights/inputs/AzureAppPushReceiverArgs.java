// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The Azure mobile App push notification receiver.
 * 
 */
public final class AzureAppPushReceiverArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureAppPushReceiverArgs Empty = new AzureAppPushReceiverArgs();

    /**
     * The email address registered for the Azure mobile app.
     * 
     */
    @Import(name="emailAddress", required=true)
    private Output<String> emailAddress;

    /**
     * @return The email address registered for the Azure mobile app.
     * 
     */
    public Output<String> emailAddress() {
        return this.emailAddress;
    }

    /**
     * The name of the Azure mobile app push receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Azure mobile app push receiver. Names must be unique across all receivers within an action group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private AzureAppPushReceiverArgs() {}

    private AzureAppPushReceiverArgs(AzureAppPushReceiverArgs $) {
        this.emailAddress = $.emailAddress;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureAppPushReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureAppPushReceiverArgs $;

        public Builder() {
            $ = new AzureAppPushReceiverArgs();
        }

        public Builder(AzureAppPushReceiverArgs defaults) {
            $ = new AzureAppPushReceiverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emailAddress The email address registered for the Azure mobile app.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        /**
         * @param emailAddress The email address registered for the Azure mobile app.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        /**
         * @param name The name of the Azure mobile app push receiver. Names must be unique across all receivers within an action group.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Azure mobile app push receiver. Names must be unique across all receivers within an action group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AzureAppPushReceiverArgs build() {
            $.emailAddress = Objects.requireNonNull($.emailAddress, "expected parameter 'emailAddress' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
