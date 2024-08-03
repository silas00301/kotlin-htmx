package dev.silash.kotlinHtmx.cssClasses.htmx

import dev.silash.kotlinHtmx.HtmxCSSClasses
import dev.silash.kotlinHtmx.cssClasses.CSSClass

class HtmxSettling : CSSClass {
    override val className: String = "htmx-settling"
}

fun HtmxCSSClasses.settling() = addEntry(HtmxSettling())
