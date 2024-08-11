package dev.silash.kotlinHtmx.enums

import dev.silash.testingUtils.assertContains
import kotlin.test.Test

class ScrollBehaviorTest {
    @Test
    fun scrollBehaviorBehaviorNameTest() {
        val entries = ScrollBehavior.entries.map { it.behaviorName }

        entries assertContains "auto"
        entries assertContains "instant"
        entries assertContains "smooth"
    }

    @Test
    fun stringToScrollBehaviorTest() {
        val entries =
            listOf(
                "auto",
                "instant",
                "smooth",
                "invalid",
            ).map { it.toScrollBehavior() }

        entries assertContains ScrollBehavior.AUTO
        entries assertContains ScrollBehavior.INSTANT
        entries assertContains ScrollBehavior.SMOOTH
        entries assertContains null
    }
}
