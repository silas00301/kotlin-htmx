package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxParams : HxDescriptor("hx-params") {
    fun all() {
        +"*"
    }

    fun none() {
        +"none"
    }

    fun except(vararg params: String) {
        +"not ${params.joinToString(",")}"
    }

    fun only(vararg params: String) {
        +params.joinToString(",")
    }
}
