// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.ManagementPolicyRuleResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ManagementPolicySchemaResponse {
    /**
     * @return The Storage Account ManagementPolicies Rules. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     */
    private List<ManagementPolicyRuleResponse> rules;

    private ManagementPolicySchemaResponse() {}
    /**
     * @return The Storage Account ManagementPolicies Rules. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     * 
     */
    public List<ManagementPolicyRuleResponse> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicySchemaResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<ManagementPolicyRuleResponse> rules;
        public Builder() {}
        public Builder(ManagementPolicySchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder rules(List<ManagementPolicyRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(ManagementPolicyRuleResponse... rules) {
            return rules(List.of(rules));
        }
        public ManagementPolicySchemaResponse build() {
            final var o = new ManagementPolicySchemaResponse();
            o.rules = rules;
            return o;
        }
    }
}
