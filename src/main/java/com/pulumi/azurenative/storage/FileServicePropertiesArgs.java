// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.storage.inputs.CorsRulesArgs;
import com.pulumi.azurenative.storage.inputs.DeleteRetentionPolicyArgs;
import com.pulumi.azurenative.storage.inputs.ProtocolSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileServicePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileServicePropertiesArgs Empty = new FileServicePropertiesArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
     */
    @Import(name="cors")
    private @Nullable Output<CorsRulesArgs> cors;

    /**
     * @return Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
     */
    public Optional<Output<CorsRulesArgs>> cors() {
        return Optional.ofNullable(this.cors);
    }

    /**
     * The name of the file Service within the specified storage account. File Service Name must be &#34;default&#34;
     * 
     */
    @Import(name="fileServicesName")
    private @Nullable Output<String> fileServicesName;

    /**
     * @return The name of the file Service within the specified storage account. File Service Name must be &#34;default&#34;
     * 
     */
    public Optional<Output<String>> fileServicesName() {
        return Optional.ofNullable(this.fileServicesName);
    }

    /**
     * Protocol settings for file service
     * 
     */
    @Import(name="protocolSettings")
    private @Nullable Output<ProtocolSettingsArgs> protocolSettings;

    /**
     * @return Protocol settings for file service
     * 
     */
    public Optional<Output<ProtocolSettingsArgs>> protocolSettings() {
        return Optional.ofNullable(this.protocolSettings);
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The file service properties for share soft delete.
     * 
     */
    @Import(name="shareDeleteRetentionPolicy")
    private @Nullable Output<DeleteRetentionPolicyArgs> shareDeleteRetentionPolicy;

    /**
     * @return The file service properties for share soft delete.
     * 
     */
    public Optional<Output<DeleteRetentionPolicyArgs>> shareDeleteRetentionPolicy() {
        return Optional.ofNullable(this.shareDeleteRetentionPolicy);
    }

    private FileServicePropertiesArgs() {}

    private FileServicePropertiesArgs(FileServicePropertiesArgs $) {
        this.accountName = $.accountName;
        this.cors = $.cors;
        this.fileServicesName = $.fileServicesName;
        this.protocolSettings = $.protocolSettings;
        this.resourceGroupName = $.resourceGroupName;
        this.shareDeleteRetentionPolicy = $.shareDeleteRetentionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileServicePropertiesArgs $;

        public Builder() {
            $ = new FileServicePropertiesArgs();
        }

        public Builder(FileServicePropertiesArgs defaults) {
            $ = new FileServicePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param cors Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
         * 
         * @return builder
         * 
         */
        public Builder cors(@Nullable Output<CorsRulesArgs> cors) {
            $.cors = cors;
            return this;
        }

        /**
         * @param cors Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
         * 
         * @return builder
         * 
         */
        public Builder cors(CorsRulesArgs cors) {
            return cors(Output.of(cors));
        }

        /**
         * @param fileServicesName The name of the file Service within the specified storage account. File Service Name must be &#34;default&#34;
         * 
         * @return builder
         * 
         */
        public Builder fileServicesName(@Nullable Output<String> fileServicesName) {
            $.fileServicesName = fileServicesName;
            return this;
        }

        /**
         * @param fileServicesName The name of the file Service within the specified storage account. File Service Name must be &#34;default&#34;
         * 
         * @return builder
         * 
         */
        public Builder fileServicesName(String fileServicesName) {
            return fileServicesName(Output.of(fileServicesName));
        }

        /**
         * @param protocolSettings Protocol settings for file service
         * 
         * @return builder
         * 
         */
        public Builder protocolSettings(@Nullable Output<ProtocolSettingsArgs> protocolSettings) {
            $.protocolSettings = protocolSettings;
            return this;
        }

        /**
         * @param protocolSettings Protocol settings for file service
         * 
         * @return builder
         * 
         */
        public Builder protocolSettings(ProtocolSettingsArgs protocolSettings) {
            return protocolSettings(Output.of(protocolSettings));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param shareDeleteRetentionPolicy The file service properties for share soft delete.
         * 
         * @return builder
         * 
         */
        public Builder shareDeleteRetentionPolicy(@Nullable Output<DeleteRetentionPolicyArgs> shareDeleteRetentionPolicy) {
            $.shareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
            return this;
        }

        /**
         * @param shareDeleteRetentionPolicy The file service properties for share soft delete.
         * 
         * @return builder
         * 
         */
        public Builder shareDeleteRetentionPolicy(DeleteRetentionPolicyArgs shareDeleteRetentionPolicy) {
            return shareDeleteRetentionPolicy(Output.of(shareDeleteRetentionPolicy));
        }

        public FileServicePropertiesArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
