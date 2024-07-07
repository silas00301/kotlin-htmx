package dev.silash.kotlinHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxGet(val url: String) : HxDescriptor("hx-get") {
    init {
        +url
    }
}
