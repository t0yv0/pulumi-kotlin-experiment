// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSensitivityLabelResult {
    /**
     * @return The column name.
     * 
     */
    private String columnName;
    /**
     * @return Resource ID.
     * 
     */
    private String id;
    /**
     * @return The information type.
     * 
     */
    private @Nullable String informationType;
    /**
     * @return The information type ID.
     * 
     */
    private @Nullable String informationTypeId;
    /**
     * @return Is sensitivity recommendation disabled. Applicable for recommended sensitivity label only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     * 
     */
    private Boolean isDisabled;
    /**
     * @return The label ID.
     * 
     */
    private @Nullable String labelId;
    /**
     * @return The label name.
     * 
     */
    private @Nullable String labelName;
    /**
     * @return Resource that manages the sensitivity label.
     * 
     */
    private String managedBy;
    /**
     * @return Resource name.
     * 
     */
    private String name;
    private @Nullable String rank;
    /**
     * @return The schema name.
     * 
     */
    private String schemaName;
    /**
     * @return The table name.
     * 
     */
    private String tableName;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetSensitivityLabelResult() {}
    /**
     * @return The column name.
     * 
     */
    public String columnName() {
        return this.columnName;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The information type.
     * 
     */
    public Optional<String> informationType() {
        return Optional.ofNullable(this.informationType);
    }
    /**
     * @return The information type ID.
     * 
     */
    public Optional<String> informationTypeId() {
        return Optional.ofNullable(this.informationTypeId);
    }
    /**
     * @return Is sensitivity recommendation disabled. Applicable for recommended sensitivity label only. Specifies whether the sensitivity recommendation on this column is disabled (dismissed) or not.
     * 
     */
    public Boolean isDisabled() {
        return this.isDisabled;
    }
    /**
     * @return The label ID.
     * 
     */
    public Optional<String> labelId() {
        return Optional.ofNullable(this.labelId);
    }
    /**
     * @return The label name.
     * 
     */
    public Optional<String> labelName() {
        return Optional.ofNullable(this.labelName);
    }
    /**
     * @return Resource that manages the sensitivity label.
     * 
     */
    public String managedBy() {
        return this.managedBy;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> rank() {
        return Optional.ofNullable(this.rank);
    }
    /**
     * @return The schema name.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }
    /**
     * @return The table name.
     * 
     */
    public String tableName() {
        return this.tableName;
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

    public static Builder builder(GetSensitivityLabelResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String columnName;
        private String id;
        private @Nullable String informationType;
        private @Nullable String informationTypeId;
        private Boolean isDisabled;
        private @Nullable String labelId;
        private @Nullable String labelName;
        private String managedBy;
        private String name;
        private @Nullable String rank;
        private String schemaName;
        private String tableName;
        private String type;
        public Builder() {}
        public Builder(GetSensitivityLabelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.id = defaults.id;
    	      this.informationType = defaults.informationType;
    	      this.informationTypeId = defaults.informationTypeId;
    	      this.isDisabled = defaults.isDisabled;
    	      this.labelId = defaults.labelId;
    	      this.labelName = defaults.labelName;
    	      this.managedBy = defaults.managedBy;
    	      this.name = defaults.name;
    	      this.rank = defaults.rank;
    	      this.schemaName = defaults.schemaName;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder columnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder informationType(@Nullable String informationType) {
            this.informationType = informationType;
            return this;
        }
        @CustomType.Setter
        public Builder informationTypeId(@Nullable String informationTypeId) {
            this.informationTypeId = informationTypeId;
            return this;
        }
        @CustomType.Setter
        public Builder isDisabled(Boolean isDisabled) {
            this.isDisabled = Objects.requireNonNull(isDisabled);
            return this;
        }
        @CustomType.Setter
        public Builder labelId(@Nullable String labelId) {
            this.labelId = labelId;
            return this;
        }
        @CustomType.Setter
        public Builder labelName(@Nullable String labelName) {
            this.labelName = labelName;
            return this;
        }
        @CustomType.Setter
        public Builder managedBy(String managedBy) {
            this.managedBy = Objects.requireNonNull(managedBy);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder rank(@Nullable String rank) {
            this.rank = rank;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        @CustomType.Setter
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSensitivityLabelResult build() {
            final var o = new GetSensitivityLabelResult();
            o.columnName = columnName;
            o.id = id;
            o.informationType = informationType;
            o.informationTypeId = informationTypeId;
            o.isDisabled = isDisabled;
            o.labelId = labelId;
            o.labelName = labelName;
            o.managedBy = managedBy;
            o.name = name;
            o.rank = rank;
            o.schemaName = schemaName;
            o.tableName = tableName;
            o.type = type;
            return o;
        }
    }
}
