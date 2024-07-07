package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxPreserve(val option: String) : HxDescriptor("hx-preserve") {
    init {
        +option
    }
}
