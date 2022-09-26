// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppDomainOwnershipIdentifierSlotResult {
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
     * @return Resource type.
     * 
     */
    private String type;
    /**
     * @return String representation of the identity.
     * 
     */
    private @Nullable String value;

    private GetWebAppDomainOwnershipIdentifierSlotResult() {}
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
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return String representation of the identity.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppDomainOwnershipIdentifierSlotResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String kind;
        private String name;
        private String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(GetWebAppDomainOwnershipIdentifierSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public GetWebAppDomainOwnershipIdentifierSlotResult build() {
            final var o = new GetWebAppDomainOwnershipIdentifierSlotResult();
            o.id = id;
            o.kind = kind;
            o.name = name;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}
