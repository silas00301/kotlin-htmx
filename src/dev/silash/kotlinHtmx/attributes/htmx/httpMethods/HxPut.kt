package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxPut(val url: String) : HtmlAttribute("hx-put") {
    init {
        +url
    }
}
