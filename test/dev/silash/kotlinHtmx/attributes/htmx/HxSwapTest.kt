package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.htmx.HxSwap.HxScrollDirection
import dev.silash.kotlinHtmx.attributes.htmx.HxSwap.HxShowDirection
import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

class HxSwapTest : AttributeBaseTest() {
    @Test
    fun swapTest() {
        val expected =
            buildString {
                append("innerHTML ")
                append("outerHTML ")
                append("textContent ")
                append("beforebegin ")
                append("afterbegin ")
                append("beforeend ")
                append("afterend ")
                append("delete ")
                append("none ")
                append("swap:1000ms ")
                append("settle:1ms ")
                append("ignoreTitle ")
                append("scroll:top ")
                append("show:top:div ")
                append("show:bottom ")
                append("focus-show:true")
            }

        htmxHtmlAttributes.swap {
            innerHtml()
            outerHtml()
            textContent()
            beforeBegin()
            afterBegin()
            beforeEnd()
            afterEnd()
            delete()
            none()
            swap(1.seconds)
            settle(1.milliseconds)
            ignoreTitle()
            scroll(HxScrollDirection.TOP)
            show("div", HxShowDirection.TOP)
            show(direction = HxShowDirection.BOTTOM)
            focusShow(true)
        }

        assertAttribute("hx-swap", expected)
    }
}
