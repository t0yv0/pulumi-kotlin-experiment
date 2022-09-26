// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StaticSiteCustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final StaticSiteCustomDomainArgs Empty = new StaticSiteCustomDomainArgs();

    /**
     * The custom domain to create.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The custom domain to create.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

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
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the static site.
     * 
     */
    public Output<String> name() {
        return this.name;
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

    /**
     * Validation method for adding a custom domain
     * 
     */
    @Import(name="validationMethod")
    private @Nullable Output<String> validationMethod;

    /**
     * @return Validation method for adding a custom domain
     * 
     */
    public Optional<Output<String>> validationMethod() {
        return Optional.ofNullable(this.validationMethod);
    }

    private StaticSiteCustomDomainArgs() {}

    private StaticSiteCustomDomainArgs(StaticSiteCustomDomainArgs $) {
        this.domainName = $.domainName;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.validationMethod = $.validationMethod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticSiteCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticSiteCustomDomainArgs $;

        public Builder() {
            $ = new StaticSiteCustomDomainArgs();
        }

        public Builder(StaticSiteCustomDomainArgs defaults) {
            $ = new StaticSiteCustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The custom domain to create.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The custom domain to create.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
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
         * @param name Name of the static site.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the static site.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        /**
         * @param validationMethod Validation method for adding a custom domain
         * 
         * @return builder
         * 
         */
        public Builder validationMethod(@Nullable Output<String> validationMethod) {
            $.validationMethod = validationMethod;
            return this;
        }

        /**
         * @param validationMethod Validation method for adding a custom domain
         * 
         * @return builder
         * 
         */
        public Builder validationMethod(String validationMethod) {
            return validationMethod(Output.of(validationMethod));
        }

        public StaticSiteCustomDomainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.validationMethod = Codegen.stringProp("validationMethod").output().arg($.validationMethod).def("cname-delegation").getNullable();
            return $;
        }
    }

}