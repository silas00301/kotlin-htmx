package brock.api.utils.htmx.descriptors.interfaces

abstract class HxDescriptor(var attributeName: String) {

    var text: String = ""

    operator fun String.unaryPlus() {
        val toAppend = this.trimStart()
        text += when {
            text.endsWith(" ") -> toAppend
            text.endsWith(":") -> toAppend
            text == "" -> toAppend
            this.startsWith(":") -> toAppend
            else -> " $toAppend"
        }
    }

}