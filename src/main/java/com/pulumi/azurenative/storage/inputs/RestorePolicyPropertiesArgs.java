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
 * The blob service properties for blob restore policy
 * 
 */
public final class RestorePolicyPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestorePolicyPropertiesArgs Empty = new RestorePolicyPropertiesArgs();

    /**
     * how long this blob can be restored. It should be great than zero and less than DeleteRetentionPolicy.days.
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    /**
     * @return how long this blob can be restored. It should be great than zero and less than DeleteRetentionPolicy.days.
     * 
     */
    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    /**
     * Blob restore is enabled if set to true.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Blob restore is enabled if set to true.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private RestorePolicyPropertiesArgs() {}

    private RestorePolicyPropertiesArgs(RestorePolicyPropertiesArgs $) {
        this.days = $.days;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestorePolicyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestorePolicyPropertiesArgs $;

        public Builder() {
            $ = new RestorePolicyPropertiesArgs();
        }

        public Builder(RestorePolicyPropertiesArgs defaults) {
            $ = new RestorePolicyPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days how long this blob can be restored. It should be great than zero and less than DeleteRetentionPolicy.days.
         * 
         * @return builder
         * 
         */
        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days how long this blob can be restored. It should be great than zero and less than DeleteRetentionPolicy.days.
         * 
         * @return builder
         * 
         */
        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        /**
         * @param enabled Blob restore is enabled if set to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Blob restore is enabled if set to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public RestorePolicyPropertiesArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
