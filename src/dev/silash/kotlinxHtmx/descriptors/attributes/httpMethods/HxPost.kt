package dev.silash.kotlinxHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxPost(val url: String) : HxDescriptor("hx-post") {
    init {
        +url
    }
}
