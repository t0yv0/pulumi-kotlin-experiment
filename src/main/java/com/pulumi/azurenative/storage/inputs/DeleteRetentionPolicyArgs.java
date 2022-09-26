// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The service properties for soft delete.
 * 
 */
public final class DeleteRetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeleteRetentionPolicyArgs Empty = new DeleteRetentionPolicyArgs();

    /**
     * Indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    /**
     * @return Indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
     * 
     */
    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    /**
     * Indicates whether DeleteRetentionPolicy is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Indicates whether DeleteRetentionPolicy is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private DeleteRetentionPolicyArgs() {}

    private DeleteRetentionPolicyArgs(DeleteRetentionPolicyArgs $) {
        this.days = $.days;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeleteRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeleteRetentionPolicyArgs $;

        public Builder() {
            $ = new DeleteRetentionPolicyArgs();
        }

        public Builder(DeleteRetentionPolicyArgs defaults) {
            $ = new DeleteRetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days Indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
         * 
         * @return builder
         * 
         */
        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days Indicates the number of days that the deleted item should be retained. The minimum specified value can be 1 and the maximum value can be 365.
         * 
         * @return builder
         * 
         */
        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        /**
         * @param enabled Indicates whether DeleteRetentionPolicy is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether DeleteRetentionPolicy is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public DeleteRetentionPolicyArgs build() {
            return $;
        }
    }

}