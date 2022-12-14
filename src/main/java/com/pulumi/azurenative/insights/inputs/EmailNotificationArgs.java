// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Email notification of an autoscale event.
 * 
 */
public final class EmailNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailNotificationArgs Empty = new EmailNotificationArgs();

    /**
     * the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
     * 
     */
    @Import(name="customEmails")
    private @Nullable Output<List<String>> customEmails;

    /**
     * @return the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
     * 
     */
    public Optional<Output<List<String>>> customEmails() {
        return Optional.ofNullable(this.customEmails);
    }

    /**
     * a value indicating whether to send email to subscription administrator.
     * 
     */
    @Import(name="sendToSubscriptionAdministrator")
    private @Nullable Output<Boolean> sendToSubscriptionAdministrator;

    /**
     * @return a value indicating whether to send email to subscription administrator.
     * 
     */
    public Optional<Output<Boolean>> sendToSubscriptionAdministrator() {
        return Optional.ofNullable(this.sendToSubscriptionAdministrator);
    }

    /**
     * a value indicating whether to send email to subscription co-administrators.
     * 
     */
    @Import(name="sendToSubscriptionCoAdministrators")
    private @Nullable Output<Boolean> sendToSubscriptionCoAdministrators;

    /**
     * @return a value indicating whether to send email to subscription co-administrators.
     * 
     */
    public Optional<Output<Boolean>> sendToSubscriptionCoAdministrators() {
        return Optional.ofNullable(this.sendToSubscriptionCoAdministrators);
    }

    private EmailNotificationArgs() {}

    private EmailNotificationArgs(EmailNotificationArgs $) {
        this.customEmails = $.customEmails;
        this.sendToSubscriptionAdministrator = $.sendToSubscriptionAdministrator;
        this.sendToSubscriptionCoAdministrators = $.sendToSubscriptionCoAdministrators;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailNotificationArgs $;

        public Builder() {
            $ = new EmailNotificationArgs();
        }

        public Builder(EmailNotificationArgs defaults) {
            $ = new EmailNotificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customEmails the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder customEmails(@Nullable Output<List<String>> customEmails) {
            $.customEmails = customEmails;
            return this;
        }

        /**
         * @param customEmails the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder customEmails(List<String> customEmails) {
            return customEmails(Output.of(customEmails));
        }

        /**
         * @param customEmails the custom e-mails list. This value can be null or empty, in which case this attribute will be ignored.
         * 
         * @return builder
         * 
         */
        public Builder customEmails(String... customEmails) {
            return customEmails(List.of(customEmails));
        }

        /**
         * @param sendToSubscriptionAdministrator a value indicating whether to send email to subscription administrator.
         * 
         * @return builder
         * 
         */
        public Builder sendToSubscriptionAdministrator(@Nullable Output<Boolean> sendToSubscriptionAdministrator) {
            $.sendToSubscriptionAdministrator = sendToSubscriptionAdministrator;
            return this;
        }

        /**
         * @param sendToSubscriptionAdministrator a value indicating whether to send email to subscription administrator.
         * 
         * @return builder
         * 
         */
        public Builder sendToSubscriptionAdministrator(Boolean sendToSubscriptionAdministrator) {
            return sendToSubscriptionAdministrator(Output.of(sendToSubscriptionAdministrator));
        }

        /**
         * @param sendToSubscriptionCoAdministrators a value indicating whether to send email to subscription co-administrators.
         * 
         * @return builder
         * 
         */
        public Builder sendToSubscriptionCoAdministrators(@Nullable Output<Boolean> sendToSubscriptionCoAdministrators) {
            $.sendToSubscriptionCoAdministrators = sendToSubscriptionCoAdministrators;
            return this;
        }

        /**
         * @param sendToSubscriptionCoAdministrators a value indicating whether to send email to subscription co-administrators.
         * 
         * @return builder
         * 
         */
        public Builder sendToSubscriptionCoAdministrators(Boolean sendToSubscriptionCoAdministrators) {
            return sendToSubscriptionCoAdministrators(Output.of(sendToSubscriptionCoAdministrators));
        }

        public EmailNotificationArgs build() {
            $.sendToSubscriptionAdministrator = Codegen.booleanProp("sendToSubscriptionAdministrator").output().arg($.sendToSubscriptionAdministrator).def(false).getNullable();
            $.sendToSubscriptionCoAdministrators = Codegen.booleanProp("sendToSubscriptionCoAdministrators").output().arg($.sendToSubscriptionCoAdministrators).def(false).getNullable();
            return $;
        }
    }

}
