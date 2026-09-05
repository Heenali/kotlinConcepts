package com.example.kotlinPractice.Functions

fun main()
{
    //compare the data of classes
    //copy data into another class
    //not createding get and setter

    var dataValue1=Data("Heenali",20)
    var dataValue2=Data("Heenali",20)
    if(dataValue1==dataValue2)
        println("Same Both classes")
    var dataValue3=dataValue1.copy()
    println(dataValue3)


}
data class Data (val name:String,val age:Int){
}