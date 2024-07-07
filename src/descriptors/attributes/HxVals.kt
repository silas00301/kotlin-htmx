package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxVals : HxDescriptor("hx-vals") {

    fun normal(strategy: HxValsMap.() -> Unit) {
        + "{"
        val instance = HxValsMap()
        instance.strategy()
        val text = instance.text.trimStart().trimEnd(' ', ',')
        + text
        + "}"
    }

    fun javaScript(strategy: HxValsMap.() -> Unit) {
        + "js:"
        normal(strategy)
    }

    class HxValsMap : HxDescriptor("hx-vals") {
        fun add(key: String, value: String) {
            if(text.endsWith(',')) {
                + " $key: $value,"
            } else {
                + "$key: $value,"
            }
        }
    }

}