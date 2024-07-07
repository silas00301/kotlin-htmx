package brock.api.utils.htmx.descriptors.attributes

import brock.api.utils.htmx.descriptors.interfaces.HxDescriptor

class HxSelectOob : HxDescriptor("hx-select-oob") {

    fun select(strategy: HxSelectElement.() -> Unit) {
        val instance = HxSelectElement()
        instance.strategy()
        val text = instance.text.trimStart().trimEnd()
        + "$text,"
    }

    class HxSelectElement : HxDescriptor("hx-select-oob") {

        fun element(selector: String) {
            + selector
        }

        fun where(selector: Pair<String, String>): String {
            val (key, value) = selector
            return "[$key='$value']"
        }

        infix fun String.equalTo(selector: String) = Pair(this, selector)

        fun strategy(strategy: HxSwap.() -> Unit) {
            val instance = HxSwap()
            instance.strategy()
            val text = instance.text.trimStart().trimEnd()
            + ":$text"
        }
    }

}