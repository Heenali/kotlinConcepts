package com.example.kotlinPractice.codingRound

fun longestIncreasingSubsequence(input: IntArray): Int {
    val n = input.size
    val lis = IntArray(n) { 1 }

    for (i in 1 until n) {
        for (j in 0 until i) {
            if (input[i] > input[j] && lis[i] < lis[j] + 1) {

                lis[i] = lis[j] + 1

            }
        }
    }
    for(n in lis)
    {
        println(lis.get(n))
    }
    return lis.maxOrNull() ?: 0
}

fun main() {

    val input = intArrayOf(1, 2, 13, 9, 10, 12, 7, 3, 2, 6, 1, 8)
    val result = longestIncreasingSubsequence(input)
    println("Length of the longest increasing subsequence: $result")
}
