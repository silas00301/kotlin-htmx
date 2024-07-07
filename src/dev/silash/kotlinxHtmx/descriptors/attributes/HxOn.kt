package dev.silash.kotlinxHtmx.descriptors.attributes

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxOn(event: String?, htmxEvent: String?) : HxDescriptor("hx-on") {
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
