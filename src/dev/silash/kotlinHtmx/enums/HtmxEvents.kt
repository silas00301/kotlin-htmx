package dev.silash.kotlinHtmx.enums

import dev.silash.kotlinHtmx.enums.HtmxEvents.ABORT
import dev.silash.kotlinHtmx.enums.HtmxEvents.AFTER_ON_LOAD
import dev.silash.kotlinHtmx.enums.HtmxEvents.AFTER_PROCESS_NODE
import dev.silash.kotlinHtmx.enums.HtmxEvents.AFTER_REQUEST
import dev.silash.kotlinHtmx.enums.HtmxEvents.AFTER_SETTLE
import dev.silash.kotlinHtmx.enums.HtmxEvents.AFTER_SWAP
import dev.silash.kotlinHtmx.enums.HtmxEvents.BEFORE_CLEANUP_ELEMENT
import dev.silash.kotlinHtmx.enums.HtmxEvents.BEFORE_HISTORY_SAVE
import dev.silash.kotlinHtmx.enums.HtmxEvents.BEFORE_ON_LOAD
import dev.silash.kotlinHtmx.enums.HtmxEvents.BEFORE_PROCESS_NODE
import dev.silash.kotlinHtmx.enums.HtmxEvents.BEFORE_REQUEST
import dev.silash.kotlinHtmx.enums.HtmxEvents.BEFORE_SEND
import dev.silash.kotlinHtmx.enums.HtmxEvents.BEFORE_SWAP
import dev.silash.kotlinHtmx.enums.HtmxEvents.CONFIG_REQUEST
import dev.silash.kotlinHtmx.enums.HtmxEvents.CONFIRM
import dev.silash.kotlinHtmx.enums.HtmxEvents.HISTORY_CACHE_ERROR
import dev.silash.kotlinHtmx.enums.HtmxEvents.HISTORY_CACHE_MISS
import dev.silash.kotlinHtmx.enums.HtmxEvents.HISTORY_CACHE_MISS_ERROR
import dev.silash.kotlinHtmx.enums.HtmxEvents.HISTORY_CACHE_MISS_LOAD
import dev.silash.kotlinHtmx.enums.HtmxEvents.HISTORY_RESTORE
import dev.silash.kotlinHtmx.enums.HtmxEvents.LOAD
import dev.silash.kotlinHtmx.enums.HtmxEvents.NO_SSE_SOURCE_ERROR
import dev.silash.kotlinHtmx.enums.HtmxEvents.ON_LOAD_ERROR
import dev.silash.kotlinHtmx.enums.HtmxEvents.OOB_AFTER_SWAP
import dev.silash.kotlinHtmx.enums.HtmxEvents.OOB_BEFORE_SWAP
import dev.silash.kotlinHtmx.enums.HtmxEvents.OOB_ERROR_NO_TARGET
import dev.silash.kotlinHtmx.enums.HtmxEvents.PROMPT
import dev.silash.kotlinHtmx.enums.HtmxEvents.PUSHED_INTO_HISTORY
import dev.silash.kotlinHtmx.enums.HtmxEvents.RESPONSE_ERROR
import dev.silash.kotlinHtmx.enums.HtmxEvents.SEND_ERROR
import dev.silash.kotlinHtmx.enums.HtmxEvents.SSE_ERROR
import dev.silash.kotlinHtmx.enums.HtmxEvents.SSE_OPEN
import dev.silash.kotlinHtmx.enums.HtmxEvents.SWAP_ERROR
import dev.silash.kotlinHtmx.enums.HtmxEvents.TARGET_ERROR
import dev.silash.kotlinHtmx.enums.HtmxEvents.TIMEOUT
import dev.silash.kotlinHtmx.enums.HtmxEvents.VALIDATION_FAILED
import dev.silash.kotlinHtmx.enums.HtmxEvents.VALIDATION_HALTED
import dev.silash.kotlinHtmx.enums.HtmxEvents.VALIDATION_VALIDATE
import dev.silash.kotlinHtmx.enums.HtmxEvents.XHR_ABORT
import dev.silash.kotlinHtmx.enums.HtmxEvents.XHR_LOADEND
import dev.silash.kotlinHtmx.enums.HtmxEvents.XHR_LOADSTART
import dev.silash.kotlinHtmx.enums.HtmxEvents.XHR_PROGRESS

