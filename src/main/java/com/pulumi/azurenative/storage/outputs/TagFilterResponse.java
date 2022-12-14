// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TagFilterResponse {
    /**
     * @return This is the filter tag name, it can have 1 - 128 characters
     * 
     */
    private String name;
    /**
     * @return This is the comparison operator which is used for object comparison and filtering. Only == (equality operator) is currently supported
     * 
     */
    private String op;
    /**
     * @return This is the filter tag value field used for tag based filtering, it can have 0 - 256 characters
     * 
     */
    private String value;

    private TagFilterResponse() {}
    /**
     * @return This is the filter tag name, it can have 1 - 128 characters
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return This is the comparison operator which is used for object comparison and filtering. Only == (equality operator) is currently supported
     * 
     */
    public String op() {
        return this.op;
    }
    /**
     * @return This is the filter tag value field used for tag based filtering, it can have 0 - 256 characters
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagFilterResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String op;
        private String value;
        public Builder() {}
        public Builder(TagFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.op = defaults.op;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder op(String op) {
            this.op = Objects.requireNonNull(op);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TagFilterResponse build() {
            final var o = new TagFilterResponse();
            o.name = name;
            o.op = op;
            o.value = value;
            return o;
        }
    }
}
