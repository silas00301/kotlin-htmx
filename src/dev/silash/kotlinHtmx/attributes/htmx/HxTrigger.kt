package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import kotlin.time.Duration

class HxTrigger : HtmlAttribute("hx-trigger") {
    fun event(event: HxTriggerEvent.() -> Unit) =
        HxTriggerEvent().apply(event).attributeText.let {
            +"${it.trimEnd()},"
        }

    fun every(timing: Duration) = +"every ${timing.inWholeMilliseconds}ms,"

    class HxTriggerEvent : HtmlAttribute("hx-trigger") {
        fun click() = +"click"

        fun filter(filterExpression: String) = +"[$filterExpression]"

        fun modifiers(eventModifiers: EventModifiers.() -> Unit) =
            EventModifiers().apply(eventModifiers).attributeText.let {
                +it.trimEnd()
            }

        @Suppress("TooManyFunctions")
        class EventModifiers : HtmlAttribute("hx-trigger") {
            fun once() = +"once"

            fun changed() = +"changed"

            fun delay(timing: Duration) = +"delay:${timing.inWholeMilliseconds}ms"

            fun throttle(timing: Duration) = +"throttle:${timing.inWholeMilliseconds}ms"

            fun from(from: HxTarget.() -> Unit) =
                HxTarget().apply(from).attributeText.let {
                    +"from:${it.trim()}"
                }

            fun target(target: HxTarget.() -> Unit) =
                HxTarget().apply(target).attributeText.let {
                    +"target:${it.trim()}"
                }

            fun consume() = +"consume"

            fun queue(method: QueueOptions) = +"queue:${method.name.lowercase()}"

            enum class QueueOptions {
                FIRST,
                LAST,
                ALL,
                NONE,
            }

            fun load() = +"load"

            fun revealed() = +"revealed"

            fun intersect() = +"intersect"

            fun intersect(options: IntersectOptions.() -> Unit) =
                IntersectOptions().apply(options).attributeText.let {
                    +"intersect ${it.trim()}"
                }

            class IntersectOptions : HtmlAttribute("hx-trigger") {
                fun root(root: HxTarget.() -> Unit) =
                    HxTarget().apply(root).attributeText.let {
                        +"root:${it.trim()}"
                    }

                fun threshold(threshold: Double) =
                    require(threshold in 0.0..1.0) {
                        "Threshold must be between 0.0 and 1.0"
                    }.also {
                        +"threshold:$threshold"
                    }

                fun once() = +"once"
            }
        }
    }
}

fun HtmxHtmlAttributes.trigger(lambda: HxTrigger.() -> Unit) = addEntry(HxTrigger(), lambda)
