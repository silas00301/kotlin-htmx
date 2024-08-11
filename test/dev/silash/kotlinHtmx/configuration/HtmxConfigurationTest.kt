package dev.silash.kotlinHtmx.configuration

import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.INNER_HTML
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.OUTER_HTML
import dev.silash.kotlinHtmx.enums.ScrollBehavior.AUTO
import dev.silash.kotlinHtmx.enums.ScrollBehavior.INSTANT
import dev.silash.kotlinHtmx.enums.WebSocketBinaryType.ARRAY_BUFFER
import dev.silash.kotlinHtmx.enums.WebSocketBinaryType.BLOB
import dev.silash.testingUtils.assertIsEqualTo
import kotlin.test.AfterTest
import kotlin.test.Test

class HtmxConfigurationTest {
    private var cut = HtmxConfiguration()

    @AfterTest
    fun cleanup() {
        cut = HtmxConfiguration()
    }

    @Test
    fun historyEnabledTest() {
        val expected = """{"historyEnabled":true}"""

        cut.historyEnabled = true

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun historyCacheSizeTest() {
        val expected = """{"historyCacheSize":20}"""

        cut.historyCacheSize = 20

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun refreshOnHistoryMissTest() {
        val expected = """{"refreshOnHistoryMiss":false}"""

        cut.refreshOnHistoryMiss = false

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun defaultSwapStyleTest() {
        val expected = """{"defaultSwapStyle":"innerHTML"}"""

        cut.defaultSwapStyle = INNER_HTML

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun defaultSwapDelayTest() {
        val expected = """{"defaultSwapDelay":10}"""

        cut.defaultSwapDelay = 10

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun defaultSwapSettleDelayTest() {
        val expected = """{"defaultSwapSettleDelay":30}"""

        cut.defaultSwapSettleDelay = 30

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun includeIndicationStylesTest() {
        val expected = """{"includeIndicationStyles":false}"""

        cut.includeIndicationStyles = false

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun indicationClassTest() {
        val expected = """{"indicationClass":"custom-indication"}"""

        cut.indicationClass = "custom-indication"

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun requestClassTest() {
        val expected = """{"requestClass":"custom-request"}"""

        cut.requestClass = "custom-request"

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun addedClassTest() {
        val expected = """{"addedClass":"custom-added"}"""

        cut.addedClass = "custom-added"

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun settlingClassTest() {
        val expected = """{"settlingClass":"custom-settling"}"""

        cut.settlingClass = "custom-settling"

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun swappingClassTest() {
        val expected = """{"swappingClass":"custom-swapping"}"""

        cut.swappingClass = "custom-swapping"

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun allowEvalTest() {
        val expected = """{"allowEval":false}"""

        cut.allowEval = false

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun allowScriptsTest() {
        val expected = """{"allowScriptTags":false}"""

        cut.allowScriptTags = false

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun inlineScriptNonceTest() {
        val expected = """{"inlineScriptNonce":"custom-nonce"}"""

        cut.inlineScriptNonce = "custom-nonce"

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun inlineStyleNonceTest() {
        val expected = """{"inlineStyleNonce":"custom-nonce"}"""

        cut.inlineStyleNonce = "custom-nonce"

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun attributesToSettleTest() {
        val expected = """{"attributesToSettle":["custom-attr1", "custom-attr2"]}"""

        cut.attributesToSettle = listOf("custom-attr1", "custom-attr2")

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun wsReconnectDelayTest() {
        val expected = """{"wsReconnectDelay":"custom-delay"}"""

        cut.wsReconnectDelay = "custom-delay"

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun wsBinaryTypeTest() {
        val expected = """{"wsBinaryType":"arraybuffer"}"""

        cut.wsBinaryType = ARRAY_BUFFER

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun disableSelectorTest() {
        val expected = """{"disableSelector":"[custom-selector1], [custom-selector2]"}"""

        cut.disableSelector = listOf("[custom-selector1]", "[custom-selector2]")

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun withCredentialsTest() {
        val expected = """{"withCredentials":false}"""

        cut.withCredentials = false

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun timeoutTest() {
        val expected = """{"timeout":10000}"""

        cut.timeout = 10_000

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun scrollBehaviorTest() {
        val expected = """{"scrollBehavior":"auto"}"""

        cut.scrollBehavior = AUTO

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun defaultFocusScrollTest() {
        val expected = """{"defaultFocusScroll":true}"""

        cut.defaultFocusScroll = true

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun getCacheBusterParamTest() {
        val expected = """{"getCacheBusterParam":true}"""

        cut.getCacheBusterParam = true

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun globalViewTransitionsTest() {
        val expected = """{"globalViewTransitions":false}"""

        cut.globalViewTransitions = false

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun methodsThatUseUrlParamsTest() {
        val expected = """{"methodsThatUseUrlParams":["get", "post"]}"""

        cut.methodsThatUseUrlParams = listOf("get", "post")

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun selfRequestsOnlyTest() {
        val expected = """{"selfRequestsOnly":false}"""

        cut.selfRequestsOnly = false

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun ignoreTitleTest() {
        val expected = """{"ignoreTitle":true}"""

        cut.ignoreTitle = true

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun scrollIntoViewOnBoostTest() {
        val expected = """{"scrollIntoViewOnBoost":false}"""

        cut.scrollIntoViewOnBoost = false

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun triggerSpecsCacheTest() {
        val expected = """{"triggerSpecsCache":"custom-cache"}"""

        cut.triggerSpecsCache = "custom-cache"

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    fun allowNestedOobSwapsTest() {
        val expected = """{"allowNestedOobSwaps":false}"""

        cut.allowNestedOobSwaps = false

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    @Suppress("LongMethod")
    fun fullConfigurationSetTest() {
        val expected =
            buildString {
                append("{")
                append(""""historyEnabled":true, """)
                append(""""historyCacheSize":20, """)
                append(""""refreshOnHistoryMiss":false, """)
                append(""""defaultSwapStyle":"outerHTML", """)
                append(""""defaultSwapDelay":10, """)
                append(""""defaultSwapSettleDelay":30, """)
                append(""""includeIndicationStyles":false, """)
                append(""""indicationClass":"custom-indication", """)
                append(""""requestClass":"custom-request", """)
                append(""""addedClass":"custom-added", """)
                append(""""settlingClass":"custom-settling", """)
                append(""""swappingClass":"custom-swapping", """)
                append(""""allowEval":false, """)
                append(""""allowScriptTags":false, """)
                append(""""inlineScriptNonce":"custom-nonce", """)
                append(""""inlineStyleNonce":"custom-nonce", """)
                append(""""attributesToSettle":["custom-attr1", "custom-attr2"], """)
                append(""""wsReconnectDelay":"custom-delay", """)
                append(""""wsBinaryType":"arraybuffer", """)
                append(""""disableSelector":"[custom-selector1], [custom-selector2]", """)
                append(""""withCredentials":false, """)
                append(""""timeout":10000, """)
                append(""""scrollBehavior":"auto", """)
                append(""""defaultFocusScroll":true, """)
                append(""""getCacheBusterParam":true, """)
                append(""""globalViewTransitions":false, """)
                append(""""methodsThatUseUrlParams":["get", "post"], """)
                append(""""selfRequestsOnly":false, """)
                append(""""ignoreTitle":true, """)
                append(""""scrollIntoViewOnBoost":false, """)
                append(""""triggerSpecsCache":"custom-cache", """)
                append(""""allowNestedOobSwaps":false""")
                append("}")
            }

        cut.apply {
            historyEnabled = true
            historyCacheSize = 20
            refreshOnHistoryMiss = false
            defaultSwapStyle = OUTER_HTML
            defaultSwapDelay = 10
            defaultSwapSettleDelay = 30
            includeIndicationStyles = false
            indicationClass = "custom-indication"
            requestClass = "custom-request"
            addedClass = "custom-added"
            settlingClass = "custom-settling"
            swappingClass = "custom-swapping"
            allowEval = false
            allowScriptTags = false
            inlineScriptNonce = "custom-nonce"
            inlineStyleNonce = "custom-nonce"
            attributesToSettle = listOf("custom-attr1", "custom-attr2")
            wsReconnectDelay = "custom-delay"
            wsBinaryType = ARRAY_BUFFER
            disableSelector = listOf("[custom-selector1]", "[custom-selector2]")
            withCredentials = false
            timeout = 10000
            scrollBehavior = AUTO
            defaultFocusScroll = true
            getCacheBusterParam = true
            globalViewTransitions = false
            methodsThatUseUrlParams = listOf("get", "post")
            selfRequestsOnly = false
            ignoreTitle = true
            scrollIntoViewOnBoost = false
            triggerSpecsCache = "custom-cache"
            allowNestedOobSwaps = false
        }

        cut.toConfigString() assertIsEqualTo expected
    }

    @Test
    @Suppress("LongMethod")
    fun fullConfigurationGetWithSetValuesTest() {
        val expected =
            mapOf(
                "historyEnabled" to true,
                "historyCacheSize" to 20,
                "refreshOnHistoryMiss" to false,
                "defaultSwapStyle" to OUTER_HTML,
                "defaultSwapDelay" to 10,
                "defaultSwapSettleDelay" to 30,
                "includeIndicationStyles" to false,
                "indicationClass" to "custom-indication",
                "requestClass" to "custom-request",
                "addedClass" to "custom-added",
                "settlingClass" to "custom-settling",
                "swappingClass" to "custom-swapping",
                "allowEval" to false,
                "allowScriptTags" to false,
                "inlineScriptNonce" to "custom-nonce",
                "inlineStyleNonce" to "custom-nonce",
                "attributesToSettle" to listOf("custom-attr1", "custom-attr2"),
                "wsReconnectDelay" to "custom-delay",
                "wsBinaryType" to ARRAY_BUFFER,
                "disableSelector" to listOf("[custom-selector1]", "[custom-selector2]"),
                "withCredentials" to false,
                "timeout" to 10000,
                "scrollBehavior" to AUTO,
                "defaultFocusScroll" to true,
                "getCacheBusterParam" to true,
                "globalViewTransitions" to false,
                "methodsThatUseUrlParams" to listOf("get", "post"),
                "selfRequestsOnly" to false,
                "ignoreTitle" to true,
                "scrollIntoViewOnBoost" to false,
                "triggerSpecsCache" to "custom-cache",
                "allowNestedOobSwaps" to false,
            )
        val actual: MutableMap<String, Any> = mutableMapOf()

        cut.apply {
            historyEnabled = true
            historyCacheSize = 20
            refreshOnHistoryMiss = false
            defaultSwapStyle = OUTER_HTML
            defaultSwapDelay = 10
            defaultSwapSettleDelay = 30
            includeIndicationStyles = false
            indicationClass = "custom-indication"
            requestClass = "custom-request"
            addedClass = "custom-added"
            settlingClass = "custom-settling"
            swappingClass = "custom-swapping"
            allowEval = false
            allowScriptTags = false
            inlineScriptNonce = "custom-nonce"
            inlineStyleNonce = "custom-nonce"
            attributesToSettle = listOf("custom-attr1", "custom-attr2")
            wsReconnectDelay = "custom-delay"
            wsBinaryType = ARRAY_BUFFER
            disableSelector = listOf("[custom-selector1]", "[custom-selector2]")
            withCredentials = false
            timeout = 10000
            scrollBehavior = AUTO
            defaultFocusScroll = true
            getCacheBusterParam = true
            globalViewTransitions = false
            methodsThatUseUrlParams = listOf("get", "post")
            selfRequestsOnly = false
            ignoreTitle = true
            scrollIntoViewOnBoost = false
            triggerSpecsCache = "custom-cache"
            allowNestedOobSwaps = false
        }

        with(cut) {
            actual["historyEnabled"] = historyEnabled
            actual["historyCacheSize"] = historyCacheSize
            actual["refreshOnHistoryMiss"] = refreshOnHistoryMiss
            actual["defaultSwapStyle"] = defaultSwapStyle
            actual["defaultSwapDelay"] = defaultSwapDelay
            actual["defaultSwapSettleDelay"] = defaultSwapSettleDelay
            actual["includeIndicationStyles"] = includeIndicationStyles
            actual["indicationClass"] = indicationClass
            actual["requestClass"] = requestClass
            actual["addedClass"] = addedClass
            actual["settlingClass"] = settlingClass
            actual["swappingClass"] = swappingClass
            actual["allowEval"] = allowEval
            actual["allowScriptTags"] = allowScriptTags
            actual["inlineScriptNonce"] = inlineScriptNonce
            actual["inlineStyleNonce"] = inlineStyleNonce
            actual["attributesToSettle"] = attributesToSettle
            actual["wsReconnectDelay"] = wsReconnectDelay
            actual["wsBinaryType"] = wsBinaryType
            actual["disableSelector"] = disableSelector
            actual["withCredentials"] = withCredentials
            actual["timeout"] = timeout
            actual["scrollBehavior"] = scrollBehavior
            actual["defaultFocusScroll"] = defaultFocusScroll
            actual["getCacheBusterParam"] = getCacheBusterParam
            actual["globalViewTransitions"] = globalViewTransitions
            actual["methodsThatUseUrlParams"] = methodsThatUseUrlParams
            actual["selfRequestsOnly"] = selfRequestsOnly
            actual["ignoreTitle"] = ignoreTitle
            actual["scrollIntoViewOnBoost"] = scrollIntoViewOnBoost
            actual["triggerSpecsCache"] = triggerSpecsCache
            actual["allowNestedOobSwaps"] = allowNestedOobSwaps
        }

        actual assertIsEqualTo expected
    }

    @Test
    @Suppress("LongMethod")
    fun fullConfigurationGetWithoutSetValuesTest() {
        val expected =
            mapOf(
                "historyEnabled" to true,
                "historyCacheSize" to 10,
                "refreshOnHistoryMiss" to false,
                "defaultSwapStyle" to INNER_HTML,
                "defaultSwapDelay" to 0,
                "defaultSwapSettleDelay" to 20,
                "includeIndicationStyles" to true,
                "indicationClass" to "htmx-indicator",
                "requestClass" to "htmx-request",
                "addedClass" to "htmx-added",
                "settlingClass" to "htmx-settling",
                "swappingClass" to "htmx-swapping",
                "allowEval" to true,
                "allowScriptTags" to true,
                "inlineScriptNonce" to "",
                "inlineStyleNonce" to "",
                "attributesToSettle" to listOf("class", "style", "width", "height"),
                "wsReconnectDelay" to "full-jitter",
                "wsBinaryType" to BLOB,
                "disableSelector" to listOf("[hx-disable]", "[data-hx-disable]"),
                "withCredentials" to false,
                "timeout" to 0,
                "scrollBehavior" to INSTANT,
                "defaultFocusScroll" to false,
                "getCacheBusterParam" to false,
                "globalViewTransitions" to true,
                "methodsThatUseUrlParams" to listOf("get"),
                "selfRequestsOnly" to true,
                "ignoreTitle" to false,
                "scrollIntoViewOnBoost" to true,
                "triggerSpecsCache" to "null",
                "allowNestedOobSwaps" to true,
            )
        val actual: MutableMap<String, Any> = mutableMapOf()

        with(cut) {
            actual["historyEnabled"] = historyEnabled
            actual["historyCacheSize"] = historyCacheSize
            actual["refreshOnHistoryMiss"] = refreshOnHistoryMiss
            actual["defaultSwapStyle"] = defaultSwapStyle
            actual["defaultSwapDelay"] = defaultSwapDelay
            actual["defaultSwapSettleDelay"] = defaultSwapSettleDelay
            actual["includeIndicationStyles"] = includeIndicationStyles
            actual["indicationClass"] = indicationClass
            actual["requestClass"] = requestClass
            actual["addedClass"] = addedClass
            actual["settlingClass"] = settlingClass
            actual["swappingClass"] = swappingClass
            actual["allowEval"] = allowEval
            actual["allowScriptTags"] = allowScriptTags
            actual["inlineScriptNonce"] = inlineScriptNonce
            actual["inlineStyleNonce"] = inlineStyleNonce
            actual["attributesToSettle"] = attributesToSettle
            actual["wsReconnectDelay"] = wsReconnectDelay
            actual["wsBinaryType"] = wsBinaryType
            actual["disableSelector"] = disableSelector
            actual["withCredentials"] = withCredentials
            actual["timeout"] = timeout
            actual["scrollBehavior"] = scrollBehavior
            actual["defaultFocusScroll"] = defaultFocusScroll
            actual["getCacheBusterParam"] = getCacheBusterParam
            actual["globalViewTransitions"] = globalViewTransitions
            actual["methodsThatUseUrlParams"] = methodsThatUseUrlParams
            actual["selfRequestsOnly"] = selfRequestsOnly
            actual["ignoreTitle"] = ignoreTitle
            actual["scrollIntoViewOnBoost"] = scrollIntoViewOnBoost
            actual["triggerSpecsCache"] = triggerSpecsCache
            actual["allowNestedOobSwaps"] = allowNestedOobSwaps
        }

        actual assertIsEqualTo expected
    }
}
