package com.example.kotlinPractice.codingRound

fun filterOutEvenNumbers(numbers: List<Int>): List<Int> {

    var evenNumber= mutableListOf<Int>()
    for(i in numbers)
    {
        if(i%2==0)
            evenNumber.add(i)
    }
    return evenNumber
   // return numbers.filter { it % 2 ==0 }

}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = filterOutEvenNumbers(numbers)

    println("Original list: $numbers")
    println("List after filtering out even numbers: $result")
}


