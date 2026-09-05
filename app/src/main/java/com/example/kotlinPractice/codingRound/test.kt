package com.example.kotlinPractice.codingRound
fun main()
{
    sum(Int.MAX_VALUE,10)
    printValue("Heenali")

}
fun sum(a:Int,b:Int)
{
    val anw=a+b
    println(anw)
}

fun  printValue(value:String)
{
    println(value.hashCode())
}