package dev.silash.kotlinxHtmx.descriptors.attributes

import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

class HxSync : HxDescriptor("hx-sync") {
    fun target(target: HxTarget.() -> Unit) {
        val hxTargetClass = HxTarget()
        hxTargetClass.target()
        val text = hxTargetClass.text.trimEnd()
        +"$text:"
    }

    fun drop() {
        +"drop"
    }

    fun abort() {
        +"abort"
    }

    fun replace() {
        +"replace"
    }

    fun queue(method: QueueMethods? = null) {
        val methodName = method?.name?.lowercase()
        +"queue $methodName"
    }

    enum class QueueMethods {
        FIRST,
        LAST,
        ALL,
    }
}
