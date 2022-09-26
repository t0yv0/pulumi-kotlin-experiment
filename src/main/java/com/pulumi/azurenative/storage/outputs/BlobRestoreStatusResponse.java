// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.BlobRestoreParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BlobRestoreStatusResponse {
    /**
     * @return Failure reason when blob restore is failed.
     * 
     */
    private String failureReason;
    /**
     * @return Blob restore request parameters.
     * 
     */
    private BlobRestoreParametersResponse parameters;
    /**
     * @return Id for tracking blob restore request.
     * 
     */
    private String restoreId;
    /**
     * @return The status of blob restore progress. Possible values are: - InProgress: Indicates that blob restore is ongoing. - Complete: Indicates that blob restore has been completed successfully. - Failed: Indicates that blob restore is failed.
     * 
     */
    private String status;

    private BlobRestoreStatusResponse() {}
    /**
     * @return Failure reason when blob restore is failed.
     * 
     */
    public String failureReason() {
        return this.failureReason;
    }
    /**
     * @return Blob restore request parameters.
     * 
     */
    public BlobRestoreParametersResponse parameters() {
        return this.parameters;
    }
    /**
     * @return Id for tracking blob restore request.
     * 
     */
    public String restoreId() {
        return this.restoreId;
    }
    /**
     * @return The status of blob restore progress. Possible values are: - InProgress: Indicates that blob restore is ongoing. - Complete: Indicates that blob restore has been completed successfully. - Failed: Indicates that blob restore is failed.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobRestoreStatusResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String failureReason;
        private BlobRestoreParametersResponse parameters;
        private String restoreId;
        private String status;
        public Builder() {}
        public Builder(BlobRestoreStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureReason = defaults.failureReason;
    	      this.parameters = defaults.parameters;
    	      this.restoreId = defaults.restoreId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder failureReason(String failureReason) {
            this.failureReason = Objects.requireNonNull(failureReason);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(BlobRestoreParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        @CustomType.Setter
        public Builder restoreId(String restoreId) {
            this.restoreId = Objects.requireNonNull(restoreId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public BlobRestoreStatusResponse build() {
            final var o = new BlobRestoreStatusResponse();
            o.failureReason = failureReason;
            o.parameters = parameters;
            o.restoreId = restoreId;
            o.status = status;
            return o;
        }
    }
}
