package dev.silash.kotlinxHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxDelete(val url: String) : HxDescriptor("hx-delete") {
    init {
        +url
    }
}
