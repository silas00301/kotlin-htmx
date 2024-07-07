package dev.silash.kotlinxHtmx.descriptors.attributes

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxBoost(val enabled: Boolean) : HxDescriptor("hx-boost") {
    init {
        +enabled.toString()
    }
}
