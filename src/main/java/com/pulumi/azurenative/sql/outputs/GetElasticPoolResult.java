// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.azurenative.sql.outputs.ElasticPoolPerDatabaseSettingsResponse;
import com.pulumi.azurenative.sql.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetElasticPoolResult {
    /**
     * @return The creation date of the elastic pool (ISO8601 format).
     * 
     */
    private String creationDate;
    /**
     * @return Resource ID.
     * 
     */
    private String id;
    /**
     * @return Kind of elastic pool. This is metadata used for the Azure portal experience.
     * 
     */
    private String kind;
    /**
     * @return The license type to apply for this elastic pool.
     * 
     */
    private @Nullable String licenseType;
    /**
     * @return Resource location.
     * 
     */
    private String location;
    /**
     * @return Maintenance configuration id assigned to the elastic pool. This configuration defines the period when the maintenance updates will will occur.
     * 
     */
    private @Nullable String maintenanceConfigurationId;
    /**
     * @return The storage limit for the database elastic pool in bytes.
     * 
     */
    private @Nullable Double maxSizeBytes;
    /**
     * @return Resource name.
     * 
     */
    private String name;
    /**
     * @return The per database settings for the elastic pool.
     * 
     */
    private @Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings;
    /**
     * @return The elastic pool SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or the following command:
     * 
     */
    private @Nullable SkuResponse sku;
    /**
     * @return The state of the elastic pool.
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
     * @return Whether or not this elastic pool is zone redundant, which means the replicas of this elastic pool will be spread across multiple availability zones.
     * 
     */
    private @Nullable Boolean zoneRedundant;

    private GetElasticPoolResult() {}
    /**
     * @return The creation date of the elastic pool (ISO8601 format).
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of elastic pool. This is metadata used for the Azure portal experience.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The license type to apply for this elastic pool.
     * 
     */
    public Optional<String> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * @return Resource location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Maintenance configuration id assigned to the elastic pool. This configuration defines the period when the maintenance updates will will occur.
     * 
     */
    public Optional<String> maintenanceConfigurationId() {
        return Optional.ofNullable(this.maintenanceConfigurationId);
    }
    /**
     * @return The storage limit for the database elastic pool in bytes.
     * 
     */
    public Optional<Double> maxSizeBytes() {
        return Optional.ofNullable(this.maxSizeBytes);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The per database settings for the elastic pool.
     * 
     */
    public Optional<ElasticPoolPerDatabaseSettingsResponse> perDatabaseSettings() {
        return Optional.ofNullable(this.perDatabaseSettings);
    }
    /**
     * @return The elastic pool SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or the following command:
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return The state of the elastic pool.
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
     * @return Whether or not this elastic pool is zone redundant, which means the replicas of this elastic pool will be spread across multiple availability zones.
     * 
     */
    public Optional<Boolean> zoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticPoolResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String creationDate;
        private String id;
        private String kind;
        private @Nullable String licenseType;
        private String location;
        private @Nullable String maintenanceConfigurationId;
        private @Nullable Double maxSizeBytes;
        private String name;
        private @Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings;
        private @Nullable SkuResponse sku;
        private String state;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable Boolean zoneRedundant;
        public Builder() {}
        public Builder(GetElasticPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.maxSizeBytes = defaults.maxSizeBytes;
    	      this.name = defaults.name;
    	      this.perDatabaseSettings = defaults.perDatabaseSettings;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zoneRedundant = defaults.zoneRedundant;
        }

        @CustomType.Setter
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder maxSizeBytes(@Nullable Double maxSizeBytes) {
            this.maxSizeBytes = maxSizeBytes;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder perDatabaseSettings(@Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings) {
            this.perDatabaseSettings = perDatabaseSettings;
            return this;
        }
        @CustomType.Setter
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
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
        public Builder zoneRedundant(@Nullable Boolean zoneRedundant) {
            this.zoneRedundant = zoneRedundant;
            return this;
        }
        public GetElasticPoolResult build() {
            final var o = new GetElasticPoolResult();
            o.creationDate = creationDate;
            o.id = id;
            o.kind = kind;
            o.licenseType = licenseType;
            o.location = location;
            o.maintenanceConfigurationId = maintenanceConfigurationId;
            o.maxSizeBytes = maxSizeBytes;
            o.name = name;
            o.perDatabaseSettings = perDatabaseSettings;
            o.sku = sku;
            o.state = state;
            o.tags = tags;
            o.type = type;
            o.zoneRedundant = zoneRedundant;
            return o;
        }
    }
}
