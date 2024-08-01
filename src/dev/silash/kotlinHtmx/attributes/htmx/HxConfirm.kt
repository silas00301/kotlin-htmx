package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxConfirm(message: String) : HtmlAttribute("hx-confirm", message)

fun HtmxMethods.confirm(message: String) = addEntry(HxConfirm(message))
