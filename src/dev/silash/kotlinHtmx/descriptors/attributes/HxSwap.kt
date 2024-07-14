package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor
import dev.silash.kotlinHtmx.durations.models.HxDuration

@Suppress("TooManyFunctions")
class HxSwap : HxDescriptor("hx-swap") {
    fun innerHtml() {
        +"innerHTML"
    }

    fun outerHtml() {
        +"outerHTML"
    }

    fun textContent() {
        +"textContent"
    }

    fun beforeBegin() {
        +"beforebegin"
    }

    fun afterBegin() {
        +"afterbegin"
    }

    fun beforeEnd() {
        +"beforeend"
    }

    fun afterEnd() {
        +"afterend"
    }

    fun delete() {
        +"delete"
    }

    fun none() {
        +"none"
    }

    fun swap(time: HxDuration) {
        +"swap:$time"
    }

    fun settle(time: HxDuration) {
        +"settle:$time"
    }

    fun ignoreTitle() {
        +"ignoreTitle"
    }

    fun scroll(direction: HxScrollDirection) {
        val directionName = direction.name.lowercase()
        +"scroll:$directionName"
    }

    fun show(
        selector: String? = null,
        direction: HxShowDirection,
    ) {
        val directionName = direction.name.lowercase()
        if (selector != null) +"show:$directionName:$selector" else +"show:$directionName"
    }

    fun focusShow(enabled: Boolean) {
        val enabledName = if (enabled) "true" else "false"
        +"focus-show:$enabledName"
    }

    enum class HxShowDirection {
        TOP,
        BOTTOM,
        NONE,
    }

    enum class HxScrollDirection {
        TOP,
        BOTTOM,
    }
}
