// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoHealCustomActionResponse {
    /**
     * @return Executable to be run.
     * 
     */
    private @Nullable String exe;
    /**
     * @return Parameters for the executable.
     * 
     */
    private @Nullable String parameters;

    private AutoHealCustomActionResponse() {}
    /**
     * @return Executable to be run.
     * 
     */
    public Optional<String> exe() {
        return Optional.ofNullable(this.exe);
    }
    /**
     * @return Parameters for the executable.
     * 
     */
    public Optional<String> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoHealCustomActionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String exe;
        private @Nullable String parameters;
        public Builder() {}
        public Builder(AutoHealCustomActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exe = defaults.exe;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder exe(@Nullable String exe) {
            this.exe = exe;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable String parameters) {
            this.parameters = parameters;
            return this;
        }
        public AutoHealCustomActionResponse build() {
            final var o = new AutoHealCustomActionResponse();
            o.exe = exe;
            o.parameters = parameters;
            return o;
        }
    }
}
