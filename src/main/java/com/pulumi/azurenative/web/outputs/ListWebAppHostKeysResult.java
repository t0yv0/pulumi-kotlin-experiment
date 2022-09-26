// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListWebAppHostKeysResult {
    /**
     * @return Host level function keys.
     * 
     */
    private @Nullable Map<String,String> functionKeys;
    /**
     * @return Secret key.
     * 
     */
    private @Nullable String masterKey;
    /**
     * @return System keys.
     * 
     */
    private @Nullable Map<String,String> systemKeys;

    private ListWebAppHostKeysResult() {}
    /**
     * @return Host level function keys.
     * 
     */
    public Map<String,String> functionKeys() {
        return this.functionKeys == null ? Map.of() : this.functionKeys;
    }
    /**
     * @return Secret key.
     * 
     */
    public Optional<String> masterKey() {
        return Optional.ofNullable(this.masterKey);
    }
    /**
     * @return System keys.
     * 
     */
    public Map<String,String> systemKeys() {
        return this.systemKeys == null ? Map.of() : this.systemKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppHostKeysResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> functionKeys;
        private @Nullable String masterKey;
        private @Nullable Map<String,String> systemKeys;
        public Builder() {}
        public Builder(ListWebAppHostKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionKeys = defaults.functionKeys;
    	      this.masterKey = defaults.masterKey;
    	      this.systemKeys = defaults.systemKeys;
        }

        @CustomType.Setter
        public Builder functionKeys(@Nullable Map<String,String> functionKeys) {
            this.functionKeys = functionKeys;
            return this;
        }
        @CustomType.Setter
        public Builder masterKey(@Nullable String masterKey) {
            this.masterKey = masterKey;
            return this;
        }
        @CustomType.Setter
        public Builder systemKeys(@Nullable Map<String,String> systemKeys) {
            this.systemKeys = systemKeys;
            return this;
        }
        public ListWebAppHostKeysResult build() {
            final var o = new ListWebAppHostKeysResult();
            o.functionKeys = functionKeys;
            o.masterKey = masterKey;
            o.systemKeys = systemKeys;
            return o;
        }
    }
}