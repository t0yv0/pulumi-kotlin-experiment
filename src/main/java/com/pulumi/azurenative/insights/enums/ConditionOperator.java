// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * the operator used to compare the data and the threshold.
     * 
     */
    @EnumType
    public enum ConditionOperator {
        GreaterThan("GreaterThan"),
        GreaterThanOrEqual("GreaterThanOrEqual"),
        LessThan("LessThan"),
        LessThanOrEqual("LessThanOrEqual");

        private final String value;

        ConditionOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConditionOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
