package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxTrigger : HxDescriptor("hx-trigger") {

    fun event(event: HxTriggerEvent.() -> Unit) {
        val hxTriggerEventClass = HxTriggerEvent()
        hxTriggerEventClass.event()
        val text = hxTriggerEventClass.text.trimEnd()
        + "$text,"
    }

    fun every(timing: String) {
        + "every $timing,"
    }

    class HxTriggerEvent : HxDescriptor("hx-trigger") {

        fun click() {
            + "click"
        }

        fun filter(filterExpression: String) {
            + "[$filterExpression]"
        }

        fun modifiers(eventModifiers: EventModifiers.() -> Unit) {
            val eventModifiersClass = EventModifiers()
            eventModifiersClass.eventModifiers()
            val text = eventModifiersClass.text.trimEnd()
            + text
        }

        class EventModifiers : HxDescriptor("hx-trigger") {

            fun once() {
                + "once"
            }

            fun changed() {
                + "changed"
            }

            fun delay(delay: String) {
                + "delay:$delay"
            }

            fun throttle(throttle: String) {
                + "throttle:$throttle"
            }

            fun from(from: HxTarget.() -> Unit) {
                val hxTargetClass = HxTarget()
                hxTargetClass.from()
                val text = hxTargetClass.text.trimStart().trimEnd()
                + "from:$text"
            }

            fun target(target: HxTarget.() -> Unit) {
                val hxTargetClass = HxTarget()
                hxTargetClass.target()
                val text = hxTargetClass.text.trimStart().trimEnd()
                + "target:$text"
            }

            fun consume() {
                + "consume"
            }

            fun queue(method: QueueOptions? = null) {
                val methodName = method?.name?.lowercase()
                + "queue:$methodName"
            }

            enum class QueueOptions {
                FIRST,
                LAST,
                ALL,
                NONE
            }

            fun load() {
                + "load"
            }

            fun revealed() {
                + "revealed"
            }

            fun intersect() {
                + "intersect"
            }

            fun intersect(options: IntersectOptions.() -> Unit) {
                val intersectOptions = IntersectOptions()
                intersectOptions.options()
                val text = intersectOptions.text.trimStart().trimEnd()
                + "intersect $text"
            }

            class IntersectOptions : HxDescriptor("hx-trigger") {

                fun root(root: HxTarget.() -> Unit) {
                    val hxTargetClass = HxTarget()
                    hxTargetClass.root()
                    val text = hxTargetClass.text.trimStart().trimEnd()
                    + "root:$text"
                }

                fun threshold(threshold: String) {
                    + "threshold:$threshold"
                }

                fun once() {
                    + "once"
                }
            }

        }

    }


}