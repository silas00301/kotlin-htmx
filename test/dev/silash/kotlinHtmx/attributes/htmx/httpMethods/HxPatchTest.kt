package dev.silash.kotlinHtmx.attributes.htmx.httpMethods

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxPatchTest : AttributeBaseTest() {
    @Test
    fun patchTest() {
        val expected = "https://example.com"

        htmxHtmlAttributes.patch(expected)

        assertAttribute("hx-patch", expected)
    }
}
