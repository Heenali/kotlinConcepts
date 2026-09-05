package com.example.kotlinPractice.Functions
/*you use crossinline when you want to maintain control over the execution flow
of the inline function and prevent unexpected behavior caused by non-local returns within the lambda.*/

/*Executing operation...
Inside the lambda
Operation executed.
After the operation*/
inline fun executeOperation(crossinline callback: () -> Unit) {
    println("Executing operation...")
    callback()
    println("Operation executed.")
}

fun main() {
    executeOperation {
        println("Inside the lambda")
        return@executeOperation  // This would normally exit the lambda and the main function.
    }
    println("After the operation")
}