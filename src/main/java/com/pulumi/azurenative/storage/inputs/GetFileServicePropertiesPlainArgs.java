// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFileServicePropertiesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFileServicePropertiesPlainArgs Empty = new GetFileServicePropertiesPlainArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the file Service within the specified storage account. File Service Name must be &#34;default&#34;
     * 
     */
    @Import(name="fileServicesName", required=true)
    private String fileServicesName;

    /**
     * @return The name of the file Service within the specified storage account. File Service Name must be &#34;default&#34;
     * 
     */
    public String fileServicesName() {
        return this.fileServicesName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFileServicePropertiesPlainArgs() {}

    private GetFileServicePropertiesPlainArgs(GetFileServicePropertiesPlainArgs $) {
        this.accountName = $.accountName;
        this.fileServicesName = $.fileServicesName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFileServicePropertiesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFileServicePropertiesPlainArgs $;

        public Builder() {
            $ = new GetFileServicePropertiesPlainArgs();
        }

        public Builder(GetFileServicePropertiesPlainArgs defaults) {
            $ = new GetFileServicePropertiesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param fileServicesName The name of the file Service within the specified storage account. File Service Name must be &#34;default&#34;
         * 
         * @return builder
         * 
         */
        public Builder fileServicesName(String fileServicesName) {
            $.fileServicesName = fileServicesName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetFileServicePropertiesPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.fileServicesName = Objects.requireNonNull($.fileServicesName, "expected parameter 'fileServicesName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
