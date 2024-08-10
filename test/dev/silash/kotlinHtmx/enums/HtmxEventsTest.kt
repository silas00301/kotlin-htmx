package dev.silash.kotlinHtmx.enums

import dev.silash.testingUtils.assertContains
import kotlin.test.Test

class HtmxEventsTest {
    @Test
    fun htmxEventsEventNameTest() {
        val entries = HtmxEvents.entries.map { it.eventName }
        entries assertContains "htmx:abort"
        entries assertContains "htmx:afterOnLoad"
        entries assertContains "htmx:afterProcessNode"
        entries assertContains "htmx:afterRequest"
        entries assertContains "htmx:afterSettle"
        entries assertContains "htmx:afterSwap"
        entries assertContains "htmx:beforeCleanupElement"
        entries assertContains "htmx:beforeOnLoad"
        entries assertContains "htmx:beforeProcessNode"
        entries assertContains "htmx:beforeRequest"
        entries assertContains "htmx:beforeSwap"
        entries assertContains "htmx:beforeSend"
        entries assertContains "htmx:configRequest"
        entries assertContains "htmx:confirm"
        entries assertContains "htmx:historyCacheError"
        entries assertContains "htmx:historyCacheMiss"
        entries assertContains "htmx:historyCacheMissError"
        entries assertContains "htmx:historyCacheMissLoad"
        entries assertContains "htmx:historyRestore"
        entries assertContains "htmx:beforeHistorySave"
        entries assertContains "htmx:load"
        entries assertContains "htmx:noSseSourceError"
        entries assertContains "htmx:onLoadError"
        entries assertContains "htmx:oobAfterSwap"
        entries assertContains "htmx:oobBeforeSwap"
        entries assertContains "htmx:oobErrorNoTarget"
        entries assertContains "htmx:prompt"
        entries assertContains "htmx:pushedIntoHistory"
        entries assertContains "htmx:responseError"
        entries assertContains "htmx:sendError"
        entries assertContains "htmx:sseError"
        entries assertContains "htmx:sseOpen"
        entries assertContains "htmx:swapError"
        entries assertContains "htmx:targetError"
        entries assertContains "htmx:timeout"
        entries assertContains "htmx:validationValidate"
        entries assertContains "htmx:validationFailed"
        entries assertContains "htmx:validationHalted"
        entries assertContains "htmx:xhrAbort"
        entries assertContains "htmx:xhrLoadend"
        entries assertContains "htmx:xhrLoadstart"
        entries assertContains "htmx:xhrProgress"
    }
}
