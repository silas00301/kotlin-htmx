package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.HtmxHtmlAttributes
import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.htmx.HxEncodingOptions.MULTIPART_FORM_DATA

class HxEncoding(option: HxEncodingOptions) : HtmlAttribute("hx-encoding", option.htmxName)

enum class HxEncodingOptions {
    MULTIPART_FORM_DATA,
}

val HxEncodingOptions.htmxName: String
    get() {
        when (this) {
            MULTIPART_FORM_DATA -> return "multipart/form-data"
        }
    }

fun HtmxHtmlAttributes.encoding(encoding: HxEncodingOptions = MULTIPART_FORM_DATA) = addEntry(HxEncoding(encoding))
