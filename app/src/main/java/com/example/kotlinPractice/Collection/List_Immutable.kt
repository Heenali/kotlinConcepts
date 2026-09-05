package com.example.kotlinPractice.Collection
/*[3, 2, 1, 1, 2, 3]
[3, 2, 1]
{1=1, 2=2, 3=2, 4=1}*/
fun main()
{
    var list= listOf<Int>(3,2,1,1,2,3)
    println(list)

    var set= setOf<Int>(3,2,1,1,2,3)
    println(set)

    var hash= mapOf<Int,Int>(1 to 1,2 to 2,3 to 2,3 to 1)
    println(hash)




}