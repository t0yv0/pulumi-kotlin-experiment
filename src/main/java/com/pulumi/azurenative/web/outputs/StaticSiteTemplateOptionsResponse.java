// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StaticSiteTemplateOptionsResponse {
    /**
     * @return Description of the newly generated repository.
     * 
     */
    private @Nullable String description;
    /**
     * @return Whether or not the newly generated repository is a private repository. Defaults to false (i.e. public).
     * 
     */
    private @Nullable Boolean isPrivate;
    /**
     * @return Owner of the newly generated repository.
     * 
     */
    private @Nullable String owner;
    /**
     * @return Name of the newly generated repository.
     * 
     */
    private @Nullable String repositoryName;
    /**
     * @return URL of the template repository. The newly generated repository will be based on this one.
     * 
     */
    private @Nullable String templateRepositoryUrl;

    private StaticSiteTemplateOptionsResponse() {}
    /**
     * @return Description of the newly generated repository.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Whether or not the newly generated repository is a private repository. Defaults to false (i.e. public).
     * 
     */
    public Optional<Boolean> isPrivate() {
        return Optional.ofNullable(this.isPrivate);
    }
    /**
     * @return Owner of the newly generated repository.
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * @return Name of the newly generated repository.
     * 
     */
    public Optional<String> repositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }
    /**
     * @return URL of the template repository. The newly generated repository will be based on this one.
     * 
     */
    public Optional<String> templateRepositoryUrl() {
        return Optional.ofNullable(this.templateRepositoryUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteTemplateOptionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean isPrivate;
        private @Nullable String owner;
        private @Nullable String repositoryName;
        private @Nullable String templateRepositoryUrl;
        public Builder() {}
        public Builder(StaticSiteTemplateOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.isPrivate = defaults.isPrivate;
    	      this.owner = defaults.owner;
    	      this.repositoryName = defaults.repositoryName;
    	      this.templateRepositoryUrl = defaults.templateRepositoryUrl;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder isPrivate(@Nullable Boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }
        @CustomType.Setter
        public Builder owner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }
        @CustomType.Setter
        public Builder templateRepositoryUrl(@Nullable String templateRepositoryUrl) {
            this.templateRepositoryUrl = templateRepositoryUrl;
            return this;
        }
        public StaticSiteTemplateOptionsResponse build() {
            final var o = new StaticSiteTemplateOptionsResponse();
            o.description = description;
            o.isPrivate = isPrivate;
            o.owner = owner;
            o.repositoryName = repositoryName;
            o.templateRepositoryUrl = templateRepositoryUrl;
            return o;
        }
    }
}
