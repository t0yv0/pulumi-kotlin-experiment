// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StaticSiteUserARMResourceResponse {
    /**
     * @return The display name for the static site user.
     * 
     */
    private String displayName;
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
     * @return The identity provider for the static site user.
     * 
     */
    private String provider;
    /**
     * @return The roles for the static site user, in free-form string format
     * 
     */
    private @Nullable String roles;
    /**
     * @return Resource type.
     * 
     */
    private String type;
    /**
     * @return The user id for the static site user.
     * 
     */
    private String userId;

    private StaticSiteUserARMResourceResponse() {}
    /**
     * @return The display name for the static site user.
     * 
     */
    public String displayName() {
        return this.displayName;
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
     * @return The identity provider for the static site user.
     * 
     */
    public String provider() {
        return this.provider;
    }
    /**
     * @return The roles for the static site user, in free-form string format
     * 
     */
    public Optional<String> roles() {
        return Optional.ofNullable(this.roles);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The user id for the static site user.
     * 
     */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteUserARMResourceResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String displayName;
        private String id;
        private @Nullable String kind;
        private String name;
        private String provider;
        private @Nullable String roles;
        private String type;
        private String userId;
        public Builder() {}
        public Builder(StaticSiteUserARMResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provider = defaults.provider;
    	      this.roles = defaults.roles;
    	      this.type = defaults.type;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
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
        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        @CustomType.Setter
        public Builder roles(@Nullable String roles) {
            this.roles = roles;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public StaticSiteUserARMResourceResponse build() {
            final var o = new StaticSiteUserARMResourceResponse();
            o.displayName = displayName;
            o.id = id;
            o.kind = kind;
            o.name = name;
            o.provider = provider;
            o.roles = roles;
            o.type = type;
            o.userId = userId;
            return o;
        }
    }
}
