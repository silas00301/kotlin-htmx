package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

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
