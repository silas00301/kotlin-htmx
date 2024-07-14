package dev.silash.kotlinHtmx

import dev.silash.kotlinHtmx.descriptors.HxDescriptor
import dev.silash.kotlinHtmx.descriptors.attributes.HxBoost
import dev.silash.kotlinHtmx.descriptors.attributes.HxConfirm
import dev.silash.kotlinHtmx.descriptors.attributes.HxDisable
import dev.silash.kotlinHtmx.descriptors.attributes.HxDisabledElt
import dev.silash.kotlinHtmx.descriptors.attributes.HxDisinherit
import dev.silash.kotlinHtmx.descriptors.attributes.HxEncoding
import dev.silash.kotlinHtmx.descriptors.attributes.HxEncodingOptions
import dev.silash.kotlinHtmx.descriptors.attributes.HxExt
import dev.silash.kotlinHtmx.descriptors.attributes.HxHistory
import dev.silash.kotlinHtmx.descriptors.attributes.HxHistoryElt
import dev.silash.kotlinHtmx.descriptors.attributes.HxInclude
import dev.silash.kotlinHtmx.descriptors.attributes.HxIndicator
import dev.silash.kotlinHtmx.descriptors.attributes.HxInherit
import dev.silash.kotlinHtmx.descriptors.attributes.HxOn
import dev.silash.kotlinHtmx.descriptors.attributes.HxParams
import dev.silash.kotlinHtmx.descriptors.attributes.HxPreserve
import dev.silash.kotlinHtmx.descriptors.attributes.HxPushUrl
import dev.silash.kotlinHtmx.descriptors.attributes.HxSelect
import dev.silash.kotlinHtmx.descriptors.attributes.HxSelectOob
import dev.silash.kotlinHtmx.descriptors.attributes.HxSwap
import dev.silash.kotlinHtmx.descriptors.attributes.HxSwapOob
import dev.silash.kotlinHtmx.descriptors.attributes.HxSync
import dev.silash.kotlinHtmx.descriptors.attributes.HxTarget
import dev.silash.kotlinHtmx.descriptors.attributes.HxTrigger
import dev.silash.kotlinHtmx.descriptors.attributes.HxValidate
import dev.silash.kotlinHtmx.descriptors.attributes.HxVals
import dev.silash.kotlinHtmx.descriptors.attributes.httpMethods.HxDelete
import dev.silash.kotlinHtmx.descriptors.attributes.httpMethods.HxGet
import dev.silash.kotlinHtmx.descriptors.attributes.httpMethods.HxPatch
import dev.silash.kotlinHtmx.descriptors.attributes.httpMethods.HxPost
import dev.silash.kotlinHtmx.descriptors.attributes.httpMethods.HxPut

@Suppress("TooManyFunctions")
class HtmxMethods(private val map: MutableMap<String, String>) {
    fun get(url: String) = addEntry(HxGet(url))

    fun post(url: String) = addEntry(HxPost(url))

    fun put(url: String) = addEntry(HxPut(url))

    fun delete(url: String) = addEntry(HxDelete(url))

    fun patch(url: String) = addEntry(HxPatch(url))

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

    fun preserve() = addEntry(HxPreserve())

    fun params(lambda: HxParams.() -> Unit) = addEntry(HxParams(), lambda)

    fun encoding(encodingOptions: HxEncodingOptions) = addEntry(HxEncoding(encodingOptions))

    fun vals(lambda: HxVals.() -> Unit) = addEntry(HxVals(), lambda)

    fun confirm(message: String) = addEntry(HxConfirm(message))

    fun disinherit(lambda: HxDisinherit.() -> Unit) = addEntry(HxDisinherit(), lambda)

    fun inherit(lambda: HxInherit.() -> Unit) = addEntry(HxInherit(), lambda)

    fun boost(enabled: Boolean) = addEntry(HxBoost(enabled))

    fun pushUrl(lambda: HxPushUrl.() -> Unit) = addEntry(HxPushUrl(), lambda)

    fun historyElt(lambda: HxHistoryElt.() -> Unit = {}) = addEntry(HxHistoryElt(), lambda)

    fun history(enabled: Boolean) = addEntry(HxHistory(enabled))

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
        lambda: T.() -> Unit = {},
    ) {
        val key = instance.attributeName
        instance.lambda()
        val text = instance.text.trimStart().trimEnd(' ', ',')
        map[key] = text
    }
}
