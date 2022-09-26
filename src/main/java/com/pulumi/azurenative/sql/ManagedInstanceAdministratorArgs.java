// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.ManagedInstanceAdministratorType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedInstanceAdministratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceAdministratorArgs Empty = new ManagedInstanceAdministratorArgs();

    @Import(name="administratorName")
    private @Nullable Output<String> administratorName;

    public Optional<Output<String>> administratorName() {
        return Optional.ofNullable(this.administratorName);
    }

    /**
     * Type of the managed instance administrator.
     * 
     */
    @Import(name="administratorType", required=true)
    private Output<Either<String,ManagedInstanceAdministratorType>> administratorType;

    /**
     * @return Type of the managed instance administrator.
     * 
     */
    public Output<Either<String,ManagedInstanceAdministratorType>> administratorType() {
        return this.administratorType;
    }

    /**
     * Login name of the managed instance administrator.
     * 
     */
    @Import(name="login", required=true)
    private Output<String> login;

    /**
     * @return Login name of the managed instance administrator.
     * 
     */
    public Output<String> login() {
        return this.login;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName", required=true)
    private Output<String> managedInstanceName;

    /**
     * @return The name of the managed instance.
     * 
     */
    public Output<String> managedInstanceName() {
        return this.managedInstanceName;
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
     * SID (object ID) of the managed instance administrator.
     * 
     */
    @Import(name="sid", required=true)
    private Output<String> sid;

    /**
     * @return SID (object ID) of the managed instance administrator.
     * 
     */
    public Output<String> sid() {
        return this.sid;
    }

    /**
     * Tenant ID of the managed instance administrator.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return Tenant ID of the managed instance administrator.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private ManagedInstanceAdministratorArgs() {}

    private ManagedInstanceAdministratorArgs(ManagedInstanceAdministratorArgs $) {
        this.administratorName = $.administratorName;
        this.administratorType = $.administratorType;
        this.login = $.login;
        this.managedInstanceName = $.managedInstanceName;
        this.resourceGroupName = $.resourceGroupName;
        this.sid = $.sid;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstanceAdministratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstanceAdministratorArgs $;

        public Builder() {
            $ = new ManagedInstanceAdministratorArgs();
        }

        public Builder(ManagedInstanceAdministratorArgs defaults) {
            $ = new ManagedInstanceAdministratorArgs(Objects.requireNonNull(defaults));
        }

        public Builder administratorName(@Nullable Output<String> administratorName) {
            $.administratorName = administratorName;
            return this;
        }

        public Builder administratorName(String administratorName) {
            return administratorName(Output.of(administratorName));
        }

        /**
         * @param administratorType Type of the managed instance administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(Output<Either<String,ManagedInstanceAdministratorType>> administratorType) {
            $.administratorType = administratorType;
            return this;
        }

        /**
         * @param administratorType Type of the managed instance administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(Either<String,ManagedInstanceAdministratorType> administratorType) {
            return administratorType(Output.of(administratorType));
        }

        /**
         * @param administratorType Type of the managed instance administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(String administratorType) {
            return administratorType(Either.ofLeft(administratorType));
        }

        /**
         * @param administratorType Type of the managed instance administrator.
         * 
         * @return builder
         * 
         */
        public Builder administratorType(ManagedInstanceAdministratorType administratorType) {
            return administratorType(Either.ofRight(administratorType));
        }

        /**
         * @param login Login name of the managed instance administrator.
         * 
         * @return builder
         * 
         */
        public Builder login(Output<String> login) {
            $.login = login;
            return this;
        }

        /**
         * @param login Login name of the managed instance administrator.
         * 
         * @return builder
         * 
         */
        public Builder login(String login) {
            return login(Output.of(login));
        }

        /**
         * @param managedInstanceName The name of the managed instance.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceName(Output<String> managedInstanceName) {
            $.managedInstanceName = managedInstanceName;
            return this;
        }

        /**
         * @param managedInstanceName The name of the managed instance.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceName(String managedInstanceName) {
            return managedInstanceName(Output.of(managedInstanceName));
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
         * @param sid SID (object ID) of the managed instance administrator.
         * 
         * @return builder
         * 
         */
        public Builder sid(Output<String> sid) {
            $.sid = sid;
            return this;
        }

        /**
         * @param sid SID (object ID) of the managed instance administrator.
         * 
         * @return builder
         * 
         */
        public Builder sid(String sid) {
            return sid(Output.of(sid));
        }

        /**
         * @param tenantId Tenant ID of the managed instance administrator.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId Tenant ID of the managed instance administrator.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public ManagedInstanceAdministratorArgs build() {
            $.administratorType = Objects.requireNonNull($.administratorType, "expected parameter 'administratorType' to be non-null");
            $.login = Objects.requireNonNull($.login, "expected parameter 'login' to be non-null");
            $.managedInstanceName = Objects.requireNonNull($.managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sid = Objects.requireNonNull($.sid, "expected parameter 'sid' to be non-null");
            return $;
        }
    }

}