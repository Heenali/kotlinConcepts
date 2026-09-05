package com.example.kotlinPractice.Functions

fun main()
{
    var greaterValue=10 findGreatestValue 20
    println(greaterValue)
}
infix fun Int.findGreatestValue(secondVlaue:Int):Int
{
    if(this>secondVlaue)
        return this
    else
       return secondVlaue
}