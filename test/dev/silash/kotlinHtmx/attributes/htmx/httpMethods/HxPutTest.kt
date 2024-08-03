package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxPutTest : AttributeBaseTest() {
    @Test
    fun putTest() {
        val expected = "https://example.com"

        htmxMethods.put(expected)

        assertAttribute("hx-put", expected)
    }
}
