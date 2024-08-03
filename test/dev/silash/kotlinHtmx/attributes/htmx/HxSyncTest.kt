package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxSyncTest : AttributeBaseTest() {
    @Test
    fun syncTest() {
        val expected =
            buildString {
                append("this ")
                append("closest ")
                append("div:drop ")
                append("abort ")
                append("replace ")
                append("queue first ")
                append("queue last ")
                append("queue all")
            }

        htmxHtmlAttributes.sync {
            target {
                `this`()
                closest("div")
            }
            drop()
            abort()
            replace()
            queue(HxSync.QueueMethods.FIRST)
            queue(HxSync.QueueMethods.LAST)
            queue(HxSync.QueueMethods.ALL)
        }

        assertAttribute("hx-sync", expected)
    }
}
