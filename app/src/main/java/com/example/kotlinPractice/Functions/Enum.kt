package com.example.kotlinPractice.Functions

enum class Enum (val value:Int){

    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2)
}
fun  main()
{
    println(Enum.MONDAY.value)
}

