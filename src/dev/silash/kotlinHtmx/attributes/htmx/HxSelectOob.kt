package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxSelectOob : HtmlAttribute("hx-select-oob") {
    fun select(strategy: HxSelectElement.() -> Unit) {
        val instance = HxSelectElement()
        instance.strategy()
        val text = instance.attributeText.trimStart().trimEnd()
        +"$text,"
    }

    class HxSelectElement : HtmlAttribute("hx-select-oob") {
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
            val text = instance.attributeText.trimStart().trimEnd()
            +":$text"
        }
    }
}
