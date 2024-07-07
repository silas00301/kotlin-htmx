package brock.api.utils.htmx.descriptors.attributes.httpMethods

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxPatch(val url: String) : HxDescriptor("hx-patch") {

    init {
        + url
    }
}