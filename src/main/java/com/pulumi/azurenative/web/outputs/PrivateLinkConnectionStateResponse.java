// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateLinkConnectionStateResponse {
    /**
     * @return ActionsRequired for a private link connection
     * 
     */
    private @Nullable String actionsRequired;
    /**
     * @return Description of a private link connection
     * 
     */
    private @Nullable String description;
    /**
     * @return Status of a private link connection
     * 
     */
    private @Nullable String status;

    private PrivateLinkConnectionStateResponse() {}
    /**
     * @return ActionsRequired for a private link connection
     * 
     */
    public Optional<String> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }
    /**
     * @return Description of a private link connection
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Status of a private link connection
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkConnectionStateResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String actionsRequired;
        private @Nullable String description;
        private @Nullable String status;
        public Builder() {}
        public Builder(PrivateLinkConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder actionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public PrivateLinkConnectionStateResponse build() {
            final var o = new PrivateLinkConnectionStateResponse();
            o.actionsRequired = actionsRequired;
            o.description = description;
            o.status = status;
            return o;
        }
    }
}
