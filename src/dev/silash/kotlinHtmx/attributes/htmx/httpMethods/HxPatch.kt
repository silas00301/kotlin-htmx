package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxPatch(val url: String) : HtmlAttribute("hx-patch") {
    init {
        +url
    }
}

fun HtmxHtmlAttributes.patch(url: String) = addEntry(HxPatch(url))
