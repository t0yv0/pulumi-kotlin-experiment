// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the script.
     * 
     */
    @EnumType
    public enum ScriptType {
        AzurePowerShell("AzurePowerShell"),
        AzureCLI("AzureCLI");

        private final String value;

        ScriptType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ScriptType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
