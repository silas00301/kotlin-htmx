package dev.silash.kotlinHtmx.cssClasses.htmx

import dev.silash.kotlinHtmx.HtmxCSSClasses
import dev.silash.kotlinHtmx.cssClasses.CSSClass

class HtmxAdded : CSSClass {
    override val className: String = "htmx-added"
}

fun HtmxCSSClasses.added() = addEntry(HtmxAdded())
