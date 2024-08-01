package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxSync : HtmlAttribute("hx-sync") {
    fun target(target: HxTarget.() -> Unit) =
        HxTarget().apply(target).attributeText.let {
            +"${it.trimEnd()}:"
        }

    fun drop() = +"drop"

    fun abort() = +"abort"

    fun replace() = +"replace"

    fun queue(method: QueueMethods) = +"queue ${method.name.lowercase()}"

    enum class QueueMethods {
        FIRST,
        LAST,
        ALL,
    }
}

fun HtmxMethods.sync(lambda: HxSync.() -> Unit) = addEntry(HxSync(), lambda)
