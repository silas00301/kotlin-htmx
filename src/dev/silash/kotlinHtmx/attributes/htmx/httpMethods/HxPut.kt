package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxPut(val url: String) : HtmlAttribute("hx-put") {
    init {
        +url
    }
}

fun HtmxMethods.put(url: String) = addEntry(HxPut(url))
