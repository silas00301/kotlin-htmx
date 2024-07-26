package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxSwapOob : HtmlAttribute("hx-swap-oob") {
    fun trueSwap() {
        +"true"
    }

    fun swap(swap: HxSwapElement.() -> Unit) {
        val swapElement = HxSwapElement()
        swapElement.swap()
        +swapElement.attributeText
    }

    class HxSwapElement : HtmlAttribute("hx-swap-oob") {
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
    }
}
