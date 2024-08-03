package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.events.HtmxEvent
import dev.silash.kotlinHtmx.events.StandardEvent
import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxOnTest : AttributeBaseTest() {
    @Test
    fun onTest() {
        val expectedHtmx = "console.log('Hello World!')"
        val expectedStandard = "console.log('Hello World!')"

        htmxMethods.on(HtmxEvent("click")) {
            execute("console.log('Hello World!')")
        }
        htmxMethods.on(StandardEvent("test")) {
            execute("console.log('Hello World!')")
        }

        assertAttribute("hx-on::click", expectedHtmx)
        assertAttribute("hx-on:test", expectedStandard)
    }
}
