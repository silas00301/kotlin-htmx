package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.htmx.HxTrigger.HxTriggerEvent.EventModifiers.QueueOptions.ALL
import dev.silash.kotlinHtmx.attributes.htmx.HxTrigger.HxTriggerEvent.EventModifiers.QueueOptions.FIRST
import dev.silash.kotlinHtmx.attributes.htmx.HxTrigger.HxTriggerEvent.EventModifiers.QueueOptions.LAST
import dev.silash.kotlinHtmx.attributes.htmx.HxTrigger.HxTriggerEvent.EventModifiers.QueueOptions.NONE
import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

class HxTriggerTest : AttributeBaseTest() {
    @Test
    fun triggerTest() {
        val expected =
            buildString {
                append("click ")
                append("[test] ")
                append("once ")
                append("changed ")
                append("delay:1000ms ")
                append("throttle:1000ms ")
                append("from:this ")
                append("target:this ")
                append("consume ")
                append("queue:first ")
                append("queue:last ")
                append("queue:all ")
                append("queue:none ")
                append("load ")
                append("revealed ")
                append("intersect ")
                append("intersect root:this ")
                append("threshold:0.5 ")
                append("once, ")
                append("every 1000ms")
            }

        htmxHtmlAttributes.trigger {
            event {
                click()
                filter("test")
                modifiers {
                    once()
                    changed()
                    delay(1000.milliseconds)
                    throttle(1.seconds)
                    from { `this`() }
                    target { `this`() }
                    consume()
                    queue(FIRST)
                    queue(LAST)
                    queue(ALL)
                    queue(NONE)
                    load()
                    revealed()
                    intersect()
                    intersect {
                        root { `this`() }
                        threshold(0.5)
                        once()
                    }
                }
            }
            every(1.seconds)
        }

        assertAttribute("hx-trigger", expected)
    }

    @Test
    fun `threshold should throw IllegalArgumentException if value not between 0 and 1`() {
        assertFailsWith<IllegalArgumentException>(
            message = "Threshold must be between 0 and 1",
        ) {
            htmxHtmlAttributes.trigger {
                event {
                    modifiers {
                        intersect {
                            threshold(1.5)
                        }
                    }
                }
            }
        }
    }
}
