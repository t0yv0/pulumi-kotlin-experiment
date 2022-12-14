// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataCollectionRuleAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataCollectionRuleAssociationArgs Empty = new DataCollectionRuleAssociationArgs();

    /**
     * The name of the association. The name is case insensitive.
     * 
     */
    @Import(name="associationName")
    private @Nullable Output<String> associationName;

    /**
     * @return The name of the association. The name is case insensitive.
     * 
     */
    public Optional<Output<String>> associationName() {
        return Optional.ofNullable(this.associationName);
    }

    /**
     * The resource ID of the data collection rule that is to be associated.
     * 
     */
    @Import(name="dataCollectionRuleId")
    private @Nullable Output<String> dataCollectionRuleId;

    /**
     * @return The resource ID of the data collection rule that is to be associated.
     * 
     */
    public Optional<Output<String>> dataCollectionRuleId() {
        return Optional.ofNullable(this.dataCollectionRuleId);
    }

    /**
     * Description of the association.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the association.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceUri", required=true)
    private Output<String> resourceUri;

    /**
     * @return The identifier of the resource.
     * 
     */
    public Output<String> resourceUri() {
        return this.resourceUri;
    }

    private DataCollectionRuleAssociationArgs() {}

    private DataCollectionRuleAssociationArgs(DataCollectionRuleAssociationArgs $) {
        this.associationName = $.associationName;
        this.dataCollectionRuleId = $.dataCollectionRuleId;
        this.description = $.description;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataCollectionRuleAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataCollectionRuleAssociationArgs $;

        public Builder() {
            $ = new DataCollectionRuleAssociationArgs();
        }

        public Builder(DataCollectionRuleAssociationArgs defaults) {
            $ = new DataCollectionRuleAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associationName The name of the association. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder associationName(@Nullable Output<String> associationName) {
            $.associationName = associationName;
            return this;
        }

        /**
         * @param associationName The name of the association. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder associationName(String associationName) {
            return associationName(Output.of(associationName));
        }

        /**
         * @param dataCollectionRuleId The resource ID of the data collection rule that is to be associated.
         * 
         * @return builder
         * 
         */
        public Builder dataCollectionRuleId(@Nullable Output<String> dataCollectionRuleId) {
            $.dataCollectionRuleId = dataCollectionRuleId;
            return this;
        }

        /**
         * @param dataCollectionRuleId The resource ID of the data collection rule that is to be associated.
         * 
         * @return builder
         * 
         */
        public Builder dataCollectionRuleId(String dataCollectionRuleId) {
            return dataCollectionRuleId(Output.of(dataCollectionRuleId));
        }

        /**
         * @param description Description of the association.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the association.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param resourceUri The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(Output<String> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        /**
         * @param resourceUri The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        public DataCollectionRuleAssociationArgs build() {
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}
