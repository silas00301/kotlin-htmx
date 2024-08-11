package dev.silash.kotlinHtmx.enums

import dev.silash.testingUtils.assertContains
import kotlin.test.Test

class HtmxSwapStylesTest {
    @Test
    fun htmxSwapStylesStyleNameTest() {
        val entries = HtmxSwapStyles.entries.map { it.styleName }

        entries assertContains "innerHTML"
        entries assertContains "outerHTML"
        entries assertContains "textContent"
        entries assertContains "beforebegin"
        entries assertContains "afterbegin"
        entries assertContains "beforeend"
        entries assertContains "afterend"
        entries assertContains "delete"
        entries assertContains "none"
    }

    @Test
    fun stringToHtmxEventTest() {
        val entries =
            listOf(
                "innerHTML",
                "outerHTML",
                "textContent",
                "beforebegin",
                "afterbegin",
                "beforeend",
                "afterend",
                "delete",
                "none",
                "invalid",
            ).map { it.toHtmxEvent() }

        entries assertContains HtmxSwapStyles.INNER_HTML
        entries assertContains HtmxSwapStyles.OUTER_HTML
        entries assertContains HtmxSwapStyles.TEXT_CONTENT
        entries assertContains HtmxSwapStyles.BEFORE_BEGIN
        entries assertContains HtmxSwapStyles.AFTER_BEGIN
        entries assertContains HtmxSwapStyles.BEFORE_END
        entries assertContains HtmxSwapStyles.AFTER_END
        entries assertContains HtmxSwapStyles.DELETE
        entries assertContains HtmxSwapStyles.NONE
        entries assertContains null
    }
}
