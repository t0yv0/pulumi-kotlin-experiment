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
 * The service with name and endpoint names
 * 
 */
public final class WsdlServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WsdlServiceArgs Empty = new WsdlServiceArgs();

    /**
     * List of the endpoints&#39; qualified names
     * 
     */
    @Import(name="endpointQualifiedNames")
    private @Nullable Output<List<String>> endpointQualifiedNames;

    /**
     * @return List of the endpoints&#39; qualified names
     * 
     */
    public Optional<Output<List<String>>> endpointQualifiedNames() {
        return Optional.ofNullable(this.endpointQualifiedNames);
    }

    /**
     * The service&#39;s qualified name
     * 
     */
    @Import(name="qualifiedName", required=true)
    private Output<String> qualifiedName;

    /**
     * @return The service&#39;s qualified name
     * 
     */
    public Output<String> qualifiedName() {
        return this.qualifiedName;
    }

    private WsdlServiceArgs() {}

    private WsdlServiceArgs(WsdlServiceArgs $) {
        this.endpointQualifiedNames = $.endpointQualifiedNames;
        this.qualifiedName = $.qualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WsdlServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WsdlServiceArgs $;

        public Builder() {
            $ = new WsdlServiceArgs();
        }

        public Builder(WsdlServiceArgs defaults) {
            $ = new WsdlServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointQualifiedNames List of the endpoints&#39; qualified names
         * 
         * @return builder
         * 
         */
        public Builder endpointQualifiedNames(@Nullable Output<List<String>> endpointQualifiedNames) {
            $.endpointQualifiedNames = endpointQualifiedNames;
            return this;
        }

        /**
         * @param endpointQualifiedNames List of the endpoints&#39; qualified names
         * 
         * @return builder
         * 
         */
        public Builder endpointQualifiedNames(List<String> endpointQualifiedNames) {
            return endpointQualifiedNames(Output.of(endpointQualifiedNames));
        }

        /**
         * @param endpointQualifiedNames List of the endpoints&#39; qualified names
         * 
         * @return builder
         * 
         */
        public Builder endpointQualifiedNames(String... endpointQualifiedNames) {
            return endpointQualifiedNames(List.of(endpointQualifiedNames));
        }

        /**
         * @param qualifiedName The service&#39;s qualified name
         * 
         * @return builder
         * 
         */
        public Builder qualifiedName(Output<String> qualifiedName) {
            $.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * @param qualifiedName The service&#39;s qualified name
         * 
         * @return builder
         * 
         */
        public Builder qualifiedName(String qualifiedName) {
            return qualifiedName(Output.of(qualifiedName));
        }

        public WsdlServiceArgs build() {
            $.qualifiedName = Objects.requireNonNull($.qualifiedName, "expected parameter 'qualifiedName' to be non-null");
            return $;
        }
    }

}