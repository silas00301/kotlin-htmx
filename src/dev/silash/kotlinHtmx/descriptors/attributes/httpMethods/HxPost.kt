package dev.silash.kotlinHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxPost(val url: String) : HxDescriptor("hx-post") {
    init {
        +url
    }
}
