package dev.silash.kotlinHtmx.cssClasses.htmx

import dev.silash.kotlinHtmx.HtmxCSSClasses
import dev.silash.kotlinHtmx.cssClasses.CSSClass

class HtmxRequest : CSSClass {
    override val className: String = "htmx-request"
}

fun HtmxCSSClasses.request() = addEntry(HtmxRequest())
