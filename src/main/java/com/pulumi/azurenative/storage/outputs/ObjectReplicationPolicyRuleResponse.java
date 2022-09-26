// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.ObjectReplicationPolicyFilterResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectReplicationPolicyRuleResponse {
    /**
     * @return Required. Destination container name.
     * 
     */
    private String destinationContainer;
    /**
     * @return Optional. An object that defines the filter set.
     * 
     */
    private @Nullable ObjectReplicationPolicyFilterResponse filters;
    /**
     * @return Rule Id is auto-generated for each new rule on destination account. It is required for put policy on source account.
     * 
     */
    private @Nullable String ruleId;
    /**
     * @return Required. Source container name.
     * 
     */
    private String sourceContainer;

    private ObjectReplicationPolicyRuleResponse() {}
    /**
     * @return Required. Destination container name.
     * 
     */
    public String destinationContainer() {
        return this.destinationContainer;
    }
    /**
     * @return Optional. An object that defines the filter set.
     * 
     */
    public Optional<ObjectReplicationPolicyFilterResponse> filters() {
        return Optional.ofNullable(this.filters);
    }
    /**
     * @return Rule Id is auto-generated for each new rule on destination account. It is required for put policy on source account.
     * 
     */
    public Optional<String> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }
    /**
     * @return Required. Source container name.
     * 
     */
    public String sourceContainer() {
        return this.sourceContainer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectReplicationPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destinationContainer;
        private @Nullable ObjectReplicationPolicyFilterResponse filters;
        private @Nullable String ruleId;
        private String sourceContainer;
        public Builder() {}
        public Builder(ObjectReplicationPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationContainer = defaults.destinationContainer;
    	      this.filters = defaults.filters;
    	      this.ruleId = defaults.ruleId;
    	      this.sourceContainer = defaults.sourceContainer;
        }

        @CustomType.Setter
        public Builder destinationContainer(String destinationContainer) {
            this.destinationContainer = Objects.requireNonNull(destinationContainer);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable ObjectReplicationPolicyFilterResponse filters) {
            this.filters = filters;
            return this;
        }
        @CustomType.Setter
        public Builder ruleId(@Nullable String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceContainer(String sourceContainer) {
            this.sourceContainer = Objects.requireNonNull(sourceContainer);
            return this;
        }
        public ObjectReplicationPolicyRuleResponse build() {
            final var o = new ObjectReplicationPolicyRuleResponse();
            o.destinationContainer = destinationContainer;
            o.filters = filters;
            o.ruleId = ruleId;
            o.sourceContainer = sourceContainer;
            return o;
        }
    }
}