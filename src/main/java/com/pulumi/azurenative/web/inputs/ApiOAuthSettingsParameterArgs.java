// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * OAuth settings for the API
 * 
 */
public final class ApiOAuthSettingsParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiOAuthSettingsParameterArgs Empty = new ApiOAuthSettingsParameterArgs();

    /**
     * Options available to this parameter
     * 
     */
    @Import(name="options")
    private @Nullable Output<Object> options;

    /**
     * @return Options available to this parameter
     * 
     */
    public Optional<Output<Object>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * UI definitions per culture as caller can specify the culture
     * 
     */
    @Import(name="uiDefinition")
    private @Nullable Output<Object> uiDefinition;

    /**
     * @return UI definitions per culture as caller can specify the culture
     * 
     */
    public Optional<Output<Object>> uiDefinition() {
        return Optional.ofNullable(this.uiDefinition);
    }

    /**
     * Value of the setting
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the setting
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ApiOAuthSettingsParameterArgs() {}

    private ApiOAuthSettingsParameterArgs(ApiOAuthSettingsParameterArgs $) {
        this.options = $.options;
        this.uiDefinition = $.uiDefinition;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiOAuthSettingsParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiOAuthSettingsParameterArgs $;

        public Builder() {
            $ = new ApiOAuthSettingsParameterArgs();
        }

        public Builder(ApiOAuthSettingsParameterArgs defaults) {
            $ = new ApiOAuthSettingsParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param options Options available to this parameter
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<Object> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options Options available to this parameter
         * 
         * @return builder
         * 
         */
        public Builder options(Object options) {
            return options(Output.of(options));
        }

        /**
         * @param uiDefinition UI definitions per culture as caller can specify the culture
         * 
         * @return builder
         * 
         */
        public Builder uiDefinition(@Nullable Output<Object> uiDefinition) {
            $.uiDefinition = uiDefinition;
            return this;
        }

        /**
         * @param uiDefinition UI definitions per culture as caller can specify the culture
         * 
         * @return builder
         * 
         */
        public Builder uiDefinition(Object uiDefinition) {
            return uiDefinition(Output.of(uiDefinition));
        }

        /**
         * @param value Value of the setting
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the setting
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ApiOAuthSettingsParameterArgs build() {
            return $;
        }
    }

}
