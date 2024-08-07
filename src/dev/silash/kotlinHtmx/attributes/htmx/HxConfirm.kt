package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxConfirm(message: String) : HtmlAttribute("hx-confirm", message)

fun HtmxHtmlAttributes.confirm(message: String) = addEntry(HxConfirm(message))
