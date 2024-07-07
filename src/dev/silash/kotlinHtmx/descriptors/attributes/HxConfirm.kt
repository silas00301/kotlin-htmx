package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxConfirm(val message: String) : HxDescriptor("hx-confirm") {
    init {
        +message
    }
}
