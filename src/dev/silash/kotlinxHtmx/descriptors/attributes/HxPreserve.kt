package dev.silash.kotlinxHtmx.descriptors.attributes

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxPreserve(val option: String) : HxDescriptor("hx-preserve") {
    init {
        +option
    }
}
