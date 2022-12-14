// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.MyWorkbookManagedIdentityResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMyWorkbookResult {
    /**
     * @return Workbook category, as defined by the user at creation time.
     * 
     */
    private String category;
    /**
     * @return The user-defined name of the private workbook.
     * 
     */
    private String displayName;
    /**
     * @return Resource etag
     * 
     */
    private @Nullable Map<String,String> etag;
    /**
     * @return Azure resource Id
     * 
     */
    private @Nullable String id;
    /**
     * @return Identity used for BYOS
     * 
     */
    private @Nullable MyWorkbookManagedIdentityResponse identity;
    /**
     * @return The kind of workbook. Choices are user and shared.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Resource location
     * 
     */
    private @Nullable String location;
    /**
     * @return Azure resource name
     * 
     */
    private @Nullable String name;
    /**
     * @return Configuration of this particular private workbook. Configuration data is a string containing valid JSON
     * 
     */
    private String serializedData;
    /**
     * @return Optional resourceId for a source resource.
     * 
     */
    private @Nullable String sourceId;
    /**
     * @return BYOS Storage Account URI
     * 
     */
    private @Nullable String storageUri;
    /**
     * @return Resource tags
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return Date and time in UTC of the last modification that was made to this private workbook definition.
     * 
     */
    private String timeModified;
    /**
     * @return Azure resource type
     * 
     */
    private @Nullable String type;
    /**
     * @return Unique user id of the specific user that owns this private workbook.
     * 
     */
    private String userId;
    /**
     * @return This instance&#39;s version of the data model. This can change as new features are added that can be marked private workbook.
     * 
     */
    private @Nullable String version;

    private GetMyWorkbookResult() {}
    /**
     * @return Workbook category, as defined by the user at creation time.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return The user-defined name of the private workbook.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Resource etag
     * 
     */
    public Map<String,String> etag() {
        return this.etag == null ? Map.of() : this.etag;
    }
    /**
     * @return Azure resource Id
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Identity used for BYOS
     * 
     */
    public Optional<MyWorkbookManagedIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The kind of workbook. Choices are user and shared.
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
     * @return Azure resource name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Configuration of this particular private workbook. Configuration data is a string containing valid JSON
     * 
     */
    public String serializedData() {
        return this.serializedData;
    }
    /**
     * @return Optional resourceId for a source resource.
     * 
     */
    public Optional<String> sourceId() {
        return Optional.ofNullable(this.sourceId);
    }
    /**
     * @return BYOS Storage Account URI
     * 
     */
    public Optional<String> storageUri() {
        return Optional.ofNullable(this.storageUri);
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Date and time in UTC of the last modification that was made to this private workbook definition.
     * 
     */
    public String timeModified() {
        return this.timeModified;
    }
    /**
     * @return Azure resource type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Unique user id of the specific user that owns this private workbook.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return This instance&#39;s version of the data model. This can change as new features are added that can be marked private workbook.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMyWorkbookResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String category;
        private String displayName;
        private @Nullable Map<String,String> etag;
        private @Nullable String id;
        private @Nullable MyWorkbookManagedIdentityResponse identity;
        private @Nullable String kind;
        private @Nullable String location;
        private @Nullable String name;
        private String serializedData;
        private @Nullable String sourceId;
        private @Nullable String storageUri;
        private @Nullable Map<String,String> tags;
        private String timeModified;
        private @Nullable String type;
        private String userId;
        private @Nullable String version;
        public Builder() {}
        public Builder(GetMyWorkbookResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.serializedData = defaults.serializedData;
    	      this.sourceId = defaults.sourceId;
    	      this.storageUri = defaults.storageUri;
    	      this.tags = defaults.tags;
    	      this.timeModified = defaults.timeModified;
    	      this.type = defaults.type;
    	      this.userId = defaults.userId;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder etag(@Nullable Map<String,String> etag) {
            this.etag = etag;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identity(@Nullable MyWorkbookManagedIdentityResponse identity) {
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
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder serializedData(String serializedData) {
            this.serializedData = Objects.requireNonNull(serializedData);
            return this;
        }
        @CustomType.Setter
        public Builder sourceId(@Nullable String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        @CustomType.Setter
        public Builder storageUri(@Nullable String storageUri) {
            this.storageUri = storageUri;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder timeModified(String timeModified) {
            this.timeModified = Objects.requireNonNull(timeModified);
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetMyWorkbookResult build() {
            final var o = new GetMyWorkbookResult();
            o.category = category;
            o.displayName = displayName;
            o.etag = etag;
            o.id = id;
            o.identity = identity;
            o.kind = kind;
            o.location = location;
            o.name = name;
            o.serializedData = serializedData;
            o.sourceId = sourceId;
            o.storageUri = storageUri;
            o.tags = tags;
            o.timeModified = timeModified;
            o.type = type;
            o.userId = userId;
            o.version = version;
            return o;
        }
    }
}
