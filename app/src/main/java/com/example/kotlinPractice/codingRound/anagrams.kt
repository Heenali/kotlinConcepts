package com.example.kotlinPractice.codingRound
/*val str1 = "listen"
val str2 = "silent"
listen and silent are anagrams.*/
fun main() {
    val str1 = "listen"
    val str2 = "silent"

    if (areAnagrams(str1, str2)) {
        println("$str1 and $str2 are anagrams.")
    } else {
        println("$str1 and $str2 are not anagrams.")
    }
}

fun areAnagrams(str1: String, str2: String): Boolean {
    // Remove spaces and convert to lowercase
    val cleanStr1 = str1.replace("\\s".toRegex(), "").toLowerCase()
    val cleanStr2 = str2.replace("\\s".toRegex(), "").toLowerCase()
    // Check if lengths are equal
    if (cleanStr1.length != cleanStr2.length) {
        return false
    }

    // Sort characters in both strings
    val sortedStr1 = cleanStr1.toCharArray().sorted().joinToString("")
    val sortedStr2 = cleanStr2.toCharArray().sorted().joinToString("")

    // Check if sorted strings are equal
    println(sortedStr1)
    println(sortedStr2)
    return sortedStr1 == sortedStr2
}

