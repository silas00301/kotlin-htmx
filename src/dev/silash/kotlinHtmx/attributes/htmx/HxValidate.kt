package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxValidate : HtmlAttribute("hx-validate")

fun HtmxHtmlAttributes.validate() = addEntry(HxValidate())
