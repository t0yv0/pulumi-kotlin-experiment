// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppSlotConfigurationNamesResult {
    /**
     * @return List of application settings names.
     * 
     */
    private @Nullable List<String> appSettingNames;
    /**
     * @return List of external Azure storage account identifiers.
     * 
     */
    private @Nullable List<String> azureStorageConfigNames;
    /**
     * @return List of connection string names.
     * 
     */
    private @Nullable List<String> connectionStringNames;
    /**
     * @return Resource Id.
     * 
     */
    private String id;
    /**
     * @return Kind of resource.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Resource Name.
     * 
     */
    private String name;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetWebAppSlotConfigurationNamesResult() {}
    /**
     * @return List of application settings names.
     * 
     */
    public List<String> appSettingNames() {
        return this.appSettingNames == null ? List.of() : this.appSettingNames;
    }
    /**
     * @return List of external Azure storage account identifiers.
     * 
     */
    public List<String> azureStorageConfigNames() {
        return this.azureStorageConfigNames == null ? List.of() : this.azureStorageConfigNames;
    }
    /**
     * @return List of connection string names.
     * 
     */
    public List<String> connectionStringNames() {
        return this.connectionStringNames == null ? List.of() : this.connectionStringNames;
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
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

    public static Builder builder(GetWebAppSlotConfigurationNamesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> appSettingNames;
        private @Nullable List<String> azureStorageConfigNames;
        private @Nullable List<String> connectionStringNames;
        private String id;
        private @Nullable String kind;
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetWebAppSlotConfigurationNamesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSettingNames = defaults.appSettingNames;
    	      this.azureStorageConfigNames = defaults.azureStorageConfigNames;
    	      this.connectionStringNames = defaults.connectionStringNames;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder appSettingNames(@Nullable List<String> appSettingNames) {
            this.appSettingNames = appSettingNames;
            return this;
        }
        public Builder appSettingNames(String... appSettingNames) {
            return appSettingNames(List.of(appSettingNames));
        }
        @CustomType.Setter
        public Builder azureStorageConfigNames(@Nullable List<String> azureStorageConfigNames) {
            this.azureStorageConfigNames = azureStorageConfigNames;
            return this;
        }
        public Builder azureStorageConfigNames(String... azureStorageConfigNames) {
            return azureStorageConfigNames(List.of(azureStorageConfigNames));
        }
        @CustomType.Setter
        public Builder connectionStringNames(@Nullable List<String> connectionStringNames) {
            this.connectionStringNames = connectionStringNames;
            return this;
        }
        public Builder connectionStringNames(String... connectionStringNames) {
            return connectionStringNames(List.of(connectionStringNames));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWebAppSlotConfigurationNamesResult build() {
            final var o = new GetWebAppSlotConfigurationNamesResult();
            o.appSettingNames = appSettingNames;
            o.azureStorageConfigNames = azureStorageConfigNames;
            o.connectionStringNames = connectionStringNames;
            o.id = id;
            o.kind = kind;
            o.name = name;
            o.type = type;
            return o;
        }
    }
}
