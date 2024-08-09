package dev.silash.kotlinHtmx.cssClasses

class HtmxCSSClasses(val classList: MutableList<String> = mutableListOf()) {
    inline fun addEntry(cssClass: CSSClass) {
        classList.add(cssClass.className)
    }

    val classString: String
        get() = classList.joinToString(" ")
}
