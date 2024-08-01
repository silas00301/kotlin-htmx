package dev.silash.kotlinHtmx.events

import dev.silash.testingUtils.assertIsEqualTo
import kotlin.test.Test
import kotlin.test.assertFailsWith

class HtmxEventTest {
    @Test
    fun `HtmxEvent constructor should remove colons at start`() {
        val expected = HtmxEvent("event")

        val actual = HtmxEvent("::event")

        actual.event assertIsEqualTo expected.event
    }

    @Test
    fun `HtmxEvent constructor should throw exception if event contains uppercase character`() {
        assertFailsWith<IllegalArgumentException>(
            message = "Events cannot contain uppercase character",
        ) {
            HtmxEvent("Event")
        }
    }
}
