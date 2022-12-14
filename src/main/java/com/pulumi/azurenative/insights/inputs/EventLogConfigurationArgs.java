// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventLogConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventLogConfigurationArgs Empty = new EventLogConfigurationArgs();

    @Import(name="filter")
    private @Nullable Output<String> filter;

    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    @Import(name="logName", required=true)
    private Output<String> logName;

    public Output<String> logName() {
        return this.logName;
    }

    private EventLogConfigurationArgs() {}

    private EventLogConfigurationArgs(EventLogConfigurationArgs $) {
        this.filter = $.filter;
        this.logName = $.logName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventLogConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventLogConfigurationArgs $;

        public Builder() {
            $ = new EventLogConfigurationArgs();
        }

        public Builder(EventLogConfigurationArgs defaults) {
            $ = new EventLogConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder logName(Output<String> logName) {
            $.logName = logName;
            return this;
        }

        public Builder logName(String logName) {
            return logName(Output.of(logName));
        }

        public EventLogConfigurationArgs build() {
            $.logName = Objects.requireNonNull($.logName, "expected parameter 'logName' to be non-null");
            return $;
        }
    }

}
