package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxDisable : HtmlAttribute("hx-disable")

fun HtmxHtmlAttributes.disable() = addEntry(HxDisable())
