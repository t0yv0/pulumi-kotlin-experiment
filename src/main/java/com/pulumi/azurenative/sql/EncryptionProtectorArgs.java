// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.ServerKeyType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionProtectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionProtectorArgs Empty = new EncryptionProtectorArgs();

    /**
     * Key auto rotation opt-in flag. Either true or false.
     * 
     */
    @Import(name="autoRotationEnabled")
    private @Nullable Output<Boolean> autoRotationEnabled;

    /**
     * @return Key auto rotation opt-in flag. Either true or false.
     * 
     */
    public Optional<Output<Boolean>> autoRotationEnabled() {
        return Optional.ofNullable(this.autoRotationEnabled);
    }

    /**
     * The name of the encryption protector to be updated.
     * 
     */
    @Import(name="encryptionProtectorName")
    private @Nullable Output<String> encryptionProtectorName;

    /**
     * @return The name of the encryption protector to be updated.
     * 
     */
    public Optional<Output<String>> encryptionProtectorName() {
        return Optional.ofNullable(this.encryptionProtectorName);
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server key.
     * 
     */
    @Import(name="serverKeyName")
    private @Nullable Output<String> serverKeyName;

    /**
     * @return The name of the server key.
     * 
     */
    public Optional<Output<String>> serverKeyName() {
        return Optional.ofNullable(this.serverKeyName);
    }

    /**
     * The encryption protector type like &#39;ServiceManaged&#39;, &#39;AzureKeyVault&#39;.
     * 
     */
    @Import(name="serverKeyType", required=true)
    private Output<Either<String,ServerKeyType>> serverKeyType;

    /**
     * @return The encryption protector type like &#39;ServiceManaged&#39;, &#39;AzureKeyVault&#39;.
     * 
     */
    public Output<Either<String,ServerKeyType>> serverKeyType() {
        return this.serverKeyType;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    private EncryptionProtectorArgs() {}

    private EncryptionProtectorArgs(EncryptionProtectorArgs $) {
        this.autoRotationEnabled = $.autoRotationEnabled;
        this.encryptionProtectorName = $.encryptionProtectorName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverKeyName = $.serverKeyName;
        this.serverKeyType = $.serverKeyType;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionProtectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionProtectorArgs $;

        public Builder() {
            $ = new EncryptionProtectorArgs();
        }

        public Builder(EncryptionProtectorArgs defaults) {
            $ = new EncryptionProtectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRotationEnabled Key auto rotation opt-in flag. Either true or false.
         * 
         * @return builder
         * 
         */
        public Builder autoRotationEnabled(@Nullable Output<Boolean> autoRotationEnabled) {
            $.autoRotationEnabled = autoRotationEnabled;
            return this;
        }

        /**
         * @param autoRotationEnabled Key auto rotation opt-in flag. Either true or false.
         * 
         * @return builder
         * 
         */
        public Builder autoRotationEnabled(Boolean autoRotationEnabled) {
            return autoRotationEnabled(Output.of(autoRotationEnabled));
        }

        /**
         * @param encryptionProtectorName The name of the encryption protector to be updated.
         * 
         * @return builder
         * 
         */
        public Builder encryptionProtectorName(@Nullable Output<String> encryptionProtectorName) {
            $.encryptionProtectorName = encryptionProtectorName;
            return this;
        }

        /**
         * @param encryptionProtectorName The name of the encryption protector to be updated.
         * 
         * @return builder
         * 
         */
        public Builder encryptionProtectorName(String encryptionProtectorName) {
            return encryptionProtectorName(Output.of(encryptionProtectorName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverKeyName The name of the server key.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyName(@Nullable Output<String> serverKeyName) {
            $.serverKeyName = serverKeyName;
            return this;
        }

        /**
         * @param serverKeyName The name of the server key.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyName(String serverKeyName) {
            return serverKeyName(Output.of(serverKeyName));
        }

        /**
         * @param serverKeyType The encryption protector type like &#39;ServiceManaged&#39;, &#39;AzureKeyVault&#39;.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyType(Output<Either<String,ServerKeyType>> serverKeyType) {
            $.serverKeyType = serverKeyType;
            return this;
        }

        /**
         * @param serverKeyType The encryption protector type like &#39;ServiceManaged&#39;, &#39;AzureKeyVault&#39;.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyType(Either<String,ServerKeyType> serverKeyType) {
            return serverKeyType(Output.of(serverKeyType));
        }

        /**
         * @param serverKeyType The encryption protector type like &#39;ServiceManaged&#39;, &#39;AzureKeyVault&#39;.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyType(String serverKeyType) {
            return serverKeyType(Either.ofLeft(serverKeyType));
        }

        /**
         * @param serverKeyType The encryption protector type like &#39;ServiceManaged&#39;, &#39;AzureKeyVault&#39;.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyType(ServerKeyType serverKeyType) {
            return serverKeyType(Either.ofRight(serverKeyType));
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public EncryptionProtectorArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverKeyType = Objects.requireNonNull($.serverKeyType, "expected parameter 'serverKeyType' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
