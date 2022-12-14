// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.azurenative.resources.outputs.ErrorResponseResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScriptStatusResponse {
    /**
     * @return ACI resource Id.
     * 
     */
    private String containerInstanceId;
    /**
     * @return End time of the script execution.
     * 
     */
    private String endTime;
    /**
     * @return Error that is relayed from the script execution.
     * 
     */
    private @Nullable ErrorResponseResponse error;
    /**
     * @return Time the deployment script resource will expire.
     * 
     */
    private String expirationTime;
    /**
     * @return Start time of the script execution.
     * 
     */
    private String startTime;
    /**
     * @return Storage account resource Id.
     * 
     */
    private String storageAccountId;

    private ScriptStatusResponse() {}
    /**
     * @return ACI resource Id.
     * 
     */
    public String containerInstanceId() {
        return this.containerInstanceId;
    }
    /**
     * @return End time of the script execution.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return Error that is relayed from the script execution.
     * 
     */
    public Optional<ErrorResponseResponse> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * @return Time the deployment script resource will expire.
     * 
     */
    public String expirationTime() {
        return this.expirationTime;
    }
    /**
     * @return Start time of the script execution.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return Storage account resource Id.
     * 
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptStatusResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String containerInstanceId;
        private String endTime;
        private @Nullable ErrorResponseResponse error;
        private String expirationTime;
        private String startTime;
        private String storageAccountId;
        public Builder() {}
        public Builder(ScriptStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerInstanceId = defaults.containerInstanceId;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.expirationTime = defaults.expirationTime;
    	      this.startTime = defaults.startTime;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        @CustomType.Setter
        public Builder containerInstanceId(String containerInstanceId) {
            this.containerInstanceId = Objects.requireNonNull(containerInstanceId);
            return this;
        }
        @CustomType.Setter
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        @CustomType.Setter
        public Builder error(@Nullable ErrorResponseResponse error) {
            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public ScriptStatusResponse build() {
            final var o = new ScriptStatusResponse();
            o.containerInstanceId = containerInstanceId;
            o.endTime = endTime;
            o.error = error;
            o.expirationTime = expirationTime;
            o.startTime = startTime;
            o.storageAccountId = storageAccountId;
            return o;
        }
    }
}
