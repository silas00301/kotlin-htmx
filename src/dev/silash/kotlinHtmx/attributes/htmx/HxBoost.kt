package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxBoost(enabled: Boolean) : HtmlAttribute("hx-boost", enabled.toString())

fun HtmxHtmlAttributes.boost(enabled: Boolean = true) = addEntry(HxBoost(enabled))
