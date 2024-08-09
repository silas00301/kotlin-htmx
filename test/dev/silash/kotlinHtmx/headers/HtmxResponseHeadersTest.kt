package dev.silash.kotlinHtmx.headers

import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.LOCATION
import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.PUSH_URL
import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.REDIRECT
import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.REFRESH
import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.REPLACE_URL
import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.RESELECT
import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.RESWAP
import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.RETARGET
import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.TRIGGER
import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.TRIGGER_AFTER_SETTLE
import dev.silash.kotlinHtmx.enums.HtmxResponseHeaders.TRIGGER_AFTER_SWAP
import dev.silash.kotlinHtmx.enums.headerName
import dev.silash.testingUtils.HeaderBaseTest
import dev.silash.testingUtils.assertIsEqualTo
import kotlin.test.Test

class HtmxResponseHeadersTest : HeaderBaseTest<HtmxResponseHeaders, String, String, MutableMap<String, String>>() {
    init {
        map = mutableMapOf()
        cut = HtmxResponseHeaders(map)
    }

    private fun testHeaderSetter(
        header: String,
        expected: String,
        function: HtmxResponseHeaders.(String) -> Unit,
    ) = cut.function(expected).let {
        map[header] assertIsEqualTo expected
    }

    @Test
    fun `location setter should set map entry`() =
        testHeaderSetter(
            header = LOCATION.headerName,
            expected = "test",
        ) { location = it }

    @Test
    fun `pushUrl setter should set map entry`() =
        testHeaderSetter(
            header = PUSH_URL.headerName,
            expected = "test",
        ) { pushUrl = it }

    @Test
    fun `redirect setter should set map entry`() =
        testHeaderSetter(
            header = REDIRECT.headerName,
            expected = "test",
        ) { redirect = it }

    @Test
    fun `refresh setter should set map entry`() =
        testHeaderSetter(
            header = REFRESH.headerName,
            expected = "test",
        ) { refresh = it }

    @Test
    fun `replaceUrl setter should set map entry`() =
        testHeaderSetter(
            header = REPLACE_URL.headerName,
            expected = "test",
        ) { replaceUrl = it }

    @Test
    fun `reswap setter should set map entry`() =
        testHeaderSetter(
            header = RESWAP.headerName,
            expected = "test",
        ) { reswap = it }

    @Test
    fun `retarget setter should set map entry`() =
        testHeaderSetter(
            header = RETARGET.headerName,
            expected = "test",
        ) { retarget = it }

    @Test
    fun `reselect setter should set map entry`() =
        testHeaderSetter(
            header = RESELECT.headerName,
            expected = "test",
        ) { reselect = it }

    @Test
    fun `trigger setter should set map entry`() =
        testHeaderSetter(
            header = TRIGGER.headerName,
            expected = "test",
        ) { trigger = it }

    @Test
    fun `triggerAfterSettle setter should set map entry`() =
        testHeaderSetter(
            header = TRIGGER_AFTER_SETTLE.headerName,
            expected = "test",
        ) { triggerAfterSettle = it }

    @Test
    fun `triggerAfterSwap setter should set map entry`() =
        testHeaderSetter(
            header = TRIGGER_AFTER_SWAP.headerName,
            expected = "test",
        ) { triggerAfterSwap = it }

    @Test
    fun `location getter should return map entry`() =
        testHeaderGetter(
            header = LOCATION.headerName,
            expected = "test",
        ) { location }

    @Test
    fun `pushUrl getter should return map entry`() =
        testHeaderGetter(
            header = PUSH_URL.headerName,
            expected = "test",
        ) { pushUrl }

    @Test
    fun `redirect getter should return map entry`() =
        testHeaderGetter(
            header = REDIRECT.headerName,
            expected = "test",
        ) { redirect }

    @Test
    fun `refresh getter should return map entry`() =
        testHeaderGetter(
            header = REFRESH.headerName,
            expected = "test",
        ) { refresh }

    @Test
    fun `replaceUrl getter should return map entry`() =
        testHeaderGetter(
            header = REPLACE_URL.headerName,
            expected = "test",
        ) { replaceUrl }

    @Test
    fun `reswap getter should return map entry`() =
        testHeaderGetter(
            header = RESWAP.headerName,
            expected = "test",
        ) { reswap }

    @Test
    fun `retarget getter should return map entry`() =
        testHeaderGetter(
            header = RETARGET.headerName,
            expected = "test",
        ) { retarget }

    @Test
    fun `reselect getter should return map entry`() =
        testHeaderGetter(
            header = RESELECT.headerName,
            expected = "test",
        ) { reselect }

    @Test
    fun `trigger getter should return map entry`() =
        testHeaderGetter(
            header = TRIGGER.headerName,
            expected = "test",
        ) { trigger }

    @Test
    fun `triggerAfterSettle getter should return map entry`() =
        testHeaderGetter(
            header = TRIGGER_AFTER_SETTLE.headerName,
            expected = "test",
        ) { triggerAfterSettle }

    @Test
    fun `triggerAfterSwap getter should return map entry`() =
        testHeaderGetter(
            header = TRIGGER_AFTER_SWAP.headerName,
            expected = "test",
        ) { triggerAfterSwap }
}
