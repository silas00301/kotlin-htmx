package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxPushUrl : HtmlAttribute("hx-push-url") {
    fun pushToHistory() = +"true"

    fun notPushToHistory() = +"false"

    fun url(url: String) = +url
}

fun HtmxHtmlAttributes.pushUrl(lambda: HxPushUrl.() -> Unit) = addEntry(HxPushUrl(), lambda)
