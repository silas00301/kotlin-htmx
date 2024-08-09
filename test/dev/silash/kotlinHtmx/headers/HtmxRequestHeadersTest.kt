package dev.silash.kotlinHtmx.headers

import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.BOOSTED
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.CURRENT_URL
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.HISTORY_RESTORE_REQUEST
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.PROMPT
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.REQUEST
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.TARGET
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.TRIGGER
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.TRIGGER_NAME
import dev.silash.kotlinHtmx.enums.headerName
import dev.silash.testingUtils.HeaderBaseTest
import kotlin.test.Test

class HtmxRequestHeadersTest : HeaderBaseTest<HtmxRequestHeaders, String, String, MutableMap<String, String>>() {
    init {
        map = mutableMapOf()
        cut = HtmxRequestHeaders(map)
    }

    @Test
    fun boostedTest() =
        testHeaderGetter(
            header = BOOSTED.headerName,
            expected = "true",
        ) { boosted }

    @Test
    fun currentUrlTest() =
        testHeaderGetter(
            header = CURRENT_URL.headerName,
            expected = "http://localhost:8080",
        ) { currentUrl }

    @Test
    fun historyRestoreRequestTest() =
        testHeaderGetter(
            header = HISTORY_RESTORE_REQUEST.headerName,
            expected = "true",
        ) { historyRestoreRequest }

    @Test
    fun promptTest() =
        testHeaderGetter(
            header = PROMPT.headerName,
            expected = "true",
        ) { prompt }

    @Test
    fun requestTest() =
        testHeaderGetter(
            header = REQUEST.headerName,
            expected = "true",
        ) { request }

    @Test
    fun targetTest() =
        testHeaderGetter(
            header = TARGET.headerName,
            expected = "true",
        ) { target }

    @Test
    fun triggerNameTest() =
        testHeaderGetter(
            header = TRIGGER_NAME.headerName,
            expected = "true",
        ) { triggerName }

    @Test
    fun triggerTest() =
        testHeaderGetter(
            header = TRIGGER.headerName,
            expected = "true",
        ) { trigger }
}
