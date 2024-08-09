package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxSwapOob : HtmlAttribute("hx-swap-oob") {
    fun trueSwap() = +"true"

    fun swap(swap: HxSwapElement.() -> Unit) =
        HxSwapElement().apply(swap).attributeText.let {
            +it
        }

    class HxSwapElement : HtmlAttribute("hx-swap-oob") {
        fun element(selector: String) = +selector

        fun where(selector: Pair<String, String>) {
            val (key, value) = selector
            +generateWhereSelector("$key='$value'")
        }

        fun where(selector: String) = +generateWhereSelector(selector)
    }
}

fun HtmxHtmlAttributes.swapOob(lambda: HxSwapOob.() -> Unit) = addEntry(HxSwapOob(), lambda)
