package dev.silash.kotlinxHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxGet(val url: String) : HxDescriptor("hx-get") {
    init {
        +url
    }
}
