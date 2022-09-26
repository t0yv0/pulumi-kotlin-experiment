// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The license type. Possible values are &#39;LicenseIncluded&#39; (regular price inclusive of a new SQL license) and &#39;BasePrice&#39; (discounted AHB price for bringing your own SQL licenses).
     * 
     */
    @EnumType
    public enum ManagedInstanceLicenseType {
        LicenseIncluded("LicenseIncluded"),
        BasePrice("BasePrice");

        private final String value;

        ManagedInstanceLicenseType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManagedInstanceLicenseType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }