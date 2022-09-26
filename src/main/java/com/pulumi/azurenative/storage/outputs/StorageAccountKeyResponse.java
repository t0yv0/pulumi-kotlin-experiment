// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StorageAccountKeyResponse {
    /**
     * @return Creation time of the key, in round trip date format.
     * 
     */
    private String creationTime;
    /**
     * @return Name of the key.
     * 
     */
    private String keyName;
    /**
     * @return Permissions for the key -- read-only or full permissions.
     * 
     */
    private String permissions;
    /**
     * @return Base 64-encoded value of the key.
     * 
     */
    private String value;

    private StorageAccountKeyResponse() {}
    /**
     * @return Creation time of the key, in round trip date format.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return Name of the key.
     * 
     */
    public String keyName() {
        return this.keyName;
    }
    /**
     * @return Permissions for the key -- read-only or full permissions.
     * 
     */
    public String permissions() {
        return this.permissions;
    }
    /**
     * @return Base 64-encoded value of the key.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountKeyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String creationTime;
        private String keyName;
        private String permissions;
        private String value;
        public Builder() {}
        public Builder(StorageAccountKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.keyName = defaults.keyName;
    	      this.permissions = defaults.permissions;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        @CustomType.Setter
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public StorageAccountKeyResponse build() {
            final var o = new StorageAccountKeyResponse();
            o.creationTime = creationTime;
            o.keyName = keyName;
            o.permissions = permissions;
            o.value = value;
            return o;
        }
    }
}
