package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxValidate : HtmlAttribute("hx-validate")

fun HtmxHtmlAttributes.validate() = addEntry(HxValidate())
