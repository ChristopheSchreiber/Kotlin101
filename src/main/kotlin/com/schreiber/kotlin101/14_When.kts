package com.schreiber.kotlin101

enum class PriceType {
    PIECE, RATE, PERCENTAGE
}

val priceType = PriceType.PERCENTAGE

when (priceType) {
    PriceType.PIECE -> println("piece type")
    PriceType.RATE -> println("rate type")
    PriceType.PERCENTAGE -> println("percentage type")
}

val code = getStringCode()
val mappedCode = when (code) {
    "foo" -> doFoo()
    "bar" -> doBar()
    else -> doSomethingElse()
}
print(mappedCode)

fun getStringCode() = "foo"

fun doFoo() = "FOO !"
fun doBar() = "BAR !"
fun doSomethingElse() = "FOOBAR !"
