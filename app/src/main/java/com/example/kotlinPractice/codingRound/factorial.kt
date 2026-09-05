package com.example.kotlinPractice.codingRound
/*3!=3×2×1=6
4!=4×3×2×1=24*/
fun main() {
    val number = 5
    val factorialResult = factorial(number)
    println("Factorial of $number = $factorialResult")
}

tailrec fun factorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}
