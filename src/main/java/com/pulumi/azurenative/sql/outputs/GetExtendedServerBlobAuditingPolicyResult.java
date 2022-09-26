// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExtendedServerBlobAuditingPolicyResult {
    /**
     * @return Specifies the Actions-Groups and Actions to audit.
     * 
     * The recommended set of action groups to use is the following combination - this will audit all the queries and stored procedures executed against the database, as well as successful and failed logins:
     * 
     * BATCH_COMPLETED_GROUP,
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
     * FAILED_DATABASE_AUTHENTICATION_GROUP.
     * 
     * This above combination is also the set that is configured by default when enabling auditing from the Azure portal.
     * 
     * The supported action groups to audit are (note: choose only specific groups that cover your auditing needs. Using unnecessary groups could lead to very large quantities of audit records):
     * 
     * APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
     * BACKUP_RESTORE_GROUP
     * DATABASE_LOGOUT_GROUP
     * DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
     * DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
     * DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP
     * DATABASE_PRINCIPAL_CHANGE_GROUP
     * DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP
     * FAILED_DATABASE_AUTHENTICATION_GROUP
     * SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP
     * SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
     * SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
     * USER_CHANGE_PASSWORD_GROUP
     * BATCH_STARTED_GROUP
     * BATCH_COMPLETED_GROUP
     * 
     * These are groups that cover all sql statements and stored procedures executed against the database, and should not be used in combination with other groups as this will result in duplicate audit logs.
     * 
     * For more information, see [Database-Level Audit Action Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     * 
     * For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified for Server auditing policy). The supported actions to audit are:
     * SELECT
     * UPDATE
     * INSERT
     * DELETE
     * EXECUTE
     * RECEIVE
     * REFERENCES
     * 
     * The general form for defining an action to be audited is:
     * {action} ON {object} BY {principal}
     * 
     * Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure, or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name} are used, respectively.
     * 
     * For example:
     * SELECT on dbo.myTable by public
     * SELECT on DATABASE::myDatabase by public
     * SELECT on SCHEMA::mySchema by public
     * 
     * For more information, see [Database-Level Audit Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions)
     * 
     */
    private @Nullable List<String> auditActionsAndGroups;
    /**
     * @return Resource ID.
     * 
     */
    private String id;
    /**
     * @return Specifies whether audit events are sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify &#39;State&#39; as &#39;Enabled&#39; and &#39;IsAzureMonitorTargetEnabled&#39; as true.
     * 
     * When using REST API to configure auditing, Diagnostic Settings with &#39;SQLSecurityAuditEvents&#39; diagnostic logs category on the database should be also created.
     * Note that for server level audit you should use the &#39;master&#39; database as {databaseName}.
     * 
     * Diagnostic Settings URI format:
     * PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     * 
     * For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043)
     * 
     */
    private @Nullable Boolean isAzureMonitorTargetEnabled;
    /**
     * @return Specifies the state of devops audit. If state is Enabled, devops logs will be sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify &#39;State&#39; as &#39;Enabled&#39;, &#39;IsAzureMonitorTargetEnabled&#39; as true and &#39;IsDevopsAuditEnabled&#39; as true
     * 
     * When using REST API to configure auditing, Diagnostic Settings with &#39;DevOpsOperationsAudit&#39; diagnostic logs category on the master database should also be created.
     * 
     * Diagnostic Settings URI format:
     * PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     * 
     * For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043)
     * 
     */
    private @Nullable Boolean isDevopsAuditEnabled;
    /**
     * @return Specifies whether storageAccountAccessKey value is the storage&#39;s secondary key.
     * 
     */
    private @Nullable Boolean isStorageSecondaryKeyInUse;
    /**
     * @return Resource name.
     * 
     */
    private String name;
    /**
     * @return Specifies condition of where clause when creating an audit.
     * 
     */
    private @Nullable String predicateExpression;
    /**
     * @return Specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
     * The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     * 
     */
    private @Nullable Integer queueDelayMs;
    /**
     * @return Specifies the number of days to keep in the audit logs in the storage account.
     * 
     */
    private @Nullable Integer retentionDays;
    /**
     * @return Specifies the state of the audit. If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled are required.
     * 
     */
    private String state;
    /**
     * @return Specifies the blob storage subscription Id.
     * 
     */
    private @Nullable String storageAccountSubscriptionId;
    /**
     * @return Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is required.
     * 
     */
    private @Nullable String storageEndpoint;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetExtendedServerBlobAuditingPolicyResult() {}
    /**
     * @return Specifies the Actions-Groups and Actions to audit.
     * 
     * The recommended set of action groups to use is the following combination - this will audit all the queries and stored procedures executed against the database, as well as successful and failed logins:
     * 
     * BATCH_COMPLETED_GROUP,
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP,
     * FAILED_DATABASE_AUTHENTICATION_GROUP.
     * 
     * This above combination is also the set that is configured by default when enabling auditing from the Azure portal.
     * 
     * The supported action groups to audit are (note: choose only specific groups that cover your auditing needs. Using unnecessary groups could lead to very large quantities of audit records):
     * 
     * APPLICATION_ROLE_CHANGE_PASSWORD_GROUP
     * BACKUP_RESTORE_GROUP
     * DATABASE_LOGOUT_GROUP
     * DATABASE_OBJECT_CHANGE_GROUP
     * DATABASE_OBJECT_OWNERSHIP_CHANGE_GROUP
     * DATABASE_OBJECT_PERMISSION_CHANGE_GROUP
     * DATABASE_OPERATION_GROUP
     * DATABASE_PERMISSION_CHANGE_GROUP
     * DATABASE_PRINCIPAL_CHANGE_GROUP
     * DATABASE_PRINCIPAL_IMPERSONATION_GROUP
     * DATABASE_ROLE_MEMBER_CHANGE_GROUP
     * FAILED_DATABASE_AUTHENTICATION_GROUP
     * SCHEMA_OBJECT_ACCESS_GROUP
     * SCHEMA_OBJECT_CHANGE_GROUP
     * SCHEMA_OBJECT_OWNERSHIP_CHANGE_GROUP
     * SCHEMA_OBJECT_PERMISSION_CHANGE_GROUP
     * SUCCESSFUL_DATABASE_AUTHENTICATION_GROUP
     * USER_CHANGE_PASSWORD_GROUP
     * BATCH_STARTED_GROUP
     * BATCH_COMPLETED_GROUP
     * 
     * These are groups that cover all sql statements and stored procedures executed against the database, and should not be used in combination with other groups as this will result in duplicate audit logs.
     * 
     * For more information, see [Database-Level Audit Action Groups](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-action-groups).
     * 
     * For Database auditing policy, specific Actions can also be specified (note that Actions cannot be specified for Server auditing policy). The supported actions to audit are:
     * SELECT
     * UPDATE
     * INSERT
     * DELETE
     * EXECUTE
     * RECEIVE
     * REFERENCES
     * 
     * The general form for defining an action to be audited is:
     * {action} ON {object} BY {principal}
     * 
     * Note that &lt;object&gt; in the above format can refer to an object like a table, view, or stored procedure, or an entire database or schema. For the latter cases, the forms DATABASE::{db_name} and SCHEMA::{schema_name} are used, respectively.
     * 
     * For example:
     * SELECT on dbo.myTable by public
     * SELECT on DATABASE::myDatabase by public
     * SELECT on SCHEMA::mySchema by public
     * 
     * For more information, see [Database-Level Audit Actions](https://docs.microsoft.com/en-us/sql/relational-databases/security/auditing/sql-server-audit-action-groups-and-actions#database-level-audit-actions)
     * 
     */
    public List<String> auditActionsAndGroups() {
        return this.auditActionsAndGroups == null ? List.of() : this.auditActionsAndGroups;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies whether audit events are sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify &#39;State&#39; as &#39;Enabled&#39; and &#39;IsAzureMonitorTargetEnabled&#39; as true.
     * 
     * When using REST API to configure auditing, Diagnostic Settings with &#39;SQLSecurityAuditEvents&#39; diagnostic logs category on the database should be also created.
     * Note that for server level audit you should use the &#39;master&#39; database as {databaseName}.
     * 
     * Diagnostic Settings URI format:
     * PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     * 
     * For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043)
     * 
     */
    public Optional<Boolean> isAzureMonitorTargetEnabled() {
        return Optional.ofNullable(this.isAzureMonitorTargetEnabled);
    }
    /**
     * @return Specifies the state of devops audit. If state is Enabled, devops logs will be sent to Azure Monitor.
     * In order to send the events to Azure Monitor, specify &#39;State&#39; as &#39;Enabled&#39;, &#39;IsAzureMonitorTargetEnabled&#39; as true and &#39;IsDevopsAuditEnabled&#39; as true
     * 
     * When using REST API to configure auditing, Diagnostic Settings with &#39;DevOpsOperationsAudit&#39; diagnostic logs category on the master database should also be created.
     * 
     * Diagnostic Settings URI format:
     * PUT https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Sql/servers/{serverName}/databases/master/providers/microsoft.insights/diagnosticSettings/{settingsName}?api-version=2017-05-01-preview
     * 
     * For more information, see [Diagnostic Settings REST API](https://go.microsoft.com/fwlink/?linkid=2033207)
     * or [Diagnostic Settings PowerShell](https://go.microsoft.com/fwlink/?linkid=2033043)
     * 
     */
    public Optional<Boolean> isDevopsAuditEnabled() {
        return Optional.ofNullable(this.isDevopsAuditEnabled);
    }
    /**
     * @return Specifies whether storageAccountAccessKey value is the storage&#39;s secondary key.
     * 
     */
    public Optional<Boolean> isStorageSecondaryKeyInUse() {
        return Optional.ofNullable(this.isStorageSecondaryKeyInUse);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Specifies condition of where clause when creating an audit.
     * 
     */
    public Optional<String> predicateExpression() {
        return Optional.ofNullable(this.predicateExpression);
    }
    /**
     * @return Specifies the amount of time in milliseconds that can elapse before audit actions are forced to be processed.
     * The default minimum value is 1000 (1 second). The maximum is 2,147,483,647.
     * 
     */
    public Optional<Integer> queueDelayMs() {
        return Optional.ofNullable(this.queueDelayMs);
    }
    /**
     * @return Specifies the number of days to keep in the audit logs in the storage account.
     * 
     */
    public Optional<Integer> retentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }
    /**
     * @return Specifies the state of the audit. If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled are required.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Specifies the blob storage subscription Id.
     * 
     */
    public Optional<String> storageAccountSubscriptionId() {
        return Optional.ofNullable(this.storageAccountSubscriptionId);
    }
    /**
     * @return Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). If state is Enabled, storageEndpoint or isAzureMonitorTargetEnabled is required.
     * 
     */
    public Optional<String> storageEndpoint() {
        return Optional.ofNullable(this.storageEndpoint);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtendedServerBlobAuditingPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> auditActionsAndGroups;
        private String id;
        private @Nullable Boolean isAzureMonitorTargetEnabled;
        private @Nullable Boolean isDevopsAuditEnabled;
        private @Nullable Boolean isStorageSecondaryKeyInUse;
        private String name;
        private @Nullable String predicateExpression;
        private @Nullable Integer queueDelayMs;
        private @Nullable Integer retentionDays;
        private String state;
        private @Nullable String storageAccountSubscriptionId;
        private @Nullable String storageEndpoint;
        private String type;
        public Builder() {}
        public Builder(GetExtendedServerBlobAuditingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditActionsAndGroups = defaults.auditActionsAndGroups;
    	      this.id = defaults.id;
    	      this.isAzureMonitorTargetEnabled = defaults.isAzureMonitorTargetEnabled;
    	      this.isDevopsAuditEnabled = defaults.isDevopsAuditEnabled;
    	      this.isStorageSecondaryKeyInUse = defaults.isStorageSecondaryKeyInUse;
    	      this.name = defaults.name;
    	      this.predicateExpression = defaults.predicateExpression;
    	      this.queueDelayMs = defaults.queueDelayMs;
    	      this.retentionDays = defaults.retentionDays;
    	      this.state = defaults.state;
    	      this.storageAccountSubscriptionId = defaults.storageAccountSubscriptionId;
    	      this.storageEndpoint = defaults.storageEndpoint;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder auditActionsAndGroups(@Nullable List<String> auditActionsAndGroups) {
            this.auditActionsAndGroups = auditActionsAndGroups;
            return this;
        }
        public Builder auditActionsAndGroups(String... auditActionsAndGroups) {
            return auditActionsAndGroups(List.of(auditActionsAndGroups));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isAzureMonitorTargetEnabled(@Nullable Boolean isAzureMonitorTargetEnabled) {
            this.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isDevopsAuditEnabled(@Nullable Boolean isDevopsAuditEnabled) {
            this.isDevopsAuditEnabled = isDevopsAuditEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder isStorageSecondaryKeyInUse(@Nullable Boolean isStorageSecondaryKeyInUse) {
            this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder predicateExpression(@Nullable String predicateExpression) {
            this.predicateExpression = predicateExpression;
            return this;
        }
        @CustomType.Setter
        public Builder queueDelayMs(@Nullable Integer queueDelayMs) {
            this.queueDelayMs = queueDelayMs;
            return this;
        }
        @CustomType.Setter
        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountSubscriptionId(@Nullable String storageAccountSubscriptionId) {
            this.storageAccountSubscriptionId = storageAccountSubscriptionId;
            return this;
        }
        @CustomType.Setter
        public Builder storageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetExtendedServerBlobAuditingPolicyResult build() {
            final var o = new GetExtendedServerBlobAuditingPolicyResult();
            o.auditActionsAndGroups = auditActionsAndGroups;
            o.id = id;
            o.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
            o.isDevopsAuditEnabled = isDevopsAuditEnabled;
            o.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
            o.name = name;
            o.predicateExpression = predicateExpression;
            o.queueDelayMs = queueDelayMs;
            o.retentionDays = retentionDays;
            o.state = state;
            o.storageAccountSubscriptionId = storageAccountSubscriptionId;
            o.storageEndpoint = storageEndpoint;
            o.type = type;
            return o;
        }
    }
}
