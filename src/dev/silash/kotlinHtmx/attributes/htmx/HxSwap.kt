package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles
import dev.silash.kotlinHtmx.enums.styleName
import kotlin.time.Duration

@Suppress("TooManyFunctions")
class HxSwap : HtmlAttribute("hx-swap") {
    fun style(style: HtmxSwapStyles) = +style.styleName

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

fun HtmxHtmlAttributes.swap(lambda: HxSwap.() -> Unit) = addEntry(HxSwap(), lambda)
