package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxDelete(val url: String) : HtmlAttribute("hx-delete") {
    init {
        +url
    }
}

fun HtmxHtmlAttributes.delete(url: String) = addEntry(HxDelete(url))
