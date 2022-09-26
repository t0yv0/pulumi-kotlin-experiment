// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleEmailActionResponse {
    /**
     * @return the list of administrator&#39;s custom email addresses to notify of the activation of the alert.
     * 
     */
    private @Nullable List<String> customEmails;
    /**
     * @return specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.RuleEmailAction&#39;.
     * 
     */
    private String odataType;
    /**
     * @return Whether the administrators (service and co-administrators) of the service should be notified when the alert is activated.
     * 
     */
    private @Nullable Boolean sendToServiceOwners;

    private RuleEmailActionResponse() {}
    /**
     * @return the list of administrator&#39;s custom email addresses to notify of the activation of the alert.
     * 
     */
    public List<String> customEmails() {
        return this.customEmails == null ? List.of() : this.customEmails;
    }
    /**
     * @return specifies the type of the action. There are two types of actions: RuleEmailAction and RuleWebhookAction.
     * Expected value is &#39;Microsoft.Azure.Management.Insights.Models.RuleEmailAction&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }
    /**
     * @return Whether the administrators (service and co-administrators) of the service should be notified when the alert is activated.
     * 
     */
    public Optional<Boolean> sendToServiceOwners() {
        return Optional.ofNullable(this.sendToServiceOwners);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleEmailActionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> customEmails;
        private String odataType;
        private @Nullable Boolean sendToServiceOwners;
        public Builder() {}
        public Builder(RuleEmailActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEmails = defaults.customEmails;
    	      this.odataType = defaults.odataType;
    	      this.sendToServiceOwners = defaults.sendToServiceOwners;
        }

        @CustomType.Setter
        public Builder customEmails(@Nullable List<String> customEmails) {
            this.customEmails = customEmails;
            return this;
        }
        public Builder customEmails(String... customEmails) {
            return customEmails(List.of(customEmails));
        }
        @CustomType.Setter
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        @CustomType.Setter
        public Builder sendToServiceOwners(@Nullable Boolean sendToServiceOwners) {
            this.sendToServiceOwners = sendToServiceOwners;
            return this;
        }
        public RuleEmailActionResponse build() {
            final var o = new RuleEmailActionResponse();
            o.customEmails = customEmails;
            o.odataType = odataType;
            o.sendToServiceOwners = sendToServiceOwners;
            return o;
        }
    }
}