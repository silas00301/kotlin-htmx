package dev.silash.kotlinxHtmx.descriptors.attributes

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

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
