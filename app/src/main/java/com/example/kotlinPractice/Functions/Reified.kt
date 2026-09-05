package com.example.kotlinPractice.Functions
/*
Generics: Provide a way to write functions or classes that work with different types while ensuring type safety. The actual type is determined at compile-time.

reified: Used with inline functions to access the actual type information of a generic type parameter at runtime. Enables operations that require knowledge of the type, overcoming type erasure.

reified is particularly useful when working with reflection, building DSLs, or in situations where runtime type information is necessary. Keep in mind that reified can only be used with inline functions.
*/
inline fun <reified T> exampleFunction(value: T) {
    println("Type: ${T::class.java.simpleName}")

    if (value?.equals(42) == true) {
        println("Value is of type")
    } else {
        println("Value is not of type ----")
    }
}

fun main() {
    exampleFunction(42)  // Output: Type: Int, Value is of type Int
    exampleFunction("Hello")  // Output: Type: String, Value is of type String
}
