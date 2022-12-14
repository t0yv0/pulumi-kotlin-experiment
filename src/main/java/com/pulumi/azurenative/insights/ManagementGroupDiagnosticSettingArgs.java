// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.insights.inputs.ManagementGroupLogSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementGroupDiagnosticSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementGroupDiagnosticSettingArgs Empty = new ManagementGroupDiagnosticSettingArgs();

    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    @Import(name="eventHubAuthorizationRuleId")
    private @Nullable Output<String> eventHubAuthorizationRuleId;

    /**
     * @return The resource Id for the event hub authorization rule.
     * 
     */
    public Optional<Output<String>> eventHubAuthorizationRuleId() {
        return Optional.ofNullable(this.eventHubAuthorizationRuleId);
    }

    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    @Import(name="eventHubName")
    private @Nullable Output<String> eventHubName;

    /**
     * @return The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    public Optional<Output<String>> eventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }

    /**
     * Location of the resource
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location of the resource
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The list of logs settings.
     * 
     */
    @Import(name="logs")
    private @Nullable Output<List<ManagementGroupLogSettingsArgs>> logs;

    /**
     * @return The list of logs settings.
     * 
     */
    public Optional<Output<List<ManagementGroupLogSettingsArgs>>> logs() {
        return Optional.ofNullable(this.logs);
    }

    /**
     * The management group id.
     * 
     */
    @Import(name="managementGroupId", required=true)
    private Output<String> managementGroupId;

    /**
     * @return The management group id.
     * 
     */
    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The name of the diagnostic setting.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the diagnostic setting.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    @Import(name="serviceBusRuleId")
    private @Nullable Output<String> serviceBusRuleId;

    /**
     * @return The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    public Optional<Output<String>> serviceBusRuleId() {
        return Optional.ofNullable(this.serviceBusRuleId);
    }

    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }

    /**
     * The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private ManagementGroupDiagnosticSettingArgs() {}

    private ManagementGroupDiagnosticSettingArgs(ManagementGroupDiagnosticSettingArgs $) {
        this.eventHubAuthorizationRuleId = $.eventHubAuthorizationRuleId;
        this.eventHubName = $.eventHubName;
        this.location = $.location;
        this.logs = $.logs;
        this.managementGroupId = $.managementGroupId;
        this.name = $.name;
        this.serviceBusRuleId = $.serviceBusRuleId;
        this.storageAccountId = $.storageAccountId;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementGroupDiagnosticSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementGroupDiagnosticSettingArgs $;

        public Builder() {
            $ = new ManagementGroupDiagnosticSettingArgs();
        }

        public Builder(ManagementGroupDiagnosticSettingArgs defaults) {
            $ = new ManagementGroupDiagnosticSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventHubAuthorizationRuleId The resource Id for the event hub authorization rule.
         * 
         * @return builder
         * 
         */
        public Builder eventHubAuthorizationRuleId(@Nullable Output<String> eventHubAuthorizationRuleId) {
            $.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
            return this;
        }

        /**
         * @param eventHubAuthorizationRuleId The resource Id for the event hub authorization rule.
         * 
         * @return builder
         * 
         */
        public Builder eventHubAuthorizationRuleId(String eventHubAuthorizationRuleId) {
            return eventHubAuthorizationRuleId(Output.of(eventHubAuthorizationRuleId));
        }

        /**
         * @param eventHubName The name of the event hub. If none is specified, the default event hub will be selected.
         * 
         * @return builder
         * 
         */
        public Builder eventHubName(@Nullable Output<String> eventHubName) {
            $.eventHubName = eventHubName;
            return this;
        }

        /**
         * @param eventHubName The name of the event hub. If none is specified, the default event hub will be selected.
         * 
         * @return builder
         * 
         */
        public Builder eventHubName(String eventHubName) {
            return eventHubName(Output.of(eventHubName));
        }

        /**
         * @param location Location of the resource
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location of the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param logs The list of logs settings.
         * 
         * @return builder
         * 
         */
        public Builder logs(@Nullable Output<List<ManagementGroupLogSettingsArgs>> logs) {
            $.logs = logs;
            return this;
        }

        /**
         * @param logs The list of logs settings.
         * 
         * @return builder
         * 
         */
        public Builder logs(List<ManagementGroupLogSettingsArgs> logs) {
            return logs(Output.of(logs));
        }

        /**
         * @param logs The list of logs settings.
         * 
         * @return builder
         * 
         */
        public Builder logs(ManagementGroupLogSettingsArgs... logs) {
            return logs(List.of(logs));
        }

        /**
         * @param managementGroupId The management group id.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(Output<String> managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        /**
         * @param managementGroupId The management group id.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(String managementGroupId) {
            return managementGroupId(Output.of(managementGroupId));
        }

        /**
         * @param name The name of the diagnostic setting.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the diagnostic setting.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param serviceBusRuleId The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusRuleId(@Nullable Output<String> serviceBusRuleId) {
            $.serviceBusRuleId = serviceBusRuleId;
            return this;
        }

        /**
         * @param serviceBusRuleId The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusRuleId(String serviceBusRuleId) {
            return serviceBusRuleId(Output.of(serviceBusRuleId));
        }

        /**
         * @param storageAccountId The resource ID of the storage account to which you would like to send Diagnostic Logs.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId The resource ID of the storage account to which you would like to send Diagnostic Logs.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
        }

        /**
         * @param workspaceId The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public ManagementGroupDiagnosticSettingArgs build() {
            $.managementGroupId = Objects.requireNonNull($.managementGroupId, "expected parameter 'managementGroupId' to be non-null");
            return $;
        }
    }

}
