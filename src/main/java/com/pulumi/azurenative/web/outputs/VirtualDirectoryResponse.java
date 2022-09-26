// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualDirectoryResponse {
    /**
     * @return Physical path.
     * 
     */
    private @Nullable String physicalPath;
    /**
     * @return Path to virtual application.
     * 
     */
    private @Nullable String virtualPath;

    private VirtualDirectoryResponse() {}
    /**
     * @return Physical path.
     * 
     */
    public Optional<String> physicalPath() {
        return Optional.ofNullable(this.physicalPath);
    }
    /**
     * @return Path to virtual application.
     * 
     */
    public Optional<String> virtualPath() {
        return Optional.ofNullable(this.virtualPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDirectoryResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String physicalPath;
        private @Nullable String virtualPath;
        public Builder() {}
        public Builder(VirtualDirectoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.virtualPath = defaults.virtualPath;
        }

        @CustomType.Setter
        public Builder physicalPath(@Nullable String physicalPath) {
            this.physicalPath = physicalPath;
            return this;
        }
        @CustomType.Setter
        public Builder virtualPath(@Nullable String virtualPath) {
            this.virtualPath = virtualPath;
            return this;
        }
        public VirtualDirectoryResponse build() {
            final var o = new VirtualDirectoryResponse();
            o.physicalPath = physicalPath;
            o.virtualPath = virtualPath;
            return o;
        }
    }
}
