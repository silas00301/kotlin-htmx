package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxValsTest : AttributeBaseTest() {
    @Test
    fun valsTest() {
        val expected =
            buildString {
                append("{ ")
                append("key1: value1 ")
                append("} ")
                append("js:{ ")
                append("key1: value1 ")
                append("} , ")
                append("js:{ ")
                append("key1: value1 ")
                append("}")
            }

        htmxMethods.vals {
            normal { add("key1", "value1") }
            js { add("key1", "value1") }
            +","
            javaScript { add("key1", "value1") }
        }

        assertAttribute("hx-vals", expected)
    }
}
