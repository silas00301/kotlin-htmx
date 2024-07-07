package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxPushUrl : HxDescriptor("hx-push-url") {

    fun pushToHistory() {
        + "true"
    }

    fun notPushToHistory() {
        + "false"
    }

    fun url(url: String) {
        + url
    }

}