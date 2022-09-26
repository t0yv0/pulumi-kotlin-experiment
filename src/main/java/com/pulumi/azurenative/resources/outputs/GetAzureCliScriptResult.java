// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.azurenative.resources.outputs.ContainerConfigurationResponse;
import com.pulumi.azurenative.resources.outputs.EnvironmentVariableResponse;
import com.pulumi.azurenative.resources.outputs.ManagedServiceIdentityResponse;
import com.pulumi.azurenative.resources.outputs.ScriptStatusResponse;
import com.pulumi.azurenative.resources.outputs.StorageAccountConfigurationResponse;
import com.pulumi.azurenative.resources.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAzureCliScriptResult {
    /**
     * @return Command line arguments to pass to the script. Arguments are separated by spaces. ex: -Name blue* -Location &#39;West US 2&#39;
     * 
     */
    private @Nullable String arguments;
    /**
     * @return Azure CLI module version to be used.
     * 
     */
    private String azCliVersion;
    /**
     * @return The clean up preference when the script execution gets in a terminal state. Default setting is &#39;Always&#39;.
     * 
     */
    private @Nullable String cleanupPreference;
    /**
     * @return Container settings.
     * 
     */
    private @Nullable ContainerConfigurationResponse containerSettings;
    /**
     * @return The environment variables to pass over to the script.
     * 
     */
    private @Nullable List<EnvironmentVariableResponse> environmentVariables;
    /**
     * @return Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID.
     * 
     */
    private @Nullable String forceUpdateTag;
    /**
     * @return String Id used to locate any resource on Azure.
     * 
     */
    private String id;
    /**
     * @return Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    private @Nullable ManagedServiceIdentityResponse identity;
    /**
     * @return Type of the script.
     * Expected value is &#39;AzureCLI&#39;.
     * 
     */
    private String kind;
    /**
     * @return The location of the ACI and the storage account for the deployment script.
     * 
     */
    private String location;
    /**
     * @return Name of this resource.
     * 
     */
    private String name;
    /**
     * @return List of script outputs.
     * 
     */
    private Map<String,Object> outputs;
    /**
     * @return Uri for the script. This is the entry point for the external script.
     * 
     */
    private @Nullable String primaryScriptUri;
    /**
     * @return State of the script execution. This only appears in the response.
     * 
     */
    private String provisioningState;
    /**
     * @return Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. Duration is based on ISO 8601 pattern (for example P1D means one day).
     * 
     */
    private String retentionInterval;
    /**
     * @return Script body.
     * 
     */
    private @Nullable String scriptContent;
    /**
     * @return Contains the results of script execution.
     * 
     */
    private ScriptStatusResponse status;
    /**
     * @return Storage Account settings.
     * 
     */
    private @Nullable StorageAccountConfigurationResponse storageAccountSettings;
    /**
     * @return Supporting files for the external script.
     * 
     */
    private @Nullable List<String> supportingScriptUris;
    /**
     * @return The system metadata related to this resource.
     * 
     */
    private SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return Maximum allowed script execution time specified in ISO 8601 format. Default value is P1D
     * 
     */
    private @Nullable String timeout;
    /**
     * @return Type of this resource.
     * 
     */
    private String type;

    private GetAzureCliScriptResult() {}
    /**
     * @return Command line arguments to pass to the script. Arguments are separated by spaces. ex: -Name blue* -Location &#39;West US 2&#39;
     * 
     */
    public Optional<String> arguments() {
        return Optional.ofNullable(this.arguments);
    }
    /**
     * @return Azure CLI module version to be used.
     * 
     */
    public String azCliVersion() {
        return this.azCliVersion;
    }
    /**
     * @return The clean up preference when the script execution gets in a terminal state. Default setting is &#39;Always&#39;.
     * 
     */
    public Optional<String> cleanupPreference() {
        return Optional.ofNullable(this.cleanupPreference);
    }
    /**
     * @return Container settings.
     * 
     */
    public Optional<ContainerConfigurationResponse> containerSettings() {
        return Optional.ofNullable(this.containerSettings);
    }
    /**
     * @return The environment variables to pass over to the script.
     * 
     */
    public List<EnvironmentVariableResponse> environmentVariables() {
        return this.environmentVariables == null ? List.of() : this.environmentVariables;
    }
    /**
     * @return Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID.
     * 
     */
    public Optional<String> forceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * @return String Id used to locate any resource on Azure.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    public Optional<ManagedServiceIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Type of the script.
     * Expected value is &#39;AzureCLI&#39;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The location of the ACI and the storage account for the deployment script.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Name of this resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of script outputs.
     * 
     */
    public Map<String,Object> outputs() {
        return this.outputs;
    }
    /**
     * @return Uri for the script. This is the entry point for the external script.
     * 
     */
    public Optional<String> primaryScriptUri() {
        return Optional.ofNullable(this.primaryScriptUri);
    }
    /**
     * @return State of the script execution. This only appears in the response.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. Duration is based on ISO 8601 pattern (for example P1D means one day).
     * 
     */
    public String retentionInterval() {
        return this.retentionInterval;
    }
    /**
     * @return Script body.
     * 
     */
    public Optional<String> scriptContent() {
        return Optional.ofNullable(this.scriptContent);
    }
    /**
     * @return Contains the results of script execution.
     * 
     */
    public ScriptStatusResponse status() {
        return this.status;
    }
    /**
     * @return Storage Account settings.
     * 
     */
    public Optional<StorageAccountConfigurationResponse> storageAccountSettings() {
        return Optional.ofNullable(this.storageAccountSettings);
    }
    /**
     * @return Supporting files for the external script.
     * 
     */
    public List<String> supportingScriptUris() {
        return this.supportingScriptUris == null ? List.of() : this.supportingScriptUris;
    }
    /**
     * @return The system metadata related to this resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Maximum allowed script execution time specified in ISO 8601 format. Default value is P1D
     * 
     */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return Type of this resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzureCliScriptResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arguments;
        private String azCliVersion;
        private @Nullable String cleanupPreference;
        private @Nullable ContainerConfigurationResponse containerSettings;
        private @Nullable List<EnvironmentVariableResponse> environmentVariables;
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private String kind;
        private String location;
        private String name;
        private Map<String,Object> outputs;
        private @Nullable String primaryScriptUri;
        private String provisioningState;
        private String retentionInterval;
        private @Nullable String scriptContent;
        private ScriptStatusResponse status;
        private @Nullable StorageAccountConfigurationResponse storageAccountSettings;
        private @Nullable List<String> supportingScriptUris;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable String timeout;
        private String type;
        public Builder() {}
        public Builder(GetAzureCliScriptResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.azCliVersion = defaults.azCliVersion;
    	      this.cleanupPreference = defaults.cleanupPreference;
    	      this.containerSettings = defaults.containerSettings;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.primaryScriptUri = defaults.primaryScriptUri;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retentionInterval = defaults.retentionInterval;
    	      this.scriptContent = defaults.scriptContent;
    	      this.status = defaults.status;
    	      this.storageAccountSettings = defaults.storageAccountSettings;
    	      this.supportingScriptUris = defaults.supportingScriptUris;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder arguments(@Nullable String arguments) {
            this.arguments = arguments;
            return this;
        }
        @CustomType.Setter
        public Builder azCliVersion(String azCliVersion) {
            this.azCliVersion = Objects.requireNonNull(azCliVersion);
            return this;
        }
        @CustomType.Setter
        public Builder cleanupPreference(@Nullable String cleanupPreference) {
            this.cleanupPreference = cleanupPreference;
            return this;
        }
        @CustomType.Setter
        public Builder containerSettings(@Nullable ContainerConfigurationResponse containerSettings) {
            this.containerSettings = containerSettings;
            return this;
        }
        @CustomType.Setter
        public Builder environmentVariables(@Nullable List<EnvironmentVariableResponse> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(EnvironmentVariableResponse... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }
        @CustomType.Setter
        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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
        public Builder outputs(Map<String,Object> outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }
        @CustomType.Setter
        public Builder primaryScriptUri(@Nullable String primaryScriptUri) {
            this.primaryScriptUri = primaryScriptUri;
            return this;
        }
        @CustomType.Setter
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        @CustomType.Setter
        public Builder retentionInterval(String retentionInterval) {
            this.retentionInterval = Objects.requireNonNull(retentionInterval);
            return this;
        }
        @CustomType.Setter
        public Builder scriptContent(@Nullable String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        @CustomType.Setter
        public Builder status(ScriptStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountSettings(@Nullable StorageAccountConfigurationResponse storageAccountSettings) {
            this.storageAccountSettings = storageAccountSettings;
            return this;
        }
        @CustomType.Setter
        public Builder supportingScriptUris(@Nullable List<String> supportingScriptUris) {
            this.supportingScriptUris = supportingScriptUris;
            return this;
        }
        public Builder supportingScriptUris(String... supportingScriptUris) {
            return supportingScriptUris(List.of(supportingScriptUris));
        }
        @CustomType.Setter
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAzureCliScriptResult build() {
            final var o = new GetAzureCliScriptResult();
            o.arguments = arguments;
            o.azCliVersion = azCliVersion;
            o.cleanupPreference = cleanupPreference;
            o.containerSettings = containerSettings;
            o.environmentVariables = environmentVariables;
            o.forceUpdateTag = forceUpdateTag;
            o.id = id;
            o.identity = identity;
            o.kind = kind;
            o.location = location;
            o.name = name;
            o.outputs = outputs;
            o.primaryScriptUri = primaryScriptUri;
            o.provisioningState = provisioningState;
            o.retentionInterval = retentionInterval;
            o.scriptContent = scriptContent;
            o.status = status;
            o.storageAccountSettings = storageAccountSettings;
            o.supportingScriptUris = supportingScriptUris;
            o.systemData = systemData;
            o.tags = tags;
            o.timeout = timeout;
            o.type = type;
            return o;
        }
    }
}
