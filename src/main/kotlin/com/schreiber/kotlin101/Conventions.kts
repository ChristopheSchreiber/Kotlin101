package com.schreiber.kotlin101


data class Quantity(val value: Double) {
    operator fun plus(other : Quantity) = Quantity(this.value + other.value)
}

val quantity1 = Quantity(100.0)
val quantity2 = Quantity(10.0)
println(quantity1 + quantity2)