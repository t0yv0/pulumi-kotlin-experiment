// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.enums.Name;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The blob service properties for Last access time based tracking policy.
 * 
 */
public final class LastAccessTimeTrackingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final LastAccessTimeTrackingPolicyArgs Empty = new LastAccessTimeTrackingPolicyArgs();

    /**
     * An array of predefined supported blob types. Only blockBlob is the supported value. This field is currently read only
     * 
     */
    @Import(name="blobType")
    private @Nullable Output<List<String>> blobType;

    /**
     * @return An array of predefined supported blob types. Only blockBlob is the supported value. This field is currently read only
     * 
     */
    public Optional<Output<List<String>>> blobType() {
        return Optional.ofNullable(this.blobType);
    }

    /**
     * When set to true last access time based tracking is enabled.
     * 
     */
    @Import(name="enable", required=true)
    private Output<Boolean> enable;

    /**
     * @return When set to true last access time based tracking is enabled.
     * 
     */
    public Output<Boolean> enable() {
        return this.enable;
    }

    /**
     * Name of the policy. The valid value is AccessTimeTracking. This field is currently read only
     * 
     */
    @Import(name="name")
    private @Nullable Output<Either<String,Name>> name;

    /**
     * @return Name of the policy. The valid value is AccessTimeTracking. This field is currently read only
     * 
     */
    public Optional<Output<Either<String,Name>>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The field specifies blob object tracking granularity in days, typically how often the blob object should be tracked.This field is currently read only with value as 1
     * 
     */
    @Import(name="trackingGranularityInDays")
    private @Nullable Output<Integer> trackingGranularityInDays;

    /**
     * @return The field specifies blob object tracking granularity in days, typically how often the blob object should be tracked.This field is currently read only with value as 1
     * 
     */
    public Optional<Output<Integer>> trackingGranularityInDays() {
        return Optional.ofNullable(this.trackingGranularityInDays);
    }

    private LastAccessTimeTrackingPolicyArgs() {}

    private LastAccessTimeTrackingPolicyArgs(LastAccessTimeTrackingPolicyArgs $) {
        this.blobType = $.blobType;
        this.enable = $.enable;
        this.name = $.name;
        this.trackingGranularityInDays = $.trackingGranularityInDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LastAccessTimeTrackingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LastAccessTimeTrackingPolicyArgs $;

        public Builder() {
            $ = new LastAccessTimeTrackingPolicyArgs();
        }

        public Builder(LastAccessTimeTrackingPolicyArgs defaults) {
            $ = new LastAccessTimeTrackingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blobType An array of predefined supported blob types. Only blockBlob is the supported value. This field is currently read only
         * 
         * @return builder
         * 
         */
        public Builder blobType(@Nullable Output<List<String>> blobType) {
            $.blobType = blobType;
            return this;
        }

        /**
         * @param blobType An array of predefined supported blob types. Only blockBlob is the supported value. This field is currently read only
         * 
         * @return builder
         * 
         */
        public Builder blobType(List<String> blobType) {
            return blobType(Output.of(blobType));
        }

        /**
         * @param blobType An array of predefined supported blob types. Only blockBlob is the supported value. This field is currently read only
         * 
         * @return builder
         * 
         */
        public Builder blobType(String... blobType) {
            return blobType(List.of(blobType));
        }

        /**
         * @param enable When set to true last access time based tracking is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enable(Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable When set to true last access time based tracking is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param name Name of the policy. The valid value is AccessTimeTracking. This field is currently read only
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<Either<String,Name>> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the policy. The valid value is AccessTimeTracking. This field is currently read only
         * 
         * @return builder
         * 
         */
        public Builder name(Either<String,Name> name) {
            return name(Output.of(name));
        }

        /**
         * @param name Name of the policy. The valid value is AccessTimeTracking. This field is currently read only
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Either.ofLeft(name));
        }

        /**
         * @param name Name of the policy. The valid value is AccessTimeTracking. This field is currently read only
         * 
         * @return builder
         * 
         */
        public Builder name(Name name) {
            return name(Either.ofRight(name));
        }

        /**
         * @param trackingGranularityInDays The field specifies blob object tracking granularity in days, typically how often the blob object should be tracked.This field is currently read only with value as 1
         * 
         * @return builder
         * 
         */
        public Builder trackingGranularityInDays(@Nullable Output<Integer> trackingGranularityInDays) {
            $.trackingGranularityInDays = trackingGranularityInDays;
            return this;
        }

        /**
         * @param trackingGranularityInDays The field specifies blob object tracking granularity in days, typically how often the blob object should be tracked.This field is currently read only with value as 1
         * 
         * @return builder
         * 
         */
        public Builder trackingGranularityInDays(Integer trackingGranularityInDays) {
            return trackingGranularityInDays(Output.of(trackingGranularityInDays));
        }

        public LastAccessTimeTrackingPolicyArgs build() {
            $.enable = Objects.requireNonNull($.enable, "expected parameter 'enable' to be non-null");
            return $;
        }
    }

}
