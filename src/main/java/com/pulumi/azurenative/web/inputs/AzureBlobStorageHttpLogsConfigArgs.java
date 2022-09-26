// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Http logs to azure blob storage configuration.
 * 
 */
public final class AzureBlobStorageHttpLogsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureBlobStorageHttpLogsConfigArgs Empty = new AzureBlobStorageHttpLogsConfigArgs();

    /**
     * True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return True if configuration is enabled, false if it is disabled and null if configuration is not set.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Retention in days.
     * Remove blobs older than X days.
     * 0 or lower means no retention.
     * 
     */
    @Import(name="retentionInDays")
    private @Nullable Output<Integer> retentionInDays;

    /**
     * @return Retention in days.
     * Remove blobs older than X days.
     * 0 or lower means no retention.
     * 
     */
    public Optional<Output<Integer>> retentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }

    /**
     * SAS url to a azure blob container with read/write/list/delete permissions.
     * 
     */
    @Import(name="sasUrl")
    private @Nullable Output<String> sasUrl;

    /**
     * @return SAS url to a azure blob container with read/write/list/delete permissions.
     * 
     */
    public Optional<Output<String>> sasUrl() {
        return Optional.ofNullable(this.sasUrl);
    }

    private AzureBlobStorageHttpLogsConfigArgs() {}

    private AzureBlobStorageHttpLogsConfigArgs(AzureBlobStorageHttpLogsConfigArgs $) {
        this.enabled = $.enabled;
        this.retentionInDays = $.retentionInDays;
        this.sasUrl = $.sasUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBlobStorageHttpLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBlobStorageHttpLogsConfigArgs $;

        public Builder() {
            $ = new AzureBlobStorageHttpLogsConfigArgs();
        }

        public Builder(AzureBlobStorageHttpLogsConfigArgs defaults) {
            $ = new AzureBlobStorageHttpLogsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled True if configuration is enabled, false if it is disabled and null if configuration is not set.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled True if configuration is enabled, false if it is disabled and null if configuration is not set.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param retentionInDays Retention in days.
         * Remove blobs older than X days.
         * 0 or lower means no retention.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(@Nullable Output<Integer> retentionInDays) {
            $.retentionInDays = retentionInDays;
            return this;
        }

        /**
         * @param retentionInDays Retention in days.
         * Remove blobs older than X days.
         * 0 or lower means no retention.
         * 
         * @return builder
         * 
         */
        public Builder retentionInDays(Integer retentionInDays) {
            return retentionInDays(Output.of(retentionInDays));
        }

        /**
         * @param sasUrl SAS url to a azure blob container with read/write/list/delete permissions.
         * 
         * @return builder
         * 
         */
        public Builder sasUrl(@Nullable Output<String> sasUrl) {
            $.sasUrl = sasUrl;
            return this;
        }

        /**
         * @param sasUrl SAS url to a azure blob container with read/write/list/delete permissions.
         * 
         * @return builder
         * 
         */
        public Builder sasUrl(String sasUrl) {
            return sasUrl(Output.of(sasUrl));
        }

        public AzureBlobStorageHttpLogsConfigArgs build() {
            return $;
        }
    }

}
