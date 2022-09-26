// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.DaprMetadataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DaprComponentResponse {
    /**
     * @return Component metadata
     * 
     */
    private @Nullable List<DaprMetadataResponse> metadata;
    /**
     * @return Component name
     * 
     */
    private @Nullable String name;
    /**
     * @return Component type
     * 
     */
    private @Nullable String type;
    /**
     * @return Component version
     * 
     */
    private @Nullable String version;

    private DaprComponentResponse() {}
    /**
     * @return Component metadata
     * 
     */
    public List<DaprMetadataResponse> metadata() {
        return this.metadata == null ? List.of() : this.metadata;
    }
    /**
     * @return Component name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Component type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Component version
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaprComponentResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DaprMetadataResponse> metadata;
        private @Nullable String name;
        private @Nullable String type;
        private @Nullable String version;
        public Builder() {}
        public Builder(DaprComponentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder metadata(@Nullable List<DaprMetadataResponse> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(DaprMetadataResponse... metadata) {
            return metadata(List.of(metadata));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public DaprComponentResponse build() {
            final var o = new DaprComponentResponse();
            o.metadata = metadata;
            o.name = name;
            o.type = type;
            o.version = version;
            return o;
        }
    }
}