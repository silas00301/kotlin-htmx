package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxMethods
import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import kotlin.time.Duration

@Suppress("TooManyFunctions")
class HxSwap : HtmlAttribute("hx-swap") {
    fun innerHtml() = +"innerHTML"

    fun outerHtml() = +"outerHTML"

    fun textContent() = +"textContent"

    fun beforeBegin() = +"beforebegin"

    fun afterBegin() = +"afterbegin"

    fun beforeEnd() = +"beforeend"

    fun afterEnd() = +"afterend"

    fun delete() = +"delete"

    fun none() = +"none"

    fun swap(time: Duration) = +"swap:${time.inWholeMilliseconds}ms"

    fun settle(time: Duration) = +"settle:${time.inWholeMilliseconds}ms"

    fun ignoreTitle() = +"ignoreTitle"

    fun scroll(direction: HxScrollDirection) = +"scroll:${direction.name.lowercase()}"

    fun show(
        selector: String? = null,
        direction: HxShowDirection,
    ) = if (selector != null) {
        +"show:${direction.name.lowercase()}:$selector"
    } else {
        +"show:${direction.name.lowercase()}"
    }

    fun focusShow(enabled: Boolean) = +"focus-show:$enabled"

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

fun HtmxMethods.swap(lambda: HxSwap.() -> Unit) = addEntry(HxSwap(), lambda)
