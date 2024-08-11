package dev.silash.kotlinHtmx.cssClasses.htmx

import dev.silash.kotlinHtmx.cssClasses.CSSClass
import dev.silash.kotlinHtmx.cssClasses.HtmxCSSClasses

object HtmxRequest : CSSClass {
    override val className: String = "htmx-request"
}

fun HtmxCSSClasses.request() = addEntry(HtmxRequest)
