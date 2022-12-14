// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebhookReceiverResponse {
    /**
     * @return Indicates the identifier uri for aad auth.
     * 
     */
    private @Nullable String identifierUri;
    /**
     * @return The name of the webhook receiver. Names must be unique across all receivers within an action group.
     * 
     */
    private String name;
    /**
     * @return Indicates the webhook app object Id for aad auth.
     * 
     */
    private @Nullable String objectId;
    /**
     * @return The URI where webhooks should be sent.
     * 
     */
    private String serviceUri;
    /**
     * @return Indicates the tenant id for aad auth.
     * 
     */
    private @Nullable String tenantId;
    /**
     * @return Indicates whether or not use AAD authentication.
     * 
     */
    private @Nullable Boolean useAadAuth;
    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    private @Nullable Boolean useCommonAlertSchema;

    private WebhookReceiverResponse() {}
    /**
     * @return Indicates the identifier uri for aad auth.
     * 
     */
    public Optional<String> identifierUri() {
        return Optional.ofNullable(this.identifierUri);
    }
    /**
     * @return The name of the webhook receiver. Names must be unique across all receivers within an action group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Indicates the webhook app object Id for aad auth.
     * 
     */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * @return The URI where webhooks should be sent.
     * 
     */
    public String serviceUri() {
        return this.serviceUri;
    }
    /**
     * @return Indicates the tenant id for aad auth.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return Indicates whether or not use AAD authentication.
     * 
     */
    public Optional<Boolean> useAadAuth() {
        return Optional.ofNullable(this.useAadAuth);
    }
    /**
     * @return Indicates whether to use common alert schema.
     * 
     */
    public Optional<Boolean> useCommonAlertSchema() {
        return Optional.ofNullable(this.useCommonAlertSchema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookReceiverResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String identifierUri;
        private String name;
        private @Nullable String objectId;
        private String serviceUri;
        private @Nullable String tenantId;
        private @Nullable Boolean useAadAuth;
        private @Nullable Boolean useCommonAlertSchema;
        public Builder() {}
        public Builder(WebhookReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifierUri = defaults.identifierUri;
    	      this.name = defaults.name;
    	      this.objectId = defaults.objectId;
    	      this.serviceUri = defaults.serviceUri;
    	      this.tenantId = defaults.tenantId;
    	      this.useAadAuth = defaults.useAadAuth;
    	      this.useCommonAlertSchema = defaults.useCommonAlertSchema;
        }

        @CustomType.Setter
        public Builder identifierUri(@Nullable String identifierUri) {
            this.identifierUri = identifierUri;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceUri(String serviceUri) {
            this.serviceUri = Objects.requireNonNull(serviceUri);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder useAadAuth(@Nullable Boolean useAadAuth) {
            this.useAadAuth = useAadAuth;
            return this;
        }
        @CustomType.Setter
        public Builder useCommonAlertSchema(@Nullable Boolean useCommonAlertSchema) {
            this.useCommonAlertSchema = useCommonAlertSchema;
            return this;
        }
        public WebhookReceiverResponse build() {
            final var o = new WebhookReceiverResponse();
            o.identifierUri = identifierUri;
            o.name = name;
            o.objectId = objectId;
            o.serviceUri = serviceUri;
            o.tenantId = tenantId;
            o.useAadAuth = useAadAuth;
            o.useCommonAlertSchema = useCommonAlertSchema;
            return o;
        }
    }
}
