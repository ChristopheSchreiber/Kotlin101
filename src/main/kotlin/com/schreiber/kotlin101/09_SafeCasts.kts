package com.schreiber.kotlin101

fun methodReturningAnyType() = "Toto";
fun otherMethodReturningAnyType() = 123;

val value : Any = methodReturningAnyType()
if (value is String) {
    println(value.toUpperCase())
}

val otherValue : Any = otherMethodReturningAnyType()
val stringValue : String = otherValue as? String ?: "not a String"
println(stringValue.toUpperCase())