// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.WorkflowTriggerListCallbackUrlQueriesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListWorkflowTriggerCallbackUrlResult {
    /**
     * @return Gets the workflow trigger callback URL base path.
     * 
     */
    private String basePath;
    /**
     * @return Gets the workflow trigger callback URL HTTP method.
     * 
     */
    private String method;
    /**
     * @return Gets the workflow trigger callback URL query parameters.
     * 
     */
    private @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries;
    /**
     * @return Gets the workflow trigger callback URL relative path.
     * 
     */
    private String relativePath;
    /**
     * @return Gets the workflow trigger callback URL relative path parameters.
     * 
     */
    private @Nullable List<String> relativePathParameters;
    /**
     * @return Gets the workflow trigger callback URL.
     * 
     */
    private String value;

    private ListWorkflowTriggerCallbackUrlResult() {}
    /**
     * @return Gets the workflow trigger callback URL base path.
     * 
     */
    public String basePath() {
        return this.basePath;
    }
    /**
     * @return Gets the workflow trigger callback URL HTTP method.
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Gets the workflow trigger callback URL query parameters.
     * 
     */
    public Optional<WorkflowTriggerListCallbackUrlQueriesResponse> queries() {
        return Optional.ofNullable(this.queries);
    }
    /**
     * @return Gets the workflow trigger callback URL relative path.
     * 
     */
    public String relativePath() {
        return this.relativePath;
    }
    /**
     * @return Gets the workflow trigger callback URL relative path parameters.
     * 
     */
    public List<String> relativePathParameters() {
        return this.relativePathParameters == null ? List.of() : this.relativePathParameters;
    }
    /**
     * @return Gets the workflow trigger callback URL.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkflowTriggerCallbackUrlResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String basePath;
        private String method;
        private @Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries;
        private String relativePath;
        private @Nullable List<String> relativePathParameters;
        private String value;
        public Builder() {}
        public Builder(ListWorkflowTriggerCallbackUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basePath = defaults.basePath;
    	      this.method = defaults.method;
    	      this.queries = defaults.queries;
    	      this.relativePath = defaults.relativePath;
    	      this.relativePathParameters = defaults.relativePathParameters;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder basePath(String basePath) {
            this.basePath = Objects.requireNonNull(basePath);
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        @CustomType.Setter
        public Builder queries(@Nullable WorkflowTriggerListCallbackUrlQueriesResponse queries) {
            this.queries = queries;
            return this;
        }
        @CustomType.Setter
        public Builder relativePath(String relativePath) {
            this.relativePath = Objects.requireNonNull(relativePath);
            return this;
        }
        @CustomType.Setter
        public Builder relativePathParameters(@Nullable List<String> relativePathParameters) {
            this.relativePathParameters = relativePathParameters;
            return this;
        }
        public Builder relativePathParameters(String... relativePathParameters) {
            return relativePathParameters(List.of(relativePathParameters));
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListWorkflowTriggerCallbackUrlResult build() {
            final var o = new ListWorkflowTriggerCallbackUrlResult();
            o.basePath = basePath;
            o.method = method;
            o.queries = queries;
            o.relativePath = relativePath;
            o.relativePathParameters = relativePathParameters;
            o.value = value;
            return o;
        }
    }
}
