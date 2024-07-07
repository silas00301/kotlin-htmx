package dev.silash.kotlinxHtmx.descriptors.attributes

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxExt : HxDescriptor("hx-ext") {
    fun add(vararg extensions: String) {
        +extensions.joinToString(" ")
    }

    fun ignore(vararg extensions: String) {
        extensions.forEach {
            +"ignore:$it"
        }
    }
}
