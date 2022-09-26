// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.azurenative.resources.outputs.DebugSettingResponse;
import com.pulumi.azurenative.resources.outputs.DependencyResponse;
import com.pulumi.azurenative.resources.outputs.ErrorResponseResponse;
import com.pulumi.azurenative.resources.outputs.OnErrorDeploymentExtendedResponse;
import com.pulumi.azurenative.resources.outputs.ParametersLinkResponse;
import com.pulumi.azurenative.resources.outputs.ProviderResponse;
import com.pulumi.azurenative.resources.outputs.ResourceReferenceResponse;
import com.pulumi.azurenative.resources.outputs.TemplateLinkResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DeploymentPropertiesExtendedResponse {
    /**
     * @return The correlation ID of the deployment.
     * 
     */
    private String correlationId;
    /**
     * @return The debug setting of the deployment.
     * 
     */
    private DebugSettingResponse debugSetting;
    /**
     * @return The list of deployment dependencies.
     * 
     */
    private List<DependencyResponse> dependencies;
    /**
     * @return The duration of the template deployment.
     * 
     */
    private String duration;
    /**
     * @return The deployment error.
     * 
     */
    private ErrorResponseResponse error;
    /**
     * @return The deployment mode. Possible values are Incremental and Complete.
     * 
     */
    private String mode;
    /**
     * @return The deployment on error behavior.
     * 
     */
    private OnErrorDeploymentExtendedResponse onErrorDeployment;
    /**
     * @return Array of provisioned resources.
     * 
     */
    private List<ResourceReferenceResponse> outputResources;
    /**
     * @return Key/value pairs that represent deployment output.
     * 
     */
    private Object outputs;
    /**
     * @return Deployment parameters.
     * 
     */
    private Object parameters;
    /**
     * @return The URI referencing the parameters.
     * 
     */
    private ParametersLinkResponse parametersLink;
    /**
     * @return The list of resource providers needed for the deployment.
     * 
     */
    private List<ProviderResponse> providers;
    /**
     * @return Denotes the state of provisioning.
     * 
     */
    private String provisioningState;
    /**
     * @return The hash produced for the template.
     * 
     */
    private String templateHash;
    /**
     * @return The URI referencing the template.
     * 
     */
    private TemplateLinkResponse templateLink;
    /**
     * @return The timestamp of the template deployment.
     * 
     */
    private String timestamp;
    /**
     * @return Array of validated resources.
     * 
     */
    private List<ResourceReferenceResponse> validatedResources;

    private DeploymentPropertiesExtendedResponse() {}
    /**
     * @return The correlation ID of the deployment.
     * 
     */
    public String correlationId() {
        return this.correlationId;
    }
    /**
     * @return The debug setting of the deployment.
     * 
     */
    public DebugSettingResponse debugSetting() {
        return this.debugSetting;
    }
    /**
     * @return The list of deployment dependencies.
     * 
     */
    public List<DependencyResponse> dependencies() {
        return this.dependencies;
    }
    /**
     * @return The duration of the template deployment.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return The deployment error.
     * 
     */
    public ErrorResponseResponse error() {
        return this.error;
    }
    /**
     * @return The deployment mode. Possible values are Incremental and Complete.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return The deployment on error behavior.
     * 
     */
    public OnErrorDeploymentExtendedResponse onErrorDeployment() {
        return this.onErrorDeployment;
    }
    /**
     * @return Array of provisioned resources.
     * 
     */
    public List<ResourceReferenceResponse> outputResources() {
        return this.outputResources;
    }
    /**
     * @return Key/value pairs that represent deployment output.
     * 
     */
    public Object outputs() {
        return this.outputs;
    }
    /**
     * @return Deployment parameters.
     * 
     */
    public Object parameters() {
        return this.parameters;
    }
    /**
     * @return The URI referencing the parameters.
     * 
     */
    public ParametersLinkResponse parametersLink() {
        return this.parametersLink;
    }
    /**
     * @return The list of resource providers needed for the deployment.
     * 
     */
    public List<ProviderResponse> providers() {
        return this.providers;
    }
    /**
     * @return Denotes the state of provisioning.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The hash produced for the template.
     * 
     */
    public String templateHash() {
        return this.templateHash;
    }
    /**
     * @return The URI referencing the template.
     * 
     */
    public TemplateLinkResponse templateLink() {
        return this.templateLink;
    }
    /**
     * @return The timestamp of the template deployment.
     * 
     */
    public String timestamp() {
        return this.timestamp;
    }
    /**
     * @return Array of validated resources.
     * 
     */
    public List<ResourceReferenceResponse> validatedResources() {
        return this.validatedResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentPropertiesExtendedResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String correlationId;
        private DebugSettingResponse debugSetting;
        private List<DependencyResponse> dependencies;
        private String duration;
        private ErrorResponseResponse error;
        private String mode;
        private OnErrorDeploymentExtendedResponse onErrorDeployment;
        private List<ResourceReferenceResponse> outputResources;
        private Object outputs;
        private Object parameters;
        private ParametersLinkResponse parametersLink;
        private List<ProviderResponse> providers;
        private String provisioningState;
        private String templateHash;
        private TemplateLinkResponse templateLink;
        private String timestamp;
        private List<ResourceReferenceResponse> validatedResources;
        public Builder() {}
        public Builder(DeploymentPropertiesExtendedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.correlationId = defaults.correlationId;
    	      this.debugSetting = defaults.debugSetting;
    	      this.dependencies = defaults.dependencies;
    	      this.duration = defaults.duration;
    	      this.error = defaults.error;
    	      this.mode = defaults.mode;
    	      this.onErrorDeployment = defaults.onErrorDeployment;
    	      this.outputResources = defaults.outputResources;
    	      this.outputs = defaults.outputs;
    	      this.parameters = defaults.parameters;
    	      this.parametersLink = defaults.parametersLink;
    	      this.providers = defaults.providers;
    	      this.provisioningState = defaults.provisioningState;
    	      this.templateHash = defaults.templateHash;
    	      this.templateLink = defaults.templateLink;
    	      this.timestamp = defaults.timestamp;
    	      this.validatedResources = defaults.validatedResources;
        }

        @CustomType.Setter
        public Builder correlationId(String correlationId) {
            this.correlationId = Objects.requireNonNull(correlationId);
            return this;
        }
        @CustomType.Setter
        public Builder debugSetting(DebugSettingResponse debugSetting) {
            this.debugSetting = Objects.requireNonNull(debugSetting);
            return this;
        }
        @CustomType.Setter
        public Builder dependencies(List<DependencyResponse> dependencies) {
            this.dependencies = Objects.requireNonNull(dependencies);
            return this;
        }
        public Builder dependencies(DependencyResponse... dependencies) {
            return dependencies(List.of(dependencies));
        }
        @CustomType.Setter
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        @CustomType.Setter
        public Builder error(ErrorResponseResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        @CustomType.Setter
        public Builder onErrorDeployment(OnErrorDeploymentExtendedResponse onErrorDeployment) {
            this.onErrorDeployment = Objects.requireNonNull(onErrorDeployment);
            return this;
        }
        @CustomType.Setter
        public Builder outputResources(List<ResourceReferenceResponse> outputResources) {
            this.outputResources = Objects.requireNonNull(outputResources);
            return this;
        }
        public Builder outputResources(ResourceReferenceResponse... outputResources) {
            return outputResources(List.of(outputResources));
        }
        @CustomType.Setter
        public Builder outputs(Object outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(Object parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        @CustomType.Setter
        public Builder parametersLink(ParametersLinkResponse parametersLink) {
            this.parametersLink = Objects.requireNonNull(parametersLink);
            return this;
        }
        @CustomType.Setter
        public Builder providers(List<ProviderResponse> providers) {
            this.providers = Objects.requireNonNull(providers);
            return this;
        }
        public Builder providers(ProviderResponse... providers) {
            return providers(List.of(providers));
        }
        @CustomType.Setter
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        @CustomType.Setter
        public Builder templateHash(String templateHash) {
            this.templateHash = Objects.requireNonNull(templateHash);
            return this;
        }
        @CustomType.Setter
        public Builder templateLink(TemplateLinkResponse templateLink) {
            this.templateLink = Objects.requireNonNull(templateLink);
            return this;
        }
        @CustomType.Setter
        public Builder timestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }
        @CustomType.Setter
        public Builder validatedResources(List<ResourceReferenceResponse> validatedResources) {
            this.validatedResources = Objects.requireNonNull(validatedResources);
            return this;
        }
        public Builder validatedResources(ResourceReferenceResponse... validatedResources) {
            return validatedResources(List.of(validatedResources));
        }
        public DeploymentPropertiesExtendedResponse build() {
            final var o = new DeploymentPropertiesExtendedResponse();
            o.correlationId = correlationId;
            o.debugSetting = debugSetting;
            o.dependencies = dependencies;
            o.duration = duration;
            o.error = error;
            o.mode = mode;
            o.onErrorDeployment = onErrorDeployment;
            o.outputResources = outputResources;
            o.outputs = outputs;
            o.parameters = parameters;
            o.parametersLink = parametersLink;
            o.providers = providers;
            o.provisioningState = provisioningState;
            o.templateHash = templateHash;
            o.templateLink = templateLink;
            o.timestamp = timestamp;
            o.validatedResources = validatedResources;
            return o;
        }
    }
}