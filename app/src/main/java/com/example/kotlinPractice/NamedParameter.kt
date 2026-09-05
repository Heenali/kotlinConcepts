package com.example.kotlinPractice

fun greet(name: String, greeting: String = "Hello", punctuation: String = "!") {
    println("$greeting, $name$punctuation")
}

fun main() {
    // Call the function with named parameters
    greet(name = "Alice", greeting = "Hi")  // Output: Hi, Alice!

    // Using default values for unspecified parameters
    greet(name = "Bob")  // Output: Hello, Bob!

    // Mixing named and positional parameters
    greet("Charlie", punctuation = "?")  // Output: Hello, Charlie?
}