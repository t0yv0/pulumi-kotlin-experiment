// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * specifies the type of the alert criteria.
     * 
     */
    @EnumType
    public enum Odatatype {
        Microsoft_Azure_Monitor_SingleResourceMultipleMetricCriteria("Microsoft.Azure.Monitor.SingleResourceMultipleMetricCriteria"),
        Microsoft_Azure_Monitor_MultipleResourceMultipleMetricCriteria("Microsoft.Azure.Monitor.MultipleResourceMultipleMetricCriteria"),
        Microsoft_Azure_Monitor_WebtestLocationAvailabilityCriteria("Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria");

        private final String value;

        Odatatype(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Odatatype[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
