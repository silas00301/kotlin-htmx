package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxValidate : HtmlAttribute("hx-validate")

fun HtmxMethods.validate() = addEntry(HxValidate())
