// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DebugSettingResponse {
    /**
     * @return Specifies the type of information to log for debugging. The permitted values are none, requestContent, responseContent, or both requestContent and responseContent separated by a comma. The default is none. When setting this value, carefully consider the type of information you are passing in during deployment. By logging information about the request or response, you could potentially expose sensitive data that is retrieved through the deployment operations.
     * 
     */
    private @Nullable String detailLevel;

    private DebugSettingResponse() {}
    /**
     * @return Specifies the type of information to log for debugging. The permitted values are none, requestContent, responseContent, or both requestContent and responseContent separated by a comma. The default is none. When setting this value, carefully consider the type of information you are passing in during deployment. By logging information about the request or response, you could potentially expose sensitive data that is retrieved through the deployment operations.
     * 
     */
    public Optional<String> detailLevel() {
        return Optional.ofNullable(this.detailLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DebugSettingResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String detailLevel;
        public Builder() {}
        public Builder(DebugSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detailLevel = defaults.detailLevel;
        }

        @CustomType.Setter
        public Builder detailLevel(@Nullable String detailLevel) {
            this.detailLevel = detailLevel;
            return this;
        }
        public DebugSettingResponse build() {
            final var o = new DebugSettingResponse();
            o.detailLevel = detailLevel;
            return o;
        }
    }
}
