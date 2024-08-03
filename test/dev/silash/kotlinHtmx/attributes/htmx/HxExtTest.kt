package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxExtTest : AttributeBaseTest() {
    @Test
    fun extTest() {
        val expected = "text test ignore:text ignore:test"

        htmxHtmlAttributes.ext {
            add("text", "test")
            ignore("text", "test")
        }

        assertAttribute("hx-ext", expected)
    }
}
