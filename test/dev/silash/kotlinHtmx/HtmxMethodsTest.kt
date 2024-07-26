package dev.silash.kotlinHtmx

import dev.silash.kotlinHtmx.attributes.htmx.HxEncodingOptions.MULTIPART_FORM_DATA
import dev.silash.kotlinHtmx.attributes.htmx.HxSwap.HxScrollDirection
import dev.silash.kotlinHtmx.attributes.htmx.HxSwap.HxShowDirection
import dev.silash.kotlinHtmx.attributes.htmx.HxSync
import dev.silash.kotlinHtmx.attributes.htmx.HxTrigger.HxTriggerEvent.EventModifiers.QueueOptions.ALL
import dev.silash.kotlinHtmx.attributes.htmx.HxTrigger.HxTriggerEvent.EventModifiers.QueueOptions.FIRST
import dev.silash.kotlinHtmx.attributes.htmx.HxTrigger.HxTriggerEvent.EventModifiers.QueueOptions.LAST
import dev.silash.kotlinHtmx.attributes.htmx.HxTrigger.HxTriggerEvent.EventModifiers.QueueOptions.NONE
import dev.silash.kotlinHtmx.enums.HtmxAttributes.DISINHERIT
import dev.silash.kotlinHtmx.enums.HtmxAttributes.HISTORY
import dev.silash.kotlinHtmx.enums.HtmxAttributes.ON
import dev.silash.kotlinHtmx.enums.HtmxAttributes.SELECT
import dev.silash.testingUtils.assertIsEqualTo
import kotlin.test.AfterTest
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

class HtmxMethodsTest {
    private val map = mutableMapOf<String, String>()

    private val cut = HtmxMethods(map)

    @AfterTest
    fun cleanup() {
        map.clear()
    }

    @Test
    fun getTest() {
        val url = "https://example.com"
        val expected = mapOf("hx-get" to url)

        cut.get(url)

        map assertIsEqualTo expected
    }

    @Test
    fun postTest() {
        val url = "https://example.com"
        val expected = mapOf("hx-post" to url)

        cut.post(url)

        map assertIsEqualTo expected
    }

    @Test
    fun putTest() {
        val url = "https://example.com"
        val expected = mapOf("hx-put" to url)

        cut.put(url)

        map assertIsEqualTo expected
    }

    @Test
    fun deleteTest() {
        val url = "https://example.com"
        val expected = mapOf("hx-delete" to url)

        cut.delete(url)

        map assertIsEqualTo expected
    }

    @Test
    fun patchTest() {
        val url = "https://example.com"
        val expected = mapOf("hx-patch" to url)

        cut.patch(url)

        map assertIsEqualTo expected
    }

    @Test
    fun includeTest() {
        val expected =
            mapOf(
                "hx-include" to
                    buildString {
                        append("this ")
                        append("closest ")
                        append("div ")
                        append("find span ")
                        append("next ")
                        append("next div ")
                        append("previous ")
                        append("previous div ")
                        append("[id='example'] ")
                        append("[id='example']")
                    },
            )

        cut.include {
            `this`()
            closest("div")
            find("span")
            next()
            next("div")
            previous()
            previous("div")
            where("id" to "example")
            where("id='example'")
        }

        map assertIsEqualTo expected
    }

    @Test
    fun swapTest() {
        val expected =
            mapOf(
                "hx-swap" to
                    buildString {
                        append("innerHTML ")
                        append("outerHTML ")
                        append("textContent ")
                        append("beforebegin ")
                        append("afterbegin ")
                        append("beforeend ")
                        append("afterend ")
                        append("delete ")
                        append("none ")
                        append("swap:1000ms ")
                        append("settle:1ms ")
                        append("ignoreTitle ")
                        append("scroll:top ")
                        append("show:top:div ")
                        append("show:bottom ")
                        append("focus-show:true")
                    },
            )

        cut.swap {
            innerHtml()
            outerHtml()
            textContent()
            beforeBegin()
            afterBegin()
            beforeEnd()
            afterEnd()
            delete()
            none()
            swap(1.seconds)
            settle(1.milliseconds)
            ignoreTitle()
            scroll(HxScrollDirection.TOP)
            show("div", HxShowDirection.TOP)
            show(direction = HxShowDirection.BOTTOM)
            focusShow(true)
        }

        map assertIsEqualTo expected
    }

    @Test
    fun targetTest() {
        val expected =
            mapOf(
                "hx-target" to
                    buildString {
                        append("this ")
                        append("closest ")
                        append("div ")
                        append("find span ")
                        append("next ")
                        append("next div ")
                        append("previous ")
                        append("previous div ")
                        append("[id='example'] ")
                        append("[id='example']")
                    },
            )

        cut.target {
            `this`()
            closest("div")
            find("span")
            next()
            next("div")
            previous()
            previous("div")
            where("id" to "example")
            where("id='example'")
        }

        map assertIsEqualTo expected
    }

