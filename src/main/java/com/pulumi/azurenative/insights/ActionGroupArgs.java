// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.insights.inputs.ArmRoleReceiverArgs;
import com.pulumi.azurenative.insights.inputs.AutomationRunbookReceiverArgs;
import com.pulumi.azurenative.insights.inputs.AzureAppPushReceiverArgs;
import com.pulumi.azurenative.insights.inputs.AzureFunctionReceiverArgs;
import com.pulumi.azurenative.insights.inputs.EmailReceiverArgs;
import com.pulumi.azurenative.insights.inputs.ItsmReceiverArgs;
import com.pulumi.azurenative.insights.inputs.LogicAppReceiverArgs;
import com.pulumi.azurenative.insights.inputs.SmsReceiverArgs;
import com.pulumi.azurenative.insights.inputs.VoiceReceiverArgs;
import com.pulumi.azurenative.insights.inputs.WebhookReceiverArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActionGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionGroupArgs Empty = new ActionGroupArgs();

    /**
     * The name of the action group.
     * 
     */
    @Import(name="actionGroupName")
    private @Nullable Output<String> actionGroupName;

    /**
     * @return The name of the action group.
     * 
     */
    public Optional<Output<String>> actionGroupName() {
        return Optional.ofNullable(this.actionGroupName);
    }

    /**
     * The list of ARM role receivers that are part of this action group. Roles are Azure RBAC roles and only built-in roles are supported.
     * 
     */
    @Import(name="armRoleReceivers")
    private @Nullable Output<List<ArmRoleReceiverArgs>> armRoleReceivers;

    /**
     * @return The list of ARM role receivers that are part of this action group. Roles are Azure RBAC roles and only built-in roles are supported.
     * 
     */
    public Optional<Output<List<ArmRoleReceiverArgs>>> armRoleReceivers() {
        return Optional.ofNullable(this.armRoleReceivers);
    }

    /**
     * The list of AutomationRunbook receivers that are part of this action group.
     * 
     */
    @Import(name="automationRunbookReceivers")
    private @Nullable Output<List<AutomationRunbookReceiverArgs>> automationRunbookReceivers;

    /**
     * @return The list of AutomationRunbook receivers that are part of this action group.
     * 
     */
    public Optional<Output<List<AutomationRunbookReceiverArgs>>> automationRunbookReceivers() {
        return Optional.ofNullable(this.automationRunbookReceivers);
    }

    /**
     * The list of AzureAppPush receivers that are part of this action group.
     * 
     */
    @Import(name="azureAppPushReceivers")
    private @Nullable Output<List<AzureAppPushReceiverArgs>> azureAppPushReceivers;

    /**
     * @return The list of AzureAppPush receivers that are part of this action group.
     * 
     */
    public Optional<Output<List<AzureAppPushReceiverArgs>>> azureAppPushReceivers() {
        return Optional.ofNullable(this.azureAppPushReceivers);
    }

    /**
     * The list of azure function receivers that are part of this action group.
     * 
     */
    @Import(name="azureFunctionReceivers")
    private @Nullable Output<List<AzureFunctionReceiverArgs>> azureFunctionReceivers;

    /**
     * @return The list of azure function receivers that are part of this action group.
     * 
     */
    public Optional<Output<List<AzureFunctionReceiverArgs>>> azureFunctionReceivers() {
        return Optional.ofNullable(this.azureFunctionReceivers);
    }

    /**
     * The list of email receivers that are part of this action group.
     * 
     */
    @Import(name="emailReceivers")
    private @Nullable Output<List<EmailReceiverArgs>> emailReceivers;

    /**
     * @return The list of email receivers that are part of this action group.
     * 
     */
    public Optional<Output<List<EmailReceiverArgs>>> emailReceivers() {
        return Optional.ofNullable(this.emailReceivers);
    }

    /**
     * Indicates whether this action group is enabled. If an action group is not enabled, then none of its receivers will receive communications.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether this action group is enabled. If an action group is not enabled, then none of its receivers will receive communications.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The short name of the action group. This will be used in SMS messages.
     * 
     */
    @Import(name="groupShortName", required=true)
    private Output<String> groupShortName;

    /**
     * @return The short name of the action group. This will be used in SMS messages.
     * 
     */
    public Output<String> groupShortName() {
        return this.groupShortName;
    }

    /**
     * The list of ITSM receivers that are part of this action group.
     * 
     */
    @Import(name="itsmReceivers")
    private @Nullable Output<List<ItsmReceiverArgs>> itsmReceivers;

    /**
     * @return The list of ITSM receivers that are part of this action group.
     * 
     */
    public Optional<Output<List<ItsmReceiverArgs>>> itsmReceivers() {
        return Optional.ofNullable(this.itsmReceivers);
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
     * The list of logic app receivers that are part of this action group.
     * 
     */
    @Import(name="logicAppReceivers")
    private @Nullable Output<List<LogicAppReceiverArgs>> logicAppReceivers;

    /**
     * @return The list of logic app receivers that are part of this action group.
     * 
     */
    public Optional<Output<List<LogicAppReceiverArgs>>> logicAppReceivers() {
        return Optional.ofNullable(this.logicAppReceivers);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The list of SMS receivers that are part of this action group.
     * 
     */
    @Import(name="smsReceivers")
    private @Nullable Output<List<SmsReceiverArgs>> smsReceivers;

    /**
     * @return The list of SMS receivers that are part of this action group.
     * 
     */
    public Optional<Output<List<SmsReceiverArgs>>> smsReceivers() {
        return Optional.ofNullable(this.smsReceivers);
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

    /**
     * The list of voice receivers that are part of this action group.
     * 
     */
    @Import(name="voiceReceivers")
    private @Nullable Output<List<VoiceReceiverArgs>> voiceReceivers;

    /**
     * @return The list of voice receivers that are part of this action group.
     * 
     */
    public Optional<Output<List<VoiceReceiverArgs>>> voiceReceivers() {
        return Optional.ofNullable(this.voiceReceivers);
    }

    /**
     * The list of webhook receivers that are part of this action group.
     * 
     */
    @Import(name="webhookReceivers")
    private @Nullable Output<List<WebhookReceiverArgs>> webhookReceivers;

    /**
     * @return The list of webhook receivers that are part of this action group.
     * 
     */
    public Optional<Output<List<WebhookReceiverArgs>>> webhookReceivers() {
        return Optional.ofNullable(this.webhookReceivers);
    }

    private ActionGroupArgs() {}

    private ActionGroupArgs(ActionGroupArgs $) {
        this.actionGroupName = $.actionGroupName;
        this.armRoleReceivers = $.armRoleReceivers;
        this.automationRunbookReceivers = $.automationRunbookReceivers;
        this.azureAppPushReceivers = $.azureAppPushReceivers;
        this.azureFunctionReceivers = $.azureFunctionReceivers;
        this.emailReceivers = $.emailReceivers;
        this.enabled = $.enabled;
        this.groupShortName = $.groupShortName;
        this.itsmReceivers = $.itsmReceivers;
        this.location = $.location;
        this.logicAppReceivers = $.logicAppReceivers;
        this.resourceGroupName = $.resourceGroupName;
        this.smsReceivers = $.smsReceivers;
        this.tags = $.tags;
        this.voiceReceivers = $.voiceReceivers;
        this.webhookReceivers = $.webhookReceivers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionGroupArgs $;

        public Builder() {
            $ = new ActionGroupArgs();
        }

        public Builder(ActionGroupArgs defaults) {
            $ = new ActionGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionGroupName The name of the action group.
         * 
         * @return builder
         * 
         */
        public Builder actionGroupName(@Nullable Output<String> actionGroupName) {
            $.actionGroupName = actionGroupName;
            return this;
        }

        /**
         * @param actionGroupName The name of the action group.
         * 
         * @return builder
         * 
         */
        public Builder actionGroupName(String actionGroupName) {
            return actionGroupName(Output.of(actionGroupName));
        }

        /**
         * @param armRoleReceivers The list of ARM role receivers that are part of this action group. Roles are Azure RBAC roles and only built-in roles are supported.
         * 
         * @return builder
         * 
         */
        public Builder armRoleReceivers(@Nullable Output<List<ArmRoleReceiverArgs>> armRoleReceivers) {
            $.armRoleReceivers = armRoleReceivers;
            return this;
        }

        /**
         * @param armRoleReceivers The list of ARM role receivers that are part of this action group. Roles are Azure RBAC roles and only built-in roles are supported.
         * 
         * @return builder
         * 
         */
        public Builder armRoleReceivers(List<ArmRoleReceiverArgs> armRoleReceivers) {
            return armRoleReceivers(Output.of(armRoleReceivers));
        }

        /**
         * @param armRoleReceivers The list of ARM role receivers that are part of this action group. Roles are Azure RBAC roles and only built-in roles are supported.
         * 
         * @return builder
         * 
         */
        public Builder armRoleReceivers(ArmRoleReceiverArgs... armRoleReceivers) {
            return armRoleReceivers(List.of(armRoleReceivers));
        }

        /**
         * @param automationRunbookReceivers The list of AutomationRunbook receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder automationRunbookReceivers(@Nullable Output<List<AutomationRunbookReceiverArgs>> automationRunbookReceivers) {
            $.automationRunbookReceivers = automationRunbookReceivers;
            return this;
        }

        /**
         * @param automationRunbookReceivers The list of AutomationRunbook receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder automationRunbookReceivers(List<AutomationRunbookReceiverArgs> automationRunbookReceivers) {
            return automationRunbookReceivers(Output.of(automationRunbookReceivers));
        }

        /**
         * @param automationRunbookReceivers The list of AutomationRunbook receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder automationRunbookReceivers(AutomationRunbookReceiverArgs... automationRunbookReceivers) {
            return automationRunbookReceivers(List.of(automationRunbookReceivers));
        }

        /**
         * @param azureAppPushReceivers The list of AzureAppPush receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder azureAppPushReceivers(@Nullable Output<List<AzureAppPushReceiverArgs>> azureAppPushReceivers) {
            $.azureAppPushReceivers = azureAppPushReceivers;
            return this;
        }

        /**
         * @param azureAppPushReceivers The list of AzureAppPush receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder azureAppPushReceivers(List<AzureAppPushReceiverArgs> azureAppPushReceivers) {
            return azureAppPushReceivers(Output.of(azureAppPushReceivers));
        }

        /**
         * @param azureAppPushReceivers The list of AzureAppPush receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder azureAppPushReceivers(AzureAppPushReceiverArgs... azureAppPushReceivers) {
            return azureAppPushReceivers(List.of(azureAppPushReceivers));
        }

        /**
         * @param azureFunctionReceivers The list of azure function receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder azureFunctionReceivers(@Nullable Output<List<AzureFunctionReceiverArgs>> azureFunctionReceivers) {
            $.azureFunctionReceivers = azureFunctionReceivers;
            return this;
        }

        /**
         * @param azureFunctionReceivers The list of azure function receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder azureFunctionReceivers(List<AzureFunctionReceiverArgs> azureFunctionReceivers) {
            return azureFunctionReceivers(Output.of(azureFunctionReceivers));
        }

        /**
         * @param azureFunctionReceivers The list of azure function receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder azureFunctionReceivers(AzureFunctionReceiverArgs... azureFunctionReceivers) {
            return azureFunctionReceivers(List.of(azureFunctionReceivers));
        }

        /**
         * @param emailReceivers The list of email receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder emailReceivers(@Nullable Output<List<EmailReceiverArgs>> emailReceivers) {
            $.emailReceivers = emailReceivers;
            return this;
        }

        /**
         * @param emailReceivers The list of email receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder emailReceivers(List<EmailReceiverArgs> emailReceivers) {
            return emailReceivers(Output.of(emailReceivers));
        }

        /**
         * @param emailReceivers The list of email receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder emailReceivers(EmailReceiverArgs... emailReceivers) {
            return emailReceivers(List.of(emailReceivers));
        }

        /**
         * @param enabled Indicates whether this action group is enabled. If an action group is not enabled, then none of its receivers will receive communications.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether this action group is enabled. If an action group is not enabled, then none of its receivers will receive communications.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param groupShortName The short name of the action group. This will be used in SMS messages.
         * 
         * @return builder
         * 
         */
        public Builder groupShortName(Output<String> groupShortName) {
            $.groupShortName = groupShortName;
            return this;
        }

        /**
         * @param groupShortName The short name of the action group. This will be used in SMS messages.
         * 
         * @return builder
         * 
         */
        public Builder groupShortName(String groupShortName) {
            return groupShortName(Output.of(groupShortName));
        }

        /**
         * @param itsmReceivers The list of ITSM receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder itsmReceivers(@Nullable Output<List<ItsmReceiverArgs>> itsmReceivers) {
            $.itsmReceivers = itsmReceivers;
            return this;
        }

        /**
         * @param itsmReceivers The list of ITSM receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder itsmReceivers(List<ItsmReceiverArgs> itsmReceivers) {
            return itsmReceivers(Output.of(itsmReceivers));
        }

        /**
         * @param itsmReceivers The list of ITSM receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder itsmReceivers(ItsmReceiverArgs... itsmReceivers) {
            return itsmReceivers(List.of(itsmReceivers));
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
         * @param logicAppReceivers The list of logic app receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder logicAppReceivers(@Nullable Output<List<LogicAppReceiverArgs>> logicAppReceivers) {
            $.logicAppReceivers = logicAppReceivers;
            return this;
        }

        /**
         * @param logicAppReceivers The list of logic app receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder logicAppReceivers(List<LogicAppReceiverArgs> logicAppReceivers) {
            return logicAppReceivers(Output.of(logicAppReceivers));
        }

        /**
         * @param logicAppReceivers The list of logic app receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder logicAppReceivers(LogicAppReceiverArgs... logicAppReceivers) {
            return logicAppReceivers(List.of(logicAppReceivers));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param smsReceivers The list of SMS receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder smsReceivers(@Nullable Output<List<SmsReceiverArgs>> smsReceivers) {
            $.smsReceivers = smsReceivers;
            return this;
        }

        /**
         * @param smsReceivers The list of SMS receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder smsReceivers(List<SmsReceiverArgs> smsReceivers) {
            return smsReceivers(Output.of(smsReceivers));
        }

        /**
         * @param smsReceivers The list of SMS receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder smsReceivers(SmsReceiverArgs... smsReceivers) {
            return smsReceivers(List.of(smsReceivers));
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

        /**
         * @param voiceReceivers The list of voice receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder voiceReceivers(@Nullable Output<List<VoiceReceiverArgs>> voiceReceivers) {
            $.voiceReceivers = voiceReceivers;
            return this;
        }

        /**
         * @param voiceReceivers The list of voice receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder voiceReceivers(List<VoiceReceiverArgs> voiceReceivers) {
            return voiceReceivers(Output.of(voiceReceivers));
        }

        /**
         * @param voiceReceivers The list of voice receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder voiceReceivers(VoiceReceiverArgs... voiceReceivers) {
            return voiceReceivers(List.of(voiceReceivers));
        }

        /**
         * @param webhookReceivers The list of webhook receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder webhookReceivers(@Nullable Output<List<WebhookReceiverArgs>> webhookReceivers) {
            $.webhookReceivers = webhookReceivers;
            return this;
        }

        /**
         * @param webhookReceivers The list of webhook receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder webhookReceivers(List<WebhookReceiverArgs> webhookReceivers) {
            return webhookReceivers(Output.of(webhookReceivers));
        }

        /**
         * @param webhookReceivers The list of webhook receivers that are part of this action group.
         * 
         * @return builder
         * 
         */
        public Builder webhookReceivers(WebhookReceiverArgs... webhookReceivers) {
            return webhookReceivers(List.of(webhookReceivers));
        }

        public ActionGroupArgs build() {
            $.enabled = Codegen.booleanProp("enabled").output().arg($.enabled).def(true).require();
            $.groupShortName = Objects.requireNonNull($.groupShortName, "expected parameter 'groupShortName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}