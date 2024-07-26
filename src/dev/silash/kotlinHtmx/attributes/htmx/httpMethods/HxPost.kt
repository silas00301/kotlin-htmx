package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxPost(val url: String) : HtmlAttribute("hx-post") {
    init {
        +url
    }
}
