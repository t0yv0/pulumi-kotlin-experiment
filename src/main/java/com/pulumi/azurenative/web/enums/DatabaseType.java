// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Database type (e.g. SqlAzure / MySql).
     * 
     */
    @EnumType
    public enum DatabaseType {
        SqlAzure("SqlAzure"),
        MySql("MySql"),
        LocalMySql("LocalMySql"),
        PostgreSql("PostgreSql");

        private final String value;

        DatabaseType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatabaseType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
