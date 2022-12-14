// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.ApiResourceBackendServiceResponse;
import com.pulumi.azurenative.web.outputs.ApiResourceDefinitionsResponse;
import com.pulumi.azurenative.web.outputs.ConnectionParameterResponse;
import com.pulumi.azurenative.web.outputs.WsdlDefinitionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomApiPropertiesDefinitionResponse {
    /**
     * @return API Definitions
     * 
     */
    private @Nullable ApiResourceDefinitionsResponse apiDefinitions;
    /**
     * @return The API type
     * 
     */
    private @Nullable String apiType;
    /**
     * @return The API backend service
     * 
     */
    private @Nullable ApiResourceBackendServiceResponse backendService;
    /**
     * @return Brand color
     * 
     */
    private @Nullable String brandColor;
    /**
     * @return The custom API capabilities
     * 
     */
    private @Nullable List<String> capabilities;
    /**
     * @return Connection parameters
     * 
     */
    private @Nullable Map<String,ConnectionParameterResponse> connectionParameters;
    /**
     * @return The custom API description
     * 
     */
    private @Nullable String description;
    /**
     * @return The display name
     * 
     */
    private @Nullable String displayName;
    /**
     * @return The icon URI
     * 
     */
    private @Nullable String iconUri;
    /**
     * @return Runtime URLs
     * 
     */
    private @Nullable List<String> runtimeUrls;
    /**
     * @return The JSON representation of the swagger
     * 
     */
    private @Nullable Object swagger;
    /**
     * @return The WSDL definition
     * 
     */
    private @Nullable WsdlDefinitionResponse wsdlDefinition;

    private CustomApiPropertiesDefinitionResponse() {}
    /**
     * @return API Definitions
     * 
     */
    public Optional<ApiResourceDefinitionsResponse> apiDefinitions() {
        return Optional.ofNullable(this.apiDefinitions);
    }
    /**
     * @return The API type
     * 
     */
    public Optional<String> apiType() {
        return Optional.ofNullable(this.apiType);
    }
    /**
     * @return The API backend service
     * 
     */
    public Optional<ApiResourceBackendServiceResponse> backendService() {
        return Optional.ofNullable(this.backendService);
    }
    /**
     * @return Brand color
     * 
     */
    public Optional<String> brandColor() {
        return Optional.ofNullable(this.brandColor);
    }
    /**
     * @return The custom API capabilities
     * 
     */
    public List<String> capabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }
    /**
     * @return Connection parameters
     * 
     */
    public Map<String,ConnectionParameterResponse> connectionParameters() {
        return this.connectionParameters == null ? Map.of() : this.connectionParameters;
    }
    /**
     * @return The custom API description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The display name
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The icon URI
     * 
     */
    public Optional<String> iconUri() {
        return Optional.ofNullable(this.iconUri);
    }
    /**
     * @return Runtime URLs
     * 
     */
    public List<String> runtimeUrls() {
        return this.runtimeUrls == null ? List.of() : this.runtimeUrls;
    }
    /**
     * @return The JSON representation of the swagger
     * 
     */
    public Optional<Object> swagger() {
        return Optional.ofNullable(this.swagger);
    }
    /**
     * @return The WSDL definition
     * 
     */
    public Optional<WsdlDefinitionResponse> wsdlDefinition() {
        return Optional.ofNullable(this.wsdlDefinition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomApiPropertiesDefinitionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApiResourceDefinitionsResponse apiDefinitions;
        private @Nullable String apiType;
        private @Nullable ApiResourceBackendServiceResponse backendService;
        private @Nullable String brandColor;
        private @Nullable List<String> capabilities;
        private @Nullable Map<String,ConnectionParameterResponse> connectionParameters;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String iconUri;
        private @Nullable List<String> runtimeUrls;
        private @Nullable Object swagger;
        private @Nullable WsdlDefinitionResponse wsdlDefinition;
        public Builder() {}
        public Builder(CustomApiPropertiesDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiDefinitions = defaults.apiDefinitions;
    	      this.apiType = defaults.apiType;
    	      this.backendService = defaults.backendService;
    	      this.brandColor = defaults.brandColor;
    	      this.capabilities = defaults.capabilities;
    	      this.connectionParameters = defaults.connectionParameters;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.iconUri = defaults.iconUri;
    	      this.runtimeUrls = defaults.runtimeUrls;
    	      this.swagger = defaults.swagger;
    	      this.wsdlDefinition = defaults.wsdlDefinition;
        }

        @CustomType.Setter
        public Builder apiDefinitions(@Nullable ApiResourceDefinitionsResponse apiDefinitions) {
            this.apiDefinitions = apiDefinitions;
            return this;
        }
        @CustomType.Setter
        public Builder apiType(@Nullable String apiType) {
            this.apiType = apiType;
            return this;
        }
        @CustomType.Setter
        public Builder backendService(@Nullable ApiResourceBackendServiceResponse backendService) {
            this.backendService = backendService;
            return this;
        }
        @CustomType.Setter
        public Builder brandColor(@Nullable String brandColor) {
            this.brandColor = brandColor;
            return this;
        }
        @CustomType.Setter
        public Builder capabilities(@Nullable List<String> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }
        @CustomType.Setter
        public Builder connectionParameters(@Nullable Map<String,ConnectionParameterResponse> connectionParameters) {
            this.connectionParameters = connectionParameters;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder iconUri(@Nullable String iconUri) {
            this.iconUri = iconUri;
            return this;
        }
        @CustomType.Setter
        public Builder runtimeUrls(@Nullable List<String> runtimeUrls) {
            this.runtimeUrls = runtimeUrls;
            return this;
        }
        public Builder runtimeUrls(String... runtimeUrls) {
            return runtimeUrls(List.of(runtimeUrls));
        }
        @CustomType.Setter
        public Builder swagger(@Nullable Object swagger) {
            this.swagger = swagger;
            return this;
        }
        @CustomType.Setter
        public Builder wsdlDefinition(@Nullable WsdlDefinitionResponse wsdlDefinition) {
            this.wsdlDefinition = wsdlDefinition;
            return this;
        }
        public CustomApiPropertiesDefinitionResponse build() {
            final var o = new CustomApiPropertiesDefinitionResponse();
            o.apiDefinitions = apiDefinitions;
            o.apiType = apiType;
            o.backendService = backendService;
            o.brandColor = brandColor;
            o.capabilities = capabilities;
            o.connectionParameters = connectionParameters;
            o.description = description;
            o.displayName = displayName;
            o.iconUri = iconUri;
            o.runtimeUrls = runtimeUrls;
            o.swagger = swagger;
            o.wsdlDefinition = wsdlDefinition;
            return o;
        }
    }
}
