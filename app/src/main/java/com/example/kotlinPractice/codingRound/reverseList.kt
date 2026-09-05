package com.example.kotlinPractice.codingRound

fun reverseList(inputList: List<Int>): List<Int> {
    val reversedList = mutableListOf<Int>()
    //inputList.reversed()
    for (i in inputList.size - 1 downTo 0) {
        reversedList.add(inputList[i])
    }

    return reversedList
}

fun main() {

    val originalList = listOf(5, 4, 3, 2, 1)
    val reversedList = reverseList(originalList)

    println("Original list: $originalList")
    println("Reversed list: $reversedList")
}
