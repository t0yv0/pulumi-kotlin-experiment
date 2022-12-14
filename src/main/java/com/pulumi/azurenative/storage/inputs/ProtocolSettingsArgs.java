// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.SmbSettingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Protocol settings for file service
 * 
 */
public final class ProtocolSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProtocolSettingsArgs Empty = new ProtocolSettingsArgs();

    /**
     * Setting for SMB protocol
     * 
     */
    @Import(name="smb")
    private @Nullable Output<SmbSettingArgs> smb;

    /**
     * @return Setting for SMB protocol
     * 
     */
    public Optional<Output<SmbSettingArgs>> smb() {
        return Optional.ofNullable(this.smb);
    }

    private ProtocolSettingsArgs() {}

    private ProtocolSettingsArgs(ProtocolSettingsArgs $) {
        this.smb = $.smb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProtocolSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProtocolSettingsArgs $;

        public Builder() {
            $ = new ProtocolSettingsArgs();
        }

        public Builder(ProtocolSettingsArgs defaults) {
            $ = new ProtocolSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param smb Setting for SMB protocol
         * 
         * @return builder
         * 
         */
        public Builder smb(@Nullable Output<SmbSettingArgs> smb) {
            $.smb = smb;
            return this;
        }

        /**
         * @param smb Setting for SMB protocol
         * 
         * @return builder
         * 
         */
        public Builder smb(SmbSettingArgs smb) {
            return smb(Output.of(smb));
        }

        public ProtocolSettingsArgs build() {
            return $;
        }
    }

}
