package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.enums.HtmxEvents
import dev.silash.kotlinHtmx.enums.eventName

class HxOn(event: String) : HtmlAttribute("hx-on") {
    init {
        event.trimStart(':')
        attributeName += ":$event"
    }

    fun execute(action: String) = +action
}

fun HtmxHtmlAttributes.on(
    event: String,
    lambda: HxOn.() -> Unit,
) = addEntry(HxOn(event), lambda)

fun HtmxHtmlAttributes.on(
    event: HtmxEvents,
    lambda: HxOn.() -> Unit,
) = addEntry(HxOn(event.eventName), lambda)
