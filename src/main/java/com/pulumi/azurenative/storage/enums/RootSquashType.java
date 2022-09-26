// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The property is for NFS share only. The default is NoRootSquash.
     * 
     */
    @EnumType
    public enum RootSquashType {
        NoRootSquash("NoRootSquash"),
        RootSquash("RootSquash"),
        AllSquash("AllSquash");

        private final String value;

        RootSquashType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RootSquashType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }