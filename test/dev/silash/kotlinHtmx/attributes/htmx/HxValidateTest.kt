package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxValidateTest : AttributeBaseTest() {
    @Test
    fun validateTest() {
        htmxMethods.validate()

        assertAttribute("hx-validate")
    }
}
