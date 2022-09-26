// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.ConnectionStringType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Database connection string value to type pair.
 * 
 */
public final class ConnStringValueTypePairArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnStringValueTypePairArgs Empty = new ConnStringValueTypePairArgs();

    /**
     * Type of database.
     * 
     */
    @Import(name="type", required=true)
    private Output<ConnectionStringType> type;

    /**
     * @return Type of database.
     * 
     */
    public Output<ConnectionStringType> type() {
        return this.type;
    }

    /**
     * Value of pair.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value of pair.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ConnStringValueTypePairArgs() {}

    private ConnStringValueTypePairArgs(ConnStringValueTypePairArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnStringValueTypePairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnStringValueTypePairArgs $;

        public Builder() {
            $ = new ConnStringValueTypePairArgs();
        }

        public Builder(ConnStringValueTypePairArgs defaults) {
            $ = new ConnStringValueTypePairArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Type of database.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<ConnectionStringType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of database.
         * 
         * @return builder
         * 
         */
        public Builder type(ConnectionStringType type) {
            return type(Output.of(type));
        }

        /**
         * @param value Value of pair.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of pair.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ConnStringValueTypePairArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
