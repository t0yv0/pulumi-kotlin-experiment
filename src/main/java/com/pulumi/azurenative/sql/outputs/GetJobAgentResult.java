// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.azurenative.sql.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobAgentResult {
    /**
     * @return Resource ID of the database to store job metadata in.
     * 
     */
    private String databaseId;
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
     * @return The name and tier of the SKU.
     * 
     */
    private @Nullable SkuResponse sku;
    /**
     * @return The state of the job agent.
     * 
     */
    private String state;
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

    private GetJobAgentResult() {}
    /**
     * @return Resource ID of the database to store job metadata in.
     * 
     */
    public String databaseId() {
        return this.databaseId;
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
     * @return The name and tier of the SKU.
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return The state of the job agent.
     * 
     */
    public String state() {
        return this.state;
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

    public static Builder builder(GetJobAgentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databaseId;
        private String id;
        private String location;
        private String name;
        private @Nullable SkuResponse sku;
        private String state;
        private @Nullable Map<String,String> tags;
        private String type;
        public Builder() {}
        public Builder(GetJobAgentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseId = defaults.databaseId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder databaseId(String databaseId) {
            this.databaseId = Objects.requireNonNull(databaseId);
            return this;
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
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
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
        public GetJobAgentResult build() {
            final var o = new GetJobAgentResult();
            o.databaseId = databaseId;
            o.id = id;
            o.location = location;
            o.name = name;
            o.sku = sku;
            o.state = state;
            o.tags = tags;
            o.type = type;
            return o;
        }
    }
}