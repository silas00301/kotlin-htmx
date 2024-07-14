package dev.silash.kotlinHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

class HxDelete(val url: String) : HxDescriptor("hx-delete") {
    init {
        +url
    }
}
