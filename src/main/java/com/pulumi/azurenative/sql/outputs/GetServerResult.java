// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.azurenative.sql.outputs.ResourceIdentityResponse;
import com.pulumi.azurenative.sql.outputs.ServerExternalAdministratorResponse;
import com.pulumi.azurenative.sql.outputs.ServerPrivateEndpointConnectionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServerResult {
    /**
     * @return Administrator username for the server. Once created it cannot be changed.
     * 
     */
    private @Nullable String administratorLogin;
    /**
     * @return The Azure Active Directory identity of the server.
     * 
     */
    private @Nullable ServerExternalAdministratorResponse administrators;
    /**
     * @return The fully qualified domain name of the server.
     * 
     */
    private String fullyQualifiedDomainName;
    /**
     * @return Resource ID.
     * 
     */
    private String id;
    /**
     * @return The Azure Active Directory identity of the server.
     * 
     */
    private @Nullable ResourceIdentityResponse identity;
    /**
     * @return A CMK URI of the key to use for encryption.
     * 
     */
    private @Nullable String keyId;
    /**
     * @return Kind of sql server. This is metadata used for the Azure portal experience.
     * 
     */
    private String kind;
    /**
     * @return Resource location.
     * 
     */
    private String location;
    /**
     * @return Minimal TLS version. Allowed values: &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
     * 
     */
    private @Nullable String minimalTlsVersion;
    /**
     * @return Resource name.
     * 
     */
    private String name;
    /**
     * @return The resource id of a user assigned identity to be used by default.
     * 
     */
    private @Nullable String primaryUserAssignedIdentityId;
    /**
     * @return List of private endpoint connections on a server
     * 
     */
    private List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * @return Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    private @Nullable String publicNetworkAccess;
    /**
     * @return The state of the server.
     * 
     */
    private String state;
    /**
     * @return Resource tags.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private String type;
    /**
     * @return The version of the server.
     * 
     */
    private @Nullable String version;
    /**
     * @return Whether or not existing server has a workspace created and if it allows connection from workspace
     * 
     */
    private String workspaceFeature;

    private GetServerResult() {}
    /**
     * @return Administrator username for the server. Once created it cannot be changed.
     * 
     */
    public Optional<String> administratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }
    /**
     * @return The Azure Active Directory identity of the server.
     * 
     */
    public Optional<ServerExternalAdministratorResponse> administrators() {
        return Optional.ofNullable(this.administrators);
    }
    /**
     * @return The fully qualified domain name of the server.
     * 
     */
    public String fullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Active Directory identity of the server.
     * 
     */
    public Optional<ResourceIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return A CMK URI of the key to use for encryption.
     * 
     */
    public Optional<String> keyId() {
        return Optional.ofNullable(this.keyId);
    }
    /**
     * @return Kind of sql server. This is metadata used for the Azure portal experience.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Resource location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Minimal TLS version. Allowed values: &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
     * 
     */
    public Optional<String> minimalTlsVersion() {
        return Optional.ofNullable(this.minimalTlsVersion);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource id of a user assigned identity to be used by default.
     * 
     */
    public Optional<String> primaryUserAssignedIdentityId() {
        return Optional.ofNullable(this.primaryUserAssignedIdentityId);
    }
    /**
     * @return List of private endpoint connections on a server
     * 
     */
    public List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * @return Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Optional<String> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * @return The state of the server.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The version of the server.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }
    /**
     * @return Whether or not existing server has a workspace created and if it allows connection from workspace
     * 
     */
    public String workspaceFeature() {
        return this.workspaceFeature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String administratorLogin;
        private @Nullable ServerExternalAdministratorResponse administrators;
        private String fullyQualifiedDomainName;
        private String id;
        private @Nullable ResourceIdentityResponse identity;
        private @Nullable String keyId;
        private String kind;
        private String location;
        private @Nullable String minimalTlsVersion;
        private String name;
        private @Nullable String primaryUserAssignedIdentityId;
        private List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections;
        private @Nullable String publicNetworkAccess;
        private String state;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String version;
        private String workspaceFeature;
        public Builder() {}
        public Builder(GetServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administrators = defaults.administrators;
    	      this.fullyQualifiedDomainName = defaults.fullyQualifiedDomainName;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.keyId = defaults.keyId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.name = defaults.name;
    	      this.primaryUserAssignedIdentityId = defaults.primaryUserAssignedIdentityId;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
    	      this.workspaceFeature = defaults.workspaceFeature;
        }

        @CustomType.Setter
        public Builder administratorLogin(@Nullable String administratorLogin) {
            this.administratorLogin = administratorLogin;
            return this;
        }
        @CustomType.Setter
        public Builder administrators(@Nullable ServerExternalAdministratorResponse administrators) {
            this.administrators = administrators;
            return this;
        }
        @CustomType.Setter
        public Builder fullyQualifiedDomainName(String fullyQualifiedDomainName) {
            this.fullyQualifiedDomainName = Objects.requireNonNull(fullyQualifiedDomainName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        @CustomType.Setter
        public Builder keyId(@Nullable String keyId) {
            this.keyId = keyId;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder minimalTlsVersion(@Nullable String minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder primaryUserAssignedIdentityId(@Nullable String primaryUserAssignedIdentityId) {
            this.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return this;
        }
        @CustomType.Setter
        public Builder privateEndpointConnections(List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(ServerPrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        @CustomType.Setter
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        @CustomType.Setter
        public Builder workspaceFeature(String workspaceFeature) {
            this.workspaceFeature = Objects.requireNonNull(workspaceFeature);
            return this;
        }
        public GetServerResult build() {
            final var o = new GetServerResult();
            o.administratorLogin = administratorLogin;
            o.administrators = administrators;
            o.fullyQualifiedDomainName = fullyQualifiedDomainName;
            o.id = id;
            o.identity = identity;
            o.keyId = keyId;
            o.kind = kind;
            o.location = location;
            o.minimalTlsVersion = minimalTlsVersion;
            o.name = name;
            o.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            o.privateEndpointConnections = privateEndpointConnections;
            o.publicNetworkAccess = publicNetworkAccess;
            o.state = state;
            o.tags = tags;
            o.type = type;
            o.version = version;
            o.workspaceFeature = workspaceFeature;
            return o;
        }
    }
}
