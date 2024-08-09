package dev.silash.kotlinHtmx.cssClasses.htmx

import dev.silash.kotlinHtmx.cssClasses.CSSClass
import dev.silash.kotlinHtmx.cssClasses.HtmxCSSClasses

class HtmxSettling : CSSClass {
    override val className: String = "htmx-settling"
}

fun HtmxCSSClasses.settling() = addEntry(HtmxSettling())
