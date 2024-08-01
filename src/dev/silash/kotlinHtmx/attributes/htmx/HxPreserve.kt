package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxPreserve : HtmlAttribute("hx-preserve")

fun HtmxMethods.preserve() = addEntry(HxPreserve())
