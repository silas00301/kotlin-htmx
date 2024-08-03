package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxBoost(enabled: Boolean) : HtmlAttribute("hx-boost", enabled.toString())

fun HtmxHtmlAttributes.boost(enabled: Boolean = true) = addEntry(HxBoost(enabled))
