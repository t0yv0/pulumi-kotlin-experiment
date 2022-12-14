// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.resources.inputs.TagsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TagAtScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagAtScopeArgs Empty = new TagAtScopeArgs();

    /**
     * The set of tags.
     * 
     */
    @Import(name="properties", required=true)
    private Output<TagsArgs> properties;

    /**
     * @return The set of tags.
     * 
     */
    public Output<TagsArgs> properties() {
        return this.properties;
    }

    /**
     * The resource scope.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The resource scope.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private TagAtScopeArgs() {}

    private TagAtScopeArgs(TagAtScopeArgs $) {
        this.properties = $.properties;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagAtScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagAtScopeArgs $;

        public Builder() {
            $ = new TagAtScopeArgs();
        }

        public Builder(TagAtScopeArgs defaults) {
            $ = new TagAtScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param properties The set of tags.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<TagsArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The set of tags.
         * 
         * @return builder
         * 
         */
        public Builder properties(TagsArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param scope The resource scope.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The resource scope.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public TagAtScopeArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
