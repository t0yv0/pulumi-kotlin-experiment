// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubscriptionDiagnosticSettingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionDiagnosticSettingArgs Empty = new GetSubscriptionDiagnosticSettingArgs();

    /**
     * The name of the diagnostic setting.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the diagnostic setting.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetSubscriptionDiagnosticSettingArgs() {}

    private GetSubscriptionDiagnosticSettingArgs(GetSubscriptionDiagnosticSettingArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionDiagnosticSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionDiagnosticSettingArgs $;

        public Builder() {
            $ = new GetSubscriptionDiagnosticSettingArgs();
        }

        public Builder(GetSubscriptionDiagnosticSettingArgs defaults) {
            $ = new GetSubscriptionDiagnosticSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the diagnostic setting.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the diagnostic setting.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetSubscriptionDiagnosticSettingArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
