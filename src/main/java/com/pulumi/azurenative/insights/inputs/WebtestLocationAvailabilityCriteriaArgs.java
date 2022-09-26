// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the metric alert rule criteria for a web test resource.
 * 
 */
public final class WebtestLocationAvailabilityCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebtestLocationAvailabilityCriteriaArgs Empty = new WebtestLocationAvailabilityCriteriaArgs();

    /**
     * The Application Insights resource Id.
     * 
     */
    @Import(name="componentId", required=true)
    private Output<String> componentId;

    /**
     * @return The Application Insights resource Id.
     * 
     */
    public Output<String> componentId() {
        return this.componentId;
    }

    /**
     * The number of failed locations.
     * 
     */
    @Import(name="failedLocationCount", required=true)
    private Output<Double> failedLocationCount;

    /**
     * @return The number of failed locations.
     * 
     */
    public Output<Double> failedLocationCount() {
        return this.failedLocationCount;
    }

    /**
     * specifies the type of the alert criteria.
     * Expected value is &#39;Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return specifies the type of the alert criteria.
     * Expected value is &#39;Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The Application Insights web test Id.
     * 
     */
    @Import(name="webTestId", required=true)
    private Output<String> webTestId;

    /**
     * @return The Application Insights web test Id.
     * 
     */
    public Output<String> webTestId() {
        return this.webTestId;
    }

    private WebtestLocationAvailabilityCriteriaArgs() {}

    private WebtestLocationAvailabilityCriteriaArgs(WebtestLocationAvailabilityCriteriaArgs $) {
        this.componentId = $.componentId;
        this.failedLocationCount = $.failedLocationCount;
        this.odataType = $.odataType;
        this.webTestId = $.webTestId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebtestLocationAvailabilityCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebtestLocationAvailabilityCriteriaArgs $;

        public Builder() {
            $ = new WebtestLocationAvailabilityCriteriaArgs();
        }

        public Builder(WebtestLocationAvailabilityCriteriaArgs defaults) {
            $ = new WebtestLocationAvailabilityCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentId The Application Insights resource Id.
         * 
         * @return builder
         * 
         */
        public Builder componentId(Output<String> componentId) {
            $.componentId = componentId;
            return this;
        }

        /**
         * @param componentId The Application Insights resource Id.
         * 
         * @return builder
         * 
         */
        public Builder componentId(String componentId) {
            return componentId(Output.of(componentId));
        }

        /**
         * @param failedLocationCount The number of failed locations.
         * 
         * @return builder
         * 
         */
        public Builder failedLocationCount(Output<Double> failedLocationCount) {
            $.failedLocationCount = failedLocationCount;
            return this;
        }

        /**
         * @param failedLocationCount The number of failed locations.
         * 
         * @return builder
         * 
         */
        public Builder failedLocationCount(Double failedLocationCount) {
            return failedLocationCount(Output.of(failedLocationCount));
        }

        /**
         * @param odataType specifies the type of the alert criteria.
         * Expected value is &#39;Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType specifies the type of the alert criteria.
         * Expected value is &#39;Microsoft.Azure.Monitor.WebtestLocationAvailabilityCriteria&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param webTestId The Application Insights web test Id.
         * 
         * @return builder
         * 
         */
        public Builder webTestId(Output<String> webTestId) {
            $.webTestId = webTestId;
            return this;
        }

        /**
         * @param webTestId The Application Insights web test Id.
         * 
         * @return builder
         * 
         */
        public Builder webTestId(String webTestId) {
            return webTestId(Output.of(webTestId));
        }

        public WebtestLocationAvailabilityCriteriaArgs build() {
            $.componentId = Objects.requireNonNull($.componentId, "expected parameter 'componentId' to be non-null");
            $.failedLocationCount = Objects.requireNonNull($.failedLocationCount, "expected parameter 'failedLocationCount' to be non-null");
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            $.webTestId = Objects.requireNonNull($.webTestId, "expected parameter 'webTestId' to be non-null");
            return $;
        }
    }

}