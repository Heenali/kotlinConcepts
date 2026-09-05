package com.example.kotlinPractice.Collection

import com.example.kotlinPractice.Person1

fun main()
{
    val originalArray = arrayOf(6,1)
    val list = mutableListOf(6,1)

    ///////////////////////////////////////
    val sum = list.fold(2) { a, b -> a + b }
    println(sum) // Output: 9

    val sum1 = list.reduce { a, b -> a + b }
    println(sum1) // Output: 7

    val flatMapV = listOf("Heenali", "Lakhani")
    println(flatMapV.flatMap { it.toList() })// [H, e, e, n, a, l, i, L, a, k, h, a, n, i]

    //sort the original list
    list.sort()
    println(list)
    list.sortDescending()
    println(list)

    //sort the new list
    var listSort=list.sorted()
    println(listSort)
    var listDesc=list.sortedDescending()
    println(listDesc)


    // remove duplication
    val distinctArray = list.distinct()
    println(distinctArray)
    val uniqueSet = list.toSet()
    println(uniqueSet)


    //convert list to map
    val people = listOf(
        Person1(1, "Alice"),
        Person1(2, "Bob"),
        Person1(3, "Charlie"),
        Person1(4, "David")
    )
    val peopleMap = people.associateBy { it.name.length }
    println("People Map: $peopleMap")
    //People Map: {5=Person1(id=4, name=David), 3=Person1(id=2, name=Bob), 7=Person1(id=3, name=Charlie)}

    //sort with id
    people.sortedWith(compareBy({it.id}))
    println("People : $peopleMap")
    //People : {5=Person1(id=4, name=David), 3=Person1(id=2, name=Bob), 7=Person1(id=3, name=Charlie)}

    //filter the list
    var filterList=list.filter { it>5 }
    println(filterList)

    //change the list
    var mapList=list.map { it*it }
    println(filterList)

    //divide the list in another two list
    var (one ,two)=list.partition {it>5 }
    println(one)
    println(two)

    //return true or false base on condition
    var predicateCondition={num:Int->num>5}
    var any=list.any (predicateCondition )
    println(any)
    var all=list.all (predicateCondition )
    println(all)
    var find=list.find (predicateCondition )
    println(find)
    var count=list.count (predicateCondition )
    println(count)








}
data class Person(val name: String, val age: Int)



