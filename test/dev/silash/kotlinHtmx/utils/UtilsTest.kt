package dev.silash.kotlinHtmx.utils

import dev.silash.kotlinHtmx.descriptors.HxDescriptor
import dev.silash.testingUtils.assertIsEqualTo
import kotlin.test.Test
import kotlin.test.assertFailsWith

class UtilsTest {
    @Test
    fun `generateWhereSelector should add brackets to the input`() {
        val expected = "[key='value']"

        val dummyClass = object : HxDescriptor("") {}

        val result =
            with(dummyClass) {
                generateWhereSelector("key='value'")
            }

        result assertIsEqualTo expected
    }

    @Test
    fun `generateWhereSelector should throw IllegalArgumentException if selector does not contain exactly one '='`() {
        val expectedMessage = "Selector must be in the form \"key='value'\""

        val dummyClass = object : HxDescriptor("") {}

        assertFailsWith<IllegalArgumentException>(
            message = expectedMessage,
        ) {
            with(dummyClass) {
                generateWhereSelector("key='value'='value'")
            }
        }
    }
}
