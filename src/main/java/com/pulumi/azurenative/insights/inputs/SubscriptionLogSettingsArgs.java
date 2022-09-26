// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Part of Subscription diagnostic setting. Specifies the settings for a particular log.
 * 
 */
public final class SubscriptionLogSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionLogSettingsArgs Empty = new SubscriptionLogSettingsArgs();

    /**
     * Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * a value indicating whether this log is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return a value indicating whether this log is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private SubscriptionLogSettingsArgs() {}

    private SubscriptionLogSettingsArgs(SubscriptionLogSettingsArgs $) {
        this.category = $.category;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionLogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionLogSettingsArgs $;

        public Builder() {
            $ = new SubscriptionLogSettingsArgs();
        }

        public Builder(SubscriptionLogSettingsArgs defaults) {
            $ = new SubscriptionLogSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param enabled a value indicating whether this log is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled a value indicating whether this log is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public SubscriptionLogSettingsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}