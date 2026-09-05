package com.example.kotlinPractice.Coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class launch {
}
fun main()
{
    val job: Job = GlobalScope.launch{
        println("Coroutine started")
        delay(1000) // Simulating some background work
        println("Coroutine completed")
    }
    runBlocking {
        delay(2000) // 2 seconds
    }
}