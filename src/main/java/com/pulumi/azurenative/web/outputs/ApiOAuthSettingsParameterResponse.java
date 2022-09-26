// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApiOAuthSettingsParameterResponse {
    /**
     * @return Options available to this parameter
     * 
     */
    private @Nullable Object options;
    /**
     * @return UI definitions per culture as caller can specify the culture
     * 
     */
    private @Nullable Object uiDefinition;
    /**
     * @return Value of the setting
     * 
     */
    private @Nullable String value;

    private ApiOAuthSettingsParameterResponse() {}
    /**
     * @return Options available to this parameter
     * 
     */
    public Optional<Object> options() {
        return Optional.ofNullable(this.options);
    }
    /**
     * @return UI definitions per culture as caller can specify the culture
     * 
     */
    public Optional<Object> uiDefinition() {
        return Optional.ofNullable(this.uiDefinition);
    }
    /**
     * @return Value of the setting
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOAuthSettingsParameterResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Object options;
        private @Nullable Object uiDefinition;
        private @Nullable String value;
        public Builder() {}
        public Builder(ApiOAuthSettingsParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.options = defaults.options;
    	      this.uiDefinition = defaults.uiDefinition;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder options(@Nullable Object options) {
            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder uiDefinition(@Nullable Object uiDefinition) {
            this.uiDefinition = uiDefinition;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public ApiOAuthSettingsParameterResponse build() {
            final var o = new ApiOAuthSettingsParameterResponse();
            o.options = options;
            o.uiDefinition = uiDefinition;
            o.value = value;
            return o;
        }
    }
}
