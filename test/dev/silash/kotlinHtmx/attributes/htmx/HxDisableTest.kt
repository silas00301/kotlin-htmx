package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxDisableTest : AttributeBaseTest() {
    @Test
    fun disableTest() {
        htmxMethods.disable()

        assertAttribute("hx-disable")
    }
}
