package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.events.Event
import dev.silash.kotlinHtmx.events.HtmxEvent
import dev.silash.kotlinHtmx.events.StandardEvent

class HxOn(event: Event) : HtmlAttribute("hx-on") {
    init {
        attributeName +=
            when (event) {
                is StandardEvent -> ":${event.event}"
                is HtmxEvent -> "::${event.event}"
            }
    }

    fun execute(action: String) = +action
}

fun HtmxMethods.on(
    event: Event,
    lambda: HxOn.() -> Unit,
) = addEntry(HxOn(event), lambda)
