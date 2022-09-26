// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.ServerPublicNetworkAccess;
import com.pulumi.azurenative.sql.inputs.ResourceIdentityArgs;
import com.pulumi.azurenative.sql.inputs.ServerExternalAdministratorArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

    /**
     * Administrator username for the server. Once created it cannot be changed.
     * 
     */
    @Import(name="administratorLogin")
    private @Nullable Output<String> administratorLogin;

    /**
     * @return Administrator username for the server. Once created it cannot be changed.
     * 
     */
    public Optional<Output<String>> administratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }

    /**
     * The administrator login password (required for server creation).
     * 
     */
    @Import(name="administratorLoginPassword")
    private @Nullable Output<String> administratorLoginPassword;

    /**
     * @return The administrator login password (required for server creation).
     * 
     */
    public Optional<Output<String>> administratorLoginPassword() {
        return Optional.ofNullable(this.administratorLoginPassword);
    }

    /**
     * The Azure Active Directory identity of the server.
     * 
     */
    @Import(name="administrators")
    private @Nullable Output<ServerExternalAdministratorArgs> administrators;

    /**
     * @return The Azure Active Directory identity of the server.
     * 
     */
    public Optional<Output<ServerExternalAdministratorArgs>> administrators() {
        return Optional.ofNullable(this.administrators);
    }

    /**
     * The Azure Active Directory identity of the server.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ResourceIdentityArgs> identity;

    /**
     * @return The Azure Active Directory identity of the server.
     * 
     */
    public Optional<Output<ResourceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * A CMK URI of the key to use for encryption.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return A CMK URI of the key to use for encryption.
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Minimal TLS version. Allowed values: &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
     * 
     */
    @Import(name="minimalTlsVersion")
    private @Nullable Output<String> minimalTlsVersion;

    /**
     * @return Minimal TLS version. Allowed values: &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
     * 
     */
    public Optional<Output<String>> minimalTlsVersion() {
        return Optional.ofNullable(this.minimalTlsVersion);
    }

    /**
     * The resource id of a user assigned identity to be used by default.
     * 
     */
    @Import(name="primaryUserAssignedIdentityId")
    private @Nullable Output<String> primaryUserAssignedIdentityId;

    /**
     * @return The resource id of a user assigned identity to be used by default.
     * 
     */
    public Optional<Output<String>> primaryUserAssignedIdentityId() {
        return Optional.ofNullable(this.primaryUserAssignedIdentityId);
    }

    /**
     * Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<Either<String,ServerPublicNetworkAccess>> publicNetworkAccess;

    /**
     * @return Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Optional<Output<Either<String,ServerPublicNetworkAccess>>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
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
     * The name of the server.
     * 
     */
    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
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

    /**
     * The version of the server.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the server.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ServerArgs() {}

    private ServerArgs(ServerArgs $) {
        this.administratorLogin = $.administratorLogin;
        this.administratorLoginPassword = $.administratorLoginPassword;
        this.administrators = $.administrators;
        this.identity = $.identity;
        this.keyId = $.keyId;
        this.location = $.location;
        this.minimalTlsVersion = $.minimalTlsVersion;
        this.primaryUserAssignedIdentityId = $.primaryUserAssignedIdentityId;
        this.publicNetworkAccess = $.publicNetworkAccess;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.tags = $.tags;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerArgs $;

        public Builder() {
            $ = new ServerArgs();
        }

        public Builder(ServerArgs defaults) {
            $ = new ServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administratorLogin Administrator username for the server. Once created it cannot be changed.
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(@Nullable Output<String> administratorLogin) {
            $.administratorLogin = administratorLogin;
            return this;
        }

        /**
         * @param administratorLogin Administrator username for the server. Once created it cannot be changed.
         * 
         * @return builder
         * 
         */
        public Builder administratorLogin(String administratorLogin) {
            return administratorLogin(Output.of(administratorLogin));
        }

        /**
         * @param administratorLoginPassword The administrator login password (required for server creation).
         * 
         * @return builder
         * 
         */
        public Builder administratorLoginPassword(@Nullable Output<String> administratorLoginPassword) {
            $.administratorLoginPassword = administratorLoginPassword;
            return this;
        }

        /**
         * @param administratorLoginPassword The administrator login password (required for server creation).
         * 
         * @return builder
         * 
         */
        public Builder administratorLoginPassword(String administratorLoginPassword) {
            return administratorLoginPassword(Output.of(administratorLoginPassword));
        }

        /**
         * @param administrators The Azure Active Directory identity of the server.
         * 
         * @return builder
         * 
         */
        public Builder administrators(@Nullable Output<ServerExternalAdministratorArgs> administrators) {
            $.administrators = administrators;
            return this;
        }

        /**
         * @param administrators The Azure Active Directory identity of the server.
         * 
         * @return builder
         * 
         */
        public Builder administrators(ServerExternalAdministratorArgs administrators) {
            return administrators(Output.of(administrators));
        }

        /**
         * @param identity The Azure Active Directory identity of the server.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The Azure Active Directory identity of the server.
         * 
         * @return builder
         * 
         */
        public Builder identity(ResourceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param keyId A CMK URI of the key to use for encryption.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId A CMK URI of the key to use for encryption.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param minimalTlsVersion Minimal TLS version. Allowed values: &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
         * 
         * @return builder
         * 
         */
        public Builder minimalTlsVersion(@Nullable Output<String> minimalTlsVersion) {
            $.minimalTlsVersion = minimalTlsVersion;
            return this;
        }

        /**
         * @param minimalTlsVersion Minimal TLS version. Allowed values: &#39;1.0&#39;, &#39;1.1&#39;, &#39;1.2&#39;
         * 
         * @return builder
         * 
         */
        public Builder minimalTlsVersion(String minimalTlsVersion) {
            return minimalTlsVersion(Output.of(minimalTlsVersion));
        }

        /**
         * @param primaryUserAssignedIdentityId The resource id of a user assigned identity to be used by default.
         * 
         * @return builder
         * 
         */
        public Builder primaryUserAssignedIdentityId(@Nullable Output<String> primaryUserAssignedIdentityId) {
            $.primaryUserAssignedIdentityId = primaryUserAssignedIdentityId;
            return this;
        }

        /**
         * @param primaryUserAssignedIdentityId The resource id of a user assigned identity to be used by default.
         * 
         * @return builder
         * 
         */
        public Builder primaryUserAssignedIdentityId(String primaryUserAssignedIdentityId) {
            return primaryUserAssignedIdentityId(Output.of(primaryUserAssignedIdentityId));
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(@Nullable Output<Either<String,ServerPublicNetworkAccess>> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(Either<String,ServerPublicNetworkAccess> publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(String publicNetworkAccess) {
            return publicNetworkAccess(Either.ofLeft(publicNetworkAccess));
        }

        /**
         * @param publicNetworkAccess Whether or not public endpoint access is allowed for this server.  Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccess(ServerPublicNetworkAccess publicNetworkAccess) {
            return publicNetworkAccess(Either.ofRight(publicNetworkAccess));
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
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable Output<String> serverName) {
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

        /**
         * @param version The version of the server.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the server.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ServerArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}