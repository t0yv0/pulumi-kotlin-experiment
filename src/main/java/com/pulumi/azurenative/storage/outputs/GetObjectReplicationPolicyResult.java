// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.ObjectReplicationPolicyRuleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetObjectReplicationPolicyResult {
    /**
     * @return Required. Destination account name.
     * 
     */
    private String destinationAccount;
    /**
     * @return Indicates when the policy is enabled on the source account.
     * 
     */
    private String enabledTime;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private String id;
    /**
     * @return The name of the resource
     * 
     */
    private String name;
    /**
     * @return A unique id for object replication policy.
     * 
     */
    private String policyId;
    /**
     * @return The storage account object replication rules.
     * 
     */
    private @Nullable List<ObjectReplicationPolicyRuleResponse> rules;
    /**
     * @return Required. Source account name.
     * 
     */
    private String sourceAccount;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private String type;

    private GetObjectReplicationPolicyResult() {}
    /**
     * @return Required. Destination account name.
     * 
     */
    public String destinationAccount() {
        return this.destinationAccount;
    }
    /**
     * @return Indicates when the policy is enabled on the source account.
     * 
     */
    public String enabledTime() {
        return this.enabledTime;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A unique id for object replication policy.
     * 
     */
    public String policyId() {
        return this.policyId;
    }
    /**
     * @return The storage account object replication rules.
     * 
     */
    public List<ObjectReplicationPolicyRuleResponse> rules() {
        return this.rules == null ? List.of() : this.rules;
    }
    /**
     * @return Required. Source account name.
     * 
     */
    public String sourceAccount() {
        return this.sourceAccount;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectReplicationPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destinationAccount;
        private String enabledTime;
        private String id;
        private String name;
        private String policyId;
        private @Nullable List<ObjectReplicationPolicyRuleResponse> rules;
        private String sourceAccount;
        private String type;
        public Builder() {}
        public Builder(GetObjectReplicationPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationAccount = defaults.destinationAccount;
    	      this.enabledTime = defaults.enabledTime;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.policyId = defaults.policyId;
    	      this.rules = defaults.rules;
    	      this.sourceAccount = defaults.sourceAccount;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder destinationAccount(String destinationAccount) {
            this.destinationAccount = Objects.requireNonNull(destinationAccount);
            return this;
        }
        @CustomType.Setter
        public Builder enabledTime(String enabledTime) {
            this.enabledTime = Objects.requireNonNull(enabledTime);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder policyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<ObjectReplicationPolicyRuleResponse> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(ObjectReplicationPolicyRuleResponse... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder sourceAccount(String sourceAccount) {
            this.sourceAccount = Objects.requireNonNull(sourceAccount);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetObjectReplicationPolicyResult build() {
            final var o = new GetObjectReplicationPolicyResult();
            o.destinationAccount = destinationAccount;
            o.enabledTime = enabledTime;
            o.id = id;
            o.name = name;
            o.policyId = policyId;
            o.rules = rules;
            o.sourceAccount = sourceAccount;
            o.type = type;
            return o;
        }
    }
}
