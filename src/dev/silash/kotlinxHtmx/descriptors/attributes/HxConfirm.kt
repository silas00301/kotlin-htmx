package dev.silash.kotlinxHtmx.descriptors.attributes

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxConfirm(val message: String) : HxDescriptor("hx-confirm") {
    init {
        +message
    }
}
