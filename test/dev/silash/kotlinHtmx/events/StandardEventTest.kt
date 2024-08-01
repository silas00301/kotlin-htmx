package dev.silash.kotlinHtmx.events

import dev.silash.testingUtils.assertIsEqualTo
import kotlin.test.Test
import kotlin.test.assertFailsWith

class StandardEventTest {
    @Test
    fun `StandardEvent constructor should remove colons at start`() {
        val expected = StandardEvent("event")

        val actual = StandardEvent("::event")

        actual.event assertIsEqualTo expected.event
    }

    @Test
    fun `StandardEvent constructor should throw exception if event contains uppercase character`() {
        assertFailsWith<IllegalArgumentException>(
            message = "Events cannot contain uppercase character",
        ) {
            StandardEvent("Event")
        }
    }
}
