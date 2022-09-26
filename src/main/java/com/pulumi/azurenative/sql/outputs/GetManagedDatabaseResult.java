// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetManagedDatabaseResult {
    /**
     * @return Collation of the metadata catalog.
     * 
     */
    private @Nullable String catalogCollation;
    /**
     * @return Collation of the managed database.
     * 
     */
    private @Nullable String collation;
    /**
     * @return Creation date of the database.
     * 
     */
    private String creationDate;
    /**
     * @return Geo paired region.
     * 
     */
    private String defaultSecondaryLocation;
    /**
     * @return Earliest restore point in time for point in time restore.
     * 
     */
    private String earliestRestorePoint;
    /**
     * @return Instance Failover Group resource identifier that this managed database belongs to.
     * 
     */
    private String failoverGroupId;
    /**
     * @return Resource ID.
     * 
     */
    private String id;
    /**
     * @return Resource location.
     * 
     */
    private String location;
    /**
     * @return Resource name.
     * 
     */
    private String name;
    /**
     * @return Status of the database.
     * 
     */
    private String status;
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

    private GetManagedDatabaseResult() {}
    /**
     * @return Collation of the metadata catalog.
     * 
     */
    public Optional<String> catalogCollation() {
        return Optional.ofNullable(this.catalogCollation);
    }
    /**
     * @return Collation of the managed database.
     * 
     */
    public Optional<String> collation() {
        return Optional.ofNullable(this.collation);
    }
    /**
     * @return Creation date of the database.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return Geo paired region.
     * 
     */
    public String defaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }
    /**
     * @return Earliest restore point in time for point in time restore.
     * 
     */
    public String earliestRestorePoint() {
        return this.earliestRestorePoint;
    }
    /**
     * @return Instance Failover Group resource identifier that this managed database belongs to.
     * 
     */
    public String failoverGroupId() {
        return this.failoverGroupId;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Status of the database.
     * 
     */
    public String status() {
        return this.status;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String catalogCollation;
        private @Nullable String collation;
        private String creationDate;
        private String defaultSecondaryLocation;
        private String earliestRestorePoint;
        private String failoverGroupId;
        private String id;
        private String location;
        private String name;
        private String status;
        private @Nullable Map<String,String> tags;
        private String type;
        public Builder() {}
        public Builder(GetManagedDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogCollation = defaults.catalogCollation;
    	      this.collation = defaults.collation;
    	      this.creationDate = defaults.creationDate;
    	      this.defaultSecondaryLocation = defaults.defaultSecondaryLocation;
    	      this.earliestRestorePoint = defaults.earliestRestorePoint;
    	      this.failoverGroupId = defaults.failoverGroupId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder catalogCollation(@Nullable String catalogCollation) {
            this.catalogCollation = catalogCollation;
            return this;
        }
        @CustomType.Setter
        public Builder collation(@Nullable String collation) {
            this.collation = collation;
            return this;
        }
        @CustomType.Setter
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        @CustomType.Setter
        public Builder defaultSecondaryLocation(String defaultSecondaryLocation) {
            this.defaultSecondaryLocation = Objects.requireNonNull(defaultSecondaryLocation);
            return this;
        }
        @CustomType.Setter
        public Builder earliestRestorePoint(String earliestRestorePoint) {
            this.earliestRestorePoint = Objects.requireNonNull(earliestRestorePoint);
            return this;
        }
        @CustomType.Setter
        public Builder failoverGroupId(String failoverGroupId) {
            this.failoverGroupId = Objects.requireNonNull(failoverGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
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
        public GetManagedDatabaseResult build() {
            final var o = new GetManagedDatabaseResult();
            o.catalogCollation = catalogCollation;
            o.collation = collation;
            o.creationDate = creationDate;
            o.defaultSecondaryLocation = defaultSecondaryLocation;
            o.earliestRestorePoint = earliestRestorePoint;
            o.failoverGroupId = failoverGroupId;
            o.id = id;
            o.location = location;
            o.name = name;
            o.status = status;
            o.tags = tags;
            o.type = type;
            return o;
        }
    }
}
