package dev.silash.kotlinHtmx.enums

import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.AFTER_BEGIN
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.AFTER_END
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.BEFORE_BEGIN
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.BEFORE_END
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.DELETE
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.INNER_HTML
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.NONE
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.OUTER_HTML
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.TEXT_CONTENT

enum class HtmxSwapStyles {
    INNER_HTML,
    OUTER_HTML,
    TEXT_CONTENT,
    BEFORE_BEGIN,
    AFTER_BEGIN,
    BEFORE_END,
    AFTER_END,
    DELETE,
    NONE,
}

val HtmxSwapStyles.styleName
    get() =
        when (this) {
            INNER_HTML -> "innerHTML"
            OUTER_HTML -> "outerHTML"
            TEXT_CONTENT -> "textContent"
            BEFORE_BEGIN -> "beforebegin"
            AFTER_BEGIN -> "afterbegin"
            BEFORE_END -> "beforeend"
            AFTER_END -> "afterend"
            DELETE -> "delete"
            NONE -> "none"
        }

fun String.toHtmxEvent(): HtmxSwapStyles? =
    when (this) {
        "innerHTML" -> INNER_HTML
        "outerHTML" -> OUTER_HTML
        "textContent" -> TEXT_CONTENT
        "beforebegin" -> BEFORE_BEGIN
        "afterbegin" -> AFTER_BEGIN
        "beforeend" -> BEFORE_END
        "afterend" -> AFTER_END
        "delete" -> DELETE
        "none" -> NONE
        else -> null
    }
