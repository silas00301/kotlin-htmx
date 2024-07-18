package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxDisabledElt : HxDescriptor("hx-disabled-elt") {
    @Suppress("FunctionNaming", "ktlint:standard:function-naming")
    fun `this`() {
        +"this"
    }

    fun closest(selector: String) {
        +"closest $selector"
    }

    fun find(selector: String) {
        +"find $selector"
    }

    fun next(selector: String = "") {
        +"next $selector"
    }

    fun previous(selector: String = "") {
        +"previous $selector"
    }

    fun where(selector: Pair<String, String>) {
        val (key, value) = selector
        +generateWhereSelector("$key='$value'")
    }

    fun where(selector: String) {
        +generateWhereSelector(selector)
    }
}
