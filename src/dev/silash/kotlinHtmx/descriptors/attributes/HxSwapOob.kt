package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.interfaces.HxDescriptor

class HxSwapOob : HxDescriptor("hx-swap-oob") {
    fun trueSwap() {
        +"true"
    }

    fun swap(swap: HxSwapElement.() -> Unit) {
        val swapElement = HxSwapElement()
        swapElement.swap()
        +swapElement.text
    }

    class HxSwapElement : HxDescriptor("hx-swap-oob") {
        fun element(selector: String) {
            +selector
        }

        fun where(selector: Pair<String, String>): String {
            val (key, value) = selector
            return "[$key='$value']"
        }

        infix fun String.equalTo(selector: String) = Pair(this, selector)
    }
}
