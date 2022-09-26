// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PermissionScopeResponse {
    /**
     * @return The permissions for the local user. Possible values include: Read (r), Write (w), Delete (d), List (l), and Create (c).
     * 
     */
    private String permissions;
    /**
     * @return The name of resource, normally the container name or the file share name, used by the local user.
     * 
     */
    private String resourceName;
    /**
     * @return The service used by the local user, e.g. blob, file.
     * 
     */
    private String service;

    private PermissionScopeResponse() {}
    /**
     * @return The permissions for the local user. Possible values include: Read (r), Write (w), Delete (d), List (l), and Create (c).
     * 
     */
    public String permissions() {
        return this.permissions;
    }
    /**
     * @return The name of resource, normally the container name or the file share name, used by the local user.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }
    /**
     * @return The service used by the local user, e.g. blob, file.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionScopeResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String permissions;
        private String resourceName;
        private String service;
        public Builder() {}
        public Builder(PermissionScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissions = defaults.permissions;
    	      this.resourceName = defaults.resourceName;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        @CustomType.Setter
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public PermissionScopeResponse build() {
            final var o = new PermissionScopeResponse();
            o.permissions = permissions;
            o.resourceName = resourceName;
            o.service = service;
            return o;
        }
    }
}
