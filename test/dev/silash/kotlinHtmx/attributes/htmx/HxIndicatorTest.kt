package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxIndicatorTest : AttributeBaseTest() {
    @Test
    fun indicatorTest() {
        val expected =
            buildString {
                append("closest div ")
                append("[id='example'] ")
                append("[id='example']")
            }

        htmxMethods.indicator {
            closest("div")
            where("id" to "example")
            where("id='example'")
        }

        assertAttribute("hx-indicator", expected)
    }
}
