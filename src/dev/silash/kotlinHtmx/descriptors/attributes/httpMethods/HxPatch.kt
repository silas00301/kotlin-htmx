package dev.silash.kotlinHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

class HxPatch(val url: String) : HxDescriptor("hx-patch") {
    init {
        +url
    }
}