    @Test
    fun syncTest() {
        val expected =
            mapOf(
                "hx-sync" to
                    buildString {
                        append("this ")
                        append("closest ")
                        append("div:drop ")
                        append("abort ")
                        append("replace ")
                        append("queue first ")
                        append("queue last ")
                        append("queue all")
                    },
            )

        cut.sync {
            target {
                `this`()
                closest("div")
            }
            drop()
            abort()
            replace()
            queue(HxSync.QueueMethods.FIRST)
            queue(HxSync.QueueMethods.LAST)
            queue(HxSync.QueueMethods.ALL)
        }

        map assertIsEqualTo expected
    }

    @Test
    fun triggerTest() {
        val expected =
            mapOf(
                "hx-trigger" to
                    buildString {
                        append("click ")
                        append("[test] ")
                        append("once ")
                        append("changed ")
                        append("delay:1000ms ")
                        append("throttle:1000ms ")
                        append("from:this ")
                        append("target:this ")
                        append("consume ")
                        append("queue:first ")
                        append("queue:last ")
                        append("queue:all ")
                        append("queue:none ")
                        append("load ")
                        append("revealed ")
                        append("intersect ")
                        append("intersect root:this ")
                        append("threshold:0.5 ")
                        append("once, ")
                        append("every 1000ms")
                    },
            )

        cut.trigger {
            event {
                click()
                filter("test")
                modifiers {
                    once()
                    changed()
                    delay(1000.milliseconds)
                    throttle(1.seconds)
                    from { `this`() }
                    target { `this`() }
                    consume()
                    queue(FIRST)
                    queue(LAST)
                    queue(ALL)
                    queue(NONE)
                    load()
                    revealed()
                    intersect()
                    intersect {
                        root { `this`() }
                        threshold(0.5)
                        once()
                    }
                }
            }
            every(1.seconds)
        }

        map assertIsEqualTo expected
    }

    @Test
    fun `threshold should throw IllegalArgumentException if value not between 0 and 1`() {
        assertFailsWith<IllegalArgumentException>(
            message = "Threshold must be between 0 and 1",
        ) {
            cut.trigger {
                event {
                    modifiers {
                        intersect {
                            threshold(1.5)
                        }
                    }
                }
            }
        }
    }

    @Test
    fun disabledEltTest() {
        val expected =
            mapOf(
                "hx-disabled-elt" to
                    buildString {
                        append("this ")
                        append("closest div ")
                        append("find span ")
                        append("next ")
                        append("next div ")
                        append("previous ")
                        append("previous div ")
                        append("[id='example'] ")
                        append("[id='example']")
                    },
            )

        cut.disabledElt {
            `this`()
            closest("div")
            find("span")
            next()
            next("div")
            previous()
            previous("div")
            where("id" to "example")
            where("id='example'")
        }

        map assertIsEqualTo expected
    }

    @Test
    fun indicatorTest() {
        val expected =
            mapOf(
                "hx-indicator" to
                    buildString {
                        append("closest div ")
                        append("[id='example'] ")
                        append("[id='example']")
                    },
            )

        cut.indicator {
            closest("div")
            where("id" to "example")
            where("id='example'")
        }

        map assertIsEqualTo expected
    }

    @Test
    fun swapOobTest() {
        val expected =
            mapOf(
                "hx-swap-oob" to
                    buildString {
                        append("true ")
                        append("div ")
                        append("[id='example'] ")
                        append("[id='example']")
                    },
            )

        cut.swapOob {
            trueSwap()
            swap {
                element("div")
                where("id" to "example")
                where("id='example'")
            }
        }

        map assertIsEqualTo expected
    }

    @Test
    fun selectTest() {
        val expected =
            mapOf(
                "hx-select" to
                    buildString {
                        append("[id='example'] ")
                        append("[id='example']")
                    },
            )

        cut.select {
            where("id" to "example")
            where("id='example'")
        }

        map assertIsEqualTo expected
    }

    @Test
    fun selectOobTest() {
        val expected =
            mapOf(
                "hx-select-oob" to
                    buildString {
                        append("div ")
                        append("[id='example'] ")
                        append("[id='example']")
                        append(":innerHTML, ")
                        append("div ")
                        append("[id='example'] ")
                        append("[id='example']")
                        append(":outerHTML")
                    },
            )

        cut.selectOob {
            select {
                element("div")
                where("id" to "example")
                where("id='example'")
                strategy {
                    innerHtml()
                }
            }
            select {
                element("div")
                where("id" to "example")
                where("id='example'")
                strategy {
                    outerHtml()
                }
            }
        }

        map assertIsEqualTo expected
    }

