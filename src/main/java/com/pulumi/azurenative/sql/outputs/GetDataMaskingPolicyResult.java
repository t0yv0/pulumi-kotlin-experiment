// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataMaskingPolicyResult {
    /**
     * @return The list of the application principals. This is a legacy parameter and is no longer used.
     * 
     */
    private String applicationPrincipals;
    /**
     * @return The state of the data masking policy.
     * 
     */
    private String dataMaskingState;
    /**
     * @return The list of the exempt principals. Specifies the semicolon-separated list of database users for which the data masking policy does not apply. The specified users receive data results without masking for all of the database queries.
     * 
     */
    private @Nullable String exemptPrincipals;
    /**
     * @return Resource ID.
     * 
     */
    private String id;
    /**
     * @return The kind of data masking policy. Metadata, used for Azure portal.
     * 
     */
    private String kind;
    /**
     * @return The location of the data masking policy.
     * 
     */
    private String location;
    /**
     * @return The masking level. This is a legacy parameter and is no longer used.
     * 
     */
    private String maskingLevel;
    /**
     * @return Resource name.
     * 
     */
    private String name;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetDataMaskingPolicyResult() {}
    /**
     * @return The list of the application principals. This is a legacy parameter and is no longer used.
     * 
     */
    public String applicationPrincipals() {
        return this.applicationPrincipals;
    }
    /**
     * @return The state of the data masking policy.
     * 
     */
    public String dataMaskingState() {
        return this.dataMaskingState;
    }
    /**
     * @return The list of the exempt principals. Specifies the semicolon-separated list of database users for which the data masking policy does not apply. The specified users receive data results without masking for all of the database queries.
     * 
     */
    public Optional<String> exemptPrincipals() {
        return Optional.ofNullable(this.exemptPrincipals);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The kind of data masking policy. Metadata, used for Azure portal.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The location of the data masking policy.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The masking level. This is a legacy parameter and is no longer used.
     * 
     */
    public String maskingLevel() {
        return this.maskingLevel;
    }
    /**
     * @return Resource name.
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

    public static Builder builder(GetDataMaskingPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationPrincipals;
        private String dataMaskingState;
        private @Nullable String exemptPrincipals;
        private String id;
        private String kind;
        private String location;
        private String maskingLevel;
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetDataMaskingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationPrincipals = defaults.applicationPrincipals;
    	      this.dataMaskingState = defaults.dataMaskingState;
    	      this.exemptPrincipals = defaults.exemptPrincipals;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.maskingLevel = defaults.maskingLevel;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder applicationPrincipals(String applicationPrincipals) {
            this.applicationPrincipals = Objects.requireNonNull(applicationPrincipals);
            return this;
        }
        @CustomType.Setter
        public Builder dataMaskingState(String dataMaskingState) {
            this.dataMaskingState = Objects.requireNonNull(dataMaskingState);
            return this;
        }
        @CustomType.Setter
        public Builder exemptPrincipals(@Nullable String exemptPrincipals) {
            this.exemptPrincipals = exemptPrincipals;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder maskingLevel(String maskingLevel) {
            this.maskingLevel = Objects.requireNonNull(maskingLevel);
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
        public GetDataMaskingPolicyResult build() {
            final var o = new GetDataMaskingPolicyResult();
            o.applicationPrincipals = applicationPrincipals;
            o.dataMaskingState = dataMaskingState;
            o.exemptPrincipals = exemptPrincipals;
            o.id = id;
            o.kind = kind;
            o.location = location;
            o.maskingLevel = maskingLevel;
            o.name = name;
            o.type = type;
            return o;
        }
    }
}
