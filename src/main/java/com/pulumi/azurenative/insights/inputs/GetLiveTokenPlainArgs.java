// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLiveTokenPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLiveTokenPlainArgs Empty = new GetLiveTokenPlainArgs();

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceUri", required=true)
    private String resourceUri;

    /**
     * @return The identifier of the resource.
     * 
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    private GetLiveTokenPlainArgs() {}

    private GetLiveTokenPlainArgs(GetLiveTokenPlainArgs $) {
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLiveTokenPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLiveTokenPlainArgs $;

        public Builder() {
            $ = new GetLiveTokenPlainArgs();
        }

        public Builder(GetLiveTokenPlainArgs defaults) {
            $ = new GetLiveTokenPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceUri The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        public GetLiveTokenPlainArgs build() {
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}