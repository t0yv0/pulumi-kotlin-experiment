// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A dictionary of name and value pairs.
 * 
 */
public final class TagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagsArgs Empty = new TagsArgs();

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TagsArgs() {}

    private TagsArgs(TagsArgs $) {
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagsArgs $;

        public Builder() {
            $ = new TagsArgs();
        }

        public Builder(TagsArgs defaults) {
            $ = new TagsArgs(Objects.requireNonNull(defaults));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public TagsArgs build() {
            return $;
        }
    }

}