// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies whether data in the container may be accessed publicly and the level of access.
     * 
     */
    @EnumType
    public enum PublicAccess {
        Container("Container"),
        Blob("Blob"),
        None("None");

        private final String value;

        PublicAccess(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PublicAccess[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
