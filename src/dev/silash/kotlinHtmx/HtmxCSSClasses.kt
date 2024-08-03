package dev.silash.kotlinHtmx

import dev.silash.kotlinHtmx.cssClasses.CSSClass

class HtmxCSSClasses(val classList: MutableList<String> = mutableListOf()) {
    inline fun addEntry(cssClass: CSSClass) {
        classList.add(cssClass.className)
    }

    val classString: String
        get() = classList.joinToString(" ")
}
