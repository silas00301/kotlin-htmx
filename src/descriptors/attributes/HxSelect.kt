package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxSelect : HxDescriptor("hx-select") {

    fun where(selector: Pair<String, String>) {
        val (key, value) = selector
        + "[$key='$value']"
    }

    infix fun String.equalTo(selector: String) = Pair(this, selector)

}