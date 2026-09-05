package com.example.kotlinPractice.Functions

fun main()
{
    val executionTime = measureTimeMillis {
        // Simulate some work
        for (i in 1..1000000) {
            // Do some computation
        }
    }

    println("Execution time: $executionTime ms")
}
inline fun measureTimeMillis(block: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - startTime
}