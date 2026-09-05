package com.example.kotlinPractice

data class Person1(val id: Int, val name: String)

fun main() {
    val people = listOf(
        Person1(1, "Alice"),
        Person1(2, "Bob"),
        Person1(3, "Charlie"),
        Person1(4, "David")
    )

    val peopleMap = people.associateBy { it.name.length }

    println("People Map: $peopleMap")
}