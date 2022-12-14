// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomDomainResponse {
    /**
     * @return Gets or sets the custom domain name assigned to the storage account. Name is the CNAME source.
     * 
     */
    private String name;
    /**
     * @return Indicates whether indirect CName validation is enabled. Default value is false. This should only be set on updates.
     * 
     */
    private @Nullable Boolean useSubDomainName;

    private CustomDomainResponse() {}
    /**
     * @return Gets or sets the custom domain name assigned to the storage account. Name is the CNAME source.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Indicates whether indirect CName validation is enabled. Default value is false. This should only be set on updates.
     * 
     */
    public Optional<Boolean> useSubDomainName() {
        return Optional.ofNullable(this.useSubDomainName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable Boolean useSubDomainName;
        public Builder() {}
        public Builder(CustomDomainResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.useSubDomainName = defaults.useSubDomainName;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder useSubDomainName(@Nullable Boolean useSubDomainName) {
            this.useSubDomainName = useSubDomainName;
            return this;
        }
        public CustomDomainResponse build() {
            final var o = new CustomDomainResponse();
            o.name = name;
            o.useSubDomainName = useSubDomainName;
            return o;
        }
    }
}
