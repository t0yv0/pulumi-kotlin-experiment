// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzNsActionGroupResponse {
    /**
     * @return Azure Action Group reference.
     * 
     */
    private @Nullable List<String> actionGroup;
    /**
     * @return Custom payload to be sent for all webhook URI in Azure action group
     * 
     */
    private @Nullable String customWebhookPayload;
    /**
     * @return Custom subject override for all email ids in Azure action group
     * 
     */
    private @Nullable String emailSubject;

    private AzNsActionGroupResponse() {}
    /**
     * @return Azure Action Group reference.
     * 
     */
    public List<String> actionGroup() {
        return this.actionGroup == null ? List.of() : this.actionGroup;
    }
    /**
     * @return Custom payload to be sent for all webhook URI in Azure action group
     * 
     */
    public Optional<String> customWebhookPayload() {
        return Optional.ofNullable(this.customWebhookPayload);
    }
    /**
     * @return Custom subject override for all email ids in Azure action group
     * 
     */
    public Optional<String> emailSubject() {
        return Optional.ofNullable(this.emailSubject);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzNsActionGroupResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> actionGroup;
        private @Nullable String customWebhookPayload;
        private @Nullable String emailSubject;
        public Builder() {}
        public Builder(AzNsActionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroup = defaults.actionGroup;
    	      this.customWebhookPayload = defaults.customWebhookPayload;
    	      this.emailSubject = defaults.emailSubject;
        }

        @CustomType.Setter
        public Builder actionGroup(@Nullable List<String> actionGroup) {
            this.actionGroup = actionGroup;
            return this;
        }
        public Builder actionGroup(String... actionGroup) {
            return actionGroup(List.of(actionGroup));
        }
        @CustomType.Setter
        public Builder customWebhookPayload(@Nullable String customWebhookPayload) {
            this.customWebhookPayload = customWebhookPayload;
            return this;
        }
        @CustomType.Setter
        public Builder emailSubject(@Nullable String emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public AzNsActionGroupResponse build() {
            final var o = new AzNsActionGroupResponse();
            o.actionGroup = actionGroup;
            o.customWebhookPayload = customWebhookPayload;
            o.emailSubject = emailSubject;
            return o;
        }
    }
}
