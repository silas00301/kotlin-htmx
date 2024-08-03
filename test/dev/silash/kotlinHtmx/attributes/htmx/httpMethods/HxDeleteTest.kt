package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxDeleteTest : AttributeBaseTest() {
    @Test
    fun deleteTest() {
        val expected = "https://example.com"

        htmxMethods.delete(expected)

        assertAttribute("hx-delete", expected)
    }
}
