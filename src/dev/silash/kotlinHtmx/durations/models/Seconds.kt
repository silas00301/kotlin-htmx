package dev.silash.kotlinHtmx.durations.models

import dev.silash.kotlinHtmx.enums.HxDurationUnit
import dev.silash.kotlinHtmx.enums.HxDurationUnit.SECONDS

data class Seconds(override val amount: Int) : HxDuration {
    override val unit: HxDurationUnit get() = SECONDS

    override fun toString(): String = "${amount}s"
}

val Int.s get() = Seconds(this)
