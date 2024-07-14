package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

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
