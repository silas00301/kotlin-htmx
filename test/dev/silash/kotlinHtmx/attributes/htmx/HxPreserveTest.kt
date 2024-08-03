package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxPreserveTest : AttributeBaseTest() {
    @Test
    fun preserveTest() {
        htmxMethods.preserve()

        assertAttribute("hx-preserve")
    }
}
