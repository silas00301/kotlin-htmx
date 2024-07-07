package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxBoost(val enabled: Boolean) : HxDescriptor("hx-boost") {

    init {
        + enabled.toString()
    }

}