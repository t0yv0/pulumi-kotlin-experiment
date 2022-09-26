// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.AutoscaleNotificationResponse;
import com.pulumi.azurenative.insights.outputs.AutoscaleProfileResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAutoscaleSettingResult {
    /**
     * @return the enabled flag. Specifies whether automatic scaling is enabled for the resource. The default value is &#39;false&#39;.
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Azure resource Id
     * 
     */
    private String id;
    /**
     * @return Resource location
     * 
     */
    private String location;
    /**
     * @return Azure resource name
     * 
     */
    private String name;
    /**
     * @return the collection of notifications.
     * 
     */
    private @Nullable List<AutoscaleNotificationResponse> notifications;
    /**
     * @return the collection of automatic scaling profiles that specify different scaling parameters for different time periods. A maximum of 20 profiles can be specified.
     * 
     */
    private List<AutoscaleProfileResponse> profiles;
    /**
     * @return Resource tags
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return the location of the resource that the autoscale setting should be added to.
     * 
     */
    private @Nullable String targetResourceLocation;
    /**
     * @return the resource identifier of the resource that the autoscale setting should be added to.
     * 
     */
    private @Nullable String targetResourceUri;
    /**
     * @return Azure resource type
     * 
     */
    private String type;

    private GetAutoscaleSettingResult() {}
    /**
     * @return the enabled flag. Specifies whether automatic scaling is enabled for the resource. The default value is &#39;false&#39;.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Azure resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Azure resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return the collection of notifications.
     * 
     */
    public List<AutoscaleNotificationResponse> notifications() {
        return this.notifications == null ? List.of() : this.notifications;
    }
    /**
     * @return the collection of automatic scaling profiles that specify different scaling parameters for different time periods. A maximum of 20 profiles can be specified.
     * 
     */
    public List<AutoscaleProfileResponse> profiles() {
        return this.profiles;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return the location of the resource that the autoscale setting should be added to.
     * 
     */
    public Optional<String> targetResourceLocation() {
        return Optional.ofNullable(this.targetResourceLocation);
    }
    /**
     * @return the resource identifier of the resource that the autoscale setting should be added to.
     * 
     */
    public Optional<String> targetResourceUri() {
        return Optional.ofNullable(this.targetResourceUri);
    }
    /**
     * @return Azure resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoscaleSettingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private String id;
        private String location;
        private String name;
        private @Nullable List<AutoscaleNotificationResponse> notifications;
        private List<AutoscaleProfileResponse> profiles;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetResourceLocation;
        private @Nullable String targetResourceUri;
        private String type;
        public Builder() {}
        public Builder(GetAutoscaleSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notifications = defaults.notifications;
    	      this.profiles = defaults.profiles;
    	      this.tags = defaults.tags;
    	      this.targetResourceLocation = defaults.targetResourceLocation;
    	      this.targetResourceUri = defaults.targetResourceUri;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
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
        public Builder notifications(@Nullable List<AutoscaleNotificationResponse> notifications) {
            this.notifications = notifications;
            return this;
        }
        public Builder notifications(AutoscaleNotificationResponse... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder profiles(List<AutoscaleProfileResponse> profiles) {
            this.profiles = Objects.requireNonNull(profiles);
            return this;
        }
        public Builder profiles(AutoscaleProfileResponse... profiles) {
            return profiles(List.of(profiles));
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder targetResourceLocation(@Nullable String targetResourceLocation) {
            this.targetResourceLocation = targetResourceLocation;
            return this;
        }
        @CustomType.Setter
        public Builder targetResourceUri(@Nullable String targetResourceUri) {
            this.targetResourceUri = targetResourceUri;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAutoscaleSettingResult build() {
            final var o = new GetAutoscaleSettingResult();
            o.enabled = enabled;
            o.id = id;
            o.location = location;
            o.name = name;
            o.notifications = notifications;
            o.profiles = profiles;
            o.tags = tags;
            o.targetResourceLocation = targetResourceLocation;
            o.targetResourceUri = targetResourceUri;
            o.type = type;
            return o;
        }
    }
}
