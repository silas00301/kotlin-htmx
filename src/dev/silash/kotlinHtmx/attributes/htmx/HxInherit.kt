package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.enums.HtmxAttributes
import dev.silash.kotlinHtmx.enums.attributeName

class HxInherit : HtmlAttribute("hx-inherit") {
    fun all() = +"*"

    fun select(vararg attribute: HtmxAttributes) =
        +attribute.joinToString(" ") {
            it.attributeName
        }
}

fun HtmxHtmlAttributes.inherit(lambda: HxInherit.() -> Unit) = addEntry(HxInherit(), lambda)
