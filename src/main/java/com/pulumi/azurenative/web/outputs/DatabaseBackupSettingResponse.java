// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseBackupSettingResponse {
    /**
     * @return Contains a connection string to a database which is being backed up or restored. If the restore should happen to a new database, the database name inside is the new one.
     * 
     */
    private @Nullable String connectionString;
    /**
     * @return Contains a connection string name that is linked to the SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     * 
     */
    private @Nullable String connectionStringName;
    /**
     * @return Database type (e.g. SqlAzure / MySql).
     * 
     */
    private String databaseType;
    private @Nullable String name;

    private DatabaseBackupSettingResponse() {}
    /**
     * @return Contains a connection string to a database which is being backed up or restored. If the restore should happen to a new database, the database name inside is the new one.
     * 
     */
    public Optional<String> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * @return Contains a connection string name that is linked to the SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     * 
     */
    public Optional<String> connectionStringName() {
        return Optional.ofNullable(this.connectionStringName);
    }
    /**
     * @return Database type (e.g. SqlAzure / MySql).
     * 
     */
    public String databaseType() {
        return this.databaseType;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseBackupSettingResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectionString;
        private @Nullable String connectionStringName;
        private String databaseType;
        private @Nullable String name;
        public Builder() {}
        public Builder(DatabaseBackupSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.connectionStringName = defaults.connectionStringName;
    	      this.databaseType = defaults.databaseType;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        @CustomType.Setter
        public Builder connectionStringName(@Nullable String connectionStringName) {
            this.connectionStringName = connectionStringName;
            return this;
        }
        @CustomType.Setter
        public Builder databaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public DatabaseBackupSettingResponse build() {
            final var o = new DatabaseBackupSettingResponse();
            o.connectionString = connectionString;
            o.connectionStringName = connectionStringName;
            o.databaseType = databaseType;
            o.name = name;
            return o;
        }
    }
}