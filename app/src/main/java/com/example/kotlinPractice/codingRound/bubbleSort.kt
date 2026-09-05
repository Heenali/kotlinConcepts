package com.example.kotlinPractice.codingRound

fun bubbleSort(list: MutableList<Int>) {
    val n = list.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (list[j] > list[j + 1]) {
                // Swap elements
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }
    }

}
fun bubbleSortDescending(list: MutableList<Int>) {
    val n = list.size

    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (list[j] < list[j + 1]) {
                // Swap elements for descending order
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }
    }
}
fun main() {
    val unsortedList = mutableListOf(5, 2, 8, 1, 3)
    println("Unsorted List: $unsortedList")

    bubbleSort(unsortedList)
    println("Sorted List: $unsortedList")

    bubbleSortDescending(unsortedList)
    println("Sorted List: $unsortedList")
}
