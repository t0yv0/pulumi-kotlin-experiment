// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the mode of database creation.
     * 
     * Default: regular database creation.
     * 
     * Copy: creates a database as a copy of an existing database. sourceDatabaseId must be specified as the resource ID of the source database.
     * 
     * Secondary: creates a database as a secondary replica of an existing database. sourceDatabaseId must be specified as the resource ID of the existing primary database.
     * 
     * PointInTimeRestore: Creates a database by restoring a point in time backup of an existing database. sourceDatabaseId must be specified as the resource ID of the existing database, and restorePointInTime must be specified.
     * 
     * Recovery: Creates a database by restoring a geo-replicated backup. sourceDatabaseId must be specified as the recoverable database resource ID to restore.
     * 
     * Restore: Creates a database by restoring a backup of a deleted database. sourceDatabaseId must be specified. If sourceDatabaseId is the database&#39;s original resource ID, then sourceDatabaseDeletionDate must be specified. Otherwise sourceDatabaseId must be the restorable dropped database resource ID and sourceDatabaseDeletionDate is ignored. restorePointInTime may also be specified to restore from an earlier point in time.
     * 
     * RestoreLongTermRetentionBackup: Creates a database by restoring from a long term retention vault. recoveryServicesRecoveryPointResourceId must be specified as the recovery point resource ID.
     * 
     * Copy, Secondary, and RestoreLongTermRetentionBackup are not supported for DataWarehouse edition.
     * 
     */
    @EnumType
    public enum CreateMode {
        Default("Default"),
        Copy("Copy"),
        Secondary("Secondary"),
        PointInTimeRestore("PointInTimeRestore"),
        Restore("Restore"),
        Recovery("Recovery"),
        RestoreExternalBackup("RestoreExternalBackup"),
        RestoreExternalBackupSecondary("RestoreExternalBackupSecondary"),
        RestoreLongTermRetentionBackup("RestoreLongTermRetentionBackup"),
        OnlineSecondary("OnlineSecondary");

        private final String value;

        CreateMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CreateMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
