package dev.silash.kotlinHtmx.durations.models

import dev.silash.kotlinHtmx.enums.HxDurationUnit.MILLISECONDS
import dev.silash.testingUtils.assertIsEqualTo
import kotlin.test.Test

class MillisecondsTest {
    @Test
    fun intMsTest() {
        val ms = 100.ms
        val (amount, unit) = ms
        amount assertIsEqualTo 100
        unit assertIsEqualTo MILLISECONDS
        ms.toString() assertIsEqualTo "100ms"
    }
}
