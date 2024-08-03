package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxExt : HtmlAttribute("hx-ext") {
    fun add(vararg extensions: String) = +extensions.joinToString(" ")

    fun ignore(vararg extensions: String) =
        extensions.forEach {
            +"ignore:$it"
        }
}

fun HtmxHtmlAttributes.ext(lambda: HxExt.() -> Unit) = addEntry(HxExt(), lambda)
