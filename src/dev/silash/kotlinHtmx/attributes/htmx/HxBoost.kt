package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxBoost(enabled: Boolean) : HtmlAttribute("hx-boost", enabled.toString())

fun HtmxMethods.boost(enabled: Boolean = true) = addEntry(HxBoost(enabled))
