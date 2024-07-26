package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxVals : HtmlAttribute("hx-vals") {
    fun normal(strategy: HxValsMap.() -> Unit) {
        +"{"
        val instance = HxValsMap()
        instance.strategy()
        val text = instance.attributeText.trimStart().trimEnd(' ', ',')
        +text
        +"}"
    }

    fun javaScript(strategy: HxValsMap.() -> Unit) {
        +"js:"
        normal(strategy)
    }

    fun js(strategy: HxValsMap.() -> Unit) = javaScript(strategy)

    class HxValsMap : HtmlAttribute("hx-vals") {
        fun add(
            key: String,
            value: String,
        ) {
            +"$key: $value,"
        }
    }
}
