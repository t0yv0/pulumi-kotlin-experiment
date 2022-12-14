// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Name of the policy. The valid value is AccessTimeTracking. This field is currently read only
     * 
     */
    @EnumType
    public enum Name {
        AccessTimeTracking("AccessTimeTracking");

        private final String value;

        Name(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Name[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
