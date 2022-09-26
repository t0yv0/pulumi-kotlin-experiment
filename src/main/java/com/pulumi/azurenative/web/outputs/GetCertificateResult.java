// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.HostingEnvironmentProfileResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCertificateResult {
    /**
     * @return CNAME of the certificate to be issued via free certificate
     * 
     */
    private @Nullable String canonicalName;
    /**
     * @return Raw bytes of .cer file
     * 
     */
    private String cerBlob;
    /**
     * @return Method of domain validation for free cert
     * 
     */
    private @Nullable String domainValidationMethod;
    /**
     * @return Certificate expiration date.
     * 
     */
    private String expirationDate;
    /**
     * @return Friendly name of the certificate.
     * 
     */
    private String friendlyName;
    /**
     * @return Host names the certificate applies to.
     * 
     */
    private @Nullable List<String> hostNames;
    /**
     * @return Specification for the App Service Environment to use for the certificate.
     * 
     */
    private HostingEnvironmentProfileResponse hostingEnvironmentProfile;
    /**
     * @return Resource Id.
     * 
     */
    private String id;
    /**
     * @return Certificate issue Date.
     * 
     */
    private String issueDate;
    /**
     * @return Certificate issuer.
     * 
     */
    private String issuer;
    /**
     * @return Key Vault Csm resource Id.
     * 
     */
    private @Nullable String keyVaultId;
    /**
     * @return Key Vault secret name.
     * 
     */
    private @Nullable String keyVaultSecretName;
    /**
     * @return Status of the Key Vault secret.
     * 
     */
    private String keyVaultSecretStatus;
    /**
     * @return Kind of resource.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Resource Location.
     * 
     */
    private String location;
    /**
     * @return Resource Name.
     * 
     */
    private String name;
    /**
     * @return Pfx blob.
     * 
     */
    private @Nullable String pfxBlob;
    /**
     * @return Public key hash.
     * 
     */
    private String publicKeyHash;
    /**
     * @return Self link.
     * 
     */
    private String selfLink;
    /**
     * @return Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
     * 
     */
    private @Nullable String serverFarmId;
    /**
     * @return App name.
     * 
     */
    private String siteName;
    /**
     * @return Subject name of the certificate.
     * 
     */
    private String subjectName;
    /**
     * @return Resource tags.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return Certificate thumbprint.
     * 
     */
    private String thumbprint;
    /**
     * @return Resource type.
     * 
     */
    private String type;
    /**
     * @return Is the certificate valid?.
     * 
     */
    private Boolean valid;

    private GetCertificateResult() {}
    /**
     * @return CNAME of the certificate to be issued via free certificate
     * 
     */
    public Optional<String> canonicalName() {
        return Optional.ofNullable(this.canonicalName);
    }
    /**
     * @return Raw bytes of .cer file
     * 
     */
    public String cerBlob() {
        return this.cerBlob;
    }
    /**
     * @return Method of domain validation for free cert
     * 
     */
    public Optional<String> domainValidationMethod() {
        return Optional.ofNullable(this.domainValidationMethod);
    }
    /**
     * @return Certificate expiration date.
     * 
     */
    public String expirationDate() {
        return this.expirationDate;
    }
    /**
     * @return Friendly name of the certificate.
     * 
     */
    public String friendlyName() {
        return this.friendlyName;
    }
    /**
     * @return Host names the certificate applies to.
     * 
     */
    public List<String> hostNames() {
        return this.hostNames == null ? List.of() : this.hostNames;
    }
    /**
     * @return Specification for the App Service Environment to use for the certificate.
     * 
     */
    public HostingEnvironmentProfileResponse hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Certificate issue Date.
     * 
     */
    public String issueDate() {
        return this.issueDate;
    }
    /**
     * @return Certificate issuer.
     * 
     */
    public String issuer() {
        return this.issuer;
    }
    /**
     * @return Key Vault Csm resource Id.
     * 
     */
    public Optional<String> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }
    /**
     * @return Key Vault secret name.
     * 
     */
    public Optional<String> keyVaultSecretName() {
        return Optional.ofNullable(this.keyVaultSecretName);
    }
    /**
     * @return Status of the Key Vault secret.
     * 
     */
    public String keyVaultSecretStatus() {
        return this.keyVaultSecretStatus;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Pfx blob.
     * 
     */
    public Optional<String> pfxBlob() {
        return Optional.ofNullable(this.pfxBlob);
    }
    /**
     * @return Public key hash.
     * 
     */
    public String publicKeyHash() {
        return this.publicKeyHash;
    }
    /**
     * @return Self link.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Resource ID of the associated App Service plan, formatted as: &#34;/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}&#34;.
     * 
     */
    public Optional<String> serverFarmId() {
        return Optional.ofNullable(this.serverFarmId);
    }
    /**
     * @return App name.
     * 
     */
    public String siteName() {
        return this.siteName;
    }
    /**
     * @return Subject name of the certificate.
     * 
     */
    public String subjectName() {
        return this.subjectName;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Certificate thumbprint.
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Is the certificate valid?.
     * 
     */
    public Boolean valid() {
        return this.valid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String canonicalName;
        private String cerBlob;
        private @Nullable String domainValidationMethod;
        private String expirationDate;
        private String friendlyName;
        private @Nullable List<String> hostNames;
        private HostingEnvironmentProfileResponse hostingEnvironmentProfile;
        private String id;
        private String issueDate;
        private String issuer;
        private @Nullable String keyVaultId;
        private @Nullable String keyVaultSecretName;
        private String keyVaultSecretStatus;
        private @Nullable String kind;
        private String location;
        private String name;
        private @Nullable String pfxBlob;
        private String publicKeyHash;
        private String selfLink;
        private @Nullable String serverFarmId;
        private String siteName;
        private String subjectName;
        private @Nullable Map<String,String> tags;
        private String thumbprint;
        private String type;
        private Boolean valid;
        public Builder() {}
        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalName = defaults.canonicalName;
    	      this.cerBlob = defaults.cerBlob;
    	      this.domainValidationMethod = defaults.domainValidationMethod;
    	      this.expirationDate = defaults.expirationDate;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hostNames = defaults.hostNames;
    	      this.hostingEnvironmentProfile = defaults.hostingEnvironmentProfile;
    	      this.id = defaults.id;
    	      this.issueDate = defaults.issueDate;
    	      this.issuer = defaults.issuer;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultSecretName = defaults.keyVaultSecretName;
    	      this.keyVaultSecretStatus = defaults.keyVaultSecretStatus;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.pfxBlob = defaults.pfxBlob;
    	      this.publicKeyHash = defaults.publicKeyHash;
    	      this.selfLink = defaults.selfLink;
    	      this.serverFarmId = defaults.serverFarmId;
    	      this.siteName = defaults.siteName;
    	      this.subjectName = defaults.subjectName;
    	      this.tags = defaults.tags;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
    	      this.valid = defaults.valid;
        }

        @CustomType.Setter
        public Builder canonicalName(@Nullable String canonicalName) {
            this.canonicalName = canonicalName;
            return this;
        }
        @CustomType.Setter
        public Builder cerBlob(String cerBlob) {
            this.cerBlob = Objects.requireNonNull(cerBlob);
            return this;
        }
        @CustomType.Setter
        public Builder domainValidationMethod(@Nullable String domainValidationMethod) {
            this.domainValidationMethod = domainValidationMethod;
            return this;
        }
        @CustomType.Setter
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }
        @CustomType.Setter
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }
        @CustomType.Setter
        public Builder hostNames(@Nullable List<String> hostNames) {
            this.hostNames = hostNames;
            return this;
        }
        public Builder hostNames(String... hostNames) {
            return hostNames(List.of(hostNames));
        }
        @CustomType.Setter
        public Builder hostingEnvironmentProfile(HostingEnvironmentProfileResponse hostingEnvironmentProfile) {
            this.hostingEnvironmentProfile = Objects.requireNonNull(hostingEnvironmentProfile);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder issueDate(String issueDate) {
            this.issueDate = Objects.requireNonNull(issueDate);
            return this;
        }
        @CustomType.Setter
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultSecretName(@Nullable String keyVaultSecretName) {
            this.keyVaultSecretName = keyVaultSecretName;
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultSecretStatus(String keyVaultSecretStatus) {
            this.keyVaultSecretStatus = Objects.requireNonNull(keyVaultSecretStatus);
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder pfxBlob(@Nullable String pfxBlob) {
            this.pfxBlob = pfxBlob;
            return this;
        }
        @CustomType.Setter
        public Builder publicKeyHash(String publicKeyHash) {
            this.publicKeyHash = Objects.requireNonNull(publicKeyHash);
            return this;
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        @CustomType.Setter
        public Builder serverFarmId(@Nullable String serverFarmId) {
            this.serverFarmId = serverFarmId;
            return this;
        }
        @CustomType.Setter
        public Builder siteName(String siteName) {
            this.siteName = Objects.requireNonNull(siteName);
            return this;
        }
        @CustomType.Setter
        public Builder subjectName(String subjectName) {
            this.subjectName = Objects.requireNonNull(subjectName);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder valid(Boolean valid) {
            this.valid = Objects.requireNonNull(valid);
            return this;
        }
        public GetCertificateResult build() {
            final var o = new GetCertificateResult();
            o.canonicalName = canonicalName;
            o.cerBlob = cerBlob;
            o.domainValidationMethod = domainValidationMethod;
            o.expirationDate = expirationDate;
            o.friendlyName = friendlyName;
            o.hostNames = hostNames;
            o.hostingEnvironmentProfile = hostingEnvironmentProfile;
            o.id = id;
            o.issueDate = issueDate;
            o.issuer = issuer;
            o.keyVaultId = keyVaultId;
            o.keyVaultSecretName = keyVaultSecretName;
            o.keyVaultSecretStatus = keyVaultSecretStatus;
            o.kind = kind;
            o.location = location;
            o.name = name;
            o.pfxBlob = pfxBlob;
            o.publicKeyHash = publicKeyHash;
            o.selfLink = selfLink;
            o.serverFarmId = serverFarmId;
            o.siteName = siteName;
            o.subjectName = subjectName;
            o.tags = tags;
            o.thumbprint = thumbprint;
            o.type = type;
            o.valid = valid;
            return o;
        }
    }
}