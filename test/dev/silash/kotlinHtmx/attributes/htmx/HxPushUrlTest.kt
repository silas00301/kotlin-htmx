package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxPushUrlTest : AttributeBaseTest() {
    @Test
    fun pushUrlTest() {
        val expected =
            buildString {
                append("true ")
                append("false ")
                append("https://example.com")
            }

        htmxMethods.pushUrl {
            pushToHistory()
            notPushToHistory()
            url("https://example.com")
        }

        assertAttribute("hx-push-url", expected)
    }
}
