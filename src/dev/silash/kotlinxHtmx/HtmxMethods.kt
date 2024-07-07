package dev.silash.kotlinxHtmx

import dev.silash.kotlinxHtmx.descriptors.attributes.HxBoost
import dev.silash.kotlinxHtmx.descriptors.attributes.HxConfirm
import dev.silash.kotlinxHtmx.descriptors.attributes.HxDisable
import dev.silash.kotlinxHtmx.descriptors.attributes.HxDisabledElt
import dev.silash.kotlinxHtmx.descriptors.attributes.HxDisinherit
import dev.silash.kotlinxHtmx.descriptors.attributes.HxEncoding
import dev.silash.kotlinxHtmx.descriptors.attributes.HxEncodingOptions
import dev.silash.kotlinxHtmx.descriptors.attributes.HxExt
import dev.silash.kotlinxHtmx.descriptors.attributes.HxHistory
import dev.silash.kotlinxHtmx.descriptors.attributes.HxHistoryElt
import dev.silash.kotlinxHtmx.descriptors.attributes.HxInclude
import dev.silash.kotlinxHtmx.descriptors.attributes.HxIndicator
import dev.silash.kotlinxHtmx.descriptors.attributes.HxInherit
import dev.silash.kotlinxHtmx.descriptors.attributes.HxOn
import dev.silash.kotlinxHtmx.descriptors.attributes.HxParams
import dev.silash.kotlinxHtmx.descriptors.attributes.HxPreserve
import dev.silash.kotlinxHtmx.descriptors.attributes.HxPushUrl
import dev.silash.kotlinxHtmx.descriptors.attributes.HxSelect
import dev.silash.kotlinxHtmx.descriptors.attributes.HxSelectOob
import dev.silash.kotlinxHtmx.descriptors.attributes.HxSwap
import dev.silash.kotlinxHtmx.descriptors.attributes.HxSwapOob
import dev.silash.kotlinxHtmx.descriptors.attributes.HxSync
import dev.silash.kotlinxHtmx.descriptors.attributes.HxTarget
import dev.silash.kotlinxHtmx.descriptors.attributes.HxTrigger
import dev.silash.kotlinxHtmx.descriptors.attributes.HxValidate
import dev.silash.kotlinxHtmx.descriptors.attributes.HxVals
import dev.silash.kotlinxHtmx.descriptors.attributes.httpMethods.HxDelete
import dev.silash.kotlinxHtmx.descriptors.attributes.httpMethods.HxGet
import dev.silash.kotlinxHtmx.descriptors.attributes.httpMethods.HxPatch
import dev.silash.kotlinxHtmx.descriptors.attributes.httpMethods.HxPost
import dev.silash.kotlinxHtmx.descriptors.attributes.httpMethods.HxPut
import dev.silash.kotlinxHtmx.descriptors.interfaces.HxDescriptor

@Suppress("TooManyFunctions")
class HtmxMethods(private val map: MutableMap<String, String>) {
    fun get(
        url: String,
        lambda: HxGet.() -> Unit = {},
    ) = addEntry(HxGet(url), lambda)

    fun post(
        url: String,
        lambda: HxPost.() -> Unit = {},
    ) = addEntry(HxPost(url), lambda)

    fun put(
        url: String,
        lambda: HxPut.() -> Unit = {},
    ) = addEntry(HxPut(url), lambda)

    fun delete(
        url: String,
        lambda: HxDelete.() -> Unit = {},
    ) = addEntry(HxDelete(url), lambda)

    fun patch(
        url: String,
        lambda: HxPatch.() -> Unit = {},
    ) = addEntry(HxPatch(url), lambda)

    fun include(lambda: HxInclude.() -> Unit) = addEntry(HxInclude(), lambda)

    fun swap(lambda: HxSwap.() -> Unit) = addEntry(HxSwap(), lambda)

    fun target(lambda: HxTarget.() -> Unit) = addEntry(HxTarget(), lambda)

    fun sync(lambda: HxSync.() -> Unit) = addEntry(HxSync(), lambda)

    fun trigger(lambda: HxTrigger.() -> Unit) = addEntry(HxTrigger(), lambda)

    fun disabledElt(lambda: HxDisabledElt.() -> Unit) = addEntry(HxDisabledElt(), lambda)

    fun indicator(lambda: HxIndicator.() -> Unit) = addEntry(HxIndicator(), lambda)

    fun swapOob(lambda: HxSwapOob.() -> Unit) = addEntry(HxSwapOob(), lambda)

    fun select(lambda: HxSelect.() -> Unit) = addEntry(HxSelect(), lambda)

    fun selectOob(lambda: HxSelectOob.() -> Unit) = addEntry(HxSelectOob(), lambda)

    fun preserve(
        option: String = "",
        lambda: HxPreserve.() -> Unit = {},
    ) = addEntry(HxPreserve(option), lambda)

    fun params(lambda: HxParams.() -> Unit) = addEntry(HxParams(), lambda)

    fun encoding(
        encodingOptions: HxEncodingOptions,
        lambda: HxEncoding.() -> Unit = {},
    ) = addEntry(HxEncoding(encodingOptions), lambda)

    fun vals(lambda: HxVals.() -> Unit) = addEntry(HxVals(), lambda)

    fun confirm(
        message: String,
        lambda: HxConfirm.() -> Unit = {},
    ) = addEntry(HxConfirm(message), lambda)

    fun disinherit(lambda: HxDisinherit.() -> Unit) = addEntry(HxDisinherit(), lambda)

    fun inherit(lambda: HxInherit.() -> Unit) = addEntry(HxInherit(), lambda)

    fun boost(
        enabled: Boolean,
        lambda: HxBoost.() -> Unit = {},
    ) = addEntry(HxBoost(enabled), lambda)

    fun pushUrl(lambda: HxPushUrl.() -> Unit) = addEntry(HxPushUrl(), lambda)

    fun historyElt(lambda: HxHistoryElt.() -> Unit = {}) = addEntry(HxHistoryElt(), lambda)

    fun history(
        enabled: Boolean,
        lambda: HxHistory.() -> Unit = {},
    ) = addEntry(HxHistory(enabled), lambda)

    fun validate(lambda: HxValidate.() -> Unit = {}) = addEntry(HxValidate(), lambda)

    fun on(
        event: String? = null,
        htmxEvent: String? = null,
        lambda: HxOn.() -> Unit,
    ) = addEntry(HxOn(event, htmxEvent), lambda)

    fun ext(lambda: HxExt.() -> Unit) = addEntry(HxExt(), lambda)

    fun disable(lambda: HxDisable.() -> Unit = {}) = addEntry(HxDisable(), lambda)

    private fun <T : HxDescriptor> addEntry(
        instance: T,
        lambda: T.() -> Unit,
    ) {
        val key = instance.attributeName
        instance.lambda()
        val text = instance.text.trimStart().trimEnd(' ', ',')
        map[key] = text
    }
}
