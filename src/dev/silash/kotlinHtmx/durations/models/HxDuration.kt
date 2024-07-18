package dev.silash.kotlinHtmx.durations.models

import dev.silash.kotlinHtmx.enums.HxDurationUnit

sealed interface HxDuration {
    val amount: Int

    val unit: HxDurationUnit

    override fun toString(): String

    operator fun component1(): Int = amount

    operator fun component2(): HxDurationUnit = unit
}
