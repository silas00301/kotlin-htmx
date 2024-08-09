package dev.silash.kotlinHtmx.cssClasses.htmx

import dev.silash.kotlinHtmx.cssClasses.CSSClass
import dev.silash.kotlinHtmx.cssClasses.HtmxCSSClasses

class HtmxIndicator : CSSClass {
    override val className: String = "htmx-indicator"
}

fun HtmxCSSClasses.indicator() = addEntry(HtmxIndicator())