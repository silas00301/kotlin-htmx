package brock.api.utils.htmx.descriptors.attributes.httpMethods

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxPost(val url: String) : HxDescriptor("hx-post") {

    init {
        + url
    }

}