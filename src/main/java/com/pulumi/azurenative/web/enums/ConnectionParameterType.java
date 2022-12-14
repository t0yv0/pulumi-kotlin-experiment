// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the parameter
     * 
     */
    @EnumType
    public enum ConnectionParameterType {
        String("string"),
        Securestring("securestring"),
        Secureobject("secureobject"),
        Int_("int"),
        Bool("bool"),
        Object("object"),
        Array("array"),
        OauthSetting("oauthSetting"),
        Connection("connection");

        private final String value;

        ConnectionParameterType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConnectionParameterType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
