package dev.silash.kotlinHtmx.cssClasses.htmx

import dev.silash.kotlinHtmx.cssClasses.CSSClass
import dev.silash.kotlinHtmx.cssClasses.HtmxCSSClasses

class HtmxSwapping : CSSClass {
    override val className: String = "htmx-swapping"
}

fun HtmxCSSClasses.swapping() = addEntry(HtmxSwapping())
