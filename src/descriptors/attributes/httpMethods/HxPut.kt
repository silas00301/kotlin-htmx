package brock.api.utils.htmx.descriptors.attributes.httpMethods

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxPut(val url: String) : HxDescriptor("hx-put") {

    init {
        + url
    }
}