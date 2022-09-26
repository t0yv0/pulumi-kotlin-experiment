// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The routes that specify the endpoints used for login and logout requests.
 * 
 */
public final class LoginRoutesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoginRoutesArgs Empty = new LoginRoutesArgs();

    /**
     * The endpoint at which a logout request should be made.
     * 
     */
    @Import(name="logoutEndpoint")
    private @Nullable Output<String> logoutEndpoint;

    /**
     * @return The endpoint at which a logout request should be made.
     * 
     */
    public Optional<Output<String>> logoutEndpoint() {
        return Optional.ofNullable(this.logoutEndpoint);
    }

    private LoginRoutesArgs() {}

    private LoginRoutesArgs(LoginRoutesArgs $) {
        this.logoutEndpoint = $.logoutEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoginRoutesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoginRoutesArgs $;

        public Builder() {
            $ = new LoginRoutesArgs();
        }

        public Builder(LoginRoutesArgs defaults) {
            $ = new LoginRoutesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logoutEndpoint The endpoint at which a logout request should be made.
         * 
         * @return builder
         * 
         */
        public Builder logoutEndpoint(@Nullable Output<String> logoutEndpoint) {
            $.logoutEndpoint = logoutEndpoint;
            return this;
        }

        /**
         * @param logoutEndpoint The endpoint at which a logout request should be made.
         * 
         * @return builder
         * 
         */
        public Builder logoutEndpoint(String logoutEndpoint) {
            return logoutEndpoint(Output.of(logoutEndpoint));
        }

        public LoginRoutesArgs build() {
            return $;
        }
    }

}