package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxSync : HtmlAttribute("hx-sync") {
    fun target(target: HxTarget.() -> Unit) {
        val hxTargetClass = HxTarget()
        hxTargetClass.target()
        val text = hxTargetClass.attributeText.trimEnd()
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

    fun queue(method: QueueMethods) {
        val methodName = method.name.lowercase()
        +"queue $methodName"
    }

    enum class QueueMethods {
        FIRST,
        LAST,
        ALL,
    }
}
