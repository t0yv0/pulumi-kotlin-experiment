// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The authentication protocol that is used for the file share. Can only be specified when creating a share.
     * 
     */
    @EnumType
    public enum EnabledProtocols {
        SMB("SMB"),
        NFS("NFS");

        private final String value;

        EnabledProtocols(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EnabledProtocols[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
