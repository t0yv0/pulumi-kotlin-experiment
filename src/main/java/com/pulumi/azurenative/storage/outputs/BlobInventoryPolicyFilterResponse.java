// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BlobInventoryPolicyFilterResponse {
    /**
     * @return An array of predefined enum values. Valid values include blockBlob, appendBlob, pageBlob. Hns accounts does not support pageBlobs.
     * 
     */
    private List<String> blobTypes;
    /**
     * @return Includes blob versions in blob inventory when value set to true.
     * 
     */
    private @Nullable Boolean includeBlobVersions;
    /**
     * @return Includes blob snapshots in blob inventory when value set to true.
     * 
     */
    private @Nullable Boolean includeSnapshots;
    /**
     * @return An array of strings for blob prefixes to be matched.
     * 
     */
    private @Nullable List<String> prefixMatch;

    private BlobInventoryPolicyFilterResponse() {}
    /**
     * @return An array of predefined enum values. Valid values include blockBlob, appendBlob, pageBlob. Hns accounts does not support pageBlobs.
     * 
     */
    public List<String> blobTypes() {
        return this.blobTypes;
    }
    /**
     * @return Includes blob versions in blob inventory when value set to true.
     * 
     */
    public Optional<Boolean> includeBlobVersions() {
        return Optional.ofNullable(this.includeBlobVersions);
    }
    /**
     * @return Includes blob snapshots in blob inventory when value set to true.
     * 
     */
    public Optional<Boolean> includeSnapshots() {
        return Optional.ofNullable(this.includeSnapshots);
    }
    /**
     * @return An array of strings for blob prefixes to be matched.
     * 
     */
    public List<String> prefixMatch() {
        return this.prefixMatch == null ? List.of() : this.prefixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyFilterResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> blobTypes;
        private @Nullable Boolean includeBlobVersions;
        private @Nullable Boolean includeSnapshots;
        private @Nullable List<String> prefixMatch;
        public Builder() {}
        public Builder(BlobInventoryPolicyFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobTypes = defaults.blobTypes;
    	      this.includeBlobVersions = defaults.includeBlobVersions;
    	      this.includeSnapshots = defaults.includeSnapshots;
    	      this.prefixMatch = defaults.prefixMatch;
        }

        @CustomType.Setter
        public Builder blobTypes(List<String> blobTypes) {
            this.blobTypes = Objects.requireNonNull(blobTypes);
            return this;
        }
        public Builder blobTypes(String... blobTypes) {
            return blobTypes(List.of(blobTypes));
        }
        @CustomType.Setter
        public Builder includeBlobVersions(@Nullable Boolean includeBlobVersions) {
            this.includeBlobVersions = includeBlobVersions;
            return this;
        }
        @CustomType.Setter
        public Builder includeSnapshots(@Nullable Boolean includeSnapshots) {
            this.includeSnapshots = includeSnapshots;
            return this;
        }
        @CustomType.Setter
        public Builder prefixMatch(@Nullable List<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }
        public Builder prefixMatch(String... prefixMatch) {
            return prefixMatch(List.of(prefixMatch));
        }
        public BlobInventoryPolicyFilterResponse build() {
            final var o = new BlobInventoryPolicyFilterResponse();
            o.blobTypes = blobTypes;
            o.includeBlobVersions = includeBlobVersions;
            o.includeSnapshots = includeSnapshots;
            o.prefixMatch = prefixMatch;
            return o;
        }
    }
}
