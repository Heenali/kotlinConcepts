package com.example.kotlinPractice.codingRound

/*{10,"Heenali",true,4,5,"Lakhani"}
4*/
fun main()
{
    var list= mutableListOf<Any>(10,"Heenali",true,4,5,"Lakhani")
   // list.filterIsInstance<Int>()
    findNUmber(list)
}

fun findNUmber(list:MutableList<Any>)

{
    val integerList = mutableListOf<Int>()

    // Manually filtering integers from the list
    for (i in list) {
        if (i is Int) {
            if(i%2==0)
                 integerList.add(i)
        }
    }
    integerList.sort()

    println(integerList)
}