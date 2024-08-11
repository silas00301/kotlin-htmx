package dev.silash.kotlinHtmx.utils

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.testingUtils.assertIsEqualTo
import kotlin.test.Test
import kotlin.test.assertFailsWith

class UtilsTest {
    @Test
    fun `generateWhereSelector should add brackets to the input`() {
        val expected = "[key='value']"

        val dummyClass = object : HtmlAttribute("") {}

        val result =
            with(dummyClass) {
                generateWhereSelector("key='value'")
            }

        result assertIsEqualTo expected
    }

    @Test
    fun `generateWhereSelector should throw IllegalArgumentException if selector does not contain exactly one '='`() {
        val expectedMessage = "Selector must be in the form \"key='value'\""

        val dummyClass = object : HtmlAttribute("") {}

        assertFailsWith<IllegalArgumentException>(
            message = expectedMessage,
        ) {
            with(dummyClass) {
                generateWhereSelector("key='value'='value'")
            }
        }
    }

    @Test
    fun `String contains uppercase should return true if String contains uppercase characters`() {
        val expected = true

        val actual = "Hello".containsUpperCase()

        actual assertIsEqualTo expected
    }

    @Test
    fun `String contains uppercase should return false if String does not contain uppercase characters`() {
        val expected = false

        val actual = "hello".containsUpperCase()

        actual assertIsEqualTo expected
    }

    @Test
    fun `String contains uppercase should return false if String is empty`() {
        val expected = false

        val actual = "".containsUpperCase()

        actual assertIsEqualTo expected
    }

    @Test
    fun `String contains lowercase should return true if String contains lowercase characters`() {
        val expected = true

        val actual = "hello".containsLowerCase()

        actual assertIsEqualTo expected
    }

    @Test
    fun `String contains lowercase should return false if String does not contain lowercase characters`() {
        val expected = false

        val actual = "HELLO".containsLowerCase()

        actual assertIsEqualTo expected
    }

    @Test
    fun `String contains lowercase should return false if String is empty`() {
        val expected = false

        val actual = "".containsLowerCase()

        actual assertIsEqualTo expected
    }

    @Test
    fun stringPrependTest() {
        val expected = "prefixString"

        val actual = "String".prepend("prefix")

        actual assertIsEqualTo expected
    }

    @Test
    fun stringAppendTest() {
        val expected = "StringSuffix"

        val actual = "String".append("Suffix")

        actual assertIsEqualTo expected
    }
}
