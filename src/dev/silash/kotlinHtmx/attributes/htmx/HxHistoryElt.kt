package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxHistoryElt : HtmlAttribute("hx-history-elt")

fun HtmxHtmlAttributes.historyElt() = addEntry(HxHistoryElt())
