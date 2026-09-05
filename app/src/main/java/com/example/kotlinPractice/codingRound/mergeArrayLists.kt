package com.example.kotlinPractice.codingRound

fun mergeArrayLists(list1: ArrayList<Int>, list2: ArrayList<Int>): ArrayList<Int> {
    val mergedList = ArrayList<Int>()
   // mergedList.addAll(list1)
   // mergedList.addAll(list2)
    for (i in list1)
    {
        mergedList.add(i)
    }
    for (i in list2)
    {
        mergedList.add(i)
    }

    return mergedList
}

fun main() {
    val list1 = arrayListOf(1, 2, 3,4)
    val list2 = arrayListOf(4, 5, 6)

    val mergedList = mergeArrayLists(list1, list2)
    println("List 1: $list1")
    println("List 2: $list2")
    println("Merged List: $mergedList")
}
