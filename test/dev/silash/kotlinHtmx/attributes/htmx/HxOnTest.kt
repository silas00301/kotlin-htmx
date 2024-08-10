package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.enums.HtmxEvents.PROMPT
import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxOnTest : AttributeBaseTest() {
    @Test
    fun onTest() {
        val expectedHtmx = "console.log('Hello World!')"
        val expectedStandard = "console.log('Hello World!')"

        htmxHtmlAttributes.on(PROMPT) {
            execute("console.log('Hello World!')")
        }
        htmxHtmlAttributes.on("click") {
            execute("console.log('Hello World!')")
        }

        assertAttribute("hx-on:htmx:prompt", expectedHtmx)
        assertAttribute("hx-on:click", expectedStandard)
    }
}
