// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.azurenative.sql.enums.IdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Active Directory identity configuration for a resource.
 * 
 */
public final class ResourceIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * The identity type. Set this to &#39;SystemAssigned&#39; in order to automatically create and assign an Azure Active Directory principal for the resource.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,IdentityType>> type;

    /**
     * @return The identity type. Set this to &#39;SystemAssigned&#39; in order to automatically create and assign an Azure Active Directory principal for the resource.
     * 
     */
    public Optional<Output<Either<String,IdentityType>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The resource ids of the user assigned identities to use
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Output<Map<String,Object>> userAssignedIdentities;

    /**
     * @return The resource ids of the user assigned identities to use
     * 
     */
    public Optional<Output<Map<String,Object>>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    private ResourceIdentityArgs() {}

    private ResourceIdentityArgs(ResourceIdentityArgs $) {
        this.type = $.type;
        this.userAssignedIdentities = $.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceIdentityArgs $;

        public Builder() {
            $ = new ResourceIdentityArgs();
        }

        public Builder(ResourceIdentityArgs defaults) {
            $ = new ResourceIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The identity type. Set this to &#39;SystemAssigned&#39; in order to automatically create and assign an Azure Active Directory principal for the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,IdentityType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The identity type. Set this to &#39;SystemAssigned&#39; in order to automatically create and assign an Azure Active Directory principal for the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,IdentityType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The identity type. Set this to &#39;SystemAssigned&#39; in order to automatically create and assign an Azure Active Directory principal for the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The identity type. Set this to &#39;SystemAssigned&#39; in order to automatically create and assign an Azure Active Directory principal for the resource.
         * 
         * @return builder
         * 
         */
        public Builder type(IdentityType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param userAssignedIdentities The resource ids of the user assigned identities to use
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(@Nullable Output<Map<String,Object>> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        /**
         * @param userAssignedIdentities The resource ids of the user assigned identities to use
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(Map<String,Object> userAssignedIdentities) {
            return userAssignedIdentities(Output.of(userAssignedIdentities));
        }

        public ResourceIdentityArgs build() {
            return $;
        }
    }

}
