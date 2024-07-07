package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.HtmxAttributes
import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor
import dev.silash.kotlinHtmx.toHtmxAttribute

class HxDisinherit : HxDescriptor("hx-disinherit") {
    fun all() {
        +"*"
    }

    fun select(vararg attribute: HtmxAttributes) {
        +attribute.joinToString(" ") { it.toHtmxAttribute() }
    }
}
