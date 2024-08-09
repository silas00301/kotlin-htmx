package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxSelect : HtmlAttribute("hx-select") {
    fun where(selector: Pair<String, String>) {
        val (key, value) = selector
        +generateWhereSelector("$key='$value'")
    }

    fun where(selector: String) = +generateWhereSelector(selector)
}

fun HtmxHtmlAttributes.select(lambda: HxSelect.() -> Unit) = addEntry(HxSelect(), lambda)
