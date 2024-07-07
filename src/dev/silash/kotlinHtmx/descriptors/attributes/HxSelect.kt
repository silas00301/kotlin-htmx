package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxSelect : HxDescriptor("hx-select") {
    fun where(selector: Pair<String, String>) {
        val (key, value) = selector
        +"[$key='$value']"
    }

    infix fun String.equalTo(selector: String) = Pair(this, selector)
}
