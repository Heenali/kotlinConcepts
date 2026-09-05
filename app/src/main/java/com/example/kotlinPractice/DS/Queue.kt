package com.example.kotlinPractice.DS

class Queue<T> {
    private val queueList = mutableListOf<T>()

    // Enqueue operation to add an element to the end of the queue
    fun enqueue(item: T) {
        queueList.add(item)
    }

    // Dequeue operation to remove and return the element from the front of the queue
    fun dequeue(): T? {
        return if (isEmpty()) {
            null
        } else {
            queueList.removeAt(0)
        }
    }

    // Check if the queue is empty
    fun isEmpty(): Boolean {
        return queueList.isEmpty()
    }
}
fun main() {
    val queue = Queue<Int>()

    // Enqueue elements
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)

    // Dequeue elements
    println("Dequeued item: ${queue.dequeue()}") // Output: Dequeued item: 1
    println("Dequeued item: ${queue.dequeue()}") // Output: Dequeued item: 2

    // Check if the queue is empty
    println("Is queue empty? ${queue.isEmpty()}") // Output: Is queue empty? false

    // Dequeue remaining element
    println("Dequeued item: ${queue.dequeue()}") // Output: Dequeued item: 3

    // Check if the queue is empty
    println("Is queue empty? ${queue.isEmpty()}") // Output: Is queue empty? true

    // Try to dequeue from an empty queue
    println("Dequeued item: ${queue.dequeue()}") // Output: Dequeued item: null
}
