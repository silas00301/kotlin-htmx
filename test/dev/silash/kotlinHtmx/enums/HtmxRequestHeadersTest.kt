package dev.silash.kotlinHtmx.enums

import dev.silash.testingUtils.assertContains
import kotlin.test.Test

class HtmxRequestHeadersTest {
    @Test
    fun htmxRequestHeadersHeaderNameTest() {
        val htmxHeaders = HtmxRequestHeaders.entries.map { it.headerName }
        with(htmxHeaders) {
            assertContains("HX-Boosted")
            assertContains("HX-Current-Url")
            assertContains("HX-History-Restore-Request")
            assertContains("HX-Prompt")
            assertContains("HX-Request")
            assertContains("HX-Target")
            assertContains("HX-Trigger-Name")
            assertContains("HX-Trigger")
        }
    }
}
