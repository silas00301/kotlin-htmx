package brock.api.utils.htmx

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
    DISABLE
}

fun HtmxAttributes.toHtmxAttribute()= when(this) {
    HtmxAttributes.GET -> "hx-get"
    HtmxAttributes.POST -> "hx-post"
    HtmxAttributes.PUT -> "hx-put"
    HtmxAttributes.DELETE -> "hx-delete"
    HtmxAttributes.PATCH -> "hx-patch"
    HtmxAttributes.INCLUDE -> "hx-include"
    HtmxAttributes.SWAP -> "hx-swap"
    HtmxAttributes.TARGET -> "hx-target"
    HtmxAttributes.SYNC -> "hx-sync"
    HtmxAttributes.TRIGGER -> "hx-trigger"
    HtmxAttributes.DISABLED_ELT -> "hx-disabled-elt"
    HtmxAttributes.INDICATOR -> "hx-indicator"
    HtmxAttributes.SWAP_OOB -> "hx-swap-oob"
    HtmxAttributes.SELECT -> "hx-select"
    HtmxAttributes.SELECT_OOB -> "hx-select-oob"
    HtmxAttributes.PRESERVE -> "hx-preserve"
    HtmxAttributes.PARAMS -> "hx-params"
    HtmxAttributes.ENCODING -> "hx-encoding"
    HtmxAttributes.VALS -> "hx-vals"
    HtmxAttributes.CONFIRM -> "hx-confirm"
    HtmxAttributes.DISINHERIT -> "hx-disinherit"
    HtmxAttributes.INHERIT -> "hx-inherit"
    HtmxAttributes.BOOST -> "hx-boost"
    HtmxAttributes.PUSH_URL -> "hx-push-url"
    HtmxAttributes.HISTORY_ELT -> "hx-history-elt"
    HtmxAttributes.HISTORY -> "hx-history"
    HtmxAttributes.PROMPT -> "hx-prompt"
    HtmxAttributes.VALIDATE -> "hx-validate"
    HtmxAttributes.ON -> "hx-on"
    HtmxAttributes.EXT -> "hx-ext"
    HtmxAttributes.DISABLE -> "hx-disable"
}
