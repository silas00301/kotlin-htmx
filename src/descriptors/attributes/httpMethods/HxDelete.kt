package brock.api.utils.htmx.descriptors.attributes.httpMethods

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxDelete(val url: String) : HxDescriptor("hx-delete") {

    init {
        + url
    }
}