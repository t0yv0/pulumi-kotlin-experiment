// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.azurenative.resources.outputs.IdentityResponse;
import com.pulumi.azurenative.resources.outputs.PlanResponse;
import com.pulumi.azurenative.resources.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResourceResult {
    /**
     * @return Resource ID
     * 
     */
    private String id;
    /**
     * @return The identity of the resource.
     * 
     */
    private @Nullable IdentityResponse identity;
    /**
     * @return The kind of the resource.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Resource location
     * 
     */
    private @Nullable String location;
    /**
     * @return ID of the resource that manages this resource.
     * 
     */
    private @Nullable String managedBy;
    /**
     * @return Resource name
     * 
     */
    private String name;
    /**
     * @return The plan of the resource.
     * 
     */
    private @Nullable PlanResponse plan;
    /**
     * @return The resource properties.
     * 
     */
    private Object properties;
    /**
     * @return The SKU of the resource.
     * 
     */
    private @Nullable SkuResponse sku;
    /**
     * @return Resource tags
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return Resource type
     * 
     */
    private String type;

    private GetResourceResult() {}
    /**
     * @return Resource ID
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity of the resource.
     * 
     */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The kind of the resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource location
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return ID of the resource that manages this resource.
     * 
     */
    public Optional<String> managedBy() {
        return Optional.ofNullable(this.managedBy);
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The plan of the resource.
     * 
     */
    public Optional<PlanResponse> plan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * @return The resource properties.
     * 
     */
    public Object properties() {
        return this.properties;
    }
    /**
     * @return The SKU of the resource.
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String kind;
        private @Nullable String location;
        private @Nullable String managedBy;
        private String name;
        private @Nullable PlanResponse plan;
        private Object properties;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        public Builder() {}
        public Builder(GetResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder managedBy(@Nullable String managedBy) {
            this.managedBy = managedBy;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder plan(@Nullable PlanResponse plan) {
            this.plan = plan;
            return this;
        }
        @CustomType.Setter
        public Builder properties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        @CustomType.Setter
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
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
        public GetResourceResult build() {
            final var o = new GetResourceResult();
            o.id = id;
            o.identity = identity;
            o.kind = kind;
            o.location = location;
            o.managedBy = managedBy;
            o.name = name;
            o.plan = plan;
            o.properties = properties;
            o.sku = sku;
            o.tags = tags;
            o.type = type;
            return o;
        }
    }
}
