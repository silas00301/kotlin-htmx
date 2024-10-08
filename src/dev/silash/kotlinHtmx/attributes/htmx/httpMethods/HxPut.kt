package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxPut(val url: String) : HtmlAttribute("hx-put") {
    init {
        +url
    }
}

fun HtmxHtmlAttributes.put(url: String) = addEntry(HxPut(url))
