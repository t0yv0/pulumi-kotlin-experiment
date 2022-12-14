// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupScheduleResponse {
    /**
     * @return How often the backup should be executed (e.g. for weekly backup, this should be set to 7 and FrequencyUnit should be set to Day)
     * 
     */
    private Integer frequencyInterval;
    /**
     * @return The unit of time for how often the backup should be executed (e.g. for weekly backup, this should be set to Day and FrequencyInterval should be set to 7)
     * 
     */
    private String frequencyUnit;
    /**
     * @return True if the retention policy should always keep at least one backup in the storage account, regardless how old it is; false otherwise.
     * 
     */
    private Boolean keepAtLeastOneBackup;
    /**
     * @return Last time when this schedule was triggered.
     * 
     */
    private String lastExecutionTime;
    /**
     * @return After how many days backups should be deleted.
     * 
     */
    private Integer retentionPeriodInDays;
    /**
     * @return When the schedule should start working.
     * 
     */
    private @Nullable String startTime;

    private BackupScheduleResponse() {}
    /**
     * @return How often the backup should be executed (e.g. for weekly backup, this should be set to 7 and FrequencyUnit should be set to Day)
     * 
     */
    public Integer frequencyInterval() {
        return this.frequencyInterval;
    }
    /**
     * @return The unit of time for how often the backup should be executed (e.g. for weekly backup, this should be set to Day and FrequencyInterval should be set to 7)
     * 
     */
    public String frequencyUnit() {
        return this.frequencyUnit;
    }
    /**
     * @return True if the retention policy should always keep at least one backup in the storage account, regardless how old it is; false otherwise.
     * 
     */
    public Boolean keepAtLeastOneBackup() {
        return this.keepAtLeastOneBackup;
    }
    /**
     * @return Last time when this schedule was triggered.
     * 
     */
    public String lastExecutionTime() {
        return this.lastExecutionTime;
    }
    /**
     * @return After how many days backups should be deleted.
     * 
     */
    public Integer retentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }
    /**
     * @return When the schedule should start working.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupScheduleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer frequencyInterval;
        private String frequencyUnit;
        private Boolean keepAtLeastOneBackup;
        private String lastExecutionTime;
        private Integer retentionPeriodInDays;
        private @Nullable String startTime;
        public Builder() {}
        public Builder(BackupScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequencyInterval = defaults.frequencyInterval;
    	      this.frequencyUnit = defaults.frequencyUnit;
    	      this.keepAtLeastOneBackup = defaults.keepAtLeastOneBackup;
    	      this.lastExecutionTime = defaults.lastExecutionTime;
    	      this.retentionPeriodInDays = defaults.retentionPeriodInDays;
    	      this.startTime = defaults.startTime;
        }

        @CustomType.Setter
        public Builder frequencyInterval(Integer frequencyInterval) {
            this.frequencyInterval = Objects.requireNonNull(frequencyInterval);
            return this;
        }
        @CustomType.Setter
        public Builder frequencyUnit(String frequencyUnit) {
            this.frequencyUnit = Objects.requireNonNull(frequencyUnit);
            return this;
        }
        @CustomType.Setter
        public Builder keepAtLeastOneBackup(Boolean keepAtLeastOneBackup) {
            this.keepAtLeastOneBackup = Objects.requireNonNull(keepAtLeastOneBackup);
            return this;
        }
        @CustomType.Setter
        public Builder lastExecutionTime(String lastExecutionTime) {
            this.lastExecutionTime = Objects.requireNonNull(lastExecutionTime);
            return this;
        }
        @CustomType.Setter
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = Objects.requireNonNull(retentionPeriodInDays);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public BackupScheduleResponse build() {
            final var o = new BackupScheduleResponse();
            o.frequencyInterval = frequencyInterval;
            o.frequencyUnit = frequencyUnit;
            o.keepAtLeastOneBackup = keepAtLeastOneBackup;
            o.lastExecutionTime = lastExecutionTime;
            o.retentionPeriodInDays = retentionPeriodInDays;
            o.startTime = startTime;
            return o;
        }
    }
}
