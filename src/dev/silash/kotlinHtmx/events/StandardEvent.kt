package dev.silash.kotlinHtmx.events

import dev.silash.kotlinHtmx.utils.containsUpperCase

class StandardEvent(event: String) : Event {
    override val event: String = event.trimStart(':')

    init {
        require(!event.containsUpperCase()) {
            "Events cannot contain uppercase character"
        }
    }
}
