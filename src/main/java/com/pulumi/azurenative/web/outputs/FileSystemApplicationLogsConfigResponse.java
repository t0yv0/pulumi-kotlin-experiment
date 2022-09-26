// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FileSystemApplicationLogsConfigResponse {
    /**
     * @return Log level.
     * 
     */
    private @Nullable String level;

    private FileSystemApplicationLogsConfigResponse() {}
    /**
     * @return Log level.
     * 
     */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemApplicationLogsConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String level;
        public Builder() {}
        public Builder(FileSystemApplicationLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
        }

        @CustomType.Setter
        public Builder level(@Nullable String level) {
            this.level = level;
            return this;
        }
        public FileSystemApplicationLogsConfigResponse build() {
            final var o = new FileSystemApplicationLogsConfigResponse();
            o.level = level;
            return o;
        }
    }
}