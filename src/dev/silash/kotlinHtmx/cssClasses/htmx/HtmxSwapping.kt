package dev.silash.kotlinHtmx.cssClasses.htmx

import dev.silash.kotlinHtmx.HtmxCSSClasses
import dev.silash.kotlinHtmx.cssClasses.CSSClass

class HtmxSwapping : CSSClass {
    override val className: String = "htmx-swapping"
}

fun HtmxCSSClasses.swapping() = addEntry(HtmxSwapping())
