package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxValidateTest : AttributeBaseTest() {
    @Test
    fun validateTest() {
        htmxHtmlAttributes.validate()

        assertAttribute("hx-validate")
    }
}
