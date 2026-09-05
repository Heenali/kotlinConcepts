package com.example.kotlinPractice

fun main() {

    var user=User("Heenali",20)
    user.let { println(it.name) }
    user.also { println(it.name) }
    user.run { println(name) }
    with(user) { println( name) }
    user.apply { println(id) }

}

data class User(var name: String, var id: Int)