package dev.silash.kotlinxHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxPatch(val url: String) : HxDescriptor("hx-patch") {
    init {
        +url
    }
}
