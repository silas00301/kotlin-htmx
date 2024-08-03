package dev.silash.kotlinHtmx.cssClasses.htmx

import dev.silash.kotlinHtmx.HtmxCSSClasses
import dev.silash.kotlinHtmx.cssClasses.CSSClass

class HtmxIndicator : CSSClass {
    override val className: String = "htmx-indicator"
}

fun HtmxCSSClasses.indicator() = addEntry(HtmxIndicator())
