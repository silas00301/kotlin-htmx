package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxHistory(enabled: Boolean) : HtmlAttribute("hx-history", enabled.toString())

fun HtmxHtmlAttributes.history(enabled: Boolean = false) = addEntry(HxHistory(enabled))
