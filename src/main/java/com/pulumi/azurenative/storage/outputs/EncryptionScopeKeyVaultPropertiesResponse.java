// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionScopeKeyVaultPropertiesResponse {
    /**
     * @return The object identifier of the current versioned Key Vault Key in use.
     * 
     */
    private String currentVersionedKeyIdentifier;
    /**
     * @return The object identifier for a key vault key object. When applied, the encryption scope will use the key referenced by the identifier to enable customer-managed key support on this encryption scope.
     * 
     */
    private @Nullable String keyUri;
    /**
     * @return Timestamp of last rotation of the Key Vault Key.
     * 
     */
    private String lastKeyRotationTimestamp;

    private EncryptionScopeKeyVaultPropertiesResponse() {}
    /**
     * @return The object identifier of the current versioned Key Vault Key in use.
     * 
     */
    public String currentVersionedKeyIdentifier() {
        return this.currentVersionedKeyIdentifier;
    }
    /**
     * @return The object identifier for a key vault key object. When applied, the encryption scope will use the key referenced by the identifier to enable customer-managed key support on this encryption scope.
     * 
     */
    public Optional<String> keyUri() {
        return Optional.ofNullable(this.keyUri);
    }
    /**
     * @return Timestamp of last rotation of the Key Vault Key.
     * 
     */
    public String lastKeyRotationTimestamp() {
        return this.lastKeyRotationTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionScopeKeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String currentVersionedKeyIdentifier;
        private @Nullable String keyUri;
        private String lastKeyRotationTimestamp;
        public Builder() {}
        public Builder(EncryptionScopeKeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentVersionedKeyIdentifier = defaults.currentVersionedKeyIdentifier;
    	      this.keyUri = defaults.keyUri;
    	      this.lastKeyRotationTimestamp = defaults.lastKeyRotationTimestamp;
        }

        @CustomType.Setter
        public Builder currentVersionedKeyIdentifier(String currentVersionedKeyIdentifier) {
            this.currentVersionedKeyIdentifier = Objects.requireNonNull(currentVersionedKeyIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder keyUri(@Nullable String keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        @CustomType.Setter
        public Builder lastKeyRotationTimestamp(String lastKeyRotationTimestamp) {
            this.lastKeyRotationTimestamp = Objects.requireNonNull(lastKeyRotationTimestamp);
            return this;
        }
        public EncryptionScopeKeyVaultPropertiesResponse build() {
            final var o = new EncryptionScopeKeyVaultPropertiesResponse();
            o.currentVersionedKeyIdentifier = currentVersionedKeyIdentifier;
            o.keyUri = keyUri;
            o.lastKeyRotationTimestamp = lastKeyRotationTimestamp;
            return o;
        }
    }
}
