package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxEncoding(val option: HxEncodingOptions) : HxDescriptor("hx-encoding") {

    init {
        + option.htmxName
    }

}

enum class HxEncodingOptions {
    MULTIPART_FORM_DATA,
}

val HxEncodingOptions.htmxName: String
    get() {
        when(this) {
            HxEncodingOptions.MULTIPART_FORM_DATA -> return "multipart/form-data"
        }
    }