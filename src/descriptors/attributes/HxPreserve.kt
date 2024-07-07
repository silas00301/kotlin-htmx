package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxPreserve(val option: String) : HxDescriptor("hx-preserve") {

    init {
        + option
    }

}