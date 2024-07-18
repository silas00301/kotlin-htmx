package dev.silash.kotlinHtmx.descriptors.attributes

import dev.silash.kotlinHtmx.descriptors.HxDescriptor
import dev.silash.kotlinHtmx.utils.generateWhereSelector

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

        fun where(selector: Pair<String, String>) {
            val (key, value) = selector
            +generateWhereSelector("$key='$value'")
        }

        fun where(selector: String) {
            +generateWhereSelector(selector)
        }
    }
}
