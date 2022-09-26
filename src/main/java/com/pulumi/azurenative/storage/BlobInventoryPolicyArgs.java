// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.storage.inputs.BlobInventoryPolicySchemaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BlobInventoryPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobInventoryPolicyArgs Empty = new BlobInventoryPolicyArgs();

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
     * The name of the storage account blob inventory policy. It should always be &#39;default&#39;
     * 
     */
    @Import(name="blobInventoryPolicyName")
    private @Nullable Output<String> blobInventoryPolicyName;

    /**
     * @return The name of the storage account blob inventory policy. It should always be &#39;default&#39;
     * 
     */
    public Optional<Output<String>> blobInventoryPolicyName() {
        return Optional.ofNullable(this.blobInventoryPolicyName);
    }

    /**
     * The storage account blob inventory policy object. It is composed of policy rules.
     * 
     */
    @Import(name="policy", required=true)
    private Output<BlobInventoryPolicySchemaArgs> policy;

    /**
     * @return The storage account blob inventory policy object. It is composed of policy rules.
     * 
     */
    public Output<BlobInventoryPolicySchemaArgs> policy() {
        return this.policy;
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

    private BlobInventoryPolicyArgs() {}

    private BlobInventoryPolicyArgs(BlobInventoryPolicyArgs $) {
        this.accountName = $.accountName;
        this.blobInventoryPolicyName = $.blobInventoryPolicyName;
        this.policy = $.policy;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobInventoryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobInventoryPolicyArgs $;

        public Builder() {
            $ = new BlobInventoryPolicyArgs();
        }

        public Builder(BlobInventoryPolicyArgs defaults) {
            $ = new BlobInventoryPolicyArgs(Objects.requireNonNull(defaults));
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
         * @param blobInventoryPolicyName The name of the storage account blob inventory policy. It should always be &#39;default&#39;
         * 
         * @return builder
         * 
         */
        public Builder blobInventoryPolicyName(@Nullable Output<String> blobInventoryPolicyName) {
            $.blobInventoryPolicyName = blobInventoryPolicyName;
            return this;
        }

        /**
         * @param blobInventoryPolicyName The name of the storage account blob inventory policy. It should always be &#39;default&#39;
         * 
         * @return builder
         * 
         */
        public Builder blobInventoryPolicyName(String blobInventoryPolicyName) {
            return blobInventoryPolicyName(Output.of(blobInventoryPolicyName));
        }

        /**
         * @param policy The storage account blob inventory policy object. It is composed of policy rules.
         * 
         * @return builder
         * 
         */
        public Builder policy(Output<BlobInventoryPolicySchemaArgs> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The storage account blob inventory policy object. It is composed of policy rules.
         * 
         * @return builder
         * 
         */
        public Builder policy(BlobInventoryPolicySchemaArgs policy) {
            return policy(Output.of(policy));
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

        public BlobInventoryPolicyArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}