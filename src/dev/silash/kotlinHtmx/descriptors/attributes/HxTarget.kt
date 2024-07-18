package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxTarget : HxDescriptor("hx-target") {
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

    fun next() {
        +"next"
    }

    fun next(selector: String? = null) {
        +"next $selector"
    }

    fun previous() {
        +"previous"
    }

    fun previous(selector: String? = null) {
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
