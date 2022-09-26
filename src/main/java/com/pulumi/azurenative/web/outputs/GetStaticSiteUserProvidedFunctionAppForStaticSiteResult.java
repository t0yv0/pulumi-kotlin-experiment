// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStaticSiteUserProvidedFunctionAppForStaticSiteResult {
    /**
     * @return The date and time on which the function app was registered with the static site.
     * 
     */
    private String createdOn;
    /**
     * @return The region of the function app registered with the static site
     * 
     */
    private @Nullable String functionAppRegion;
    /**
     * @return The resource id of the function app registered with the static site
     * 
     */
    private @Nullable String functionAppResourceId;
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
     * @return Resource Name.
     * 
     */
    private String name;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetStaticSiteUserProvidedFunctionAppForStaticSiteResult() {}
    /**
     * @return The date and time on which the function app was registered with the static site.
     * 
     */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return The region of the function app registered with the static site
     * 
     */
    public Optional<String> functionAppRegion() {
        return Optional.ofNullable(this.functionAppRegion);
    }
    /**
     * @return The resource id of the function app registered with the static site
     * 
     */
    public Optional<String> functionAppResourceId() {
        return Optional.ofNullable(this.functionAppResourceId);
    }
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
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
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

    public static Builder builder(GetStaticSiteUserProvidedFunctionAppForStaticSiteResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdOn;
        private @Nullable String functionAppRegion;
        private @Nullable String functionAppResourceId;
        private String id;
        private @Nullable String kind;
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetStaticSiteUserProvidedFunctionAppForStaticSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdOn = defaults.createdOn;
    	      this.functionAppRegion = defaults.functionAppRegion;
    	      this.functionAppResourceId = defaults.functionAppResourceId;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }
        @CustomType.Setter
        public Builder functionAppRegion(@Nullable String functionAppRegion) {
            this.functionAppRegion = functionAppRegion;
            return this;
        }
        @CustomType.Setter
        public Builder functionAppResourceId(@Nullable String functionAppResourceId) {
            this.functionAppResourceId = functionAppResourceId;
            return this;
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetStaticSiteUserProvidedFunctionAppForStaticSiteResult build() {
            final var o = new GetStaticSiteUserProvidedFunctionAppForStaticSiteResult();
            o.createdOn = createdOn;
            o.functionAppRegion = functionAppRegion;
            o.functionAppResourceId = functionAppResourceId;
            o.id = id;
            o.kind = kind;
            o.name = name;
            o.type = type;
            return o;
        }
    }
}
