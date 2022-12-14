// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum KnownSyslogDataSourceLogLevels {
        Debug("Debug"),
        Info("Info"),
        Notice("Notice"),
        Warning("Warning"),
        Error("Error"),
        Critical("Critical"),
        Alert("Alert"),
        Emergency("Emergency"),
        Asterisk("*");

        private final String value;

        KnownSyslogDataSourceLogLevels(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "KnownSyslogDataSourceLogLevels[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
