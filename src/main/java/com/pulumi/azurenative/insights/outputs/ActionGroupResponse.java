// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ActionGroupResponse {
    /**
     * @return The resource ID of the Action Group. This cannot be null or empty.
     * 
     */
    private String actionGroupId;
    /**
     * @return the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    private @Nullable Map<String,String> webhookProperties;

    private ActionGroupResponse() {}
    /**
     * @return The resource ID of the Action Group. This cannot be null or empty.
     * 
     */
    public String actionGroupId() {
        return this.actionGroupId;
    }
    /**
     * @return the dictionary of custom properties to include with the post operation. These data are appended to the webhook payload.
     * 
     */
    public Map<String,String> webhookProperties() {
        return this.webhookProperties == null ? Map.of() : this.webhookProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionGroupResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String actionGroupId;
        private @Nullable Map<String,String> webhookProperties;
        public Builder() {}
        public Builder(ActionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.webhookProperties = defaults.webhookProperties;
        }

        @CustomType.Setter
        public Builder actionGroupId(String actionGroupId) {
            this.actionGroupId = Objects.requireNonNull(actionGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder webhookProperties(@Nullable Map<String,String> webhookProperties) {
            this.webhookProperties = webhookProperties;
            return this;
        }
        public ActionGroupResponse build() {
            final var o = new ActionGroupResponse();
            o.actionGroupId = actionGroupId;
            o.webhookProperties = webhookProperties;
            return o;
        }
    }
}
