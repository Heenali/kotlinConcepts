package com.example.kotlinPractice.Functions

fun main() {

    var add:(Int,Int)->Int ={x,y->x+y}
    var resultAdd=operation(2,3,add)
    println(resultAdd)
}
fun operation(x:Int,y:Int,result:(Int,Int)->Int):Int
{
   return result(x,y)
}


