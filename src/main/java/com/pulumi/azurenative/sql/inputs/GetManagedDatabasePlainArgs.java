// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedDatabasePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedDatabasePlainArgs Empty = new GetManagedDatabasePlainArgs();

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return The name of the database.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName", required=true)
    private String managedInstanceName;

    /**
     * @return The name of the managed instance.
     * 
     */
    public String managedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagedDatabasePlainArgs() {}

    private GetManagedDatabasePlainArgs(GetManagedDatabasePlainArgs $) {
        this.databaseName = $.databaseName;
        this.managedInstanceName = $.managedInstanceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedDatabasePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedDatabasePlainArgs $;

        public Builder() {
            $ = new GetManagedDatabasePlainArgs();
        }

        public Builder(GetManagedDatabasePlainArgs defaults) {
            $ = new GetManagedDatabasePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseName The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param managedInstanceName The name of the managed instance.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceName(String managedInstanceName) {
            $.managedInstanceName = managedInstanceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetManagedDatabasePlainArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.managedInstanceName = Objects.requireNonNull($.managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
