package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxHistoryEltTest : AttributeBaseTest() {
    @Test
    fun historyEltTest() {
        htmxMethods.historyElt()

        assertAttribute("hx-history-elt")
    }
}
