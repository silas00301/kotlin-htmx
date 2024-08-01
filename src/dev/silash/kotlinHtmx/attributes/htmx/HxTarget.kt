package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.utils.generateWhereSelector

class HxTarget : HtmlAttribute("hx-target") {
    @Suppress("FunctionNaming", "ktlint:standard:function-naming")
    fun `this`() = +"this"

    fun closest(selector: String) = +"closest $selector"

    fun find(selector: String) = +"find $selector"

    fun next() = +"next"

    fun next(selector: String) = +"next $selector"

    fun previous() = +"previous"

    fun previous(selector: String) = +"previous $selector"

    fun where(selector: Pair<String, String>) {
        val (key, value) = selector
        +generateWhereSelector("$key='$value'")
    }

    fun where(selector: String) = +generateWhereSelector(selector)
}

fun HtmxMethods.target(lambda: HxTarget.() -> Unit) = addEntry(HxTarget(), lambda)
