// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetObjectReplicationPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetObjectReplicationPolicyPlainArgs Empty = new GetObjectReplicationPolicyPlainArgs();

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
     * The ID of object replication policy or &#39;default&#39; if the policy ID is unknown.
     * 
     */
    @Import(name="objectReplicationPolicyId", required=true)
    private String objectReplicationPolicyId;

    /**
     * @return The ID of object replication policy or &#39;default&#39; if the policy ID is unknown.
     * 
     */
    public String objectReplicationPolicyId() {
        return this.objectReplicationPolicyId;
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

    private GetObjectReplicationPolicyPlainArgs() {}

    private GetObjectReplicationPolicyPlainArgs(GetObjectReplicationPolicyPlainArgs $) {
        this.accountName = $.accountName;
        this.objectReplicationPolicyId = $.objectReplicationPolicyId;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetObjectReplicationPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetObjectReplicationPolicyPlainArgs $;

        public Builder() {
            $ = new GetObjectReplicationPolicyPlainArgs();
        }

        public Builder(GetObjectReplicationPolicyPlainArgs defaults) {
            $ = new GetObjectReplicationPolicyPlainArgs(Objects.requireNonNull(defaults));
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
         * @param objectReplicationPolicyId The ID of object replication policy or &#39;default&#39; if the policy ID is unknown.
         * 
         * @return builder
         * 
         */
        public Builder objectReplicationPolicyId(String objectReplicationPolicyId) {
            $.objectReplicationPolicyId = objectReplicationPolicyId;
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

        public GetObjectReplicationPolicyPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.objectReplicationPolicyId = Objects.requireNonNull($.objectReplicationPolicyId, "expected parameter 'objectReplicationPolicyId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
