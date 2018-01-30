package com.schreiber

import org.junit.Test
import java.math.BigDecimal
import kotlin.test.assertEquals

class TailRecursionTest {

    @Test(expected = IllegalArgumentException::class)
    fun negative_value_have_no_factorial() {
        (-1).factorial()
    }

    fun factorial_zero_is_one() {
        assertEquals(BigDecimal.ONE, 0.factorial())
    }

    @Test
    fun factorial_one_is_one() {
        assertEquals(BigDecimal.ONE, 1.factorial())
    }

    @Test
    fun factorial_two_is_two_() {
        assertEquals(BigDecimal(2), 2.factorial())
    }

    @Test
    fun factorial_three_is_6() {
        assertEquals(BigDecimal(6), 3.factorial())
    }

    @Test
    fun factorial_5_is_120() {
        assertEquals(BigDecimal(120), 5.factorial())
    }

    @Test
    fun factorial_should_handle_big_values() {
        println(100000.factorial())
    }
}
