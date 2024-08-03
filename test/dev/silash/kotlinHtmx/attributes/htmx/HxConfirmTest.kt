package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxConfirmTest : AttributeBaseTest() {
    @Test
    fun confirmTest() {
        val expected = "Are you sure?"

        htmxMethods.confirm(expected)

        assertAttribute("hx-confirm", expected)
    }
}
