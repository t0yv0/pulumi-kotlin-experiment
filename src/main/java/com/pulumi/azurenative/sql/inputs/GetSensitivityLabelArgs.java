// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSensitivityLabelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSensitivityLabelArgs Empty = new GetSensitivityLabelArgs();

    /**
     * The name of the column.
     * 
     */
    @Import(name="columnName", required=true)
    private Output<String> columnName;

    /**
     * @return The name of the column.
     * 
     */
    public Output<String> columnName() {
        return this.columnName;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
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
     * The name of the schema.
     * 
     */
    @Import(name="schemaName", required=true)
    private Output<String> schemaName;

    /**
     * @return The name of the schema.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }

    /**
     * The source of the sensitivity label.
     * 
     */
    @Import(name="sensitivityLabelSource", required=true)
    private Output<String> sensitivityLabelSource;

    /**
     * @return The source of the sensitivity label.
     * 
     */
    public Output<String> sensitivityLabelSource() {
        return this.sensitivityLabelSource;
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

    /**
     * The name of the table.
     * 
     */
    @Import(name="tableName", required=true)
    private Output<String> tableName;

    /**
     * @return The name of the table.
     * 
     */
    public Output<String> tableName() {
        return this.tableName;
    }

    private GetSensitivityLabelArgs() {}

    private GetSensitivityLabelArgs(GetSensitivityLabelArgs $) {
        this.columnName = $.columnName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.schemaName = $.schemaName;
        this.sensitivityLabelSource = $.sensitivityLabelSource;
        this.serverName = $.serverName;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSensitivityLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSensitivityLabelArgs $;

        public Builder() {
            $ = new GetSensitivityLabelArgs();
        }

        public Builder(GetSensitivityLabelArgs defaults) {
            $ = new GetSensitivityLabelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnName The name of the column.
         * 
         * @return builder
         * 
         */
        public Builder columnName(Output<String> columnName) {
            $.columnName = columnName;
            return this;
        }

        /**
         * @param columnName The name of the column.
         * 
         * @return builder
         * 
         */
        public Builder columnName(String columnName) {
            return columnName(Output.of(columnName));
        }

        /**
         * @param databaseName The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
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
         * @param schemaName The name of the schema.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        /**
         * @param schemaName The name of the schema.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        /**
         * @param sensitivityLabelSource The source of the sensitivity label.
         * 
         * @return builder
         * 
         */
        public Builder sensitivityLabelSource(Output<String> sensitivityLabelSource) {
            $.sensitivityLabelSource = sensitivityLabelSource;
            return this;
        }

        /**
         * @param sensitivityLabelSource The source of the sensitivity label.
         * 
         * @return builder
         * 
         */
        public Builder sensitivityLabelSource(String sensitivityLabelSource) {
            return sensitivityLabelSource(Output.of(sensitivityLabelSource));
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

        /**
         * @param tableName The name of the table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName The name of the table.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public GetSensitivityLabelArgs build() {
            $.columnName = Objects.requireNonNull($.columnName, "expected parameter 'columnName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.schemaName = Objects.requireNonNull($.schemaName, "expected parameter 'schemaName' to be non-null");
            $.sensitivityLabelSource = Objects.requireNonNull($.sensitivityLabelSource, "expected parameter 'sensitivityLabelSource' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}
