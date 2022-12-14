// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppPublicCertificateResult {
    /**
     * @return Public Certificate byte array
     * 
     */
    private @Nullable String blob;
    /**
     * @return Resource Id.
     * 
     */
    private String id;
    /**
     * @return Kind of resource.
     * 
     */
    private @Nullable String kind;
    /**
     * @return Resource Name.
     * 
     */
    private String name;
    /**
     * @return Public Certificate Location
     * 
     */
    private @Nullable String publicCertificateLocation;
    /**
     * @return Certificate Thumbprint
     * 
     */
    private String thumbprint;
    /**
     * @return Resource type.
     * 
     */
    private String type;

    private GetWebAppPublicCertificateResult() {}
    /**
     * @return Public Certificate byte array
     * 
     */
    public Optional<String> blob() {
        return Optional.ofNullable(this.blob);
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Public Certificate Location
     * 
     */
    public Optional<String> publicCertificateLocation() {
        return Optional.ofNullable(this.publicCertificateLocation);
    }
    /**
     * @return Certificate Thumbprint
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppPublicCertificateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String blob;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable String publicCertificateLocation;
        private String thumbprint;
        private String type;
        public Builder() {}
        public Builder(GetWebAppPublicCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.publicCertificateLocation = defaults.publicCertificateLocation;
    	      this.thumbprint = defaults.thumbprint;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder blob(@Nullable String blob) {
            this.blob = blob;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder publicCertificateLocation(@Nullable String publicCertificateLocation) {
            this.publicCertificateLocation = publicCertificateLocation;
            return this;
        }
        @CustomType.Setter
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetWebAppPublicCertificateResult build() {
            final var o = new GetWebAppPublicCertificateResult();
            o.blob = blob;
            o.id = id;
            o.kind = kind;
            o.name = name;
            o.publicCertificateLocation = publicCertificateLocation;
            o.thumbprint = thumbprint;
            o.type = type;
            return o;
        }
    }
}
