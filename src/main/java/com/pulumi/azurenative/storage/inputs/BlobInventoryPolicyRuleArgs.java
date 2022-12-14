// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.BlobInventoryPolicyDefinitionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * An object that wraps the blob inventory rule. Each rule is uniquely defined by name.
 * 
 */
public final class BlobInventoryPolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobInventoryPolicyRuleArgs Empty = new BlobInventoryPolicyRuleArgs();

    /**
     * An object that defines the blob inventory policy rule.
     * 
     */
    @Import(name="definition", required=true)
    private Output<BlobInventoryPolicyDefinitionArgs> definition;

    /**
     * @return An object that defines the blob inventory policy rule.
     * 
     */
    public Output<BlobInventoryPolicyDefinitionArgs> definition() {
        return this.definition;
    }

    /**
     * Rule is enabled when set to true.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Rule is enabled when set to true.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private BlobInventoryPolicyRuleArgs() {}

    private BlobInventoryPolicyRuleArgs(BlobInventoryPolicyRuleArgs $) {
        this.definition = $.definition;
        this.enabled = $.enabled;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobInventoryPolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobInventoryPolicyRuleArgs $;

        public Builder() {
            $ = new BlobInventoryPolicyRuleArgs();
        }

        public Builder(BlobInventoryPolicyRuleArgs defaults) {
            $ = new BlobInventoryPolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param definition An object that defines the blob inventory policy rule.
         * 
         * @return builder
         * 
         */
        public Builder definition(Output<BlobInventoryPolicyDefinitionArgs> definition) {
            $.definition = definition;
            return this;
        }

        /**
         * @param definition An object that defines the blob inventory policy rule.
         * 
         * @return builder
         * 
         */
        public Builder definition(BlobInventoryPolicyDefinitionArgs definition) {
            return definition(Output.of(definition));
        }

        /**
         * @param enabled Rule is enabled when set to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Rule is enabled when set to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A rule name can contain any combination of alpha numeric characters. Rule name is case-sensitive. It must be unique within a policy.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BlobInventoryPolicyRuleArgs build() {
            $.definition = Objects.requireNonNull($.definition, "expected parameter 'definition' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
