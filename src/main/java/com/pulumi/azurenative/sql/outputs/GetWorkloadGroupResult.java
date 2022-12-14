// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkloadGroupResult {
    /**
     * @return Resource ID.
     * 
     */
    private String id;
    /**
     * @return The workload group importance level.
     * 
     */
    private @Nullable String importance;
    /**
     * @return The workload group cap percentage resource.
     * 
     */
    private Integer maxResourcePercent;
    /**
     * @return The workload group request maximum grant percentage.
     * 
     */
    private @Nullable Double maxResourcePercentPerRequest;
    /**
     * @return The workload group minimum percentage resource.
     * 
     */
    private Integer minResourcePercent;
    /**
     * @return The workload group request minimum grant percentage.
     * 
     */
    private Double minResourcePercentPerRequest;
    /**
     * @return Resource name.
     * 
     */
    private String name;
    /**
     * @return The workload group query execution timeout.
     * 
     */
    private @Nullable Integer queryExecutionTimeout;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetWorkloadGroupResult() {}
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The workload group importance level.
     * 
     */
    public Optional<String> importance() {
        return Optional.ofNullable(this.importance);
    }
    /**
     * @return The workload group cap percentage resource.
     * 
     */
    public Integer maxResourcePercent() {
        return this.maxResourcePercent;
    }
    /**
     * @return The workload group request maximum grant percentage.
     * 
     */
    public Optional<Double> maxResourcePercentPerRequest() {
        return Optional.ofNullable(this.maxResourcePercentPerRequest);
    }
    /**
     * @return The workload group minimum percentage resource.
     * 
     */
    public Integer minResourcePercent() {
        return this.minResourcePercent;
    }
    /**
     * @return The workload group request minimum grant percentage.
     * 
     */
    public Double minResourcePercentPerRequest() {
        return this.minResourcePercentPerRequest;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The workload group query execution timeout.
     * 
     */
    public Optional<Integer> queryExecutionTimeout() {
        return Optional.ofNullable(this.queryExecutionTimeout);
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

    public static Builder builder(GetWorkloadGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String importance;
        private Integer maxResourcePercent;
        private @Nullable Double maxResourcePercentPerRequest;
        private Integer minResourcePercent;
        private Double minResourcePercentPerRequest;
        private String name;
        private @Nullable Integer queryExecutionTimeout;
        private String type;
        public Builder() {}
        public Builder(GetWorkloadGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.importance = defaults.importance;
    	      this.maxResourcePercent = defaults.maxResourcePercent;
    	      this.maxResourcePercentPerRequest = defaults.maxResourcePercentPerRequest;
    	      this.minResourcePercent = defaults.minResourcePercent;
    	      this.minResourcePercentPerRequest = defaults.minResourcePercentPerRequest;
    	      this.name = defaults.name;
    	      this.queryExecutionTimeout = defaults.queryExecutionTimeout;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder importance(@Nullable String importance) {
            this.importance = importance;
            return this;
        }
        @CustomType.Setter
        public Builder maxResourcePercent(Integer maxResourcePercent) {
            this.maxResourcePercent = Objects.requireNonNull(maxResourcePercent);
            return this;
        }
        @CustomType.Setter
        public Builder maxResourcePercentPerRequest(@Nullable Double maxResourcePercentPerRequest) {
            this.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
            return this;
        }
        @CustomType.Setter
        public Builder minResourcePercent(Integer minResourcePercent) {
            this.minResourcePercent = Objects.requireNonNull(minResourcePercent);
            return this;
        }
        @CustomType.Setter
        public Builder minResourcePercentPerRequest(Double minResourcePercentPerRequest) {
            this.minResourcePercentPerRequest = Objects.requireNonNull(minResourcePercentPerRequest);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder queryExecutionTimeout(@Nullable Integer queryExecutionTimeout) {
            this.queryExecutionTimeout = queryExecutionTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWorkloadGroupResult build() {
            final var o = new GetWorkloadGroupResult();
            o.id = id;
            o.importance = importance;
            o.maxResourcePercent = maxResourcePercent;
            o.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
            o.minResourcePercent = minResourcePercent;
            o.minResourcePercentPerRequest = minResourcePercentPerRequest;
            o.name = name;
            o.queryExecutionTimeout = queryExecutionTimeout;
            o.type = type;
            return o;
        }
    }
}
