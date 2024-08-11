package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.INNER_HTML
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.OUTER_HTML
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

        htmxHtmlAttributes.selectOob {
            select {
                element("div")
                where("id" to "example")
                where("id='example'")
                strategy {
                    style(INNER_HTML)
                }
            }
            select {
                element("div")
                where("id" to "example")
                where("id='example'")
                strategy {
                    style(OUTER_HTML)
                }
            }
        }

        assertAttribute("hx-select-oob", expected)
    }
}
