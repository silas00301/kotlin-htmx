package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxGetTest : AttributeBaseTest() {
    @Test
    fun getTest() {
        val expected = "https://example.com"

        htmxMethods.get(expected)

        assertAttribute("hx-get", expected)
    }
}
