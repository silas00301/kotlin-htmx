package dev.silash.kotlinxHtmx.descriptors.attributes

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxHistory(val enabled: Boolean) : HxDescriptor("hx-history") {
    init {
        +enabled.toString()
    }
}
