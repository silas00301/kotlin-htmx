package dev.silash.kotlinxHtmx.descriptors.attributes

import dev.silash.kotlinxHtmx.HtmxAttributes
import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor
import dev.silash.kotlinxHtmx.toHtmxAttribute

class HxInherit : HxDescriptor("hx-inherit") {
    fun all() {
        +"*"
    }

    fun select(vararg attribute: HtmxAttributes) {
        +attribute.joinToString(" ") { it.toHtmxAttribute() }
    }
}
