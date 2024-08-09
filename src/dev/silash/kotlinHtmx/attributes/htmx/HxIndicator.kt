package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxIndicator : HtmlAttribute("hx-indicator") {
    fun closest(selector: String) = +"closest $selector"

    fun where(selector: Pair<String, String>) {
        val (key, value) = selector
        +generateWhereSelector("$key='$value'")
    }

    fun where(selector: String) = +generateWhereSelector(selector)
}

fun HtmxHtmlAttributes.indicator(lambda: HxIndicator.() -> Unit) = addEntry(HxIndicator(), lambda)
