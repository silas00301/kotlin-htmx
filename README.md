# Kotlin-Htmx

Kotlin-Htmx is a Kotlin DSL for the [htmx](https://htmx.org) library. It provides a type-safe way to generate htmx
attributes and configuration.

# Usage

As the goal of this library is to be usable with any Kotlin web framework, it does not provide any specific integration.
Instead, it provides a few code snippets that can have to be integrated into your project.

- [kotlinx-html](#kotlinx-html)

## kotlinx-html

If you are using kotlinx-html the following snippets can be used to integrate Kotlin-Htmx into your project.

### Attributes

If you want to use a scope function to set the headers, you can use the following code snippet.

```kotlin
fun HTMLTag.hx(block: HtmxHtmlAttributes.() -> Unit) = HtmxHtmlAttributes(attributes).block()
```

If you want to set the headers using a property, you can use the following code snippet.

```kotlin
val HTMLTag.hx
    get() = HtmxHtmlAttributes(attributes)
```

### Configuration

```kotlin
fun HEAD.htmxConfig(block: HtmxConfiguration.() -> Unit) = meta {
    name = "htmx-config"
    content = HtmxConfiguration().apply(block).toConfigString()
}
```

### CSS Classes

```kotlin
fun HTMLTag.hxClasses(block: HtmxCSSClasses.() -> Unit) {
    attributes["class"] += HtmxCSSClasses().apply(block).classString
}
```

### Headers

#### Response Headers

```kotlin
fun RoutingResponse.hx(block: HtmxResponseHeaders.() -> Unit) = mutableMapOf<String, String>().also {
    HtmxResponseHeaders(it).apply(block)
}.forEach(headers::append)
```

#### Request Headers

```kotlin
val RoutingRequest.hx
    get() = HtmxRequestHeaders(headers.flattenEntries().toMap())
```