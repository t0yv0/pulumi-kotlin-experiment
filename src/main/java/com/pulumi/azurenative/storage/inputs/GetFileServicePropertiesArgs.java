// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFileServicePropertiesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFileServicePropertiesArgs Empty = new GetFileServicePropertiesArgs();

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
     * The name of the file Service within the specified storage account. File Service Name must be &#34;default&#34;
     * 
     */
    @Import(name="fileServicesName", required=true)
    private Output<String> fileServicesName;

    /**
     * @return The name of the file Service within the specified storage account. File Service Name must be &#34;default&#34;
     * 
     */
    public Output<String> fileServicesName() {
        return this.fileServicesName;
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

    private GetFileServicePropertiesArgs() {}

    private GetFileServicePropertiesArgs(GetFileServicePropertiesArgs $) {
        this.accountName = $.accountName;
        this.fileServicesName = $.fileServicesName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFileServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFileServicePropertiesArgs $;

        public Builder() {
            $ = new GetFileServicePropertiesArgs();
        }

        public Builder(GetFileServicePropertiesArgs defaults) {
            $ = new GetFileServicePropertiesArgs(Objects.requireNonNull(defaults));
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
         * @param fileServicesName The name of the file Service within the specified storage account. File Service Name must be &#34;default&#34;
         * 
         * @return builder
         * 
         */
        public Builder fileServicesName(Output<String> fileServicesName) {
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

        public GetFileServicePropertiesArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.fileServicesName = Objects.requireNonNull($.fileServicesName, "expected parameter 'fileServicesName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}