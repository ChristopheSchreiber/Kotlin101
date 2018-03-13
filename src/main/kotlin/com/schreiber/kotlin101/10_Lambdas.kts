package com.schreiber.kotlin101

val myList = listOf(1, 2, 3, 4, 5)
val evenNumbers = myList.filter { it % 2 == 0}
println(evenNumbers)

fun transformAndPrint(message : String, transform : (String) -> String) = println(transform(message))

transformAndPrint("hello world", String::toUpperCase)