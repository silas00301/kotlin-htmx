package dev.silash.kotlinHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

class HxGet(val url: String) : HxDescriptor("hx-get") {
    init {
        +url
    }
}
