package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxSelectTest : AttributeBaseTest() {
    @Test
    fun selectTest() {
        val expected =
            buildString {
                append("[id='example'] ")
                append("[id='example']")
            }

        htmxHtmlAttributes.select {
            where("id" to "example")
            where("id='example'")
        }

        assertAttribute("hx-select", expected)
    }
}
