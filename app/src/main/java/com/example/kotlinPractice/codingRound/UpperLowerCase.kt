package com.example.kotlinPractice.codingRound
/*Enter a string:
Heenali
Output: hEEnAlI*/
fun main() {
    println("Enter a string:")
    val input = readLine()

    if (input != null) {
        val output = manipulateString(input)
        println("Output: $output")
    } else {
        println("Invalid input.")
    }
}

fun manipulateString(input: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')

    val manipulatedString = StringBuilder()

    for (i in input) {
        if (i.toLowerCase() in vowels) {
            manipulatedString.append(i.toUpperCase())
        } else {
            manipulatedString.append(i.toLowerCase())
        }
    }

    return manipulatedString.toString()
}
