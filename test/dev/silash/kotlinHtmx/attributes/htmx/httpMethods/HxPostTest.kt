package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxPostTest : AttributeBaseTest() {
    @Test
    fun postTest() {
        val expected = "https://example.com"

        htmxMethods.post(expected)

        assertAttribute("hx-post", expected)
    }
}
