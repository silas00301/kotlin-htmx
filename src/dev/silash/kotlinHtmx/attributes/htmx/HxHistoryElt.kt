package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxHistoryElt : HtmlAttribute("hx-history-elt")

fun HtmxMethods.historyElt() = addEntry(HxHistoryElt())
