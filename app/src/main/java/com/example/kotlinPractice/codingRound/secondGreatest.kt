package com.example.kotlinPractice.codingRound

fun main() {
    val numbers = arrayListOf(10, 45, 20, 78, 56)

    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE

    for (num in numbers) {
        if (num > first) {
            second = first
            first = num
        } else if (num > second && num != first) {
            second = num
        }
    }

    println("Second Greatest Number: $second")
}
fun withSortFun() {
    val numbers = arrayListOf(10, 45, 20, 78, 56)

    val secondGreatest = numbers
        .distinct()
        .sortedDescending()[1]

    println("Second Greatest Number: $secondGreatest")
}