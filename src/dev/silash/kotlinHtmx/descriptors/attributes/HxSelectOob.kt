package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxSelectOob : HxDescriptor("hx-select-oob") {
    fun select(strategy: HxSelectElement.() -> Unit) {
        val instance = HxSelectElement()
        instance.strategy()
        val text = instance.text.trimStart().trimEnd()
        +"$text,"
    }

    class HxSelectElement : HxDescriptor("hx-select-oob") {
        fun element(selector: String) {
            +selector
        }

        fun where(selector: Pair<String, String>) {
            val (key, value) = selector
            +generateWhereSelector("$key='$value'")
        }

        fun where(selector: String) {
            +generateWhereSelector(selector)
        }

        fun strategy(strategy: HxSwap.() -> Unit) {
            val instance = HxSwap()
            instance.strategy()
            val text = instance.text.trimStart().trimEnd()
            +":$text"
        }
    }
}
