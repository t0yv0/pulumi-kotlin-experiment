// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBlobServicePropertiesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBlobServicePropertiesArgs Empty = new GetBlobServicePropertiesArgs();

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
     * The name of the blob Service within the specified storage account. Blob Service Name must be &#39;default&#39;
     * 
     */
    @Import(name="blobServicesName", required=true)
    private Output<String> blobServicesName;

    /**
     * @return The name of the blob Service within the specified storage account. Blob Service Name must be &#39;default&#39;
     * 
     */
    public Output<String> blobServicesName() {
        return this.blobServicesName;
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

    private GetBlobServicePropertiesArgs() {}

    private GetBlobServicePropertiesArgs(GetBlobServicePropertiesArgs $) {
        this.accountName = $.accountName;
        this.blobServicesName = $.blobServicesName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBlobServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBlobServicePropertiesArgs $;

        public Builder() {
            $ = new GetBlobServicePropertiesArgs();
        }

        public Builder(GetBlobServicePropertiesArgs defaults) {
            $ = new GetBlobServicePropertiesArgs(Objects.requireNonNull(defaults));
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
         * @param blobServicesName The name of the blob Service within the specified storage account. Blob Service Name must be &#39;default&#39;
         * 
         * @return builder
         * 
         */
        public Builder blobServicesName(Output<String> blobServicesName) {
            $.blobServicesName = blobServicesName;
            return this;
        }

        /**
         * @param blobServicesName The name of the blob Service within the specified storage account. Blob Service Name must be &#39;default&#39;
         * 
         * @return builder
         * 
         */
        public Builder blobServicesName(String blobServicesName) {
            return blobServicesName(Output.of(blobServicesName));
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

        public GetBlobServicePropertiesArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.blobServicesName = Objects.requireNonNull($.blobServicesName, "expected parameter 'blobServicesName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
