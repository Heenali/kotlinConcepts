package com.example.kotlinPractice.codingRound

fun sumOfArrayList(list: List<Int>): Int {
    var sum = 0
    for (i in list.indices) {
        //println(list[i])
        sum += list[i]
    }
    return sum
}
fun sumOfArrayList1(list: List<Int>): Int {
    var sum = 0
    for (i in list) {
        //println(list[i])
        sum += i
    }
    return sum
}

fun main() {
    val arrayList = listOf<Int>(1, 2,5,1)

    val totalSum = sumOfArrayList(arrayList)

    println("ArrayList: $arrayList")
    println("Total Sum: $totalSum")
}

