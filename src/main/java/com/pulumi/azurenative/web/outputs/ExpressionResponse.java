// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.AzureResourceErrorInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExpressionResponse {
    /**
     * @return The azure resource error info.
     * 
     */
    private @Nullable AzureResourceErrorInfoResponse error;
    /**
     * @return The sub expressions.
     * 
     */
    private @Nullable List<ExpressionResponse> subexpressions;
    /**
     * @return The text.
     * 
     */
    private @Nullable String text;
    private @Nullable Object value;

    private ExpressionResponse() {}
    /**
     * @return The azure resource error info.
     * 
     */
    public Optional<AzureResourceErrorInfoResponse> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * @return The sub expressions.
     * 
     */
    public List<ExpressionResponse> subexpressions() {
        return this.subexpressions == null ? List.of() : this.subexpressions;
    }
    /**
     * @return The text.
     * 
     */
    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }
    public Optional<Object> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AzureResourceErrorInfoResponse error;
        private @Nullable List<ExpressionResponse> subexpressions;
        private @Nullable String text;
        private @Nullable Object value;
        public Builder() {}
        public Builder(ExpressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.subexpressions = defaults.subexpressions;
    	      this.text = defaults.text;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder error(@Nullable AzureResourceErrorInfoResponse error) {
            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder subexpressions(@Nullable List<ExpressionResponse> subexpressions) {
            this.subexpressions = subexpressions;
            return this;
        }
        public Builder subexpressions(ExpressionResponse... subexpressions) {
            return subexpressions(List.of(subexpressions));
        }
        @CustomType.Setter
        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Object value) {
            this.value = value;
            return this;
        }
        public ExpressionResponse build() {
            final var o = new ExpressionResponse();
            o.error = error;
            o.subexpressions = subexpressions;
            o.text = text;
            o.value = value;
            return o;
        }
    }
}
