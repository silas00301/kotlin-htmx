package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxHistory(enabled: Boolean) : HtmlAttribute("hx-history", enabled.toString())

fun HtmxMethods.history(enabled: Boolean) = addEntry(HxHistory(enabled))
