package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes

class HxHistoryElt : HtmlAttribute("hx-history-elt")

fun HtmxHtmlAttributes.historyElt() = addEntry(HxHistoryElt())
