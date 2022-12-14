// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.LogLevel;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application logs to file system configuration.
 * 
 */
public final class FileSystemApplicationLogsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemApplicationLogsConfigArgs Empty = new FileSystemApplicationLogsConfigArgs();

    /**
     * Log level.
     * 
     */
    @Import(name="level")
    private @Nullable Output<LogLevel> level;

    /**
     * @return Log level.
     * 
     */
    public Optional<Output<LogLevel>> level() {
        return Optional.ofNullable(this.level);
    }

    private FileSystemApplicationLogsConfigArgs() {}

    private FileSystemApplicationLogsConfigArgs(FileSystemApplicationLogsConfigArgs $) {
        this.level = $.level;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemApplicationLogsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemApplicationLogsConfigArgs $;

        public Builder() {
            $ = new FileSystemApplicationLogsConfigArgs();
        }

        public Builder(FileSystemApplicationLogsConfigArgs defaults) {
            $ = new FileSystemApplicationLogsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param level Log level.
         * 
         * @return builder
         * 
         */
        public Builder level(@Nullable Output<LogLevel> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level Log level.
         * 
         * @return builder
         * 
         */
        public Builder level(LogLevel level) {
            return level(Output.of(level));
        }

        public FileSystemApplicationLogsConfigArgs build() {
            $.level = Codegen.objectProp("level", LogLevel.class).output().arg($.level).def(LogLevel.Off).getNullable();
            return $;
        }
    }

}
