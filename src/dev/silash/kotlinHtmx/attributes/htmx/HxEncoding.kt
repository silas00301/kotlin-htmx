package dev.silash.kotlinHtmx.attributes.htmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute

class HxEncoding(option: HxEncodingOptions) : HtmlAttribute("hx-encoding", option.htmxName)

enum class HxEncodingOptions {
    MULTIPART_FORM_DATA,
}

val HxEncodingOptions.htmxName: String
    get() {
        when (this) {
            HxEncodingOptions.MULTIPART_FORM_DATA -> return "multipart/form-data"
        }
    }
