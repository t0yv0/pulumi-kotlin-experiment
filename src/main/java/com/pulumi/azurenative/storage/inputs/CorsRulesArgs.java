// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.CorsRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sets the CORS rules. You can include up to five CorsRule elements in the request.
 * 
 */
public final class CorsRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CorsRulesArgs Empty = new CorsRulesArgs();

    /**
     * The List of CORS rules. You can include up to five CorsRule elements in the request.
     * 
     */
    @Import(name="corsRules")
    private @Nullable Output<List<CorsRuleArgs>> corsRules;

    /**
     * @return The List of CORS rules. You can include up to five CorsRule elements in the request.
     * 
     */
    public Optional<Output<List<CorsRuleArgs>>> corsRules() {
        return Optional.ofNullable(this.corsRules);
    }

    private CorsRulesArgs() {}

    private CorsRulesArgs(CorsRulesArgs $) {
        this.corsRules = $.corsRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CorsRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CorsRulesArgs $;

        public Builder() {
            $ = new CorsRulesArgs();
        }

        public Builder(CorsRulesArgs defaults) {
            $ = new CorsRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param corsRules The List of CORS rules. You can include up to five CorsRule elements in the request.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(@Nullable Output<List<CorsRuleArgs>> corsRules) {
            $.corsRules = corsRules;
            return this;
        }

        /**
         * @param corsRules The List of CORS rules. You can include up to five CorsRule elements in the request.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(List<CorsRuleArgs> corsRules) {
            return corsRules(Output.of(corsRules));
        }

        /**
         * @param corsRules The List of CORS rules. You can include up to five CorsRule elements in the request.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(CorsRuleArgs... corsRules) {
            return corsRules(List.of(corsRules));
        }

        public CorsRulesArgs build() {
            return $;
        }
    }

}
