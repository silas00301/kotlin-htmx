package dev.silash.kotlinHtmx.attributes

abstract class HtmlAttribute(var attributeName: String, var attributeText: String = "") {
    operator fun String.unaryPlus() {
        val toAppend = this.trimStart()
        attributeText +=
            when {
                attributeText.endsWith(" ") -> toAppend
                attributeText.endsWith(":") -> toAppend
                attributeText == "" -> toAppend
                this.startsWith(":") -> toAppend
                else -> " $toAppend"
            }
    }
}
