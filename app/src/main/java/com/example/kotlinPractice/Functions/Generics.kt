package com.example.kotlinPractice.Functions

/*
Generics: Provide a way to write functions or classes that work with different types while ensuring type safety. The actual type is determined at compile-time.

reified: Used with inline functions to access the actual type information of a generic type parameter at runtime. Enables operations that require knowledge of the type, overcoming type erasure.

reified is particularly useful when working with reflection, building DSLs, or in situations where runtime type information is necessary. Keep in mind that reified can only be used with inline functions.
 */
fun <T> printElement(et: T) {
    println(et)
}

fun main() {
    printElement(42)      // Output: 42
    printElement("Hello") // Output: Hello
    printElement(3.14)    // Output: 3.14
    printElement(true)
}
