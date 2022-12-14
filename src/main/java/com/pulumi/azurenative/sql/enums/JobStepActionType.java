// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of action being executed by the job step.
     * 
     */
    @EnumType
    public enum JobStepActionType {
        TSql("TSql");

        private final String value;

        JobStepActionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobStepActionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
