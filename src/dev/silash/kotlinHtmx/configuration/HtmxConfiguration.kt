package dev.silash.kotlinHtmx.configuration

import dev.silash.kotlinHtmx.cssClasses.htmx.HtmxAdded
import dev.silash.kotlinHtmx.cssClasses.htmx.HtmxIndicator
import dev.silash.kotlinHtmx.cssClasses.htmx.HtmxRequest
import dev.silash.kotlinHtmx.cssClasses.htmx.HtmxSettling
import dev.silash.kotlinHtmx.cssClasses.htmx.HtmxSwapping
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.INNER_HTML
import dev.silash.kotlinHtmx.enums.ScrollBehavior
import dev.silash.kotlinHtmx.enums.ScrollBehavior.INSTANT
import dev.silash.kotlinHtmx.enums.WebSocketBinaryType
import dev.silash.kotlinHtmx.enums.WebSocketBinaryType.BLOB
import dev.silash.kotlinHtmx.enums.behaviorName
import dev.silash.kotlinHtmx.enums.styleName
import dev.silash.kotlinHtmx.enums.toHtmxEvent
import dev.silash.kotlinHtmx.enums.toScrollBehavior
import dev.silash.kotlinHtmx.enums.toWebSocketBinaryType
import dev.silash.kotlinHtmx.enums.typeName
import dev.silash.kotlinHtmx.utils.append
import dev.silash.kotlinHtmx.utils.prepend

class HtmxConfiguration {
    private val dataMap: MutableMap<String, String> = mutableMapOf()

    var historyEnabled: Boolean
        get() = dataMap["historyEnabled"]?.toBoolean() ?: true
        set(value) {
            dataMap["historyEnabled"] = value.toString()
        }

    var historyCacheSize: Int
        @Suppress("MagicNumber")
        get() = dataMap["historyCacheSize"]?.toInt() ?: 10
        set(value) {
            dataMap["historyCacheSize"] = value.toString()
        }

    var refreshOnHistoryMiss: Boolean
        get() = dataMap["refreshOnHistoryMiss"]?.toBoolean() ?: false
        set(value) {
            dataMap["refreshOnHistoryMiss"] = value.toString()
        }

    var defaultSwapStyle: HtmxSwapStyles
        get() = dataMap["defaultSwapStyle"]?.unwrapQuotes()?.toHtmxEvent() ?: INNER_HTML
        set(value) {
            dataMap["defaultSwapStyle"] = value.styleName.wrapQuotes()
        }

    var defaultSwapDelay: Int
        get() = dataMap["defaultSwapDelay"]?.toInt() ?: 0
        set(value) {
            dataMap["defaultSwapDelay"] = value.toString()
        }

    var defaultSwapSettleDelay: Int
        @Suppress("MagicNumber")
        get() = dataMap["defaultSwapSettleDelay"]?.toInt() ?: 20
        set(value) {
            dataMap["defaultSwapSettleDelay"] = value.toString()
        }

    var includeIndicationStyles: Boolean
        get() = dataMap["includeIndicationStyles"]?.toBoolean() ?: true
        set(value) {
            dataMap["includeIndicationStyles"] = value.toString()
        }

    var indicationClass: String
        get() = dataMap["indicationClass"]?.unwrapQuotes() ?: HtmxIndicator.className
        set(value) {
            dataMap["indicationClass"] = value.wrapQuotes()
        }

    var requestClass: String
        get() = dataMap["requestClass"]?.unwrapQuotes() ?: HtmxRequest.className
        set(value) {
            dataMap["requestClass"] = value.wrapQuotes()
        }

    var addedClass: String
        get() = dataMap["addedClass"]?.unwrapQuotes() ?: HtmxAdded.className
        set(value) {
            dataMap["addedClass"] = value.wrapQuotes()
        }

    var settlingClass: String
        get() = dataMap["settlingClass"]?.unwrapQuotes() ?: HtmxSettling.className
        set(value) {
            dataMap["settlingClass"] = value.wrapQuotes()
        }

    var swappingClass: String
        get() = dataMap["swappingClass"]?.unwrapQuotes() ?: HtmxSwapping.className
        set(value) {
            dataMap["swappingClass"] = value.wrapQuotes()
        }

    var allowEval: Boolean
        get() = dataMap["allowEval"]?.toBoolean() ?: true
        set(value) {
            dataMap["allowEval"] = value.toString()
        }

    var allowScriptTags: Boolean
        get() = dataMap["allowScriptTags"]?.toBoolean() ?: true
        set(value) {
            dataMap["allowScriptTags"] = value.toString()
        }

