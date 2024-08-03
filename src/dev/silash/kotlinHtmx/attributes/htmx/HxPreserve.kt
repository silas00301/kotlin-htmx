package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxPreserve : HtmlAttribute("hx-preserve")

fun HtmxHtmlAttributes.preserve() = addEntry(HxPreserve())
