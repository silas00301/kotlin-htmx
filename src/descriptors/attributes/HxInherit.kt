package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.HtmxAttributes
import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor
import brock.api.utils.htmx.toHtmxAttribute

class HxInherit : HxDescriptor("hx-inherit") {

    fun all() {
        + "*"
    }

    fun select(vararg attribute: HtmxAttributes) {
        + attribute.joinToString(" ") { it.toHtmxAttribute() }
    }

}