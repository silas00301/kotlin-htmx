package brock.api.utils.htmx.descriptors.attributes.httpMethods

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxIndicator : HxDescriptor("hx-indicator") {

    fun closest(selector: String) {
        + "closest $selector"
    }

    fun where(selector: Pair<String, String>): String {
        val (key, value) = selector
        return "[$key='$value']"
    }

    infix fun String.equalTo(selector: String) = Pair(this, selector)

}