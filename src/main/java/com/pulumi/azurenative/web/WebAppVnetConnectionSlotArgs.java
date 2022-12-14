// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppVnetConnectionSlotArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppVnetConnectionSlotArgs Empty = new WebAppVnetConnectionSlotArgs();

    /**
     * A certificate file (.cer) blob containing the public key of the private key used to authenticate a
     * Point-To-Site VPN connection.
     * 
     */
    @Import(name="certBlob")
    private @Nullable Output<String> certBlob;

    /**
     * @return A certificate file (.cer) blob containing the public key of the private key used to authenticate a
     * Point-To-Site VPN connection.
     * 
     */
    public Optional<Output<String>> certBlob() {
        return Optional.ofNullable(this.certBlob);
    }

    /**
     * DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     * 
     */
    @Import(name="dnsServers")
    private @Nullable Output<String> dnsServers;

    /**
     * @return DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     * 
     */
    public Optional<Output<String>> dnsServers() {
        return Optional.ofNullable(this.dnsServers);
    }

    /**
     * Flag that is used to denote if this is VNET injection
     * 
     */
    @Import(name="isSwift")
    private @Nullable Output<Boolean> isSwift;

    /**
     * @return Flag that is used to denote if this is VNET injection
     * 
     */
    public Optional<Output<Boolean>> isSwift() {
        return Optional.ofNullable(this.isSwift);
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
     * Name of the deployment slot. If a slot is not specified, the API will add or update connections for the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private Output<String> slot;

    /**
     * @return Name of the deployment slot. If a slot is not specified, the API will add or update connections for the production slot.
     * 
     */
    public Output<String> slot() {
        return this.slot;
    }

    /**
     * Name of an existing Virtual Network.
     * 
     */
    @Import(name="vnetName")
    private @Nullable Output<String> vnetName;

    /**
     * @return Name of an existing Virtual Network.
     * 
     */
    public Optional<Output<String>> vnetName() {
        return Optional.ofNullable(this.vnetName);
    }

    /**
     * The Virtual Network&#39;s resource ID.
     * 
     */
    @Import(name="vnetResourceId")
    private @Nullable Output<String> vnetResourceId;

    /**
     * @return The Virtual Network&#39;s resource ID.
     * 
     */
    public Optional<Output<String>> vnetResourceId() {
        return Optional.ofNullable(this.vnetResourceId);
    }

    private WebAppVnetConnectionSlotArgs() {}

    private WebAppVnetConnectionSlotArgs(WebAppVnetConnectionSlotArgs $) {
        this.certBlob = $.certBlob;
        this.dnsServers = $.dnsServers;
        this.isSwift = $.isSwift;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
        this.vnetName = $.vnetName;
        this.vnetResourceId = $.vnetResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppVnetConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppVnetConnectionSlotArgs $;

        public Builder() {
            $ = new WebAppVnetConnectionSlotArgs();
        }

        public Builder(WebAppVnetConnectionSlotArgs defaults) {
            $ = new WebAppVnetConnectionSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certBlob A certificate file (.cer) blob containing the public key of the private key used to authenticate a
         * Point-To-Site VPN connection.
         * 
         * @return builder
         * 
         */
        public Builder certBlob(@Nullable Output<String> certBlob) {
            $.certBlob = certBlob;
            return this;
        }

        /**
         * @param certBlob A certificate file (.cer) blob containing the public key of the private key used to authenticate a
         * Point-To-Site VPN connection.
         * 
         * @return builder
         * 
         */
        public Builder certBlob(String certBlob) {
            return certBlob(Output.of(certBlob));
        }

        /**
         * @param dnsServers DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(@Nullable Output<String> dnsServers) {
            $.dnsServers = dnsServers;
            return this;
        }

        /**
         * @param dnsServers DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
         * 
         * @return builder
         * 
         */
        public Builder dnsServers(String dnsServers) {
            return dnsServers(Output.of(dnsServers));
        }

        /**
         * @param isSwift Flag that is used to denote if this is VNET injection
         * 
         * @return builder
         * 
         */
        public Builder isSwift(@Nullable Output<Boolean> isSwift) {
            $.isSwift = isSwift;
            return this;
        }

        /**
         * @param isSwift Flag that is used to denote if this is VNET injection
         * 
         * @return builder
         * 
         */
        public Builder isSwift(Boolean isSwift) {
            return isSwift(Output.of(isSwift));
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
         * @param slot Name of the deployment slot. If a slot is not specified, the API will add or update connections for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(Output<String> slot) {
            $.slot = slot;
            return this;
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will add or update connections for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            return slot(Output.of(slot));
        }

        /**
         * @param vnetName Name of an existing Virtual Network.
         * 
         * @return builder
         * 
         */
        public Builder vnetName(@Nullable Output<String> vnetName) {
            $.vnetName = vnetName;
            return this;
        }

        /**
         * @param vnetName Name of an existing Virtual Network.
         * 
         * @return builder
         * 
         */
        public Builder vnetName(String vnetName) {
            return vnetName(Output.of(vnetName));
        }

        /**
         * @param vnetResourceId The Virtual Network&#39;s resource ID.
         * 
         * @return builder
         * 
         */
        public Builder vnetResourceId(@Nullable Output<String> vnetResourceId) {
            $.vnetResourceId = vnetResourceId;
            return this;
        }

        /**
         * @param vnetResourceId The Virtual Network&#39;s resource ID.
         * 
         * @return builder
         * 
         */
        public Builder vnetResourceId(String vnetResourceId) {
            return vnetResourceId(Output.of(vnetResourceId));
        }

        public WebAppVnetConnectionSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}
