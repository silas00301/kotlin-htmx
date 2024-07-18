package dev.silash.testingUtils

import kotlin.test.assertContains
import kotlin.test.assertEquals

infix fun Any?.assertIsEqualTo(expected: Any?) {
    assertEquals(expected, this)
}

fun <T> Iterable<T>.assertContains(expected: T?) {
    assertContains(this, expected)
}
