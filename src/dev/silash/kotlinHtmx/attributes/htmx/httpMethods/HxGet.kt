package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxGet(val url: String) : HtmlAttribute("hx-get") {
    init {
        +url
    }
}

fun HtmxHtmlAttributes.get(url: String) = addEntry(HxGet(url))
