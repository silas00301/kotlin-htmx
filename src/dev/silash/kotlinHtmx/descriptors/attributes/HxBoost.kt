package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxBoost(val enabled: Boolean) : HxDescriptor("hx-boost") {
    init {
        +enabled.toString()
    }
}
