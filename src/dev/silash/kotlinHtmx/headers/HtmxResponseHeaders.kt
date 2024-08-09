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

class HtmxResponseHeaders(private val map: MutableMap<String, String> = mutableMapOf()) {
    var location: String?
        get() = map[LOCATION.headerName]
        set(value) {
            map[LOCATION.headerName] = value!!
        }

    var pushUrl: String?
        get() = map[PUSH_URL.headerName]
        set(value) {
            map[PUSH_URL.headerName] = value!!
        }

    var redirect: String?
        get() = map[REDIRECT.headerName]
        set(value) {
            map[REDIRECT.headerName] = value!!
        }

    var refresh: String?
        get() = map[REFRESH.headerName]
        set(value) {
            map[REFRESH.headerName] = value!!
        }

    var replaceUrl: String?
        get() = map[REPLACE_URL.headerName]
        set(value) {
            map[REPLACE_URL.headerName] = value!!
        }

    var reswap: String?
        get() = map[RESWAP.headerName]
        set(value) {
            map[RESWAP.headerName] = value!!
        }

    var retarget: String?
        get() = map[RETARGET.headerName]
        set(value) {
            map[RETARGET.headerName] = value!!
        }

    var reselect: String?
        get() = map[RESELECT.headerName]
        set(value) {
            map[RESELECT.headerName] = value!!
        }

    var trigger: String?
        get() = map[TRIGGER.headerName]
        set(value) {
            map[TRIGGER.headerName] = value!!
        }

    var triggerAfterSettle: String?
        get() = map[TRIGGER_AFTER_SETTLE.headerName]
        set(value) {
            map[TRIGGER_AFTER_SETTLE.headerName] = value!!
        }

    var triggerAfterSwap: String?
        get() = map[TRIGGER_AFTER_SWAP.headerName]
        set(value) {
            map[TRIGGER_AFTER_SWAP.headerName] = value!!
        }
}
