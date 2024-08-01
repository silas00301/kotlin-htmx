package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxPatch(val url: String) : HtmlAttribute("hx-patch") {
    init {
        +url
    }
}

fun HtmxMethods.patch(url: String) = addEntry(HxPatch(url))
