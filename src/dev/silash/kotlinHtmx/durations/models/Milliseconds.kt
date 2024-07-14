package dev.silash.kotlinHtmx.durations.models

import dev.silash.kotlinHtmx.enums.HxDurationUnit
import dev.silash.kotlinHtmx.enums.HxDurationUnit.MILLISECONDS

data class Milliseconds(override val amount: Int) : HxDuration {
    override val unit: HxDurationUnit get() = MILLISECONDS

    override fun toString(): String = "${amount}ms"
}

val Int.ms get() = Milliseconds(this)
