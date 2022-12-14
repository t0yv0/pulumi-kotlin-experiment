// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppHostNameBindingSlotResult {
    /**
     * @return Azure resource name.
     * 
     */
    private @Nullable String azureResourceName;
    /**
     * @return Azure resource type.
     * 
     */
    private @Nullable String azureResourceType;
    /**
     * @return Custom DNS record type.
     * 
     */
    private @Nullable String customHostNameDnsRecordType;
    /**
     * @return Fully qualified ARM domain resource URI.
     * 
     */
    private @Nullable String domainId;
    /**
     * @return Hostname type.
     * 
     */
    private @Nullable String hostNameType;
    /**
     * @return Resource Id.
     * 
     */
    private String id;
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
    /**
     * @return App Service app name.
     * 
     */
    private @Nullable String siteName;
    /**
     * @return SSL type
     * 
     */
    private @Nullable String sslState;
    /**
     * @return SSL certificate thumbprint
     * 
     */
    private @Nullable String thumbprint;
    /**
     * @return Resource type.
     * 
     */
    private String type;
    /**
     * @return Virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    private String virtualIP;

    private GetWebAppHostNameBindingSlotResult() {}
    /**
     * @return Azure resource name.
     * 
     */
    public Optional<String> azureResourceName() {
        return Optional.ofNullable(this.azureResourceName);
    }
    /**
     * @return Azure resource type.
     * 
     */
    public Optional<String> azureResourceType() {
        return Optional.ofNullable(this.azureResourceType);
    }
    /**
     * @return Custom DNS record type.
     * 
     */
    public Optional<String> customHostNameDnsRecordType() {
        return Optional.ofNullable(this.customHostNameDnsRecordType);
    }
    /**
     * @return Fully qualified ARM domain resource URI.
     * 
     */
    public Optional<String> domainId() {
        return Optional.ofNullable(this.domainId);
    }
    /**
     * @return Hostname type.
     * 
     */
    public Optional<String> hostNameType() {
        return Optional.ofNullable(this.hostNameType);
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
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
    /**
     * @return App Service app name.
     * 
     */
    public Optional<String> siteName() {
        return Optional.ofNullable(this.siteName);
    }
    /**
     * @return SSL type
     * 
     */
    public Optional<String> sslState() {
        return Optional.ofNullable(this.sslState);
    }
    /**
     * @return SSL certificate thumbprint
     * 
     */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Virtual IP address assigned to the hostname if IP based SSL is enabled.
     * 
     */
    public String virtualIP() {
        return this.virtualIP;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppHostNameBindingSlotResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String azureResourceName;
        private @Nullable String azureResourceType;
        private @Nullable String customHostNameDnsRecordType;
        private @Nullable String domainId;
        private @Nullable String hostNameType;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String siteName;
        private @Nullable String sslState;
        private @Nullable String thumbprint;
        private String type;
        private String virtualIP;
        public Builder() {}
        public Builder(GetWebAppHostNameBindingSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureResourceName = defaults.azureResourceName;
    	      this.azureResourceType = defaults.azureResourceType;
    	      this.customHostNameDnsRecordType = defaults.customHostNameDnsRecordType;
    	      this.domainId = defaults.domainId;
    	      this.hostNameType = defaults.hostNameType;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.siteName = defaults.siteName;
    	      this.sslState = defaults.sslState;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
    	      this.virtualIP = defaults.virtualIP;
        }

        @CustomType.Setter
        public Builder azureResourceName(@Nullable String azureResourceName) {
            this.azureResourceName = azureResourceName;
            return this;
        }
        @CustomType.Setter
        public Builder azureResourceType(@Nullable String azureResourceType) {
            this.azureResourceType = azureResourceType;
            return this;
        }
        @CustomType.Setter
        public Builder customHostNameDnsRecordType(@Nullable String customHostNameDnsRecordType) {
            this.customHostNameDnsRecordType = customHostNameDnsRecordType;
            return this;
        }
        @CustomType.Setter
        public Builder domainId(@Nullable String domainId) {
            this.domainId = domainId;
            return this;
        }
        @CustomType.Setter
        public Builder hostNameType(@Nullable String hostNameType) {
            this.hostNameType = hostNameType;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder siteName(@Nullable String siteName) {
            this.siteName = siteName;
            return this;
        }
        @CustomType.Setter
        public Builder sslState(@Nullable String sslState) {
            this.sslState = sslState;
            return this;
        }
        @CustomType.Setter
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder virtualIP(String virtualIP) {
            this.virtualIP = Objects.requireNonNull(virtualIP);
            return this;
        }
        public GetWebAppHostNameBindingSlotResult build() {
            final var o = new GetWebAppHostNameBindingSlotResult();
            o.azureResourceName = azureResourceName;
            o.azureResourceType = azureResourceType;
            o.customHostNameDnsRecordType = customHostNameDnsRecordType;
            o.domainId = domainId;
            o.hostNameType = hostNameType;
            o.id = id;
            o.kind = kind;
            o.name = name;
            o.siteName = siteName;
            o.sslState = sslState;
            o.thumbprint = thumbprint;
            o.type = type;
            o.virtualIP = virtualIP;
            return o;
        }
    }
}
