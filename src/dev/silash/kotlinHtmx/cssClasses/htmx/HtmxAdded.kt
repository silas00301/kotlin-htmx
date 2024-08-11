package dev.silash.kotlinHtmx.cssClasses.htmx

import dev.silash.kotlinHtmx.cssClasses.CSSClass
import dev.silash.kotlinHtmx.cssClasses.HtmxCSSClasses

object HtmxAdded : CSSClass {
    override val className: String = "htmx-added"
}

fun HtmxCSSClasses.added() = addEntry(HtmxAdded)
