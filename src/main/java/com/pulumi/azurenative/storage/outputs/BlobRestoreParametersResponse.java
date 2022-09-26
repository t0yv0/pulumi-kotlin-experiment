// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.BlobRestoreRangeResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BlobRestoreParametersResponse {
    /**
     * @return Blob ranges to restore.
     * 
     */
    private List<BlobRestoreRangeResponse> blobRanges;
    /**
     * @return Restore blob to the specified time.
     * 
     */
    private String timeToRestore;

    private BlobRestoreParametersResponse() {}
    /**
     * @return Blob ranges to restore.
     * 
     */
    public List<BlobRestoreRangeResponse> blobRanges() {
        return this.blobRanges;
    }
    /**
     * @return Restore blob to the specified time.
     * 
     */
    public String timeToRestore() {
        return this.timeToRestore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobRestoreParametersResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BlobRestoreRangeResponse> blobRanges;
        private String timeToRestore;
        public Builder() {}
        public Builder(BlobRestoreParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobRanges = defaults.blobRanges;
    	      this.timeToRestore = defaults.timeToRestore;
        }

        @CustomType.Setter
        public Builder blobRanges(List<BlobRestoreRangeResponse> blobRanges) {
            this.blobRanges = Objects.requireNonNull(blobRanges);
            return this;
        }
        public Builder blobRanges(BlobRestoreRangeResponse... blobRanges) {
            return blobRanges(List.of(blobRanges));
        }
        @CustomType.Setter
        public Builder timeToRestore(String timeToRestore) {
            this.timeToRestore = Objects.requireNonNull(timeToRestore);
            return this;
        }
        public BlobRestoreParametersResponse build() {
            final var o = new BlobRestoreParametersResponse();
            o.blobRanges = blobRanges;
            o.timeToRestore = timeToRestore;
            return o;
        }
    }
}
