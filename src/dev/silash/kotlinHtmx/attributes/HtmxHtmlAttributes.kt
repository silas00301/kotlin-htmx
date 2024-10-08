package dev.silash.kotlinHtmx.attributes

class HtmxHtmlAttributes(val map: MutableMap<String, String>) {
    inline fun <T : HtmlAttribute> addEntry(
        instance: T,
        lambda: T.() -> Unit = {},
    ) {
        val key = instance.attributeName
        instance.lambda()
        val text = instance.attributeText.trimStart().trimEnd(' ', ',')
        map[key] = text
    }
}
