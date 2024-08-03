package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxParamsTest : AttributeBaseTest() {
    @Test
    fun paramsTest() {
        val expected =
            buildString {
                append("* ")
                append("none ")
                append("not this,closest,div,find,span,next,next div,previous,previous div ")
                append("this,closest,div,find,next,next div,previous,previous div,[id='example']")
            }

        htmxMethods.params {
            all()
            none()
            except("this", "closest", "div", "find", "span", "next", "next div", "previous", "previous div")
            only("this", "closest", "div", "find", "next", "next div", "previous", "previous div", "[id='example']")
        }

        assertAttribute("hx-params", expected)
    }
}
