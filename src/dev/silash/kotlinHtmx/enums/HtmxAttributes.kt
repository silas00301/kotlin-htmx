package dev.silash.kotlinHtmx.enums

import dev.silash.kotlinHtmx.enums.HtmxAttributes.BOOST
import dev.silash.kotlinHtmx.enums.HtmxAttributes.CONFIRM
import dev.silash.kotlinHtmx.enums.HtmxAttributes.DELETE
import dev.silash.kotlinHtmx.enums.HtmxAttributes.DISABLE
import dev.silash.kotlinHtmx.enums.HtmxAttributes.DISABLED_ELT
import dev.silash.kotlinHtmx.enums.HtmxAttributes.DISINHERIT
import dev.silash.kotlinHtmx.enums.HtmxAttributes.ENCODING
import dev.silash.kotlinHtmx.enums.HtmxAttributes.EXT
import dev.silash.kotlinHtmx.enums.HtmxAttributes.GET
import dev.silash.kotlinHtmx.enums.HtmxAttributes.HISTORY
import dev.silash.kotlinHtmx.enums.HtmxAttributes.HISTORY_ELT
import dev.silash.kotlinHtmx.enums.HtmxAttributes.INCLUDE
import dev.silash.kotlinHtmx.enums.HtmxAttributes.INDICATOR
import dev.silash.kotlinHtmx.enums.HtmxAttributes.INHERIT
import dev.silash.kotlinHtmx.enums.HtmxAttributes.ON
import dev.silash.kotlinHtmx.enums.HtmxAttributes.PARAMS
import dev.silash.kotlinHtmx.enums.HtmxAttributes.PATCH
import dev.silash.kotlinHtmx.enums.HtmxAttributes.POST
import dev.silash.kotlinHtmx.enums.HtmxAttributes.PRESERVE
import dev.silash.kotlinHtmx.enums.HtmxAttributes.PROMPT
import dev.silash.kotlinHtmx.enums.HtmxAttributes.PUSH_URL
import dev.silash.kotlinHtmx.enums.HtmxAttributes.PUT
import dev.silash.kotlinHtmx.enums.HtmxAttributes.SELECT
import dev.silash.kotlinHtmx.enums.HtmxAttributes.SELECT_OOB
import dev.silash.kotlinHtmx.enums.HtmxAttributes.SWAP
import dev.silash.kotlinHtmx.enums.HtmxAttributes.SWAP_OOB
import dev.silash.kotlinHtmx.enums.HtmxAttributes.SYNC
import dev.silash.kotlinHtmx.enums.HtmxAttributes.TARGET
import dev.silash.kotlinHtmx.enums.HtmxAttributes.TRIGGER
import dev.silash.kotlinHtmx.enums.HtmxAttributes.VALIDATE
import dev.silash.kotlinHtmx.enums.HtmxAttributes.VALS

enum class HtmxAttributes {
    GET,
    POST,
    PUT,
    DELETE,
    PATCH,
    INCLUDE,
    SWAP,
    TARGET,
    SYNC,
    TRIGGER,
    DISABLED_ELT,
    INDICATOR,
    SWAP_OOB,
    SELECT,
    SELECT_OOB,
    PRESERVE,
    PARAMS,
    ENCODING,
    VALS,
    CONFIRM,
    DISINHERIT,
    INHERIT,
    BOOST,
    PUSH_URL,
    HISTORY_ELT,
    HISTORY,
    PROMPT,
    VALIDATE,
    ON,
    EXT,
    DISABLE,
}

@Suppress("CyclomaticComplexMethod")
fun HtmxAttributes.toHtmxAttribute() =
    when (this) {
        GET -> "hx-get"
        POST -> "hx-post"
        PUT -> "hx-put"
        DELETE -> "hx-delete"
        PATCH -> "hx-patch"
        INCLUDE -> "hx-include"
        SWAP -> "hx-swap"
        TARGET -> "hx-target"
        SYNC -> "hx-sync"
        TRIGGER -> "hx-trigger"
        DISABLED_ELT -> "hx-disabled-elt"
        INDICATOR -> "hx-indicator"
        SWAP_OOB -> "hx-swap-oob"
        SELECT -> "hx-select"
        SELECT_OOB -> "hx-select-oob"
        PRESERVE -> "hx-preserve"
        PARAMS -> "hx-params"
        ENCODING -> "hx-encoding"
        VALS -> "hx-vals"
        CONFIRM -> "hx-confirm"
        DISINHERIT -> "hx-disinherit"
        INHERIT -> "hx-inherit"
        BOOST -> "hx-boost"
        PUSH_URL -> "hx-push-url"
        HISTORY_ELT -> "hx-history-elt"
        HISTORY -> "hx-history"
        PROMPT -> "hx-prompt"
        VALIDATE -> "hx-validate"
        ON -> "hx-on"
        EXT -> "hx-ext"
        DISABLE -> "hx-disable"
    }
