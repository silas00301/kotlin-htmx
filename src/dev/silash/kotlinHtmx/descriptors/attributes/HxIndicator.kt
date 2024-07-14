package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

class HxIndicator : HxDescriptor("hx-indicator") {
    fun closest(selector: String) {
        +"closest $selector"
    }

    fun where(selector: Pair<String, String>): String {
        val (key, value) = selector
        return "[$key='$value']"
    }

    infix fun String.equalTo(selector: String) = Pair(this, selector)
}
