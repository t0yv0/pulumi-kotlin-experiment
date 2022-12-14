// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.azurenative.resources.outputs.SystemDataResponse;
import com.pulumi.azurenative.resources.outputs.TemplateSpecVersionInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTemplateSpecResult {
    /**
     * @return Template Spec description.
     * 
     */
    private @Nullable String description;
    /**
     * @return Template Spec display name.
     * 
     */
    private @Nullable String displayName;
    /**
     * @return String Id used to locate any resource on Azure.
     * 
     */
    private String id;
    /**
     * @return The location of the Template Spec. It cannot be changed after Template Spec creation. It must be one of the supported Azure locations.
     * 
     */
    private String location;
    /**
     * @return The Template Spec metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    private @Nullable Object metadata;
    /**
     * @return Name of this resource.
     * 
     */
    private String name;
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return Type of this resource.
     * 
     */
    private String type;
    /**
     * @return High-level information about the versions within this Template Spec. The keys are the version names. Only populated if the $expand query parameter is set to &#39;versions&#39;.
     * 
     */
    private Map<String,TemplateSpecVersionInfoResponse> versions;

    private GetTemplateSpecResult() {}
    /**
     * @return Template Spec description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Template Spec display name.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return String Id used to locate any resource on Azure.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The location of the Template Spec. It cannot be changed after Template Spec creation. It must be one of the supported Azure locations.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The Template Spec metadata. Metadata is an open-ended object and is typically a collection of key-value pairs.
     * 
     */
    public Optional<Object> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return Name of this resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Type of this resource.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return High-level information about the versions within this Template Spec. The keys are the version names. Only populated if the $expand query parameter is set to &#39;versions&#39;.
     * 
     */
    public Map<String,TemplateSpecVersionInfoResponse> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateSpecResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private String location;
        private @Nullable Object metadata;
        private String name;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private Map<String,TemplateSpecVersionInfoResponse> versions;
        public Builder() {}
        public Builder(GetTemplateSpecResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.versions = defaults.versions;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
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
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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
        public Builder versions(Map<String,TemplateSpecVersionInfoResponse> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public GetTemplateSpecResult build() {
            final var o = new GetTemplateSpecResult();
            o.description = description;
            o.displayName = displayName;
            o.id = id;
            o.location = location;
            o.metadata = metadata;
            o.name = name;
            o.systemData = systemData;
            o.tags = tags;
            o.type = type;
            o.versions = versions;
            return o;
        }
    }
}
