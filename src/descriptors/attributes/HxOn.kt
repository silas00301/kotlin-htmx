package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxOn(event: String?, htmxEvent: String?) : HxDescriptor("hx-on") {

    init {
        if(event != null) {
            attributeName += ":$event"
        } else if(htmxEvent != null) {
            attributeName += "::$htmxEvent"
        } else {
            throw IllegalArgumentException("Either event or htmxEvent must be provided")
        }
    }

    fun execute(action: String) {
        + action
    }

}