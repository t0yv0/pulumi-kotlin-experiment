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
public final class ErrorEntityResponse {
    /**
     * @return Basic error code.
     * 
     */
    private @Nullable String code;
    /**
     * @return Type of error.
     * 
     */
    private @Nullable String extendedCode;
    /**
     * @return Inner errors.
     * 
     */
    private @Nullable List<ErrorEntityResponse> innerErrors;
    /**
     * @return Any details of the error.
     * 
     */
    private @Nullable String message;
    /**
     * @return Message template.
     * 
     */
    private @Nullable String messageTemplate;
    /**
     * @return Parameters for the template.
     * 
     */
    private @Nullable List<String> parameters;

    private ErrorEntityResponse() {}
    /**
     * @return Basic error code.
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return Type of error.
     * 
     */
    public Optional<String> extendedCode() {
        return Optional.ofNullable(this.extendedCode);
    }
    /**
     * @return Inner errors.
     * 
     */
    public List<ErrorEntityResponse> innerErrors() {
        return this.innerErrors == null ? List.of() : this.innerErrors;
    }
    /**
     * @return Any details of the error.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return Message template.
     * 
     */
    public Optional<String> messageTemplate() {
        return Optional.ofNullable(this.messageTemplate);
    }
    /**
     * @return Parameters for the template.
     * 
     */
    public List<String> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorEntityResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String code;
        private @Nullable String extendedCode;
        private @Nullable List<ErrorEntityResponse> innerErrors;
        private @Nullable String message;
        private @Nullable String messageTemplate;
        private @Nullable List<String> parameters;
        public Builder() {}
        public Builder(ErrorEntityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.extendedCode = defaults.extendedCode;
    	      this.innerErrors = defaults.innerErrors;
    	      this.message = defaults.message;
    	      this.messageTemplate = defaults.messageTemplate;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder extendedCode(@Nullable String extendedCode) {
            this.extendedCode = extendedCode;
            return this;
        }
        @CustomType.Setter
        public Builder innerErrors(@Nullable List<ErrorEntityResponse> innerErrors) {
            this.innerErrors = innerErrors;
            return this;
        }
        public Builder innerErrors(ErrorEntityResponse... innerErrors) {
            return innerErrors(List.of(innerErrors));
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder messageTemplate(@Nullable String messageTemplate) {
            this.messageTemplate = messageTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }
        public ErrorEntityResponse build() {
            final var o = new ErrorEntityResponse();
            o.code = code;
            o.extendedCode = extendedCode;
            o.innerErrors = innerErrors;
            o.message = message;
            o.messageTemplate = messageTemplate;
            o.parameters = parameters;
            return o;
        }
    }
}
