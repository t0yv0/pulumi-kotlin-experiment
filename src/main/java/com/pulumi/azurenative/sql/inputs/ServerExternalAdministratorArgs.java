// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.azurenative.sql.enums.AdministratorType;
import com.pulumi.azurenative.sql.enums.PrincipalType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a active directory administrator.
 * 
 */
public final class ServerExternalAdministratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerExternalAdministratorArgs Empty = new ServerExternalAdministratorArgs();

    /**
     * Type of the sever administrator.
     * 
     */
    @Import(name="administratorType")
    private @Nullable Output<Either<String,AdministratorType>> administratorType;

    /**
     * @return Type of the sever administrator.
     * 
     */
    public Optional<Output<Either<String,AdministratorType>>> administratorType() {
        return Optional.ofNullable(this.administratorType);
    }

    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    @Import(name="azureADOnlyAuthentication")
    private @Nullable Output<Boolean> azureADOnlyAuthentication;

    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    public Optional<Output<Boolean>> azureADOnlyAuthentication() {
        return Optional.ofNullable(this.azureADOnlyAuthentication);
    }

    /**
     * Login name of the server administrator.
     * 
     */
    @Import(name="login")
    private @Nullable Output<String> login;

    /**
     * @return Login name of the server administrator.
     * 
     */
    public Optional<Output<String>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * Principal Type of the sever administrator.
     * 
     */
    @Import(name="principalType")
    private @Nullable Output<Either<String,PrincipalType>> principalType;

    /**
     * @return Principal Type of the sever administrator.
     * 
     */
    public Optional<Output<Either<String,PrincipalType>>> principalType() {
        return Optional.ofNullable(this.principalType);
    }

    /**
     * SID (object ID) of the server administrator.
     * 
     */
    @Import(name="sid")
    private @Nullable Output<String> sid;

    /**
     * @return SID (object ID) of the server administrator.
     * 
     */
    public Optional<Output<String>> sid() {
        return Optional.ofNullable(this.sid);
    }

    /**
     * Tenant ID of the administrator.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return Tenant ID of the administrator.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private ServerExternalAdministratorArgs() {}

    private ServerExternalAdministratorArgs(ServerExternalAdministratorArgs $) {
        this.administratorType = $.administratorType;
        this.azureADOnlyAuthentication = $.azureADOnlyAuthentication;
        this.login = $.login;
        this.principalType = $.principalType;
        this.sid = $.sid;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerExternalAdministratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerExternalAdministratorArgs $;

        public Builder() {
            $ = new ServerExternalAdministratorArgs();
        }

        public Builder(ServerExternalAdministratorArgs defaults) {
            $ = new ServerExternalAdministratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param administratorType Type of the sever administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(@Nullable Output<Either<String,AdministratorType>> administratorType) {
            $.administratorType = administratorType;
            return this;
        }

        /**
         * @param administratorType Type of the sever administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(Either<String,AdministratorType> administratorType) {
            return administratorType(Output.of(administratorType));
        }

        /**
         * @param administratorType Type of the sever administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(String administratorType) {
            return administratorType(Either.ofLeft(administratorType));
        }

        /**
         * @param administratorType Type of the sever administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(AdministratorType administratorType) {
            return administratorType(Either.ofRight(administratorType));
        }

        /**
         * @param azureADOnlyAuthentication Azure Active Directory only Authentication enabled.
         * 
         * @return builder
         * 
         */
        public Builder azureADOnlyAuthentication(@Nullable Output<Boolean> azureADOnlyAuthentication) {
            $.azureADOnlyAuthentication = azureADOnlyAuthentication;
            return this;
        }

        /**
         * @param azureADOnlyAuthentication Azure Active Directory only Authentication enabled.
         * 
         * @return builder
         * 
         */
        public Builder azureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
            return azureADOnlyAuthentication(Output.of(azureADOnlyAuthentication));
        }

        /**
         * @param login Login name of the server administrator.
         * 
         * @return builder
         * 
         */
        public Builder login(@Nullable Output<String> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login Login name of the server administrator.
         * 
         * @return builder
         * 
         */
        public Builder login(String login) {
            return login(Output.of(login));
        }

        /**
         * @param principalType Principal Type of the sever administrator.
         * 
         * @return builder
         * 
         */
        public Builder principalType(@Nullable Output<Either<String,PrincipalType>> principalType) {
            $.principalType = principalType;
            return this;
        }

        /**
         * @param principalType Principal Type of the sever administrator.
         * 
         * @return builder
         * 
         */
        public Builder principalType(Either<String,PrincipalType> principalType) {
            return principalType(Output.of(principalType));
        }

        /**
         * @param principalType Principal Type of the sever administrator.
         * 
         * @return builder
         * 
         */
        public Builder principalType(String principalType) {
            return principalType(Either.ofLeft(principalType));
        }

        /**
         * @param principalType Principal Type of the sever administrator.
         * 
         * @return builder
         * 
         */
        public Builder principalType(PrincipalType principalType) {
            return principalType(Either.ofRight(principalType));
        }

        /**
         * @param sid SID (object ID) of the server administrator.
         * 
         * @return builder
         * 
         */
        public Builder sid(@Nullable Output<String> sid) {
            $.sid = sid;
            return this;
        }

        /**
         * @param sid SID (object ID) of the server administrator.
         * 
         * @return builder
         * 
         */
        public Builder sid(String sid) {
            return sid(Output.of(sid));
        }

        /**
         * @param tenantId Tenant ID of the administrator.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Tenant ID of the administrator.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public ServerExternalAdministratorArgs build() {
            return $;
        }
    }

}