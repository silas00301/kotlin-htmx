package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor
import dev.silash.kotlinHtmx.enums.HtmxAttributes
import dev.silash.kotlinHtmx.enums.toHtmxAttribute

class HxInherit : HxDescriptor("hx-inherit") {
    fun all() {
        +"*"
    }

    fun select(vararg attribute: HtmxAttributes) {
        +attribute.joinToString(" ") { it.toHtmxAttribute() }
    }
}
