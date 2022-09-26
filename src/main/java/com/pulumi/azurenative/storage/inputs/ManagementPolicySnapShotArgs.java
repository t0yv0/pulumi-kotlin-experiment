// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.DateAfterCreationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Management policy action for snapshot.
 * 
 */
public final class ManagementPolicySnapShotArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementPolicySnapShotArgs Empty = new ManagementPolicySnapShotArgs();

    /**
     * The function to delete the blob snapshot
     * 
     */
    @Import(name="delete")
    private @Nullable Output<DateAfterCreationArgs> delete;

    /**
     * @return The function to delete the blob snapshot
     * 
     */
    public Optional<Output<DateAfterCreationArgs>> delete() {
        return Optional.ofNullable(this.delete);
    }

    /**
     * The function to tier blob snapshot to archive storage. Support blob snapshot currently at Hot or Cool tier
     * 
     */
    @Import(name="tierToArchive")
    private @Nullable Output<DateAfterCreationArgs> tierToArchive;

    /**
     * @return The function to tier blob snapshot to archive storage. Support blob snapshot currently at Hot or Cool tier
     * 
     */
    public Optional<Output<DateAfterCreationArgs>> tierToArchive() {
        return Optional.ofNullable(this.tierToArchive);
    }

    /**
     * The function to tier blob snapshot to cool storage. Support blob snapshot currently at Hot tier
     * 
     */
    @Import(name="tierToCool")
    private @Nullable Output<DateAfterCreationArgs> tierToCool;

    /**
     * @return The function to tier blob snapshot to cool storage. Support blob snapshot currently at Hot tier
     * 
     */
    public Optional<Output<DateAfterCreationArgs>> tierToCool() {
        return Optional.ofNullable(this.tierToCool);
    }

    private ManagementPolicySnapShotArgs() {}

    private ManagementPolicySnapShotArgs(ManagementPolicySnapShotArgs $) {
        this.delete = $.delete;
        this.tierToArchive = $.tierToArchive;
        this.tierToCool = $.tierToCool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementPolicySnapShotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementPolicySnapShotArgs $;

        public Builder() {
            $ = new ManagementPolicySnapShotArgs();
        }

        public Builder(ManagementPolicySnapShotArgs defaults) {
            $ = new ManagementPolicySnapShotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delete The function to delete the blob snapshot
         * 
         * @return builder
         * 
         */
        public Builder delete(@Nullable Output<DateAfterCreationArgs> delete) {
            $.delete = delete;
            return this;
        }

        /**
         * @param delete The function to delete the blob snapshot
         * 
         * @return builder
         * 
         */
        public Builder delete(DateAfterCreationArgs delete) {
            return delete(Output.of(delete));
        }

        /**
         * @param tierToArchive The function to tier blob snapshot to archive storage. Support blob snapshot currently at Hot or Cool tier
         * 
         * @return builder
         * 
         */
        public Builder tierToArchive(@Nullable Output<DateAfterCreationArgs> tierToArchive) {
            $.tierToArchive = tierToArchive;
            return this;
        }

        /**
         * @param tierToArchive The function to tier blob snapshot to archive storage. Support blob snapshot currently at Hot or Cool tier
         * 
         * @return builder
         * 
         */
        public Builder tierToArchive(DateAfterCreationArgs tierToArchive) {
            return tierToArchive(Output.of(tierToArchive));
        }

        /**
         * @param tierToCool The function to tier blob snapshot to cool storage. Support blob snapshot currently at Hot tier
         * 
         * @return builder
         * 
         */
        public Builder tierToCool(@Nullable Output<DateAfterCreationArgs> tierToCool) {
            $.tierToCool = tierToCool;
            return this;
        }

        /**
         * @param tierToCool The function to tier blob snapshot to cool storage. Support blob snapshot currently at Hot tier
         * 
         * @return builder
         * 
         */
        public Builder tierToCool(DateAfterCreationArgs tierToCool) {
            return tierToCool(Output.of(tierToCool));
        }

        public ManagementPolicySnapShotArgs build() {
            return $;
        }
    }

}