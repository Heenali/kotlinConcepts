package com.example.kotlinPractice.codingRound
//2^5 = 32 (2*2*2*2*2)

fun main() {
    val base = 2
    val exponent = 5
    val result = power(base, exponent)
    println("$base^$exponent = $result")
}

fun power(base: Int, exponent: Int): Long {
    return if (exponent == 0) {
        1
    } else {
        base.toLong() * power(base, exponent - 1)
    }
}
