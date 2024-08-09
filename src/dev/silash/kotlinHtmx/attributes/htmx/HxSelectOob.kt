package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxSelectOob : HtmlAttribute("hx-select-oob") {
    fun select(strategy: HxSelectElement.() -> Unit) =
        HxSelectElement().apply(strategy).attributeText.let {
            +"${it.trim()},"
        }

    class HxSelectElement : HtmlAttribute("hx-select-oob") {
        fun element(selector: String) = +selector

        fun where(selector: Pair<String, String>) {
            val (key, value) = selector
            +generateWhereSelector("$key='$value'")
        }

        fun where(selector: String) = +generateWhereSelector(selector)

        fun strategy(strategy: HxSwap.() -> Unit) =
            HxSwap().apply(strategy).attributeText.let {
                +":${it.trim()}"
            }
    }
}

fun HtmxHtmlAttributes.selectOob(lambda: HxSelectOob.() -> Unit) = addEntry(HxSelectOob(), lambda)
