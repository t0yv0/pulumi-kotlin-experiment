// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * CNAME of the certificate to be issued via free certificate
     * 
     */
    @Import(name="canonicalName")
    private @Nullable Output<String> canonicalName;

    /**
     * @return CNAME of the certificate to be issued via free certificate
     * 
     */
    public Optional<Output<String>> canonicalName() {
        return Optional.ofNullable(this.canonicalName);
    }

    /**
     * Method of domain validation for free cert
     * 
     */
    @Import(name="domainValidationMethod")
    private @Nullable Output<String> domainValidationMethod;

    /**
     * @return Method of domain validation for free cert
     * 
     */
    public Optional<Output<String>> domainValidationMethod() {
        return Optional.ofNullable(this.domainValidationMethod);
    }

    /**
     * Host names the certificate applies to.
     * 
     */
    @Import(name="hostNames")
    private @Nullable Output<List<String>> hostNames;

    /**
     * @return Host names the certificate applies to.
     * 
     */
    public Optional<Output<List<String>>> hostNames() {
        return Optional.ofNullable(this.hostNames);
    }

    /**
     * Key Vault Csm resource Id.
     * 
     */
    @Import(name="keyVaultId")
    private @Nullable Output<String> keyVaultId;

    /**
     * @return Key Vault Csm resource Id.
     * 
     */
    public Optional<Output<String>> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }

    /**
     * Key Vault secret name.
     * 
     */
    @Import(name="keyVaultSecretName")
    private @Nullable Output<String> keyVaultSecretName;

    /**
     * @return Key Vault secret name.
     * 
     */
    public Optional<Output<String>> keyVaultSecretName() {
        return Optional.ofNullable(this.keyVaultSecretName);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the certificate.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the certificate.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Certificate password.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Certificate password.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Pfx blob.
     * 
     */
    @Import(name="pfxBlob")
    private @Nullable Output<String> pfxBlob;

    /**
     * @return Pfx blob.
     * 
     */
    public Optional<Output<String>> pfxBlob() {
        return Optional.ofNullable(this.pfxBlob);
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
     * 
     */
    @Import(name="serverFarmId")
    private @Nullable Output<String> serverFarmId;

    /**
     * @return Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
     * 
     */
    public Optional<Output<String>> serverFarmId() {
        return Optional.ofNullable(this.serverFarmId);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.canonicalName = $.canonicalName;
        this.domainValidationMethod = $.domainValidationMethod;
        this.hostNames = $.hostNames;
        this.keyVaultId = $.keyVaultId;
        this.keyVaultSecretName = $.keyVaultSecretName;
        this.kind = $.kind;
        this.location = $.location;
        this.name = $.name;
        this.password = $.password;
        this.pfxBlob = $.pfxBlob;
        this.resourceGroupName = $.resourceGroupName;
        this.serverFarmId = $.serverFarmId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param canonicalName CNAME of the certificate to be issued via free certificate
         * 
         * @return builder
         * 
         */
        public Builder canonicalName(@Nullable Output<String> canonicalName) {
            $.canonicalName = canonicalName;
            return this;
        }

        /**
         * @param canonicalName CNAME of the certificate to be issued via free certificate
         * 
         * @return builder
         * 
         */
        public Builder canonicalName(String canonicalName) {
            return canonicalName(Output.of(canonicalName));
        }

        /**
         * @param domainValidationMethod Method of domain validation for free cert
         * 
         * @return builder
         * 
         */
        public Builder domainValidationMethod(@Nullable Output<String> domainValidationMethod) {
            $.domainValidationMethod = domainValidationMethod;
            return this;
        }

        /**
         * @param domainValidationMethod Method of domain validation for free cert
         * 
         * @return builder
         * 
         */
        public Builder domainValidationMethod(String domainValidationMethod) {
            return domainValidationMethod(Output.of(domainValidationMethod));
        }

        /**
         * @param hostNames Host names the certificate applies to.
         * 
         * @return builder
         * 
         */
        public Builder hostNames(@Nullable Output<List<String>> hostNames) {
            $.hostNames = hostNames;
            return this;
        }

        /**
         * @param hostNames Host names the certificate applies to.
         * 
         * @return builder
         * 
         */
        public Builder hostNames(List<String> hostNames) {
            return hostNames(Output.of(hostNames));
        }

        /**
         * @param hostNames Host names the certificate applies to.
         * 
         * @return builder
         * 
         */
        public Builder hostNames(String... hostNames) {
            return hostNames(List.of(hostNames));
        }

        /**
         * @param keyVaultId Key Vault Csm resource Id.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(@Nullable Output<String> keyVaultId) {
            $.keyVaultId = keyVaultId;
            return this;
        }

        /**
         * @param keyVaultId Key Vault Csm resource Id.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultId(String keyVaultId) {
            return keyVaultId(Output.of(keyVaultId));
        }

        /**
         * @param keyVaultSecretName Key Vault secret name.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSecretName(@Nullable Output<String> keyVaultSecretName) {
            $.keyVaultSecretName = keyVaultSecretName;
            return this;
        }

        /**
         * @param keyVaultSecretName Key Vault secret name.
         * 
         * @return builder
         * 
         */
        public Builder keyVaultSecretName(String keyVaultSecretName) {
            return keyVaultSecretName(Output.of(keyVaultSecretName));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location Resource Location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource Location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password Certificate password.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Certificate password.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param pfxBlob Pfx blob.
         * 
         * @return builder
         * 
         */
        public Builder pfxBlob(@Nullable Output<String> pfxBlob) {
            $.pfxBlob = pfxBlob;
            return this;
        }

        /**
         * @param pfxBlob Pfx blob.
         * 
         * @return builder
         * 
         */
        public Builder pfxBlob(String pfxBlob) {
            return pfxBlob(Output.of(pfxBlob));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverFarmId Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder serverFarmId(@Nullable Output<String> serverFarmId) {
            $.serverFarmId = serverFarmId;
            return this;
        }

        /**
         * @param serverFarmId Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder serverFarmId(String serverFarmId) {
            return serverFarmId(Output.of(serverFarmId));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public CertificateArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
