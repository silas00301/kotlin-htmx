package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxHistoryTest : AttributeBaseTest() {
    @Test
    fun historyTest() {
        htmxMethods.history()

        assertAttribute("hx-history", "false")
    }
}
