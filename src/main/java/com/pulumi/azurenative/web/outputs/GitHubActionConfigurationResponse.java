// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.GitHubActionCodeConfigurationResponse;
import com.pulumi.azurenative.web.outputs.GitHubActionContainerConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitHubActionConfigurationResponse {
    /**
     * @return GitHub Action code configuration.
     * 
     */
    private @Nullable GitHubActionCodeConfigurationResponse codeConfiguration;
    /**
     * @return GitHub Action container configuration.
     * 
     */
    private @Nullable GitHubActionContainerConfigurationResponse containerConfiguration;
    /**
     * @return Workflow option to determine whether the workflow file should be generated and written to the repository.
     * 
     */
    private @Nullable Boolean generateWorkflowFile;
    /**
     * @return This will help determine the workflow configuration to select.
     * 
     */
    private @Nullable Boolean isLinux;

    private GitHubActionConfigurationResponse() {}
    /**
     * @return GitHub Action code configuration.
     * 
     */
    public Optional<GitHubActionCodeConfigurationResponse> codeConfiguration() {
        return Optional.ofNullable(this.codeConfiguration);
    }
    /**
     * @return GitHub Action container configuration.
     * 
     */
    public Optional<GitHubActionContainerConfigurationResponse> containerConfiguration() {
        return Optional.ofNullable(this.containerConfiguration);
    }
    /**
     * @return Workflow option to determine whether the workflow file should be generated and written to the repository.
     * 
     */
    public Optional<Boolean> generateWorkflowFile() {
        return Optional.ofNullable(this.generateWorkflowFile);
    }
    /**
     * @return This will help determine the workflow configuration to select.
     * 
     */
    public Optional<Boolean> isLinux() {
        return Optional.ofNullable(this.isLinux);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubActionConfigurationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GitHubActionCodeConfigurationResponse codeConfiguration;
        private @Nullable GitHubActionContainerConfigurationResponse containerConfiguration;
        private @Nullable Boolean generateWorkflowFile;
        private @Nullable Boolean isLinux;
        public Builder() {}
        public Builder(GitHubActionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.containerConfiguration = defaults.containerConfiguration;
    	      this.generateWorkflowFile = defaults.generateWorkflowFile;
    	      this.isLinux = defaults.isLinux;
        }

        @CustomType.Setter
        public Builder codeConfiguration(@Nullable GitHubActionCodeConfigurationResponse codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder containerConfiguration(@Nullable GitHubActionContainerConfigurationResponse containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder generateWorkflowFile(@Nullable Boolean generateWorkflowFile) {
            this.generateWorkflowFile = generateWorkflowFile;
            return this;
        }
        @CustomType.Setter
        public Builder isLinux(@Nullable Boolean isLinux) {
            this.isLinux = isLinux;
            return this;
        }
        public GitHubActionConfigurationResponse build() {
            final var o = new GitHubActionConfigurationResponse();
            o.codeConfiguration = codeConfiguration;
            o.containerConfiguration = containerConfiguration;
            o.generateWorkflowFile = generateWorkflowFile;
            o.isLinux = isLinux;
            return o;
        }
    }
}
