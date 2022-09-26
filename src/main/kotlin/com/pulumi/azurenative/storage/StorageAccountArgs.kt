package com.pulumi.azurenative.storage

import com.pulumi.azurenative.storage.enums.Kind
import com.pulumi.azurenative.storage.inputs.SkuArgs
import com.pulumi.core.Output
import com.pulumi.core.annotations.Import
import com.pulumi.resources.ResourceArgs

data class StorageAccountArgs(
    @Import(name = "kind", required = true)
    val kind: Kind = Kind.StorageV2,

    @Import(name = "resourceGroupName", required = true)
    val resourceGroupName: Output<String> = Output.of(""),

    @Import(name = "sku", required = true)
    val sku: SkuArgs = SkuArgs.empty()
) : ResourceArgs() {

    companion object {
        @JvmStatic
        fun builder(): Builder {
            return Builder(empty())
        }

        @JvmStatic
        fun empty(): StorageAccountArgs {
            return StorageAccountArgs()
        }
    }

    class Builder(val t: StorageAccountArgs) {
        fun kind(newKind: Kind): Builder {
            return Builder(t.copy(kind = newKind))
        }

        fun resourceGroupName(name: Output<String>): Builder {
            return Builder(t.copy(resourceGroupName = name))
        }

        fun sku(newSku: SkuArgs): Builder {
            return Builder(t.copy(sku = newSku))
        }

        fun build(): StorageAccountArgs {
            return t
        }
    }
}