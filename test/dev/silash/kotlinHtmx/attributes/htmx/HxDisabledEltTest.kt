package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxDisabledEltTest : AttributeBaseTest() {
    @Test
    fun disabledEltTest() {
        val expected =
            buildString {
                append("this ")
                append("closest div ")
                append("find span ")
                append("next ")
                append("next div ")
                append("previous ")
                append("previous div ")
                append("[id='example'] ")
                append("[id='example']")
            }

        htmxMethods.disabledElt {
            `this`()
            closest("div")
            find("span")
            next()
            next("div")
            previous()
            previous("div")
            where("id" to "example")
            where("id='example'")
        }

        assertAttribute("hx-disabled-elt", expected)
    }
}
