// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.AzureResourceErrorInfoResponse;
import com.pulumi.azurenative.web.outputs.ExpressionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExpressionRootResponse {
    /**
     * @return The azure resource error info.
     * 
     */
    private @Nullable AzureResourceErrorInfoResponse error;
    /**
     * @return The path.
     * 
     */
    private @Nullable String path;
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

    private ExpressionRootResponse() {}
    /**
     * @return The azure resource error info.
     * 
     */
    public Optional<AzureResourceErrorInfoResponse> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * @return The path.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
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

    public static Builder builder(ExpressionRootResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AzureResourceErrorInfoResponse error;
        private @Nullable String path;
        private @Nullable List<ExpressionResponse> subexpressions;
        private @Nullable String text;
        private @Nullable Object value;
        public Builder() {}
        public Builder(ExpressionRootResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.path = defaults.path;
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
        public Builder path(@Nullable String path) {
            this.path = path;
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
        public ExpressionRootResponse build() {
            final var o = new ExpressionRootResponse();
            o.error = error;
            o.path = path;
            o.subexpressions = subexpressions;
            o.text = text;
            o.value = value;
            return o;
        }
    }
}
