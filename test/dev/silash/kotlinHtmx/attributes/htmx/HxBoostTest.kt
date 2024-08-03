package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxBoostTest : AttributeBaseTest() {
    @Test
    fun boostTest() {
        val expected = "true"

        htmxHtmlAttributes.boost()

        assertAttribute("hx-boost", expected)
    }
}
