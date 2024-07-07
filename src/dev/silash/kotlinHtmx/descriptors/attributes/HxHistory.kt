package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxHistory(val enabled: Boolean) : HxDescriptor("hx-history") {
    init {
        +enabled.toString()
    }
}
