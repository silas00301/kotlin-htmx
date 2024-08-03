package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxVals : HtmlAttribute("hx-vals") {
    fun normal(strategy: HxValsMap.() -> Unit) = +generateValsMap(strategy)

    fun javaScript(strategy: HxValsMap.() -> Unit) = +("js:${generateValsMap(strategy)}")

    fun js(strategy: HxValsMap.() -> Unit) = javaScript(strategy)

    private fun generateValsMap(strategy: HxValsMap.() -> Unit) =
        HxValsMap().apply(strategy).attributeText.trim(' ', ',').let {
            "{ $it }"
        }

    class HxValsMap : HtmlAttribute("hx-vals") {
        fun add(
            key: String,
            value: String,
        ) = +"$key: $value,"
    }
}

fun HtmxHtmlAttributes.vals(lambda: HxVals.() -> Unit) = addEntry(HxVals(), lambda)
