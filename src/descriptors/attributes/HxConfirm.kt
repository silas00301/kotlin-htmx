package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxConfirm(val message: String) : HxDescriptor("hx-confirm") {

    init {
        + message
    }

}