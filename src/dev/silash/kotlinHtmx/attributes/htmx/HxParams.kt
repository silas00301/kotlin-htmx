package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxParams : HtmlAttribute("hx-params") {
    fun all() = +"*"

    fun none() = +"none"

    fun except(vararg params: String) = +"not ${params.joinToString(",")}"

    fun only(vararg params: String) = +params.joinToString(",")
}

fun HtmxHtmlAttributes.params(lambda: HxParams.() -> Unit) = addEntry(HxParams(), lambda)
