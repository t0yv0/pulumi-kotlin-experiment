// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.ConsentLinkParameterDefinition;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListConnectionConsentLinksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListConnectionConsentLinksPlainArgs Empty = new ListConnectionConsentLinksPlainArgs();

    /**
     * Connection name
     * 
     */
    @Import(name="connectionName", required=true)
    private String connectionName;

    /**
     * @return Connection name
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * Collection of resources
     * 
     */
    @Import(name="parameters")
    private @Nullable List<ConsentLinkParameterDefinition> parameters;

    /**
     * @return Collection of resources
     * 
     */
    public Optional<List<ConsentLinkParameterDefinition>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Subscription Id
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable String subscriptionId;

    /**
     * @return Subscription Id
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    private ListConnectionConsentLinksPlainArgs() {}

    private ListConnectionConsentLinksPlainArgs(ListConnectionConsentLinksPlainArgs $) {
        this.connectionName = $.connectionName;
        this.parameters = $.parameters;
        this.resourceGroupName = $.resourceGroupName;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListConnectionConsentLinksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListConnectionConsentLinksPlainArgs $;

        public Builder() {
            $ = new ListConnectionConsentLinksPlainArgs();
        }

        public Builder(ListConnectionConsentLinksPlainArgs defaults) {
            $ = new ListConnectionConsentLinksPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionName Connection name
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param parameters Collection of resources
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable List<ConsentLinkParameterDefinition> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Collection of resources
         * 
         * @return builder
         * 
         */
        public Builder parameters(ConsentLinkParameterDefinition... parameters) {
            return parameters(List.of(parameters));
        }

        /**
         * @param resourceGroupName The resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param subscriptionId Subscription Id
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public ListConnectionConsentLinksPlainArgs build() {
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
