package dev.silash.kotlinHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxPatch(val url: String) : HxDescriptor("hx-patch") {
    init {
        +url
    }
}
