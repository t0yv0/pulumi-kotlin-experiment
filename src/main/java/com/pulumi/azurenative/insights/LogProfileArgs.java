// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.insights.inputs.RetentionPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogProfileArgs Empty = new LogProfileArgs();

    /**
     * the categories of the logs. These categories are created as is convenient to the user. Some values are: &#39;Write&#39;, &#39;Delete&#39;, and/or &#39;Action.&#39;
     * 
     */
    @Import(name="categories", required=true)
    private Output<List<String>> categories;

    /**
     * @return the categories of the logs. These categories are created as is convenient to the user. Some values are: &#39;Write&#39;, &#39;Delete&#39;, and/or &#39;Action.&#39;
     * 
     */
    public Output<List<String>> categories() {
        return this.categories;
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
     * List of regions for which Activity Log events should be stored or streamed. It is a comma separated list of valid ARM locations including the &#39;global&#39; location.
     * 
     */
    @Import(name="locations", required=true)
    private Output<List<String>> locations;

    /**
     * @return List of regions for which Activity Log events should be stored or streamed. It is a comma separated list of valid ARM locations including the &#39;global&#39; location.
     * 
     */
    public Output<List<String>> locations() {
        return this.locations;
    }

    /**
     * The name of the log profile.
     * 
     */
    @Import(name="logProfileName")
    private @Nullable Output<String> logProfileName;

    /**
     * @return The name of the log profile.
     * 
     */
    public Optional<Output<String>> logProfileName() {
        return Optional.ofNullable(this.logProfileName);
    }

    /**
     * the retention policy for the events in the log.
     * 
     */
    @Import(name="retentionPolicy", required=true)
    private Output<RetentionPolicyArgs> retentionPolicy;

    /**
     * @return the retention policy for the events in the log.
     * 
     */
    public Output<RetentionPolicyArgs> retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * The service bus rule ID of the service bus namespace in which you would like to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: &#39;{service bus resource ID}/authorizationrules/{key name}&#39;.
     * 
     */
    @Import(name="serviceBusRuleId")
    private @Nullable Output<String> serviceBusRuleId;

    /**
     * @return The service bus rule ID of the service bus namespace in which you would like to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: &#39;{service bus resource ID}/authorizationrules/{key name}&#39;.
     * 
     */
    public Optional<Output<String>> serviceBusRuleId() {
        return Optional.ofNullable(this.serviceBusRuleId);
    }

    /**
     * the resource id of the storage account to which you would like to send the Activity Log.
     * 
     */
    @Import(name="storageAccountId")
    private @Nullable Output<String> storageAccountId;

    /**
     * @return the resource id of the storage account to which you would like to send the Activity Log.
     * 
     */
    public Optional<Output<String>> storageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
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

    private LogProfileArgs() {}

    private LogProfileArgs(LogProfileArgs $) {
        this.categories = $.categories;
        this.location = $.location;
        this.locations = $.locations;
        this.logProfileName = $.logProfileName;
        this.retentionPolicy = $.retentionPolicy;
        this.serviceBusRuleId = $.serviceBusRuleId;
        this.storageAccountId = $.storageAccountId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogProfileArgs $;

        public Builder() {
            $ = new LogProfileArgs();
        }

        public Builder(LogProfileArgs defaults) {
            $ = new LogProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param categories the categories of the logs. These categories are created as is convenient to the user. Some values are: &#39;Write&#39;, &#39;Delete&#39;, and/or &#39;Action.&#39;
         * 
         * @return builder
         * 
         */
        public Builder categories(Output<List<String>> categories) {
            $.categories = categories;
            return this;
        }

        /**
         * @param categories the categories of the logs. These categories are created as is convenient to the user. Some values are: &#39;Write&#39;, &#39;Delete&#39;, and/or &#39;Action.&#39;
         * 
         * @return builder
         * 
         */
        public Builder categories(List<String> categories) {
            return categories(Output.of(categories));
        }

        /**
         * @param categories the categories of the logs. These categories are created as is convenient to the user. Some values are: &#39;Write&#39;, &#39;Delete&#39;, and/or &#39;Action.&#39;
         * 
         * @return builder
         * 
         */
        public Builder categories(String... categories) {
            return categories(List.of(categories));
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
         * @param locations List of regions for which Activity Log events should be stored or streamed. It is a comma separated list of valid ARM locations including the &#39;global&#39; location.
         * 
         * @return builder
         * 
         */
        public Builder locations(Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        /**
         * @param locations List of regions for which Activity Log events should be stored or streamed. It is a comma separated list of valid ARM locations including the &#39;global&#39; location.
         * 
         * @return builder
         * 
         */
        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        /**
         * @param locations List of regions for which Activity Log events should be stored or streamed. It is a comma separated list of valid ARM locations including the &#39;global&#39; location.
         * 
         * @return builder
         * 
         */
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        /**
         * @param logProfileName The name of the log profile.
         * 
         * @return builder
         * 
         */
        public Builder logProfileName(@Nullable Output<String> logProfileName) {
            $.logProfileName = logProfileName;
            return this;
        }

        /**
         * @param logProfileName The name of the log profile.
         * 
         * @return builder
         * 
         */
        public Builder logProfileName(String logProfileName) {
            return logProfileName(Output.of(logProfileName));
        }

        /**
         * @param retentionPolicy the retention policy for the events in the log.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(Output<RetentionPolicyArgs> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy the retention policy for the events in the log.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(RetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        /**
         * @param serviceBusRuleId The service bus rule ID of the service bus namespace in which you would like to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: &#39;{service bus resource ID}/authorizationrules/{key name}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusRuleId(@Nullable Output<String> serviceBusRuleId) {
            $.serviceBusRuleId = serviceBusRuleId;
            return this;
        }

        /**
         * @param serviceBusRuleId The service bus rule ID of the service bus namespace in which you would like to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: &#39;{service bus resource ID}/authorizationrules/{key name}&#39;.
         * 
         * @return builder
         * 
         */
        public Builder serviceBusRuleId(String serviceBusRuleId) {
            return serviceBusRuleId(Output.of(serviceBusRuleId));
        }

        /**
         * @param storageAccountId the resource id of the storage account to which you would like to send the Activity Log.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            $.storageAccountId = storageAccountId;
            return this;
        }

        /**
         * @param storageAccountId the resource id of the storage account to which you would like to send the Activity Log.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountId(String storageAccountId) {
            return storageAccountId(Output.of(storageAccountId));
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

        public LogProfileArgs build() {
            $.categories = Objects.requireNonNull($.categories, "expected parameter 'categories' to be non-null");
            $.locations = Objects.requireNonNull($.locations, "expected parameter 'locations' to be non-null");
            $.retentionPolicy = Objects.requireNonNull($.retentionPolicy, "expected parameter 'retentionPolicy' to be non-null");
            return $;
        }
    }

}
