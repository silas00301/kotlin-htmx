package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxDisable : HtmlAttribute("hx-disable")

fun HtmxMethods.disable() = addEntry(HxDisable())
