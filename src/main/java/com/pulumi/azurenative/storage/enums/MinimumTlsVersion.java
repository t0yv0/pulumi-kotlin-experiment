// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property.
     * 
     */
    @EnumType
    public enum MinimumTlsVersion {
        TLS1_0("TLS1_0"),
        TLS1_1("TLS1_1"),
        TLS1_2("TLS1_2");

        private final String value;

        MinimumTlsVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MinimumTlsVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
