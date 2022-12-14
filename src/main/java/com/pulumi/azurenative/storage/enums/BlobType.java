// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of a storage blob to be created.
     * 
     */
    @EnumType
    public enum BlobType {
        /**
         * Block blobs store text and binary data. Block blobs are made up of blocks of data that can be managed individually.
         * 
         */
        Block("Block"),
        /**
         * Append blobs are made up of blocks like block blobs, but are optimized for append operations.
         * 
         */
        Append("Append");

        private final String value;

        BlobType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BlobType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
