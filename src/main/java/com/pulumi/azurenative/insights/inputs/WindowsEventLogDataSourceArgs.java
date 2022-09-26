// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.azurenative.insights.enums.KnownWindowsEventLogDataSourceStreams;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of which Windows Event Log events will be collected and how they will be collected.
 * Only collected from Windows machines.
 * 
 */
public final class WindowsEventLogDataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsEventLogDataSourceArgs Empty = new WindowsEventLogDataSourceArgs();

    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    @Import(name="streams")
    private @Nullable Output<List<Either<String,KnownWindowsEventLogDataSourceStreams>>> streams;

    /**
     * @return List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    public Optional<Output<List<Either<String,KnownWindowsEventLogDataSourceStreams>>>> streams() {
        return Optional.ofNullable(this.streams);
    }

    /**
     * A list of Windows Event Log queries in XPATH format.
     * 
     */
    @Import(name="xPathQueries")
    private @Nullable Output<List<String>> xPathQueries;

    /**
     * @return A list of Windows Event Log queries in XPATH format.
     * 
     */
    public Optional<Output<List<String>>> xPathQueries() {
        return Optional.ofNullable(this.xPathQueries);
    }

    private WindowsEventLogDataSourceArgs() {}

    private WindowsEventLogDataSourceArgs(WindowsEventLogDataSourceArgs $) {
        this.name = $.name;
        this.streams = $.streams;
        this.xPathQueries = $.xPathQueries;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsEventLogDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsEventLogDataSourceArgs $;

        public Builder() {
            $ = new WindowsEventLogDataSourceArgs();
        }

        public Builder(WindowsEventLogDataSourceArgs defaults) {
            $ = new WindowsEventLogDataSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A friendly name for the data source.
         * This name should be unique across all data sources (regardless of type) within the data collection rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name for the data source.
         * This name should be unique across all data sources (regardless of type) within the data collection rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param streams List of streams that this data source will be sent to.
         * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
         * 
         * @return builder
         * 
         */
        public Builder streams(@Nullable Output<List<Either<String,KnownWindowsEventLogDataSourceStreams>>> streams) {
            $.streams = streams;
            return this;
        }

        /**
         * @param streams List of streams that this data source will be sent to.
         * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
         * 
         * @return builder
         * 
         */
        public Builder streams(List<Either<String,KnownWindowsEventLogDataSourceStreams>> streams) {
            return streams(Output.of(streams));
        }

        /**
         * @param streams List of streams that this data source will be sent to.
         * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
         * 
         * @return builder
         * 
         */
        public Builder streams(Either<String,KnownWindowsEventLogDataSourceStreams>... streams) {
            return streams(List.of(streams));
        }

        /**
         * @param xPathQueries A list of Windows Event Log queries in XPATH format.
         * 
         * @return builder
         * 
         */
        public Builder xPathQueries(@Nullable Output<List<String>> xPathQueries) {
            $.xPathQueries = xPathQueries;
            return this;
        }

        /**
         * @param xPathQueries A list of Windows Event Log queries in XPATH format.
         * 
         * @return builder
         * 
         */
        public Builder xPathQueries(List<String> xPathQueries) {
            return xPathQueries(Output.of(xPathQueries));
        }

        /**
         * @param xPathQueries A list of Windows Event Log queries in XPATH format.
         * 
         * @return builder
         * 
         */
        public Builder xPathQueries(String... xPathQueries) {
            return xPathQueries(List.of(xPathQueries));
        }

        public WindowsEventLogDataSourceArgs build() {
            return $;
        }
    }

}