package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxOn(event: String? = null, htmxEvent: String? = null) : HtmlAttribute("hx-on") {
    init {
        require(event != null || htmxEvent != null) {
            "Either event or htmxEvent must be provided"
        }
        if (event != null) {
            attributeName += ":$event"
        } else if (htmxEvent != null) {
            attributeName += "::$htmxEvent"
        }
    }

    fun execute(action: String) {
        +action
    }
}
