package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxGet(val url: String) : HtmlAttribute("hx-get") {
    init {
        +url
    }
}

fun HtmxMethods.get(url: String) = addEntry(HxGet(url))
