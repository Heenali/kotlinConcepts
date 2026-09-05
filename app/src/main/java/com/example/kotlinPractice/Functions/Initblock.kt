package com.example.kotlinPractice.Functions

class MyClass(firstName: String, lastName: String) {
    // Properties
    var fullName: String

    // Initialization block
    init {
        // Code in this block is executed when an instance of MyClass is created
        fullName = "$firstName $lastName"
        println("Object initialized with full name: $fullName")
    }

    // Other functions or properties can follow...

    // Secondary constructor
    constructor(name: String) : this(name, "") {
        // Secondary constructor body
        println("Secondary constructor called")
    }
}

fun main() {
    // Creating an instance of MyClass
    val myObject = MyClass("John", "Doe")

    // Output:
    // Object initialized with full name: John Doe
}
