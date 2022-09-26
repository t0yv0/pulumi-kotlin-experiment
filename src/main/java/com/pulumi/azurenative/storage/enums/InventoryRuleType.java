// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The valid value is Inventory
     * 
     */
    @EnumType
    public enum InventoryRuleType {
        Inventory("Inventory");

        private final String value;

        InventoryRuleType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InventoryRuleType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