enum class HtmxEvents {
    ABORT,
    AFTER_ON_LOAD,
    AFTER_PROCESS_NODE,
    AFTER_REQUEST,
    AFTER_SETTLE,
    AFTER_SWAP,
    BEFORE_CLEANUP_ELEMENT,
    BEFORE_ON_LOAD,
    BEFORE_PROCESS_NODE,
    BEFORE_REQUEST,
    BEFORE_SWAP,
    BEFORE_SEND,
    CONFIG_REQUEST,
    CONFIRM,
    HISTORY_CACHE_ERROR,
    HISTORY_CACHE_MISS,
    HISTORY_CACHE_MISS_ERROR,
    HISTORY_CACHE_MISS_LOAD,
    HISTORY_RESTORE,
    BEFORE_HISTORY_SAVE,
    LOAD,
    NO_SSE_SOURCE_ERROR,
    ON_LOAD_ERROR,
    OOB_AFTER_SWAP,
    OOB_BEFORE_SWAP,
    OOB_ERROR_NO_TARGET,
    PROMPT,
    PUSHED_INTO_HISTORY,
    RESPONSE_ERROR,
    SEND_ERROR,
    SSE_ERROR,
    SSE_OPEN,
    SWAP_ERROR,
    TARGET_ERROR,
    TIMEOUT,
    VALIDATION_VALIDATE,
    VALIDATION_FAILED,
    VALIDATION_HALTED,
    XHR_ABORT,
    XHR_LOADEND,
    XHR_LOADSTART,
    XHR_PROGRESS,
}

val HtmxEvents.eventName
    get() =
        when (this) {
            ABORT -> "htmx:abort"
            AFTER_ON_LOAD -> "htmx:afterOnLoad"
            AFTER_PROCESS_NODE -> "htmx:afterProcessNode"
            AFTER_REQUEST -> "htmx:afterRequest"
            AFTER_SETTLE -> "htmx:afterSettle"
            AFTER_SWAP -> "htmx:afterSwap"
            BEFORE_CLEANUP_ELEMENT -> "htmx:beforeCleanupElement"
            BEFORE_ON_LOAD -> "htmx:beforeOnLoad"
            BEFORE_PROCESS_NODE -> "htmx:beforeProcessNode"
            BEFORE_REQUEST -> "htmx:beforeRequest"
            BEFORE_SWAP -> "htmx:beforeSwap"
            BEFORE_SEND -> "htmx:beforeSend"
            CONFIG_REQUEST -> "htmx:configRequest"
            CONFIRM -> "htmx:confirm"
            HISTORY_CACHE_ERROR -> "htmx:historyCacheError"
            HISTORY_CACHE_MISS -> "htmx:historyCacheMiss"
            HISTORY_CACHE_MISS_ERROR -> "htmx:historyCacheMissError"
            HISTORY_CACHE_MISS_LOAD -> "htmx:historyCacheMissLoad"
            HISTORY_RESTORE -> "htmx:historyRestore"
            BEFORE_HISTORY_SAVE -> "htmx:beforeHistorySave"
            LOAD -> "htmx:load"
            NO_SSE_SOURCE_ERROR -> "htmx:noSseSourceError"
            ON_LOAD_ERROR -> "htmx:onLoadError"
            OOB_AFTER_SWAP -> "htmx:oobAfterSwap"
            OOB_BEFORE_SWAP -> "htmx:oobBeforeSwap"
            OOB_ERROR_NO_TARGET -> "htmx:oobErrorNoTarget"
            PROMPT -> "htmx:prompt"
            PUSHED_INTO_HISTORY -> "htmx:pushedIntoHistory"
            RESPONSE_ERROR -> "htmx:responseError"
            SEND_ERROR -> "htmx:sendError"
            SSE_ERROR -> "htmx:sseError"
            SSE_OPEN -> "htmx:sseOpen"
            SWAP_ERROR -> "htmx:swapError"
            TARGET_ERROR -> "htmx:targetError"
            TIMEOUT -> "htmx:timeout"
            VALIDATION_VALIDATE -> "htmx:validationValidate"
            VALIDATION_FAILED -> "htmx:validationFailed"
            VALIDATION_HALTED -> "htmx:validationHalted"
            XHR_ABORT -> "htmx:xhrAbort"
            XHR_LOADEND -> "htmx:xhrLoadend"
            XHR_LOADSTART -> "htmx:xhrLoadstart"
            XHR_PROGRESS -> "htmx:xhrProgress"
        }
