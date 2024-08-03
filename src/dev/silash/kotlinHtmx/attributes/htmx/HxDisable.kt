package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxDisable : HtmlAttribute("hx-disable")

fun HtmxHtmlAttributes.disable() = addEntry(HxDisable())
