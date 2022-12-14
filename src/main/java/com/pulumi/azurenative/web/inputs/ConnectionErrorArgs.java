// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connection error
 * 
 */
public final class ConnectionErrorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionErrorArgs Empty = new ConnectionErrorArgs();

    /**
     * Code of the status
     * 
     */
    @Import(name="code")
    private @Nullable Output<String> code;

    /**
     * @return Code of the status
     * 
     */
    public Optional<Output<String>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Resource ETag
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Resource ETag
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Description of the status
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Description of the status
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ConnectionErrorArgs() {}

    private ConnectionErrorArgs(ConnectionErrorArgs $) {
        this.code = $.code;
        this.etag = $.etag;
        this.location = $.location;
        this.message = $.message;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionErrorArgs $;

        public Builder() {
            $ = new ConnectionErrorArgs();
        }

        public Builder(ConnectionErrorArgs defaults) {
            $ = new ConnectionErrorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Code of the status
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<String> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code Code of the status
         * 
         * @return builder
         * 
         */
        public Builder code(String code) {
            return code(Output.of(code));
        }

        /**
         * @param etag Resource ETag
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Resource ETag
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param message Description of the status
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Description of the status
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ConnectionErrorArgs build() {
            return $;
        }
    }

}