    var inlineScriptNonce: String
        get() = dataMap["inlineScriptNonce"]?.unwrapQuotes() ?: ""
        set(value) {
            dataMap["inlineScriptNonce"] = value.wrapQuotes()
        }

    var inlineStyleNonce: String
        get() = dataMap["inlineStyleNonce"]?.unwrapQuotes() ?: ""
        set(value) {
            dataMap["inlineStyleNonce"] = value.wrapQuotes()
        }

    var attributesToSettle: List<String>
        get() =
            dataMap["attributesToSettle"]?.toListOfStrings() ?: listOf(
                "class", "style", "width", "height",
            )
        set(value) {
            dataMap["attributesToSettle"] = value.toArrayString()
        }

    var wsReconnectDelay: String
        get() = dataMap["wsReconnectDelay"]?.unwrapQuotes() ?: "full-jitter"
        set(value) {
            dataMap["wsReconnectDelay"] = value.wrapQuotes()
        }

    var wsBinaryType: WebSocketBinaryType
        get() = dataMap["wsBinaryType"]?.unwrapQuotes()?.toWebSocketBinaryType() ?: BLOB
        set(value) {
            dataMap["wsBinaryType"] = value.typeName.wrapQuotes()
        }

    var disableSelector: List<String>
        get() = dataMap["disableSelector"]?.unwrapQuotes()?.split(", ") ?: listOf("[hx-disable]", "[data-hx-disable]")
        set(value) {
            dataMap["disableSelector"] = value.joinToString(", ").wrapQuotes()
        }

    var withCredentials: Boolean
        get() = dataMap["withCredentials"]?.toBoolean() ?: false
        set(value) {
            dataMap["withCredentials"] = value.toString()
        }

    var timeout: Int
        get() = dataMap["timeout"]?.toInt() ?: 0
        set(value) {
            dataMap["timeout"] = value.toString()
        }

    var scrollBehavior: ScrollBehavior
        get() = dataMap["scrollBehavior"]?.unwrapQuotes()?.toScrollBehavior() ?: INSTANT
        set(value) {
            dataMap["scrollBehavior"] = value.behaviorName.wrapQuotes()
        }

    var defaultFocusScroll: Boolean
        get() = dataMap["defaultFocusScroll"]?.toBoolean() ?: false
        set(value) {
            dataMap["defaultFocusScroll"] = value.toString()
        }

    var getCacheBusterParam: Boolean
        get() = dataMap["getCacheBusterParam"]?.toBoolean() ?: false
        set(value) {
            dataMap["getCacheBusterParam"] = value.toString()
        }

    var globalViewTransitions: Boolean
        get() = dataMap["globalViewTransitions"]?.toBoolean() ?: true
        set(value) {
            dataMap["globalViewTransitions"] = value.toString()
        }

    var methodsThatUseUrlParams: List<String>
        get() = dataMap["methodsThatUseUrlParams"]?.toListOfStrings() ?: listOf("get")
        set(value) {
            dataMap["methodsThatUseUrlParams"] = value.toArrayString()
        }

    var selfRequestsOnly: Boolean
        get() = dataMap["selfRequestsOnly"]?.toBoolean() ?: true
        set(value) {
            dataMap["selfRequestsOnly"] = value.toString()
        }

    var ignoreTitle: Boolean
        get() = dataMap["ignoreTitle"]?.toBoolean() ?: false
        set(value) {
            dataMap["ignoreTitle"] = value.toString()
        }

    var scrollIntoViewOnBoost: Boolean
        get() = dataMap["scrollIntoViewOnBoost"]?.toBoolean() ?: true
        set(value) {
            dataMap["scrollIntoViewOnBoost"] = value.toString()
        }

    var triggerSpecsCache: String
        get() = dataMap["triggerSpecsCache"]?.unwrapQuotes() ?: "null"
        set(value) {
            dataMap["triggerSpecsCache"] = value.wrapQuotes()
        }

    var allowNestedOobSwaps: Boolean
        get() = dataMap["allowNestedOobSwaps"]?.toBoolean() ?: true
        set(value) {
            dataMap["allowNestedOobSwaps"] = value.toString()
        }

    private fun List<String>.toArrayString() = joinToString(", ") { it.wrapQuotes() }.prepend("[").append("]")

    private fun String.toListOfStrings() = trim('[', ']').split(", ").map { it.unwrapQuotes() }

    private fun String.wrapQuotes() = "\"$this\""

    private fun String.unwrapQuotes() = drop(1).dropLast(1)

    fun toConfigString() =
        dataMap.entries
            .joinToString(", ") { (key, value) -> "\"$key\":$value" }
            .prepend("{")
            .append("}")
}
