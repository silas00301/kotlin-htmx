package dev.silash.kotlinHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

class HxPut(val url: String) : HxDescriptor("hx-put") {
    init {
        +url
    }
}
