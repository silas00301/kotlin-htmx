package dev.silash.kotlinHtmx.cssClasses

import dev.silash.kotlinHtmx.cssClasses.htmx.added
import dev.silash.kotlinHtmx.cssClasses.htmx.indicator
import dev.silash.kotlinHtmx.cssClasses.htmx.request
import dev.silash.kotlinHtmx.cssClasses.htmx.settling
import dev.silash.kotlinHtmx.cssClasses.htmx.swapping
import dev.silash.testingUtils.assertIsEqualTo
import kotlin.test.AfterTest
import kotlin.test.Test

class HtmxCSSClassesTest {
    private val list = mutableListOf<String>()

    private val cut = HtmxCSSClasses(list)

    @AfterTest
    fun cleanup() {
        list.clear()
    }

    @Test
    fun addedTest() {
        val expected = listOf("htmx-added")

        cut.added()

        list assertIsEqualTo expected
    }

    @Test
    fun indicatorTest() {
        val expected = listOf("htmx-indicator")

        cut.indicator()

        list assertIsEqualTo expected
    }

    @Test
    fun requestTest() {
        val expected = listOf("htmx-request")

        cut.request()

        list assertIsEqualTo expected
    }

    @Test
    fun settlingTest() {
        val expected = listOf("htmx-settling")

        cut.settling()

        list assertIsEqualTo expected
    }

    @Test
    fun swappingTest() {
        val expected = listOf("htmx-swapping")

        cut.swapping()

        list assertIsEqualTo expected
    }

    @Test
    fun multipleClassesTest() {
        val expected =
            listOf(
                "htmx-added",
                "htmx-indicator",
                "htmx-request",
                "htmx-settling",
                "htmx-swapping",
            )

        cut.added()
        cut.indicator()
        cut.request()
        cut.settling()
        cut.swapping()

        list assertIsEqualTo expected
    }

    @Test
    fun classStringTest() {
        val expected =
            buildString {
                append("htmx-added ")
                append("htmx-indicator ")
                append("htmx-request ")
                append("htmx-settling ")
                append("htmx-swapping")
            }

        cut.added()
        cut.indicator()
        cut.request()
        cut.settling()
        cut.swapping()

        cut.classString assertIsEqualTo expected
    }
}
