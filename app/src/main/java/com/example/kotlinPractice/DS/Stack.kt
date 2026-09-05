package com.example.kotlinPractice.DS

class Stack<T> {
    private val stackList = mutableListOf<T>()

    // Push operation to add an element to the top of the stack
    fun push(item: T) {
        stackList.add(item)
    }

    // Pop operation to remove and return the element from the top of the stack
    fun pop(): T? {
        return if (isEmpty()) {
            null
        } else {
            stackList.removeAt(stackList.size - 1)
        }
    }

    // Peek operation to return the element from the top of the stack without removing it
    fun peek(): T? {
        return if (isEmpty()) {
            null
        } else {
            stackList.last()
        }
    }

    // Check if the stack is empty
    fun isEmpty(): Boolean {
        return stackList.isEmpty()
    }

}
fun main() {
    val stack = Stack<Int>()

    // Push elements onto the stack
    stack.push(1)
    stack.push(2)
    stack.push(3)

    // Peek at the element on the top of the stack
    println("Top element of the stack: ${stack.peek()}") // Output: Top element of the stack: 3

    // Pop elements from the top of the stack
    println("Popped element: ${stack.pop()}") // Output: Popped element: 3
    println("Popped element: ${stack.pop()}") // Output: Popped element: 2

    // Check if the stack is empty
    println("Is stack empty? ${stack.isEmpty()}") // Output: Is stack empty? false

    // Pop remaining element from the stack
    println("Popped element: ${stack.pop()}") // Output: Popped element: 1

    // Check if the stack is empty
    println("Is stack empty? ${stack.isEmpty()}") // Output: Is stack empty? true

    // Try to pop from an empty stack
    println("Popped element: ${stack.pop()}") // Output: Popped element: null
}
