package dev.silash.testingUtils

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import kotlin.test.AfterTest

abstract class AttributeBaseTest {
    private val map = mutableMapOf<String, String>()
    val htmxHtmlAttributes = HtmxHtmlAttributes(map)

    @AfterTest
    fun cleanup() {
        map.clear()
    }

    fun assertAttribute(
        key: String,
        value: String = "",
    ) {
        map.keys assertContains key
        map[key] assertIsEqualTo value
    }
}
