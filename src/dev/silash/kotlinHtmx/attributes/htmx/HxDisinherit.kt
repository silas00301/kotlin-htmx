package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.enums.HtmxAttributes
import dev.silash.kotlinHtmx.enums.attributeName

class HxDisinherit : HtmlAttribute("hx-disinherit") {
    fun all() {
        +"*"
    }

    fun select(vararg attribute: HtmxAttributes) {
        +attribute.joinToString(" ") { it.attributeName }
    }
}
