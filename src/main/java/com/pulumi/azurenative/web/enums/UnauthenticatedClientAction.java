// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    @EnumType
    public enum UnauthenticatedClientAction {
        RedirectToLoginPage("RedirectToLoginPage"),
        AllowAnonymous("AllowAnonymous");

        private final String value;

        UnauthenticatedClientAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UnauthenticatedClientAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
