package com.pulumi.azurenative.storage

import com.pulumi.azurenative.storage.enums.PublicAccess
import com.pulumi.core.Output
import com.pulumi.core.annotations.Import
import com.pulumi.resources.ResourceArgs
import java.util.Map

data class BlobContainerArgs(

    @Import(name = "accountName", required = true)
    val accountName: Output<String>,

    @Import(name = "containerName")
    val containerName: Output<String>? = null,

    @Import(name = "defaultEncryptionScope")
    val defaultEncryptionScope: Output<String>? = null,

    @Import(name = "denyEncryptionScopeOverride")
    val denyEncryptionScopeOverride: Output<Boolean>? = null,

    @Import(name = "metadata")
    val metadata: Output<Map<String, String>>? = null,

    @Import(name = "publicAccess")
    val publicAccess: Output<PublicAccess>? = null,

    @Import(name = "resourceGroupName", required = true)
    val resourceGroupName: Output<String>

) : ResourceArgs() {

    companion object {
        @JvmStatic
        fun builder(): Builder {
            return Builder(empty())
        }

        @JvmStatic
        fun empty(): BlobContainerArgs {
            return BlobContainerArgs(
                accountName = Output.of(""),
                resourceGroupName = Output.of("")
            )
        }
    }

    class Builder(
        private var t: BlobContainerArgs,
        private var accountNameSet: Boolean = false,
        private var resourceGroupNameSet: Boolean = false,
    ) {
        fun build(): BlobContainerArgs {
            if (!accountNameSet) {
                throw java.lang.NullPointerException("expected parameter 'accountName' to be non-null")
            }
            if (!resourceGroupNameSet) {
                throw java.lang.NullPointerException("expected parameter 'resourceGroupName' to be non-null")
            }
            return t
        }

        fun publicAccess(newAccess: PublicAccess): Builder {
            t = t.copy(publicAccess = Output.of(newAccess))
            return this
        }

        fun accountName(newName: Output<String>): Builder {
            t = t.copy(accountName = newName)
            accountNameSet = true
            return this
        }

        fun resourceGroupName(newName: Output<String>): Builder {
            t = t.copy(resourceGroupName = newName)
            resourceGroupNameSet = true
            return this
        }
    }
}
