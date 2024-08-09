package dev.silash.testingUtils

import kotlin.test.AfterTest

abstract class HeaderBaseTest<T1 : Any, V1, V2, T2 : MutableMap<V1, V2>> {
    lateinit var cut: T1
    lateinit var map: T2

    @AfterTest
    fun cleanup() {
        map.clear()
    }

    fun testHeaderGetter(
        header: V1,
        expected: V2,
        function: T1.() -> V2?,
    ) = map.apply { this[header] = expected }.also { cut.function() }.let { it[header] assertIsEqualTo expected }
}
