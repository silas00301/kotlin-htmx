package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxParams : HtmlAttribute("hx-params") {
    fun all() = +"*"

    fun none() = +"none"

    fun except(vararg params: String) = +"not ${params.joinToString(",")}"

    fun only(vararg params: String) = +params.joinToString(",")
}

fun HtmxMethods.params(lambda: HxParams.() -> Unit) = addEntry(HxParams(), lambda)
