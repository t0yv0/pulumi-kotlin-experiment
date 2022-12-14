// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.azurenative.sql.outputs.FailoverGroupReadOnlyEndpointResponse;
import com.pulumi.azurenative.sql.outputs.FailoverGroupReadWriteEndpointResponse;
import com.pulumi.azurenative.sql.outputs.PartnerInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFailoverGroupResult {
    /**
     * @return List of databases in the failover group.
     * 
     */
    private @Nullable List<String> databases;
    /**
     * @return Resource ID.
     * 
     */
    private String id;
    /**
     * @return Resource location.
     * 
     */
    private String location;
    /**
     * @return Resource name.
     * 
     */
    private String name;
    /**
     * @return List of partner server information for the failover group.
     * 
     */
    private List<PartnerInfoResponse> partnerServers;
    /**
     * @return Read-only endpoint of the failover group instance.
     * 
     */
    private @Nullable FailoverGroupReadOnlyEndpointResponse readOnlyEndpoint;
    /**
     * @return Read-write endpoint of the failover group instance.
     * 
     */
    private FailoverGroupReadWriteEndpointResponse readWriteEndpoint;
    /**
     * @return Local replication role of the failover group instance.
     * 
     */
    private String replicationRole;
    /**
     * @return Replication state of the failover group instance.
     * 
     */
    private String replicationState;
    /**
     * @return Resource tags.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetFailoverGroupResult() {}
    /**
     * @return List of databases in the failover group.
     * 
     */
    public List<String> databases() {
        return this.databases == null ? List.of() : this.databases;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of partner server information for the failover group.
     * 
     */
    public List<PartnerInfoResponse> partnerServers() {
        return this.partnerServers;
    }
    /**
     * @return Read-only endpoint of the failover group instance.
     * 
     */
    public Optional<FailoverGroupReadOnlyEndpointResponse> readOnlyEndpoint() {
        return Optional.ofNullable(this.readOnlyEndpoint);
    }
    /**
     * @return Read-write endpoint of the failover group instance.
     * 
     */
    public FailoverGroupReadWriteEndpointResponse readWriteEndpoint() {
        return this.readWriteEndpoint;
    }
    /**
     * @return Local replication role of the failover group instance.
     * 
     */
    public String replicationRole() {
        return this.replicationRole;
    }
    /**
     * @return Replication state of the failover group instance.
     * 
     */
    public String replicationState() {
        return this.replicationState;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFailoverGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> databases;
        private String id;
        private String location;
        private String name;
        private List<PartnerInfoResponse> partnerServers;
        private @Nullable FailoverGroupReadOnlyEndpointResponse readOnlyEndpoint;
        private FailoverGroupReadWriteEndpointResponse readWriteEndpoint;
        private String replicationRole;
        private String replicationState;
        private @Nullable Map<String,String> tags;
        private String type;
        public Builder() {}
        public Builder(GetFailoverGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.partnerServers = defaults.partnerServers;
    	      this.readOnlyEndpoint = defaults.readOnlyEndpoint;
    	      this.readWriteEndpoint = defaults.readWriteEndpoint;
    	      this.replicationRole = defaults.replicationRole;
    	      this.replicationState = defaults.replicationState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder databases(@Nullable List<String> databases) {
            this.databases = databases;
            return this;
        }
        public Builder databases(String... databases) {
            return databases(List.of(databases));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder partnerServers(List<PartnerInfoResponse> partnerServers) {
            this.partnerServers = Objects.requireNonNull(partnerServers);
            return this;
        }
        public Builder partnerServers(PartnerInfoResponse... partnerServers) {
            return partnerServers(List.of(partnerServers));
        }
        @CustomType.Setter
        public Builder readOnlyEndpoint(@Nullable FailoverGroupReadOnlyEndpointResponse readOnlyEndpoint) {
            this.readOnlyEndpoint = readOnlyEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder readWriteEndpoint(FailoverGroupReadWriteEndpointResponse readWriteEndpoint) {
            this.readWriteEndpoint = Objects.requireNonNull(readWriteEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder replicationRole(String replicationRole) {
            this.replicationRole = Objects.requireNonNull(replicationRole);
            return this;
        }
        @CustomType.Setter
        public Builder replicationState(String replicationState) {
            this.replicationState = Objects.requireNonNull(replicationState);
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetFailoverGroupResult build() {
            final var o = new GetFailoverGroupResult();
            o.databases = databases;
            o.id = id;
            o.location = location;
            o.name = name;
            o.partnerServers = partnerServers;
            o.readOnlyEndpoint = readOnlyEndpoint;
            o.readWriteEndpoint = readWriteEndpoint;
            o.replicationRole = replicationRole;
            o.replicationState = replicationState;
            o.tags = tags;
            o.type = type;
            return o;
        }
    }
}
