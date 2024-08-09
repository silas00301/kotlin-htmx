package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxPatch(val url: String) : HtmlAttribute("hx-patch") {
    init {
        +url
    }
}

fun HtmxHtmlAttributes.patch(url: String) = addEntry(HxPatch(url))
