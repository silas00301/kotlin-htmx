package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxSwap : HxDescriptor("hx-swap") {

    fun innerHtml() {
        + "innerHTML"
    }

    fun outerHtml() {
        + "outerHTML"
    }

    fun textContent() {
        + "textContent"
    }

    fun beforeBegin() {
        + "beforebegin"
    }

    fun afterBegin() {
        + "afterbegin"
    }

    fun beforeEnd() {
        + "beforeend"
    }

    fun afterEnd() {
        + "afterend"
    }

    fun delete() {
        + "delete"
    }

    fun none() {
        + "none"
    }

    fun swap(time: String) {
        + "swap:$time"
    }

    fun ignoreTitle() {
        + "ignoreTitle"
    }

    fun scroll(direction: HxScrollDirection) {
        val directionName = direction.name.lowercase()
        + "scroll:$directionName"
    }

    fun show(selector: String? = null, direction: HxShowDirection) {
        val directionName = direction.name.lowercase()
        if(selector != null) + "show:$directionName:$selector" else + "show:$directionName"
    }

    fun focusShow(enabled: Boolean) {
        val enabledName = if(enabled) "true" else "false"
        + "focus-show:$enabledName"
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