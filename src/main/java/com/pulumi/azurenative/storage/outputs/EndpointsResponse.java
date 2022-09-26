// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.StorageAccountInternetEndpointsResponse;
import com.pulumi.azurenative.storage.outputs.StorageAccountMicrosoftEndpointsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointsResponse {
    /**
     * @return Gets the blob endpoint.
     * 
     */
    private String blob;
    /**
     * @return Gets the dfs endpoint.
     * 
     */
    private String dfs;
    /**
     * @return Gets the file endpoint.
     * 
     */
    private String file;
    /**
     * @return Gets the internet routing storage endpoints
     * 
     */
    private @Nullable StorageAccountInternetEndpointsResponse internetEndpoints;
    /**
     * @return Gets the microsoft routing storage endpoints.
     * 
     */
    private @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints;
    /**
     * @return Gets the queue endpoint.
     * 
     */
    private String queue;
    /**
     * @return Gets the table endpoint.
     * 
     */
    private String table;
    /**
     * @return Gets the web endpoint.
     * 
     */
    private String web;

    private EndpointsResponse() {}
    /**
     * @return Gets the blob endpoint.
     * 
     */
    public String blob() {
        return this.blob;
    }
    /**
     * @return Gets the dfs endpoint.
     * 
     */
    public String dfs() {
        return this.dfs;
    }
    /**
     * @return Gets the file endpoint.
     * 
     */
    public String file() {
        return this.file;
    }
    /**
     * @return Gets the internet routing storage endpoints
     * 
     */
    public Optional<StorageAccountInternetEndpointsResponse> internetEndpoints() {
        return Optional.ofNullable(this.internetEndpoints);
    }
    /**
     * @return Gets the microsoft routing storage endpoints.
     * 
     */
    public Optional<StorageAccountMicrosoftEndpointsResponse> microsoftEndpoints() {
        return Optional.ofNullable(this.microsoftEndpoints);
    }
    /**
     * @return Gets the queue endpoint.
     * 
     */
    public String queue() {
        return this.queue;
    }
    /**
     * @return Gets the table endpoint.
     * 
     */
    public String table() {
        return this.table;
    }
    /**
     * @return Gets the web endpoint.
     * 
     */
    public String web() {
        return this.web;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String blob;
        private String dfs;
        private String file;
        private @Nullable StorageAccountInternetEndpointsResponse internetEndpoints;
        private @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints;
        private String queue;
        private String table;
        private String web;
        public Builder() {}
        public Builder(EndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.dfs = defaults.dfs;
    	      this.file = defaults.file;
    	      this.internetEndpoints = defaults.internetEndpoints;
    	      this.microsoftEndpoints = defaults.microsoftEndpoints;
    	      this.queue = defaults.queue;
    	      this.table = defaults.table;
    	      this.web = defaults.web;
        }

        @CustomType.Setter
        public Builder blob(String blob) {
            this.blob = Objects.requireNonNull(blob);
            return this;
        }
        @CustomType.Setter
        public Builder dfs(String dfs) {
            this.dfs = Objects.requireNonNull(dfs);
            return this;
        }
        @CustomType.Setter
        public Builder file(String file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        @CustomType.Setter
        public Builder internetEndpoints(@Nullable StorageAccountInternetEndpointsResponse internetEndpoints) {
            this.internetEndpoints = internetEndpoints;
            return this;
        }
        @CustomType.Setter
        public Builder microsoftEndpoints(@Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints) {
            this.microsoftEndpoints = microsoftEndpoints;
            return this;
        }
        @CustomType.Setter
        public Builder queue(String queue) {
            this.queue = Objects.requireNonNull(queue);
            return this;
        }
        @CustomType.Setter
        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        @CustomType.Setter
        public Builder web(String web) {
            this.web = Objects.requireNonNull(web);
            return this;
        }
        public EndpointsResponse build() {
            final var o = new EndpointsResponse();
            o.blob = blob;
            o.dfs = dfs;
            o.file = file;
            o.internetEndpoints = internetEndpoints;
            o.microsoftEndpoints = microsoftEndpoints;
            o.queue = queue;
            o.table = table;
            o.web = web;
            return o;
        }
    }
}
