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

class HtmxRequestHeaders(private val map: Map<String, String> = mapOf()) {
    val boosted: String?
        get() = map[BOOSTED.headerName]

    val currentUrl: String?
        get() = map[CURRENT_URL.headerName]

    val historyRestoreRequest: String?
        get() = map[HISTORY_RESTORE_REQUEST.headerName]

    val prompt: String?
        get() = map[PROMPT.headerName]

    val request: String?
        get() = map[REQUEST.headerName]

    val target: String?
        get() = map[TARGET.headerName]

    val triggerName: String?
        get() = map[TRIGGER_NAME.headerName]

    val trigger: String?
        get() = map[TRIGGER.headerName]
}
