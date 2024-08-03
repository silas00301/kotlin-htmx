package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.enums.HtmxAttributes.DISINHERIT
import dev.silash.kotlinHtmx.enums.HtmxAttributes.HISTORY
import dev.silash.kotlinHtmx.enums.HtmxAttributes.ON
import dev.silash.kotlinHtmx.enums.HtmxAttributes.SELECT
import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxInheritTest : AttributeBaseTest() {
    @Test
    fun inheritTest() {
        val expected =
            buildString {
                append("* ")
                append("hx-history ")
                append("hx-disinherit ")
                append("hx-select ")
                append("hx-on")
            }

        htmxMethods.inherit {
            all()
            select(HISTORY, DISINHERIT, SELECT, ON)
        }

        assertAttribute("hx-inherit", expected)
    }
}
