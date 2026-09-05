package com.example.kotlinPractice.Test
fun main()
{
    test()
}
// until -- display 1 to 4
// indices- use only with list
//.. -- display 1 to 5
//.rangeTo -- display 1 to 5
// .downTo --display 5 to 1

fun test()
{

    val inclusiveRange = 1 until 5 //1 to 4
    val inclusiveRange1 = 1 .rangeTo(5)// 1 to 5
    val inclusiveRange2 = 1 ..5// 1 to 5
    val inclusiveRange3 = 5.downTo(1)// 5 to 1
    val inclusiveRange4 = 5 downTo  1 //5 to 1
    val list= mutableListOf<Int>(1,2,3,4,5) //with indices (0,1,2,3,4)



    for (i in list)//1 to 5
    {
        println(i) // Prints 1, 2, 3, 4, 5
    }

}