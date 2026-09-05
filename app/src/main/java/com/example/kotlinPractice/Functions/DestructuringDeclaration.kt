package com.example.kotlinPractice.Functions



fun main()
{
    //DestructuringDeclaration class
    var person=DestructuringDeclaration("Heenali",30)
    val (name,age)=person
    println(age)

    //DestructuringDeclaration list
    var listValue= mutableListOf<Int>(1,2,3,4,5)
    val (one,two,three)=listValue
    println(one)

    //DestructuringDeclaration list
    var pairValue= Pair(1,2)
    val (p1,p2)=pairValue
    println(p1)





}
data class DestructuringDeclaration(val name:String, val age:Int)
{

}