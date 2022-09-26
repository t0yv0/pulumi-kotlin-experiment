// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServerAzureADAdministratorResult {
    /**
     * @return Type of the sever administrator.
     * 
     */
    private String administratorType;
    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    private Boolean azureADOnlyAuthentication;
    /**
     * @return Resource ID.
     * 
     */
    private String id;
    /**
     * @return Login name of the server administrator.
     * 
     */
    private String login;
    /**
     * @return Resource name.
     * 
     */
    private String name;
    /**
     * @return SID (object ID) of the server administrator.
     * 
     */
    private String sid;
    /**
     * @return Tenant ID of the administrator.
     * 
     */
    private @Nullable String tenantId;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetServerAzureADAdministratorResult() {}
    /**
     * @return Type of the sever administrator.
     * 
     */
    public String administratorType() {
        return this.administratorType;
    }
    /**
     * @return Azure Active Directory only Authentication enabled.
     * 
     */
    public Boolean azureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Login name of the server administrator.
     * 
     */
    public String login() {
        return this.login;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return SID (object ID) of the server administrator.
     * 
     */
    public String sid() {
        return this.sid;
    }
    /**
     * @return Tenant ID of the administrator.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
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

    public static Builder builder(GetServerAzureADAdministratorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String administratorType;
        private Boolean azureADOnlyAuthentication;
        private String id;
        private String login;
        private String name;
        private String sid;
        private @Nullable String tenantId;
        private String type;
        public Builder() {}
        public Builder(GetServerAzureADAdministratorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.azureADOnlyAuthentication = defaults.azureADOnlyAuthentication;
    	      this.id = defaults.id;
    	      this.login = defaults.login;
    	      this.name = defaults.name;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder administratorType(String administratorType) {
            this.administratorType = Objects.requireNonNull(administratorType);
            return this;
        }
        @CustomType.Setter
        public Builder azureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = Objects.requireNonNull(azureADOnlyAuthentication);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder login(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder sid(String sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetServerAzureADAdministratorResult build() {
            final var o = new GetServerAzureADAdministratorResult();
            o.administratorType = administratorType;
            o.azureADOnlyAuthentication = azureADOnlyAuthentication;
            o.id = id;
            o.login = login;
            o.name = name;
            o.sid = sid;
            o.tenantId = tenantId;
            o.type = type;
            return o;
        }
    }
}