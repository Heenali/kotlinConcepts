package com.example.kotlinPractice.Functions

/*
Sequences are collections with lazy evaluation. Elements are computed or fetched only when they are needed.
Memory Usage:

Sequences consume memory only for the currently processed elements, making them more memory-efficient, especially for large datasets or infinite sequences.
Use Cases:

Sequences are suitable when dealing with large datasets, performing complex transformations, or when you don't need to process all elements in the collection.
Operations:

Sequences provide a set of functional-style operations like map, filter, take, and others. These operations are applied lazily, allowing for more efficient processing.
*/
fun main()
{
    // List Example
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 } // Creates a new list with doubled elements

// Sequence Example
    val sequence = sequenceOf(1, 2, 3, 4, 5)
    val doubledSequence = sequence.map { it * 2 } // Creates a sequence with doubled elements

// Accessing elements
    println(list[2])  // Output: 3
    println(sequence.elementAt(2))  // Output: 3

// Iterating
    list.forEach { print("$it, ") }  // Output: 1, 2, 3, 4, 5,
    sequence.forEach { print("$it, ") }  // Output: 1, 2, 3, 4, 5,

}