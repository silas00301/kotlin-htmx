package dev.silash.kotlinxHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxPut(val url: String) : HxDescriptor("hx-put") {
    init {
        +url
    }
}
