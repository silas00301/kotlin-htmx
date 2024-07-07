package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxHistory(val enabled: Boolean) : HxDescriptor("hx-history") {

    init {
        + enabled.toString()
    }
}