// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppPremierAddOnSlotResult {
    /**
     * @return Resource Id.
     * 
     */
    private String id;
    /**
     * @return Kind of resource.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Resource Location.
     * 
     */
    private String location;
    /**
     * @return Premier add on Marketplace offer.
     * 
     */
    private @Nullable String marketplaceOffer;
    /**
     * @return Premier add on Marketplace publisher.
     * 
     */
    private @Nullable String marketplacePublisher;
    /**
     * @return Resource Name.
     * 
     */
    private String name;
    /**
     * @return Premier add on Product.
     * 
     */
    private @Nullable String product;
    /**
     * @return Premier add on SKU.
     * 
     */
    private @Nullable String sku;
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
    /**
     * @return Premier add on Vendor.
     * 
     */
    private @Nullable String vendor;

    private GetWebAppPremierAddOnSlotResult() {}
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Premier add on Marketplace offer.
     * 
     */
    public Optional<String> marketplaceOffer() {
        return Optional.ofNullable(this.marketplaceOffer);
    }
    /**
     * @return Premier add on Marketplace publisher.
     * 
     */
    public Optional<String> marketplacePublisher() {
        return Optional.ofNullable(this.marketplacePublisher);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Premier add on Product.
     * 
     */
    public Optional<String> product() {
        return Optional.ofNullable(this.product);
    }
    /**
     * @return Premier add on SKU.
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
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
    /**
     * @return Premier add on Vendor.
     * 
     */
    public Optional<String> vendor() {
        return Optional.ofNullable(this.vendor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPremierAddOnSlotResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String location;
        private @Nullable String marketplaceOffer;
        private @Nullable String marketplacePublisher;
        private String name;
        private @Nullable String product;
        private @Nullable String sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String vendor;
        public Builder() {}
        public Builder(GetWebAppPremierAddOnSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.marketplaceOffer = defaults.marketplaceOffer;
    	      this.marketplacePublisher = defaults.marketplacePublisher;
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vendor = defaults.vendor;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder marketplaceOffer(@Nullable String marketplaceOffer) {
            this.marketplaceOffer = marketplaceOffer;
            return this;
        }
        @CustomType.Setter
        public Builder marketplacePublisher(@Nullable String marketplacePublisher) {
            this.marketplacePublisher = marketplacePublisher;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder product(@Nullable String product) {
            this.product = product;
            return this;
        }
        @CustomType.Setter
        public Builder sku(@Nullable String sku) {
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
        @CustomType.Setter
        public Builder vendor(@Nullable String vendor) {
            this.vendor = vendor;
            return this;
        }
        public GetWebAppPremierAddOnSlotResult build() {
            final var o = new GetWebAppPremierAddOnSlotResult();
            o.id = id;
            o.kind = kind;
            o.location = location;
            o.marketplaceOffer = marketplaceOffer;
            o.marketplacePublisher = marketplacePublisher;
            o.name = name;
            o.product = product;
            o.sku = sku;
            o.tags = tags;
            o.type = type;
            o.vendor = vendor;
            return o;
        }
    }
}
