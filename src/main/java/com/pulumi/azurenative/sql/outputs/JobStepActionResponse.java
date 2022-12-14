// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobStepActionResponse {
    /**
     * @return The source of the action to execute.
     * 
     */
    private @Nullable String source;
    /**
     * @return Type of action being executed by the job step.
     * 
     */
    private @Nullable String type;
    /**
     * @return The action value, for example the text of the T-SQL script to execute.
     * 
     */
    private String value;

    private JobStepActionResponse() {}
    /**
     * @return The source of the action to execute.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return Type of action being executed by the job step.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The action value, for example the text of the T-SQL script to execute.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStepActionResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String source;
        private @Nullable String type;
        private String value;
        public Builder() {}
        public Builder(JobStepActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public JobStepActionResponse build() {
            final var o = new JobStepActionResponse();
            o.source = source;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}
