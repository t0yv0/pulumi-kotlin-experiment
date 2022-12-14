// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListWebAppFunctionSecretsSlotResult {
    /**
     * @return Secret key.
     * 
     */
    private @Nullable String key;
    /**
     * @return Trigger URL.
     * 
     */
    private @Nullable String triggerUrl;

    private ListWebAppFunctionSecretsSlotResult() {}
    /**
     * @return Secret key.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Trigger URL.
     * 
     */
    public Optional<String> triggerUrl() {
        return Optional.ofNullable(this.triggerUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppFunctionSecretsSlotResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String triggerUrl;
        public Builder() {}
        public Builder(ListWebAppFunctionSecretsSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.triggerUrl = defaults.triggerUrl;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder triggerUrl(@Nullable String triggerUrl) {
            this.triggerUrl = triggerUrl;
            return this;
        }
        public ListWebAppFunctionSecretsSlotResult build() {
            final var o = new ListWebAppFunctionSecretsSlotResult();
            o.key = key;
            o.triggerUrl = triggerUrl;
            return o;
        }
    }
}
