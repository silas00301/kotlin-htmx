package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

class HxDisabledElt : HxDescriptor("hx-disabled-elt") {
    fun thisElement() {
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
        +"[$key='$value']"
    }

    infix fun String.equalTo(selector: String) = Pair(this, selector)
}
