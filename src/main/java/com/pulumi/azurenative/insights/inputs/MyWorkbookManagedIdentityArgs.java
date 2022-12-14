// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Customer Managed Identity
 * 
 */
public final class MyWorkbookManagedIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final MyWorkbookManagedIdentityArgs Empty = new MyWorkbookManagedIdentityArgs();

    /**
     * The identity type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The identity type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private MyWorkbookManagedIdentityArgs() {}

    private MyWorkbookManagedIdentityArgs(MyWorkbookManagedIdentityArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MyWorkbookManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MyWorkbookManagedIdentityArgs $;

        public Builder() {
            $ = new MyWorkbookManagedIdentityArgs();
        }

        public Builder(MyWorkbookManagedIdentityArgs defaults) {
            $ = new MyWorkbookManagedIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The identity type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MyWorkbookManagedIdentityArgs build() {
            return $;
        }
    }

}
