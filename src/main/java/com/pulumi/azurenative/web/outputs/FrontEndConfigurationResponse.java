// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontEndConfigurationResponse {
    private @Nullable String kind;

    private FrontEndConfigurationResponse() {}
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontEndConfigurationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String kind;
        public Builder() {}
        public Builder(FrontEndConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
        }

        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public FrontEndConfigurationResponse build() {
            final var o = new FrontEndConfigurationResponse();
            o.kind = kind;
            return o;
        }
    }
}
