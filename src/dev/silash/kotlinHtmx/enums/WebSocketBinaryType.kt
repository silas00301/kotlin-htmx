package dev.silash.kotlinHtmx.enums

import dev.silash.kotlinHtmx.enums.WebSocketBinaryType.ARRAY_BUFFER
import dev.silash.kotlinHtmx.enums.WebSocketBinaryType.BLOB

enum class WebSocketBinaryType {
    BLOB,
    ARRAY_BUFFER,
}

val WebSocketBinaryType.typeName
    get() =
        when (this) {
            BLOB -> "blob"
            ARRAY_BUFFER -> "arraybuffer"
        }

fun String.toWebSocketBinaryType(): WebSocketBinaryType? =
    when (this) {
        "blob" -> BLOB
        "arraybuffer" -> ARRAY_BUFFER
        else -> null
    }
