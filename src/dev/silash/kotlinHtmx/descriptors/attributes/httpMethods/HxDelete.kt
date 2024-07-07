package dev.silash.kotlinHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxDelete(val url: String) : HxDescriptor("hx-delete") {
    init {
        +url
    }
}
