package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxExt : HxDescriptor("hx-ext") {

    fun add(vararg extensions: String) {
        + extensions.joinToString(" ")
    }
    
    fun ignore(vararg extensions: String) {
        extensions.forEach {
            + "ignore:$it"
        }
    }

}