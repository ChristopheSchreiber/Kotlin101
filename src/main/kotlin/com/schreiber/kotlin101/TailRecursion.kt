package com.schreiber.kotlin101;

import java.math.BigDecimal

fun Int.factorial() : BigDecimal {
    if (this < 0 ) throw IllegalArgumentException("Factorial can only be applied to strictly positive integers, ${this} is invalid")
    return recursiveFactorial(BigDecimal(this), BigDecimal.ONE)
}

private tailrec fun recursiveFactorial(integer: BigDecimal, accumulator: BigDecimal): BigDecimal {
    return when (integer) {
        BigDecimal.ZERO -> accumulator
        else -> recursiveFactorial(integer - BigDecimal.ONE, integer * accumulator)
    }
}
