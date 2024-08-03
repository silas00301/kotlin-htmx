package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxSwapOobTest : AttributeBaseTest() {
    @Test
    fun swapOobTest() {
        val expected =
            buildString {
                append("true ")
                append("div ")
                append("[id='example'] ")
                append("[id='example']")
            }

        htmxMethods.swapOob {
            trueSwap()
            swap {
                element("div")
                where("id" to "example")
                where("id='example'")
            }
        }

        assertAttribute("hx-swap-oob", expected)
    }
}
