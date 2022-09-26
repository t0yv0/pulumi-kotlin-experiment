// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU for the resource.
 * 
 */
public final class SkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The SKU capacity.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return The SKU capacity.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The SKU family.
     * 
     */
    @Import(name="family")
    private @Nullable Output<String> family;

    /**
     * @return The SKU family.
     * 
     */
    public Optional<Output<String>> family() {
        return Optional.ofNullable(this.family);
    }

    /**
     * The SKU model.
     * 
     */
    @Import(name="model")
    private @Nullable Output<String> model;

    /**
     * @return The SKU model.
     * 
     */
    public Optional<Output<String>> model() {
        return Optional.ofNullable(this.model);
    }

    /**
     * The SKU name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The SKU name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The SKU size.
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return The SKU size.
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The SKU tier.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return The SKU tier.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private SkuArgs() {}

    private SkuArgs(SkuArgs $) {
        this.capacity = $.capacity;
        this.family = $.family;
        this.model = $.model;
        this.name = $.name;
        this.size = $.size;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkuArgs $;

        public Builder() {
            $ = new SkuArgs();
        }

        public Builder(SkuArgs defaults) {
            $ = new SkuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The SKU capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The SKU capacity.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param family The SKU family.
         * 
         * @return builder
         * 
         */
        public Builder family(@Nullable Output<String> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family The SKU family.
         * 
         * @return builder
         * 
         */
        public Builder family(String family) {
            return family(Output.of(family));
        }

        /**
         * @param model The SKU model.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Output<String> model) {
            $.model = model;
            return this;
        }

        /**
         * @param model The SKU model.
         * 
         * @return builder
         * 
         */
        public Builder model(String model) {
            return model(Output.of(model));
        }

        /**
         * @param name The SKU name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The SKU name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param size The SKU size.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The SKU size.
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param tier The SKU tier.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The SKU tier.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public SkuArgs build() {
            return $;
        }
    }

}
