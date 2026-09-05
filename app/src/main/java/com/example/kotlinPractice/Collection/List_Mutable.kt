package com.example.kotlinPractice.Collection

fun main()
{
    var list= mutableListOf<Int>(3,2,1,1,2,3)
    list.add(6)
    list.removeFirst()
    list.removeLast()
    list.removeAt(0)
    list.remove(3)
    println(list)
    //[1, 1, 2]

    var set= mutableSetOf<Int>(3,2,1,1,2,3)
    set.add(6)
   // set.removeFirst()
    //set.removeLast()
    //set.removeAt(0)
    set.remove(3)
    println(set)
    //[2, 1, 6]

    var hash= mutableMapOf<Int,Int>(1 to 1,2 to 2,3 to 2)
    hash.put(4,5)
    hash.replace(2,33)
    hash.remove(1)
    println(hash)
    //{2=33, 3=2, 4=5}

    hash.forEach {
        println(it.value.toString()+"---"+it.value)
    }



}