// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiagnosticServiceTokenReadOnlyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiagnosticServiceTokenReadOnlyPlainArgs Empty = new GetDiagnosticServiceTokenReadOnlyPlainArgs();

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

    private GetDiagnosticServiceTokenReadOnlyPlainArgs() {}

    private GetDiagnosticServiceTokenReadOnlyPlainArgs(GetDiagnosticServiceTokenReadOnlyPlainArgs $) {
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiagnosticServiceTokenReadOnlyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiagnosticServiceTokenReadOnlyPlainArgs $;

        public Builder() {
            $ = new GetDiagnosticServiceTokenReadOnlyPlainArgs();
        }

        public Builder(GetDiagnosticServiceTokenReadOnlyPlainArgs defaults) {
            $ = new GetDiagnosticServiceTokenReadOnlyPlainArgs(Objects.requireNonNull(defaults));
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

        public GetDiagnosticServiceTokenReadOnlyPlainArgs build() {
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}