    @Test
    fun preserveTest() {
        val expected = mapOf("hx-preserve" to "")

        cut.preserve()

        map assertIsEqualTo expected
    }

    @Test
    fun paramsTest() {
        val expected =
            mapOf(
                "hx-params" to
                    buildString {
                        append("* ")
                        append("none ")
                        append("not this,closest,div,find,span,next,next div,previous,previous div ")
                        append("this,closest,div,find,next,next div,previous,previous div,[id='example']")
                    },
            )

        cut.params {
            all()
            none()
            except("this", "closest", "div", "find", "span", "next", "next div", "previous", "previous div")
            only("this", "closest", "div", "find", "next", "next div", "previous", "previous div", "[id='example']")
        }

        map assertIsEqualTo expected
    }

    @Test
    fun encodingTest() {
        val expected = mapOf("hx-encoding" to "multipart/form-data")

        cut.encoding(MULTIPART_FORM_DATA)

        map assertIsEqualTo expected
    }

    @Test
    fun valsTest() {
        val expected =
            mapOf(
                "hx-vals" to
                    buildString {
                        append("{ ")
                        append("key1: value1 ")
                        append("} ")
                        append("js:{ ")
                        append("key1: value1 ")
                        append("} , ")
                        append("js:{ ")
                        append("key1: value1 ")
                        append("}")
                    },
            )

        cut.vals {
            normal { add("key1", "value1") }
            js { add("key1", "value1") }
            +","
            javaScript { add("key1", "value1") }
        }

        map assertIsEqualTo expected
    }

    @Test
    fun confirmTest() {
        val expected = mapOf("hx-confirm" to "Are you sure?")

        cut.confirm("Are you sure?")

        map assertIsEqualTo expected
    }

    @Test
    fun disinheritTest() {
        val expected =
            mapOf(
                "hx-disinherit" to
                    buildString {
                        append("* ")
                        append("hx-history ")
                        append("hx-disinherit ")
                        append("hx-select ")
                        append("hx-on")
                    },
            )

        cut.disinherit {
            all()
            select(HISTORY, DISINHERIT, SELECT, ON)
        }

        map assertIsEqualTo expected
    }

    @Test
    fun inheritTest() {
        val expected =
            mapOf(
                "hx-inherit" to
                    buildString {
                        append("* ")
                        append("hx-history ")
                        append("hx-disinherit ")
                        append("hx-select ")
                        append("hx-on")
                    },
            )

        cut.inherit {
            all()
            select(HISTORY, DISINHERIT, SELECT, ON)
        }

        map assertIsEqualTo expected
    }

    @Test
    fun boostTest() {
        val expected = mapOf("hx-boost" to "true")

        cut.boost(true)

        map assertIsEqualTo expected
    }

    @Test
    fun pushUrlTest() {
        val expected =
            mapOf(
                "hx-push-url" to
                    buildString {
                        append("true ")
                        append("false ")
                        append("https://example.com")
                    },
            )

        cut.pushUrl {
            pushToHistory()
            notPushToHistory()
            url("https://example.com")
        }

        map assertIsEqualTo expected
    }

    @Test
    fun historyEltTest() {
        val expected = mapOf("hx-history-elt" to "")

        cut.historyElt()

        map assertIsEqualTo expected
    }

    @Test
    fun historyTest() {
        val expected = mapOf("hx-history" to "true")

        cut.history(true)

        map assertIsEqualTo expected
    }

    @Test
    fun validateTest() {
        val expected = mapOf("hx-validate" to "")

        cut.validate()

        map assertIsEqualTo expected
    }

    @Test
    fun onTest() {
        val expected =
            mapOf(
                "hx-on::click" to
                    buildString {
                        append("console.log('Hello World!')")
                    },
                "hx-on:test" to
                    buildString {
                        append("console.log('Hello World!')")
                    },
            )

        cut.on(htmxEvent = "click") {
            execute("console.log('Hello World!')")
        }
        cut.on(event = "test") {
            execute("console.log('Hello World!')")
        }

        map assertIsEqualTo expected
    }

    @Test
    fun `on should require either event or htmxEvent`() {
        assertFailsWith<IllegalArgumentException> {
            cut.on {
                execute("console.log('Hello World!')")
            }
        }
    }

    @Test
    fun extTest() {
        val expected = mapOf("hx-ext" to "text test ignore:text ignore:test")

        cut.ext {
            add("text", "test")
            ignore("text", "test")
        }

        map assertIsEqualTo expected
    }

    @Test
    fun disableTest() {
        val expected = mapOf("hx-disable" to "")

        cut.disable()

        map assertIsEqualTo expected
    }
}
