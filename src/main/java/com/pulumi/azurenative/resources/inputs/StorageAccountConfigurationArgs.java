// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings to use an existing storage account. Valid storage account kinds are: Storage, StorageV2 and FileStorage
 * 
 */
public final class StorageAccountConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageAccountConfigurationArgs Empty = new StorageAccountConfigurationArgs();

    /**
     * The storage account access key.
     * 
     */
    @Import(name="storageAccountKey")
    private @Nullable Output<String> storageAccountKey;

    /**
     * @return The storage account access key.
     * 
     */
    public Optional<Output<String>> storageAccountKey() {
        return Optional.ofNullable(this.storageAccountKey);
    }

    /**
     * The storage account name.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    /**
     * @return The storage account name.
     * 
     */
    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    private StorageAccountConfigurationArgs() {}

    private StorageAccountConfigurationArgs(StorageAccountConfigurationArgs $) {
        this.storageAccountKey = $.storageAccountKey;
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageAccountConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageAccountConfigurationArgs $;

        public Builder() {
            $ = new StorageAccountConfigurationArgs();
        }

        public Builder(StorageAccountConfigurationArgs defaults) {
            $ = new StorageAccountConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param storageAccountKey The storage account access key.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(@Nullable Output<String> storageAccountKey) {
            $.storageAccountKey = storageAccountKey;
            return this;
        }

        /**
         * @param storageAccountKey The storage account access key.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountKey(String storageAccountKey) {
            return storageAccountKey(Output.of(storageAccountKey));
        }

        /**
         * @param storageAccountName The storage account name.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The storage account name.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public StorageAccountConfigurationArgs build() {
            return $;
        }
    }

}