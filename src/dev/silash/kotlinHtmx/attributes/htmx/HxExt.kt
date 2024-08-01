package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxExt : HtmlAttribute("hx-ext") {
    fun add(vararg extensions: String) = +extensions.joinToString(" ")

    fun ignore(vararg extensions: String) =
        extensions.forEach {
            +"ignore:$it"
        }
}

fun HtmxMethods.ext(lambda: HxExt.() -> Unit) = addEntry(HxExt(), lambda)
