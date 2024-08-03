package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxSelectOobTest : AttributeBaseTest() {
    @Test
    fun selectOobTest() {
        val expected =
            buildString {
                append("div ")
                append("[id='example'] ")
                append("[id='example']")
                append(":innerHTML, ")
                append("div ")
                append("[id='example'] ")
                append("[id='example']")
                append(":outerHTML")
            }

        htmxMethods.selectOob {
            select {
                element("div")
                where("id" to "example")
                where("id='example'")
                strategy {
                    innerHtml()
                }
            }
            select {
                element("div")
                where("id" to "example")
                where("id='example'")
                strategy {
                    outerHtml()
                }
            }
        }

        assertAttribute("hx-select-oob", expected)
    }
}
