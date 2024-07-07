package dev.silash.kotlinxHtmx.descriptors.attributes

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxPushUrl : HxDescriptor("hx-push-url") {
    fun pushToHistory() {
        +"true"
    }

    fun notPushToHistory() {
        +"false"
    }

    fun url(url: String) {
        +url
    }
}
