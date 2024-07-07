# Setup

## Ktor

Add the following code snippet to one of your files:
```kotlin
infix fun HTMLTag.hx(method: HtmxMethods.() -> Unit) = HtmxMethods(attributes).method()
```
