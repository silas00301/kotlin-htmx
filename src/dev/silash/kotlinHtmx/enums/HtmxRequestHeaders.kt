package dev.silash.kotlinHtmx.enums

import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.BOOSTED
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.CURRENT_URL
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.HISTORY_RESTORE_REQUEST
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.PROMPT
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.REQUEST
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.TARGET
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.TRIGGER
import dev.silash.kotlinHtmx.enums.HtmxRequestHeaders.TRIGGER_NAME

enum class HtmxRequestHeaders {
    BOOSTED,
    CURRENT_URL,
    HISTORY_RESTORE_REQUEST,
    PROMPT,
    REQUEST,
    TARGET,
    TRIGGER_NAME,
    TRIGGER,
}

val HtmxRequestHeaders.headerName
    get() =
        when (this) {
            BOOSTED -> "HX-Boosted"
            CURRENT_URL -> "HX-Current-Url"
            HISTORY_RESTORE_REQUEST -> "HX-History-Restore-Request"
            PROMPT -> "HX-Prompt"
            REQUEST -> "HX-Request"
            TARGET -> "HX-Target"
            TRIGGER_NAME -> "HX-Trigger-Name"
            TRIGGER -> "HX-Trigger"
        }
