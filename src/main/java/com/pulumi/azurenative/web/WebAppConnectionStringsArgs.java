// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.inputs.ConnStringValueTypePairArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppConnectionStringsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppConnectionStringsArgs Empty = new WebAppConnectionStringsArgs();

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Connection strings.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,ConnStringValueTypePairArgs>> properties;

    /**
     * @return Connection strings.
     * 
     */
    public Optional<Output<Map<String,ConnStringValueTypePairArgs>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private WebAppConnectionStringsArgs() {}

    private WebAppConnectionStringsArgs(WebAppConnectionStringsArgs $) {
        this.kind = $.kind;
        this.name = $.name;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppConnectionStringsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppConnectionStringsArgs $;

        public Builder() {
            $ = new WebAppConnectionStringsArgs();
        }

        public Builder(WebAppConnectionStringsArgs defaults) {
            $ = new WebAppConnectionStringsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param properties Connection strings.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,ConnStringValueTypePairArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Connection strings.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,ConnStringValueTypePairArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public WebAppConnectionStringsArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
