// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ManagedServiceIdentityResponseUserAssignedIdentities;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedServiceIdentityResponse {
    /**
     * @return Principal Id of managed service identity.
     * 
     */
    private String principalId;
    /**
     * @return Tenant of managed service identity.
     * 
     */
    private String tenantId;
    /**
     * @return Type of managed service identity.
     * 
     */
    private @Nullable String type;
    /**
     * @return The list of user assigned identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}
     * 
     */
    private @Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    private ManagedServiceIdentityResponse() {}
    /**
     * @return Principal Id of managed service identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return Tenant of managed service identity.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return Type of managed service identity.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The list of user assigned identities associated with the resource. The user identity dictionary key references will be ARM resource ids in the form: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}
     * 
     */
    public Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities;
        public Builder() {}
        public Builder(ManagedServiceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        @CustomType.Setter
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder userAssignedIdentities(@Nullable Map<String,ManagedServiceIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public ManagedServiceIdentityResponse build() {
            final var o = new ManagedServiceIdentityResponse();
            o.principalId = principalId;
            o.tenantId = tenantId;
            o.type = type;
            o.userAssignedIdentities = userAssignedIdentities;
            return o;
        }
    }
}
