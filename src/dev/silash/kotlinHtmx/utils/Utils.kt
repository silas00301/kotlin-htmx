package dev.silash.kotlinHtmx.utils

import dev.silash.kotlinHtmx.descriptors.HxDescriptor

context(HxDescriptor)
fun generateWhereSelector(selector: String): String {
    require(
        selector.count {
            it == '='
        } == 1,
    ) {
        "Selector must be in the form \"key='value'\""
    }
    return "[$selector]"
}
