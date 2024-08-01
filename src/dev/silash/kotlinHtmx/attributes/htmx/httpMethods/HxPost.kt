package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxPost(val url: String) : HtmlAttribute("hx-post") {
    init {
        +url
    }
}

fun HtmxMethods.post(url: String) = addEntry(HxPost(url))
