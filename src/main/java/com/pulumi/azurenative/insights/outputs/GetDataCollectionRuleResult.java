// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.DataCollectionRuleResponseDataSources;
import com.pulumi.azurenative.insights.outputs.DataCollectionRuleResponseDestinations;
import com.pulumi.azurenative.insights.outputs.DataFlowResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataCollectionRuleResult {
    /**
     * @return The specification of data flows.
     * 
     */
    private @Nullable List<DataFlowResponse> dataFlows;
    /**
     * @return The specification of data sources.
     * This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
     * 
     */
    private @Nullable DataCollectionRuleResponseDataSources dataSources;
    /**
     * @return Description of the data collection rule.
     * 
     */
    private @Nullable String description;
    /**
     * @return The specification of destinations.
     * 
     */
    private @Nullable DataCollectionRuleResponseDestinations destinations;
    /**
     * @return Resource entity tag (ETag).
     * 
     */
    private String etag;
    /**
     * @return Fully qualified ID of the resource.
     * 
     */
    private String id;
    /**
     * @return The immutable ID of this data collection rule. This property is READ-ONLY.
     * 
     */
    private String immutableId;
    /**
     * @return The kind of the resource.
     * 
     */
    private @Nullable String kind;
    /**
     * @return The geo-location where the resource lives.
     * 
     */
    private String location;
    /**
     * @return The name of the resource.
     * 
     */
    private String name;
    /**
     * @return The resource provisioning state.
     * 
     */
    private String provisioningState;
    /**
     * @return Resource tags.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource.
     * 
     */
    private String type;

    private GetDataCollectionRuleResult() {}
    /**
     * @return The specification of data flows.
     * 
     */
    public List<DataFlowResponse> dataFlows() {
        return this.dataFlows == null ? List.of() : this.dataFlows;
    }
    /**
     * @return The specification of data sources.
     * This property is optional and can be omitted if the rule is meant to be used via direct calls to the provisioned endpoint.
     * 
     */
    public Optional<DataCollectionRuleResponseDataSources> dataSources() {
        return Optional.ofNullable(this.dataSources);
    }
    /**
     * @return Description of the data collection rule.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The specification of destinations.
     * 
     */
    public Optional<DataCollectionRuleResponseDestinations> destinations() {
        return Optional.ofNullable(this.destinations);
    }
    /**
     * @return Resource entity tag (ETag).
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Fully qualified ID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The immutable ID of this data collection rule. This property is READ-ONLY.
     * 
     */
    public String immutableId() {
        return this.immutableId;
    }
    /**
     * @return The kind of the resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return The geo-location where the resource lives.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionRuleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DataFlowResponse> dataFlows;
        private @Nullable DataCollectionRuleResponseDataSources dataSources;
        private @Nullable String description;
        private @Nullable DataCollectionRuleResponseDestinations destinations;
        private String etag;
        private String id;
        private String immutableId;
        private @Nullable String kind;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        public Builder() {}
        public Builder(GetDataCollectionRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataFlows = defaults.dataFlows;
    	      this.dataSources = defaults.dataSources;
    	      this.description = defaults.description;
    	      this.destinations = defaults.destinations;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.immutableId = defaults.immutableId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder dataFlows(@Nullable List<DataFlowResponse> dataFlows) {
            this.dataFlows = dataFlows;
            return this;
        }
        public Builder dataFlows(DataFlowResponse... dataFlows) {
            return dataFlows(List.of(dataFlows));
        }
        @CustomType.Setter
        public Builder dataSources(@Nullable DataCollectionRuleResponseDataSources dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder destinations(@Nullable DataCollectionRuleResponseDestinations destinations) {
            this.destinations = destinations;
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder immutableId(String immutableId) {
            this.immutableId = Objects.requireNonNull(immutableId);
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
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
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
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
        public GetDataCollectionRuleResult build() {
            final var o = new GetDataCollectionRuleResult();
            o.dataFlows = dataFlows;
            o.dataSources = dataSources;
            o.description = description;
            o.destinations = destinations;
            o.etag = etag;
            o.id = id;
            o.immutableId = immutableId;
            o.kind = kind;
            o.location = location;
            o.name = name;
            o.provisioningState = provisioningState;
            o.tags = tags;
            o.type = type;
            return o;
        }
    }
}
