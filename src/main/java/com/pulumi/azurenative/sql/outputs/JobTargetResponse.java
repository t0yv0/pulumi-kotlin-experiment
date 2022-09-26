// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTargetResponse {
    /**
     * @return The target database name.
     * 
     */
    private @Nullable String databaseName;
    /**
     * @return The target elastic pool name.
     * 
     */
    private @Nullable String elasticPoolName;
    /**
     * @return Whether the target is included or excluded from the group.
     * 
     */
    private @Nullable String membershipType;
    /**
     * @return The resource ID of the credential that is used during job execution to connect to the target and determine the list of databases inside the target.
     * 
     */
    private @Nullable String refreshCredential;
    /**
     * @return The target server name.
     * 
     */
    private @Nullable String serverName;
    /**
     * @return The target shard map.
     * 
     */
    private @Nullable String shardMapName;
    /**
     * @return The target type.
     * 
     */
    private String type;

    private JobTargetResponse() {}
    /**
     * @return The target database name.
     * 
     */
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * @return The target elastic pool name.
     * 
     */
    public Optional<String> elasticPoolName() {
        return Optional.ofNullable(this.elasticPoolName);
    }
    /**
     * @return Whether the target is included or excluded from the group.
     * 
     */
    public Optional<String> membershipType() {
        return Optional.ofNullable(this.membershipType);
    }
    /**
     * @return The resource ID of the credential that is used during job execution to connect to the target and determine the list of databases inside the target.
     * 
     */
    public Optional<String> refreshCredential() {
        return Optional.ofNullable(this.refreshCredential);
    }
    /**
     * @return The target server name.
     * 
     */
    public Optional<String> serverName() {
        return Optional.ofNullable(this.serverName);
    }
    /**
     * @return The target shard map.
     * 
     */
    public Optional<String> shardMapName() {
        return Optional.ofNullable(this.shardMapName);
    }
    /**
     * @return The target type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTargetResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String elasticPoolName;
        private @Nullable String membershipType;
        private @Nullable String refreshCredential;
        private @Nullable String serverName;
        private @Nullable String shardMapName;
        private String type;
        public Builder() {}
        public Builder(JobTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.elasticPoolName = defaults.elasticPoolName;
    	      this.membershipType = defaults.membershipType;
    	      this.refreshCredential = defaults.refreshCredential;
    	      this.serverName = defaults.serverName;
    	      this.shardMapName = defaults.shardMapName;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder elasticPoolName(@Nullable String elasticPoolName) {
            this.elasticPoolName = elasticPoolName;
            return this;
        }
        @CustomType.Setter
        public Builder membershipType(@Nullable String membershipType) {
            this.membershipType = membershipType;
            return this;
        }
        @CustomType.Setter
        public Builder refreshCredential(@Nullable String refreshCredential) {
            this.refreshCredential = refreshCredential;
            return this;
        }
        @CustomType.Setter
        public Builder serverName(@Nullable String serverName) {
            this.serverName = serverName;
            return this;
        }
        @CustomType.Setter
        public Builder shardMapName(@Nullable String shardMapName) {
            this.shardMapName = shardMapName;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public JobTargetResponse build() {
            final var o = new JobTargetResponse();
            o.databaseName = databaseName;
            o.elasticPoolName = elasticPoolName;
            o.membershipType = membershipType;
            o.refreshCredential = refreshCredential;
            o.serverName = serverName;
            o.shardMapName = shardMapName;
            o.type = type;
            return o;
        }
    }
}
