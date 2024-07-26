package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import kotlin.time.Duration

class HxTrigger : HtmlAttribute("hx-trigger") {
    fun event(event: HxTriggerEvent.() -> Unit) {
        val hxTriggerEventClass = HxTriggerEvent()
        hxTriggerEventClass.event()
        val text = hxTriggerEventClass.attributeText.trimEnd()
        +"$text,"
    }

    fun every(timing: Duration) {
        +"every ${timing.inWholeMilliseconds}ms,"
    }

    class HxTriggerEvent : HtmlAttribute("hx-trigger") {
        fun click() {
            +"click"
        }

        fun filter(filterExpression: String) {
            +"[$filterExpression]"
        }

        fun modifiers(eventModifiers: EventModifiers.() -> Unit) {
            val eventModifiersClass = EventModifiers()
            eventModifiersClass.eventModifiers()
            val text = eventModifiersClass.attributeText.trimEnd()
            +text
        }

        @Suppress("TooManyFunctions")
        class EventModifiers : HtmlAttribute("hx-trigger") {
            fun once() {
                +"once"
            }

            fun changed() {
                +"changed"
            }

            fun delay(timing: Duration) {
                +"delay:${timing.inWholeMilliseconds}ms"
            }

            fun throttle(timing: Duration) {
                +"throttle:${timing.inWholeMilliseconds}ms"
            }

            fun from(from: HxTarget.() -> Unit) {
                val hxTargetClass = HxTarget()
                hxTargetClass.from()
                val text = hxTargetClass.attributeText.trimStart().trimEnd()
                +"from:$text"
            }

            fun target(target: HxTarget.() -> Unit) {
                val hxTargetClass = HxTarget()
                hxTargetClass.target()
                val text = hxTargetClass.attributeText.trimStart().trimEnd()
                +"target:$text"
            }

            fun consume() {
                +"consume"
            }

            fun queue(method: QueueOptions) {
                val methodName = method.name.lowercase()
                +"queue:$methodName"
            }

            enum class QueueOptions {
                FIRST,
                LAST,
                ALL,
                NONE,
            }

            fun load() {
                +"load"
            }

            fun revealed() {
                +"revealed"
            }

            fun intersect() {
                +"intersect"
            }

            fun intersect(options: IntersectOptions.() -> Unit) {
                val intersectOptions =
                    IntersectOptions()
                intersectOptions.options()
                val text = intersectOptions.attributeText.trimStart().trimEnd()
                +"intersect $text"
            }

            class IntersectOptions : HtmlAttribute("hx-trigger") {
                fun root(root: HxTarget.() -> Unit) {
                    val hxTargetClass = HxTarget()
                    hxTargetClass.root()
                    val text = hxTargetClass.attributeText.trimStart().trimEnd()
                    +"root:$text"
                }

                fun threshold(threshold: Double) {
                    require(threshold in 0.0..1.0) {
                        "Threshold must be between 0.0 and 1.0"
                    }
                    +"threshold:$threshold"
                }

                fun once() {
                    +"once"
                }
            }
        }
    }
}
