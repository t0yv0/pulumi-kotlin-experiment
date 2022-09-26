// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption identity for the storage account.
 * 
 */
public final class EncryptionIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionIdentityArgs Empty = new EncryptionIdentityArgs();

    /**
     * Resource identifier of the UserAssigned identity to be associated with server-side encryption on the storage account.
     * 
     */
    @Import(name="encryptionUserAssignedIdentity")
    private @Nullable Output<String> encryptionUserAssignedIdentity;

    /**
     * @return Resource identifier of the UserAssigned identity to be associated with server-side encryption on the storage account.
     * 
     */
    public Optional<Output<String>> encryptionUserAssignedIdentity() {
        return Optional.ofNullable(this.encryptionUserAssignedIdentity);
    }

    private EncryptionIdentityArgs() {}

    private EncryptionIdentityArgs(EncryptionIdentityArgs $) {
        this.encryptionUserAssignedIdentity = $.encryptionUserAssignedIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionIdentityArgs $;

        public Builder() {
            $ = new EncryptionIdentityArgs();
        }

        public Builder(EncryptionIdentityArgs defaults) {
            $ = new EncryptionIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionUserAssignedIdentity Resource identifier of the UserAssigned identity to be associated with server-side encryption on the storage account.
         * 
         * @return builder
         * 
         */
        public Builder encryptionUserAssignedIdentity(@Nullable Output<String> encryptionUserAssignedIdentity) {
            $.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
            return this;
        }

        /**
         * @param encryptionUserAssignedIdentity Resource identifier of the UserAssigned identity to be associated with server-side encryption on the storage account.
         * 
         * @return builder
         * 
         */
        public Builder encryptionUserAssignedIdentity(String encryptionUserAssignedIdentity) {
            return encryptionUserAssignedIdentity(Output.of(encryptionUserAssignedIdentity));
        }

        public EncryptionIdentityArgs build() {
            return $;
        }
    }

}