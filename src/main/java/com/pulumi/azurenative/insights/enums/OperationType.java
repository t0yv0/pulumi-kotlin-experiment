// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * the operation associated with the notification and its value must be &#34;scale&#34;
     * 
     */
    @EnumType
    public enum OperationType {
        Scale("Scale");

        private final String value;

        OperationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OperationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }