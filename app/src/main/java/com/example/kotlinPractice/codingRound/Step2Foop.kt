package com.example.kotlinPractice.codingRound
/*Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 1]
Output: [3, 7, 11, 15, 10]*/
fun main() {
    val input = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 1)
    val output = generateOutput(input)

    println("Input: $input")
    println("Output: $output")
}

fun generateOutput(input: List<Int>): List<Int> {
    val output = mutableListOf<Int>()

    for (i in 0 until input.size - 1 step 2) {

        println(i)
        val sum = input[i] + input[i + 1]
        output.add(sum)
    }

    return output
}

fun sum(list:MutableList<Int>)
{
    for(i in 0 until  list.size-1 step 2)
    {
        val sum= list[i]+list[i+1]

    }
}
