package dev.silash.kotlinHtmx.enums

import dev.silash.testingUtils.assertContains
import kotlin.test.Test

class WebSocketBinaryTypeTest {
    @Test
    fun webSocketBinaryTypeTypeNameTest() {
        val entries = WebSocketBinaryType.entries.map { it.typeName }

        entries assertContains "blob"
        entries assertContains "arraybuffer"
    }

    @Test
    fun stringToWebSocketBinaryTypeTest() {
        val entries =
            listOf(
                "blob",
                "arraybuffer",
                "invalid",
            ).map { it.toWebSocketBinaryType() }

        entries assertContains WebSocketBinaryType.BLOB
        entries assertContains WebSocketBinaryType.ARRAY_BUFFER
        entries assertContains null
    }
}
