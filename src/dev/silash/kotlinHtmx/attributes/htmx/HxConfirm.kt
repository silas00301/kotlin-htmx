package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxConfirm(message: String) : HtmlAttribute("hx-confirm", message)

fun HtmxHtmlAttributes.confirm(message: String) = addEntry(HxConfirm(message))
