package dev.silash.kotlinHtmx.enums

import dev.silash.testingUtils.assertContains
import kotlin.test.Test

class HtmxAttributesTest {
    @Test
    fun htmxAttributesAttributeNameTest() {
        val htmxAttributes = HtmxAttributes.entries.map { it.attributeName }
        with(htmxAttributes) {
            assertContains("hx-get")
            assertContains("hx-post")
            assertContains("hx-put")
            assertContains("hx-delete")
            assertContains("hx-patch")
            assertContains("hx-include")
            assertContains("hx-swap")
            assertContains("hx-target")
            assertContains("hx-sync")
            assertContains("hx-trigger")
            assertContains("hx-disabled-elt")
            assertContains("hx-indicator")
            assertContains("hx-swap-oob")
            assertContains("hx-select")
            assertContains("hx-select-oob")
            assertContains("hx-preserve")
            assertContains("hx-params")
            assertContains("hx-encoding")
            assertContains("hx-vals")
            assertContains("hx-confirm")
            assertContains("hx-disinherit")
            assertContains("hx-inherit")
            assertContains("hx-boost")
            assertContains("hx-push-url")
            assertContains("hx-history-elt")
            assertContains("hx-history")
            assertContains("hx-prompt")
            assertContains("hx-validate")
            assertContains("hx-on")
            assertContains("hx-ext")
            assertContains("hx-disable")
        }
    }
}
