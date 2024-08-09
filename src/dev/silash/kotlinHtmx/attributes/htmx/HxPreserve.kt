package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxPreserve : HtmlAttribute("hx-preserve")

fun HtmxHtmlAttributes.preserve() = addEntry(HxPreserve())
