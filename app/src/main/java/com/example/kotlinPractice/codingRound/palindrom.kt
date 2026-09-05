package com.example.kotlinPractice.codingRound
/*
rar is a palindrome.
 */

fun reverseString(str: String): String {
    var reversed = ""
    for (i in str.length - 1 downTo 0) {
        reversed += str[i]
    }
    return reversed
}
fun main() {
    val number = "rar"
    val reversedNumber = reverseString(number)

    if (number == reversedNumber) {
        println("$number is a palindrome.")
    } else {
        println("$number is not a palindrome.")
    }
}

