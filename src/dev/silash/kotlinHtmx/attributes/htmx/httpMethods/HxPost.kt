package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxPost(val url: String) : HtmlAttribute("hx-post") {
    init {
        +url
    }
}

fun HtmxHtmlAttributes.post(url: String) = addEntry(HxPost(url))
