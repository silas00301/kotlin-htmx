package dev.silash.kotlinHtmx

import dev.silash.kotlinHtmx.attributes.HtmlAttribute
import dev.silash.kotlinHtmx.attributes.htmx.HxBoost
import dev.silash.kotlinHtmx.attributes.htmx.HxConfirm
import dev.silash.kotlinHtmx.attributes.htmx.HxDisable
import dev.silash.kotlinHtmx.attributes.htmx.HxDisabledElt
import dev.silash.kotlinHtmx.attributes.htmx.HxDisinherit
import dev.silash.kotlinHtmx.attributes.htmx.HxEncoding
import dev.silash.kotlinHtmx.attributes.htmx.HxEncodingOptions
import dev.silash.kotlinHtmx.attributes.htmx.HxExt
import dev.silash.kotlinHtmx.attributes.htmx.HxHistory
import dev.silash.kotlinHtmx.attributes.htmx.HxHistoryElt
import dev.silash.kotlinHtmx.attributes.htmx.HxInclude
import dev.silash.kotlinHtmx.attributes.htmx.HxIndicator
import dev.silash.kotlinHtmx.attributes.htmx.HxInherit
import dev.silash.kotlinHtmx.attributes.htmx.HxOn
import dev.silash.kotlinHtmx.attributes.htmx.HxParams
import dev.silash.kotlinHtmx.attributes.htmx.HxPreserve
import dev.silash.kotlinHtmx.attributes.htmx.HxPushUrl
import dev.silash.kotlinHtmx.attributes.htmx.HxSelect
import dev.silash.kotlinHtmx.attributes.htmx.HxSelectOob
import dev.silash.kotlinHtmx.attributes.htmx.HxSwap
import dev.silash.kotlinHtmx.attributes.htmx.HxSwapOob
import dev.silash.kotlinHtmx.attributes.htmx.HxSync
import dev.silash.kotlinHtmx.attributes.htmx.HxTarget
import dev.silash.kotlinHtmx.attributes.htmx.HxTrigger
import dev.silash.kotlinHtmx.attributes.htmx.HxValidate
import dev.silash.kotlinHtmx.attributes.htmx.HxVals
import dev.silash.kotlinHtmx.attributes.htmx.httpMethods.HxDelete
import dev.silash.kotlinHtmx.attributes.htmx.httpMethods.HxGet
import dev.silash.kotlinHtmx.attributes.htmx.httpMethods.HxPatch
import dev.silash.kotlinHtmx.attributes.htmx.httpMethods.HxPost
import dev.silash.kotlinHtmx.attributes.htmx.httpMethods.HxPut

@Suppress("TooManyFunctions")
class HtmxMethods(val map: MutableMap<String, String>) {
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

    fun historyElt() = addEntry(HxHistoryElt())

    fun history(enabled: Boolean) = addEntry(HxHistory(enabled))

    fun validate(lambda: HxValidate.() -> Unit = {}) = addEntry(HxValidate(), lambda)

    fun on(
        event: String? = null,
        htmxEvent: String? = null,
        lambda: HxOn.() -> Unit,
    ) = addEntry(HxOn(event, htmxEvent), lambda)

    fun ext(lambda: HxExt.() -> Unit) = addEntry(HxExt(), lambda)

    fun disable() = addEntry(HxDisable())

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
