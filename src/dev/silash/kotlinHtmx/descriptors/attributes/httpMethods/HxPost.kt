package dev.silash.kotlinHtmx.descriptors.attributes.httpMethods

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

class HxPost(val url: String) : HxDescriptor("hx-post") {
    init {
        +url
    }
}
