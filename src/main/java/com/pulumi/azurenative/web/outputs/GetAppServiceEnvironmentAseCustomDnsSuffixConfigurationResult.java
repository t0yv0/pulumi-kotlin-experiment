// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppServiceEnvironmentAseCustomDnsSuffixConfigurationResult {
    /**
     * @return The URL referencing the Azure Key Vault certificate secret that should be used as the default SSL/TLS certificate for sites with the custom domain suffix.
     * 
     */
    private @Nullable String certificateUrl;
    /**
     * @return The default custom domain suffix to use for all sites deployed on the ASE.
     * 
     */
    private @Nullable String dnsSuffix;
    /**
     * @return Resource Id.
     * 
     */
    private String id;
    /**
     * @return The user-assigned identity to use for resolving the key vault certificate reference. If not specified, the system-assigned ASE identity will be used if available.
     * 
     */
    private @Nullable String keyVaultReferenceIdentity;
    /**
     * @return Kind of resource.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Resource Name.
     * 
     */
    private String name;
    private String provisioningDetails;
    private String provisioningState;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetAppServiceEnvironmentAseCustomDnsSuffixConfigurationResult() {}
    /**
     * @return The URL referencing the Azure Key Vault certificate secret that should be used as the default SSL/TLS certificate for sites with the custom domain suffix.
     * 
     */
    public Optional<String> certificateUrl() {
        return Optional.ofNullable(this.certificateUrl);
    }
    /**
     * @return The default custom domain suffix to use for all sites deployed on the ASE.
     * 
     */
    public Optional<String> dnsSuffix() {
        return Optional.ofNullable(this.dnsSuffix);
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The user-assigned identity to use for resolving the key vault certificate reference. If not specified, the system-assigned ASE identity will be used if available.
     * 
     */
    public Optional<String> keyVaultReferenceIdentity() {
        return Optional.ofNullable(this.keyVaultReferenceIdentity);
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    public String provisioningDetails() {
        return this.provisioningDetails;
    }
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppServiceEnvironmentAseCustomDnsSuffixConfigurationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificateUrl;
        private @Nullable String dnsSuffix;
        private String id;
        private @Nullable String keyVaultReferenceIdentity;
        private @Nullable String kind;
        private String name;
        private String provisioningDetails;
        private String provisioningState;
        private String type;
        public Builder() {}
        public Builder(GetAppServiceEnvironmentAseCustomDnsSuffixConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateUrl = defaults.certificateUrl;
    	      this.dnsSuffix = defaults.dnsSuffix;
    	      this.id = defaults.id;
    	      this.keyVaultReferenceIdentity = defaults.keyVaultReferenceIdentity;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provisioningDetails = defaults.provisioningDetails;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder certificateUrl(@Nullable String certificateUrl) {
            this.certificateUrl = certificateUrl;
            return this;
        }
        @CustomType.Setter
        public Builder dnsSuffix(@Nullable String dnsSuffix) {
            this.dnsSuffix = dnsSuffix;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder keyVaultReferenceIdentity(@Nullable String keyVaultReferenceIdentity) {
            this.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder provisioningDetails(String provisioningDetails) {
            this.provisioningDetails = Objects.requireNonNull(provisioningDetails);
            return this;
        }
        @CustomType.Setter
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAppServiceEnvironmentAseCustomDnsSuffixConfigurationResult build() {
            final var o = new GetAppServiceEnvironmentAseCustomDnsSuffixConfigurationResult();
            o.certificateUrl = certificateUrl;
            o.dnsSuffix = dnsSuffix;
            o.id = id;
            o.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
            o.kind = kind;
            o.name = name;
            o.provisioningDetails = provisioningDetails;
            o.provisioningState = provisioningState;
            o.type = type;
            return o;
        }
    }
}
