// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.DatabaseBackupSettingResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListWebAppBackupStatusSecretsResult {
    /**
     * @return Id of the backup.
     * 
     */
    private Integer backupId;
    /**
     * @return Name of the blob which contains data for this backup.
     * 
     */
    private String blobName;
    /**
     * @return Unique correlation identifier. Please use this along with the timestamp while communicating with Azure support.
     * 
     */
    private String correlationId;
    /**
     * @return Timestamp of the backup creation.
     * 
     */
    private String created;
    /**
     * @return List of databases included in the backup.
     * 
     */
    private List<DatabaseBackupSettingResponse> databases;
    /**
     * @return Timestamp when this backup finished.
     * 
     */
    private String finishedTimeStamp;
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
     * @return Timestamp of a last restore operation which used this backup.
     * 
     */
    private String lastRestoreTimeStamp;
    /**
     * @return Details regarding this backup. Might contain an error message.
     * 
     */
    private String log;
    /**
     * @return Resource Name.
     * 
     */
    private String name;
    /**
     * @return True if this backup has been created due to a schedule being triggered.
     * 
     */
    private Boolean scheduled;
    /**
     * @return Size of the backup in bytes.
     * 
     */
    private Double sizeInBytes;
    /**
     * @return Backup status.
     * 
     */
    private String status;
    /**
     * @return SAS URL for the storage account container which contains this backup.
     * 
     */
    private String storageAccountUrl;
    /**
     * @return Resource type.
     * 
     */
    private String type;
    /**
     * @return Size of the original web app which has been backed up.
     * 
     */
    private Double websiteSizeInBytes;

    private ListWebAppBackupStatusSecretsResult() {}
    /**
     * @return Id of the backup.
     * 
     */
    public Integer backupId() {
        return this.backupId;
    }
    /**
     * @return Name of the blob which contains data for this backup.
     * 
     */
    public String blobName() {
        return this.blobName;
    }
    /**
     * @return Unique correlation identifier. Please use this along with the timestamp while communicating with Azure support.
     * 
     */
    public String correlationId() {
        return this.correlationId;
    }
    /**
     * @return Timestamp of the backup creation.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return List of databases included in the backup.
     * 
     */
    public List<DatabaseBackupSettingResponse> databases() {
        return this.databases;
    }
    /**
     * @return Timestamp when this backup finished.
     * 
     */
    public String finishedTimeStamp() {
        return this.finishedTimeStamp;
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
     * @return Timestamp of a last restore operation which used this backup.
     * 
     */
    public String lastRestoreTimeStamp() {
        return this.lastRestoreTimeStamp;
    }
    /**
     * @return Details regarding this backup. Might contain an error message.
     * 
     */
    public String log() {
        return this.log;
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return True if this backup has been created due to a schedule being triggered.
     * 
     */
    public Boolean scheduled() {
        return this.scheduled;
    }
    /**
     * @return Size of the backup in bytes.
     * 
     */
    public Double sizeInBytes() {
        return this.sizeInBytes;
    }
    /**
     * @return Backup status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return SAS URL for the storage account container which contains this backup.
     * 
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Size of the original web app which has been backed up.
     * 
     */
    public Double websiteSizeInBytes() {
        return this.websiteSizeInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppBackupStatusSecretsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer backupId;
        private String blobName;
        private String correlationId;
        private String created;
        private List<DatabaseBackupSettingResponse> databases;
        private String finishedTimeStamp;
        private String id;
        private @Nullable String kind;
        private String lastRestoreTimeStamp;
        private String log;
        private String name;
        private Boolean scheduled;
        private Double sizeInBytes;
        private String status;
        private String storageAccountUrl;
        private String type;
        private Double websiteSizeInBytes;
        public Builder() {}
        public Builder(ListWebAppBackupStatusSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.blobName = defaults.blobName;
    	      this.correlationId = defaults.correlationId;
    	      this.created = defaults.created;
    	      this.databases = defaults.databases;
    	      this.finishedTimeStamp = defaults.finishedTimeStamp;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastRestoreTimeStamp = defaults.lastRestoreTimeStamp;
    	      this.log = defaults.log;
    	      this.name = defaults.name;
    	      this.scheduled = defaults.scheduled;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.status = defaults.status;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
    	      this.type = defaults.type;
    	      this.websiteSizeInBytes = defaults.websiteSizeInBytes;
        }

        @CustomType.Setter
        public Builder backupId(Integer backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }
        @CustomType.Setter
        public Builder blobName(String blobName) {
            this.blobName = Objects.requireNonNull(blobName);
            return this;
        }
        @CustomType.Setter
        public Builder correlationId(String correlationId) {
            this.correlationId = Objects.requireNonNull(correlationId);
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder databases(List<DatabaseBackupSettingResponse> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }
        public Builder databases(DatabaseBackupSettingResponse... databases) {
            return databases(List.of(databases));
        }
        @CustomType.Setter
        public Builder finishedTimeStamp(String finishedTimeStamp) {
            this.finishedTimeStamp = Objects.requireNonNull(finishedTimeStamp);
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
        public Builder lastRestoreTimeStamp(String lastRestoreTimeStamp) {
            this.lastRestoreTimeStamp = Objects.requireNonNull(lastRestoreTimeStamp);
            return this;
        }
        @CustomType.Setter
        public Builder log(String log) {
            this.log = Objects.requireNonNull(log);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder scheduled(Boolean scheduled) {
            this.scheduled = Objects.requireNonNull(scheduled);
            return this;
        }
        @CustomType.Setter
        public Builder sizeInBytes(Double sizeInBytes) {
            this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder storageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder websiteSizeInBytes(Double websiteSizeInBytes) {
            this.websiteSizeInBytes = Objects.requireNonNull(websiteSizeInBytes);
            return this;
        }
        public ListWebAppBackupStatusSecretsResult build() {
            final var o = new ListWebAppBackupStatusSecretsResult();
            o.backupId = backupId;
            o.blobName = blobName;
            o.correlationId = correlationId;
            o.created = created;
            o.databases = databases;
            o.finishedTimeStamp = finishedTimeStamp;
            o.id = id;
            o.kind = kind;
            o.lastRestoreTimeStamp = lastRestoreTimeStamp;
            o.log = log;
            o.name = name;
            o.scheduled = scheduled;
            o.sizeInBytes = sizeInBytes;
            o.status = status;
            o.storageAccountUrl = storageAccountUrl;
            o.type = type;
            o.websiteSizeInBytes = websiteSizeInBytes;
            return o;
        }
    }
}