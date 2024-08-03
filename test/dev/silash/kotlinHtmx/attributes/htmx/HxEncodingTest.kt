package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.htmx.HxEncodingOptions.MULTIPART_FORM_DATA
import dev.silash.testingUtils.AttributeBaseTest
import kotlin.test.Test

class HxEncodingTest : AttributeBaseTest() {
    @Test
    fun encodingTest() {
        htmxMethods.encoding(MULTIPART_FORM_DATA)

        assertAttribute("hx-encoding", "multipart/form-data")
    }
}
