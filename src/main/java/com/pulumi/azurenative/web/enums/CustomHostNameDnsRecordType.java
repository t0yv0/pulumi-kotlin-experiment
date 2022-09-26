// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Custom DNS record type.
     * 
     */
    @EnumType
    public enum CustomHostNameDnsRecordType {
        CName("CName"),
        A("A");

        private final String value;

        CustomHostNameDnsRecordType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CustomHostNameDnsRecordType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
