// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TwitterRegistrationResponse {
    /**
     * @return The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    private @Nullable String consumerKey;
    /**
     * @return The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
     * application used for sign-in.
     * 
     */
    private @Nullable String consumerSecretSettingName;

    private TwitterRegistrationResponse() {}
    /**
     * @return The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    public Optional<String> consumerKey() {
        return Optional.ofNullable(this.consumerKey);
    }
    /**
     * @return The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
     * application used for sign-in.
     * 
     */
    public Optional<String> consumerSecretSettingName() {
        return Optional.ofNullable(this.consumerSecretSettingName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TwitterRegistrationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String consumerKey;
        private @Nullable String consumerSecretSettingName;
        public Builder() {}
        public Builder(TwitterRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerKey = defaults.consumerKey;
    	      this.consumerSecretSettingName = defaults.consumerSecretSettingName;
        }

        @CustomType.Setter
        public Builder consumerKey(@Nullable String consumerKey) {
            this.consumerKey = consumerKey;
            return this;
        }
        @CustomType.Setter
        public Builder consumerSecretSettingName(@Nullable String consumerSecretSettingName) {
            this.consumerSecretSettingName = consumerSecretSettingName;
            return this;
        }
        public TwitterRegistrationResponse build() {
            final var o = new TwitterRegistrationResponse();
            o.consumerKey = consumerKey;
            o.consumerSecretSettingName = consumerSecretSettingName;
            return o;
        }
    }
}
