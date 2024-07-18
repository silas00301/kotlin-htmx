package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxIndicator : HxDescriptor("hx-indicator") {
    fun closest(selector: String) {
        +"closest $selector"
    }

    fun where(selector: Pair<String, String>) {
        val (key, value) = selector
        +generateWhereSelector("$key='$value'")
    }

    fun where(selector: String) {
        +generateWhereSelector(selector)
    }
}
