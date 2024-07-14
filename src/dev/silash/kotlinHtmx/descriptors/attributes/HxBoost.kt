package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

class HxBoost(val enabled: Boolean) : HxDescriptor("hx-boost") {
    init {
        +enabled.toString()
    }
}
