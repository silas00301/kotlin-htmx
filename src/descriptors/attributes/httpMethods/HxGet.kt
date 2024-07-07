package brock.api.utils.htmx.descriptors.attributes.httpMethods

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxGet(val url: String) : HxDescriptor("hx-get") {

    init {
        + url
    }

}