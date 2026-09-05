package com.example.kotlinPractice.Functions


inline fun doOperation(inlineBlock: () -> Unit,  noInlineBlock: () -> Unit) {
    println("Calling inline block")
    inlineBlock()
    println("Calling noinline block")
    noInlineBlock()
}

fun main() {
    doOperation(
        inlineBlock= {
            println("This is an inline lambda")
        },
        noInlineBlock =  {
            println("This is a noinline lambda")
        }
    )
}