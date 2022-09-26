package com.pulumi.azurenative.storage.inputs

import com.pulumi.azurenative.storage.enums.SkuName
import com.pulumi.core.annotations.Import
import com.pulumi.resources.ResourceArgs

data class SkuArgs(
    @Import(name = "name", required = true)
    val name: SkuName = SkuName.Standard_LRS
) : ResourceArgs() {

    companion object {
        @JvmStatic
        fun empty(): SkuArgs {
            return SkuArgs()
        }

        @JvmStatic
        fun build(): Builder {
            return Builder(empty())
        }
    }

    class Builder(val t: SkuArgs) {
        fun build(): SkuArgs {
            return t
        }

        fun name(skuName: SkuName): Builder {
            return Builder(t.copy(name = skuName))
        }
    }
}
