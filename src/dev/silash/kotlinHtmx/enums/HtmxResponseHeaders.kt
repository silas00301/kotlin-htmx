package dev.silash.kotlinHtmx.enums

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

enum class HtmxResponseHeaders {
    LOCATION,
    PUSH_URL,
    REDIRECT,
    REFRESH,
    REPLACE_URL,
    RESWAP,
    RETARGET,
    RESELECT,
    TRIGGER,
    TRIGGER_AFTER_SETTLE,
    TRIGGER_AFTER_SWAP,
}

val HtmxResponseHeaders.headerName
    get() =
        when (this) {
            LOCATION -> "HX-Location"
            PUSH_URL -> "HX-Push-Url"
            REDIRECT -> "HX-Redirect"
            REFRESH -> "HX-Refresh"
            REPLACE_URL -> "HX-Replace-Url"
            RESWAP -> "HX-Reswap"
            RETARGET -> "HX-Retarget"
            RESELECT -> "HX-Reselect"
            TRIGGER -> "HX-Trigger"
            TRIGGER_AFTER_SETTLE -> "HX-Trigger-After-Settle"
            TRIGGER_AFTER_SWAP -> "HX-Trigger-After-Swap"
        }
