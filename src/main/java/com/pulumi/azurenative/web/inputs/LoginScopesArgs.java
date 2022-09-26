// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the login flow, including the scopes that should be requested.
 * 
 */
public final class LoginScopesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoginScopesArgs Empty = new LoginScopesArgs();

    /**
     * A list of the scopes that should be requested while authenticating.
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    /**
     * @return A list of the scopes that should be requested while authenticating.
     * 
     */
    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    private LoginScopesArgs() {}

    private LoginScopesArgs(LoginScopesArgs $) {
        this.scopes = $.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoginScopesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoginScopesArgs $;

        public Builder() {
            $ = new LoginScopesArgs();
        }

        public Builder(LoginScopesArgs defaults) {
            $ = new LoginScopesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scopes A list of the scopes that should be requested while authenticating.
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes A list of the scopes that should be requested while authenticating.
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes A list of the scopes that should be requested while authenticating.
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        public LoginScopesArgs build() {
            return $;
        }
    }

}