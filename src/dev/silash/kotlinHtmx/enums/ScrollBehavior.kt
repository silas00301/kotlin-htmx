package dev.silash.kotlinHtmx.enums

import dev.silash.kotlinHtmx.enums.ScrollBehavior.AUTO
import dev.silash.kotlinHtmx.enums.ScrollBehavior.INSTANT
import dev.silash.kotlinHtmx.enums.ScrollBehavior.SMOOTH

enum class ScrollBehavior {
    AUTO,
    INSTANT,
    SMOOTH,
}

val ScrollBehavior.behaviorName
    get() =
        when (this) {
            AUTO -> "auto"
            INSTANT -> "instant"
            SMOOTH -> "smooth"
        }

fun String.toScrollBehavior(): ScrollBehavior? =
    when (this) {
        "auto" -> AUTO
        "instant" -> INSTANT
        "smooth" -> SMOOTH
        else -> null
    }
