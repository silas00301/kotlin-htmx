package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

class HxVals : HxDescriptor("hx-vals") {
    fun normal(strategy: HxValsMap.() -> Unit) {
        +"{"
        val instance = HxValsMap()
        instance.strategy()
        val text = instance.text.trimStart().trimEnd(' ', ',')
        +text
        +"}"
    }

    fun javaScript(strategy: HxValsMap.() -> Unit) {
        +"js:"
        normal(strategy)
    }

    fun js(strategy: HxValsMap.() -> Unit) = javaScript(strategy)

    class HxValsMap : HxDescriptor("hx-vals") {
        fun add(
            key: String,
            value: String,
        ) {
            if (text.endsWith(',')) {
                +" $key: $value,"
            } else {
                +"$key: $value,"
            }
        }
    }
}
