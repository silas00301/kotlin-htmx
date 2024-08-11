package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.htmx.HxSwap.HxScrollDirection
import dev.silash.kotlinHtmx.attributes.htmx.HxSwap.HxShowDirection
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.AFTER_BEGIN
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.AFTER_END
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.BEFORE_BEGIN
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.BEFORE_END
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.DELETE
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.INNER_HTML
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.NONE
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.OUTER_HTML
import dev.silash.kotlinHtmx.enums.HtmxSwapStyles.TEXT_CONTENT
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
            style(INNER_HTML)
            style(OUTER_HTML)
            style(TEXT_CONTENT)
            style(BEFORE_BEGIN)
            style(AFTER_BEGIN)
            style(BEFORE_END)
            style(AFTER_END)
            style(DELETE)
            style(NONE)
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
