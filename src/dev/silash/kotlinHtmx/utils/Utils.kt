package dev.silash.kotlinHtmx.utils

import dev.silash.kotlinHtmx.attributes.HtmlAttribute

context(HtmlAttribute)
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

fun String.containsUpperCase() = any { it.isUpperCase() }

fun String.containsLowerCase() = any { it.isLowerCase() }
