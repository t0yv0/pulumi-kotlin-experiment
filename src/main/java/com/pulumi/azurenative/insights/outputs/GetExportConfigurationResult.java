// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExportConfigurationResult {
    /**
     * @return The name of the Application Insights component.
     * 
     */
    private String applicationName;
    /**
     * @return The name of the destination storage container.
     * 
     */
    private String containerName;
    /**
     * @return The name of destination account.
     * 
     */
    private String destinationAccountId;
    /**
     * @return The destination account location ID.
     * 
     */
    private String destinationStorageLocationId;
    /**
     * @return The destination storage account subscription ID.
     * 
     */
    private String destinationStorageSubscriptionId;
    /**
     * @return The destination type.
     * 
     */
    private String destinationType;
    /**
     * @return The unique ID of the export configuration inside an Application Insights component. It is auto generated when the Continuous Export configuration is created.
     * 
     */
    private String exportId;
    /**
     * @return This indicates current Continuous Export configuration status. The possible values are &#39;Preparing&#39;, &#39;Success&#39;, &#39;Failure&#39;.
     * 
     */
    private String exportStatus;
    /**
     * @return The instrumentation key of the Application Insights component.
     * 
     */
    private String instrumentationKey;
    /**
     * @return This will be &#39;true&#39; if the Continuous Export configuration is enabled, otherwise it will be &#39;false&#39;.
     * 
     */
    private String isUserEnabled;
    /**
     * @return The last time the Continuous Export configuration started failing.
     * 
     */
    private String lastGapTime;
    /**
     * @return The last time data was successfully delivered to the destination storage container for this Continuous Export configuration.
     * 
     */
    private String lastSuccessTime;
    /**
     * @return Last time the Continuous Export configuration was updated.
     * 
     */
    private String lastUserUpdate;
    /**
     * @return Deprecated
     * 
     */
    private @Nullable String notificationQueueEnabled;
    /**
     * @return This is the reason the Continuous Export configuration started failing. It can be &#39;AzureStorageNotFound&#39; or &#39;AzureStorageAccessDenied&#39;.
     * 
     */
    private String permanentErrorReason;
    /**
     * @return This comma separated list of document types that will be exported. The possible values include &#39;Requests&#39;, &#39;Event&#39;, &#39;Exceptions&#39;, &#39;Metrics&#39;, &#39;PageViews&#39;, &#39;PageViewPerformance&#39;, &#39;Rdd&#39;, &#39;PerformanceCounters&#39;, &#39;Availability&#39;, &#39;Messages&#39;.
     * 
     */
    private @Nullable String recordTypes;
    /**
     * @return The resource group of the Application Insights component.
     * 
     */
    private String resourceGroup;
    /**
     * @return The name of the destination storage account.
     * 
     */
    private String storageName;
    /**
     * @return The subscription of the Application Insights component.
     * 
     */
    private String subscriptionId;

    private GetExportConfigurationResult() {}
    /**
     * @return The name of the Application Insights component.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * @return The name of the destination storage container.
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return The name of destination account.
     * 
     */
    public String destinationAccountId() {
        return this.destinationAccountId;
    }
    /**
     * @return The destination account location ID.
     * 
     */
    public String destinationStorageLocationId() {
        return this.destinationStorageLocationId;
    }
    /**
     * @return The destination storage account subscription ID.
     * 
     */
    public String destinationStorageSubscriptionId() {
        return this.destinationStorageSubscriptionId;
    }
    /**
     * @return The destination type.
     * 
     */
    public String destinationType() {
        return this.destinationType;
    }
    /**
     * @return The unique ID of the export configuration inside an Application Insights component. It is auto generated when the Continuous Export configuration is created.
     * 
     */
    public String exportId() {
        return this.exportId;
    }
    /**
     * @return This indicates current Continuous Export configuration status. The possible values are &#39;Preparing&#39;, &#39;Success&#39;, &#39;Failure&#39;.
     * 
     */
    public String exportStatus() {
        return this.exportStatus;
    }
    /**
     * @return The instrumentation key of the Application Insights component.
     * 
     */
    public String instrumentationKey() {
        return this.instrumentationKey;
    }
    /**
     * @return This will be &#39;true&#39; if the Continuous Export configuration is enabled, otherwise it will be &#39;false&#39;.
     * 
     */
    public String isUserEnabled() {
        return this.isUserEnabled;
    }
    /**
     * @return The last time the Continuous Export configuration started failing.
     * 
     */
    public String lastGapTime() {
        return this.lastGapTime;
    }
    /**
     * @return The last time data was successfully delivered to the destination storage container for this Continuous Export configuration.
     * 
     */
    public String lastSuccessTime() {
        return this.lastSuccessTime;
    }
    /**
     * @return Last time the Continuous Export configuration was updated.
     * 
     */
    public String lastUserUpdate() {
        return this.lastUserUpdate;
    }
    /**
     * @return Deprecated
     * 
     */
    public Optional<String> notificationQueueEnabled() {
        return Optional.ofNullable(this.notificationQueueEnabled);
    }
    /**
     * @return This is the reason the Continuous Export configuration started failing. It can be &#39;AzureStorageNotFound&#39; or &#39;AzureStorageAccessDenied&#39;.
     * 
     */
    public String permanentErrorReason() {
        return this.permanentErrorReason;
    }
    /**
     * @return This comma separated list of document types that will be exported. The possible values include &#39;Requests&#39;, &#39;Event&#39;, &#39;Exceptions&#39;, &#39;Metrics&#39;, &#39;PageViews&#39;, &#39;PageViewPerformance&#39;, &#39;Rdd&#39;, &#39;PerformanceCounters&#39;, &#39;Availability&#39;, &#39;Messages&#39;.
     * 
     */
    public Optional<String> recordTypes() {
        return Optional.ofNullable(this.recordTypes);
    }
    /**
     * @return The resource group of the Application Insights component.
     * 
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }
    /**
     * @return The name of the destination storage account.
     * 
     */
    public String storageName() {
        return this.storageName;
    }
    /**
     * @return The subscription of the Application Insights component.
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportConfigurationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationName;
        private String containerName;
        private String destinationAccountId;
        private String destinationStorageLocationId;
        private String destinationStorageSubscriptionId;
        private String destinationType;
        private String exportId;
        private String exportStatus;
        private String instrumentationKey;
        private String isUserEnabled;
        private String lastGapTime;
        private String lastSuccessTime;
        private String lastUserUpdate;
        private @Nullable String notificationQueueEnabled;
        private String permanentErrorReason;
        private @Nullable String recordTypes;
        private String resourceGroup;
        private String storageName;
        private String subscriptionId;
        public Builder() {}
        public Builder(GetExportConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.containerName = defaults.containerName;
    	      this.destinationAccountId = defaults.destinationAccountId;
    	      this.destinationStorageLocationId = defaults.destinationStorageLocationId;
    	      this.destinationStorageSubscriptionId = defaults.destinationStorageSubscriptionId;
    	      this.destinationType = defaults.destinationType;
    	      this.exportId = defaults.exportId;
    	      this.exportStatus = defaults.exportStatus;
    	      this.instrumentationKey = defaults.instrumentationKey;
    	      this.isUserEnabled = defaults.isUserEnabled;
    	      this.lastGapTime = defaults.lastGapTime;
    	      this.lastSuccessTime = defaults.lastSuccessTime;
    	      this.lastUserUpdate = defaults.lastUserUpdate;
    	      this.notificationQueueEnabled = defaults.notificationQueueEnabled;
    	      this.permanentErrorReason = defaults.permanentErrorReason;
    	      this.recordTypes = defaults.recordTypes;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageName = defaults.storageName;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        @CustomType.Setter
        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        @CustomType.Setter
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        @CustomType.Setter
        public Builder destinationAccountId(String destinationAccountId) {
            this.destinationAccountId = Objects.requireNonNull(destinationAccountId);
            return this;
        }
        @CustomType.Setter
        public Builder destinationStorageLocationId(String destinationStorageLocationId) {
            this.destinationStorageLocationId = Objects.requireNonNull(destinationStorageLocationId);
            return this;
        }
        @CustomType.Setter
        public Builder destinationStorageSubscriptionId(String destinationStorageSubscriptionId) {
            this.destinationStorageSubscriptionId = Objects.requireNonNull(destinationStorageSubscriptionId);
            return this;
        }
        @CustomType.Setter
        public Builder destinationType(String destinationType) {
            this.destinationType = Objects.requireNonNull(destinationType);
            return this;
        }
        @CustomType.Setter
        public Builder exportId(String exportId) {
            this.exportId = Objects.requireNonNull(exportId);
            return this;
        }
        @CustomType.Setter
        public Builder exportStatus(String exportStatus) {
            this.exportStatus = Objects.requireNonNull(exportStatus);
            return this;
        }
        @CustomType.Setter
        public Builder instrumentationKey(String instrumentationKey) {
            this.instrumentationKey = Objects.requireNonNull(instrumentationKey);
            return this;
        }
        @CustomType.Setter
        public Builder isUserEnabled(String isUserEnabled) {
            this.isUserEnabled = Objects.requireNonNull(isUserEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder lastGapTime(String lastGapTime) {
            this.lastGapTime = Objects.requireNonNull(lastGapTime);
            return this;
        }
        @CustomType.Setter
        public Builder lastSuccessTime(String lastSuccessTime) {
            this.lastSuccessTime = Objects.requireNonNull(lastSuccessTime);
            return this;
        }
        @CustomType.Setter
        public Builder lastUserUpdate(String lastUserUpdate) {
            this.lastUserUpdate = Objects.requireNonNull(lastUserUpdate);
            return this;
        }
        @CustomType.Setter
        public Builder notificationQueueEnabled(@Nullable String notificationQueueEnabled) {
            this.notificationQueueEnabled = notificationQueueEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder permanentErrorReason(String permanentErrorReason) {
            this.permanentErrorReason = Objects.requireNonNull(permanentErrorReason);
            return this;
        }
        @CustomType.Setter
        public Builder recordTypes(@Nullable String recordTypes) {
            this.recordTypes = recordTypes;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }
        @CustomType.Setter
        public Builder storageName(String storageName) {
            this.storageName = Objects.requireNonNull(storageName);
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public GetExportConfigurationResult build() {
            final var o = new GetExportConfigurationResult();
            o.applicationName = applicationName;
            o.containerName = containerName;
            o.destinationAccountId = destinationAccountId;
            o.destinationStorageLocationId = destinationStorageLocationId;
            o.destinationStorageSubscriptionId = destinationStorageSubscriptionId;
            o.destinationType = destinationType;
            o.exportId = exportId;
            o.exportStatus = exportStatus;
            o.instrumentationKey = instrumentationKey;
            o.isUserEnabled = isUserEnabled;
            o.lastGapTime = lastGapTime;
            o.lastSuccessTime = lastSuccessTime;
            o.lastUserUpdate = lastUserUpdate;
            o.notificationQueueEnabled = notificationQueueEnabled;
            o.permanentErrorReason = permanentErrorReason;
            o.recordTypes = recordTypes;
            o.resourceGroup = resourceGroup;
            o.storageName = storageName;
            o.subscriptionId = subscriptionId;
            return o;
        }
    }
}
